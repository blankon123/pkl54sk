/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.dao;

import java.util.List;
//import model.B1;

/**
 *
 * @author StephenCN
 */
public interface AbstractService<T> {

    public void save(T t);

    public void delete(T t);

    public void update(T t);

    public T getSingleBy(String N, String p, String k);

    public List<T> getBy(String N, String p, String k);

    public List<T> getAll();

    public T getByID(Object id);
}
