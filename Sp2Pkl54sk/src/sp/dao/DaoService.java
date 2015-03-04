/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;

/**
 *
 * @author StephenCN
 * @param <T>
 */
public class DaoService<T> implements AbstractService<Object> {

    private Class<T> model;
    protected EntityManager em = null;
    private EntityManagerFactory emf;

    protected DaoService(Class<T> model) {
        this.model = model;
        //bisa juga diinisialisasi disini sama saja
//        emf = Persistence.createEntityManagerFactory("LatihanPKLPU");
//        entityManager = emf.createEntityManager();
    }

    public EntityManager entity() {
        if (em == null) {
            emf = Persistence.createEntityManagerFactory("Sp2Pkl54skPU");
            em = emf.createEntityManager();
        }
        return em;
    }

    @Override
    public void save(Object t) {
        try {
            // digunakan jika inisialisasi di entitymanager construktor
//            entityManager.getTransaction().begin();
//            entityManager.persist(t);
//            entityManager.getTransaction().commit();

            entity().getTransaction().begin();
            //System.out.println("ASD1");
            entity().persist(t);
            //System.out.println("ASD");
            entity().getTransaction().commit();
            if (entity().isOpen()) {
                entity().close();
                em = null;
            }
        } catch (RollbackException e) {
            entity().getTransaction().rollback();
        }
    }

    @Override
    public void update(Object t) {
        try {
            entity().getTransaction().begin();
            entity().merge(t);
            entity().getTransaction().commit();
        } catch (RollbackException e) {
            entity().getTransaction().rollback();
        }
    }

    @Override
    public void delete(Object t) {
        try {
            entity().remove(t);
        } catch (RollbackException e) {
            entity().getTransaction().rollback();
        }
    }

    @Override
    public List<Object> getAll() {
        String nquery = model + ".findAll";
        return entity().createNamedQuery(nquery).getResultList();
    }

    @Override
    public List<Object> getBy(String NamedQuery, String param, String keyword) {
        return entity().createNamedQuery(NamedQuery).setParameter(param, keyword).getResultList();
    }

    @Override
    public Object getSingleBy(String N, String p, String k) {
        return entity().createNamedQuery(N).setParameter(p, k).getSingleResult();
    }

    @Override
    public T getByID(Object id) {
        return this.entity().find(model, id);
    }
}
