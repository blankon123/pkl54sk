/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author StephenCN
 */
@Entity
@Table(name = "dsartb2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dsartb2.findAll", query = "SELECT d FROM Dsartb2 d"),
    @NamedQuery(name = "Dsartb2.findByNbsb2", query = "SELECT d FROM Dsartb2 d WHERE d.nbsb2 = :nbsb2"),
    @NamedQuery(name = "Dsartb2.findByB2r1", query = "SELECT d FROM Dsartb2 d WHERE d.b2r1 = :b2r1"),
    @NamedQuery(name = "Dsartb2.findByB2r2", query = "SELECT d FROM Dsartb2 d WHERE d.b2r2 = :b2r2"),
    @NamedQuery(name = "Dsartb2.findByB2r3s1", query = "SELECT d FROM Dsartb2 d WHERE d.b2r3s1 = :b2r3s1"),
    @NamedQuery(name = "Dsartb2.findByB2r3s2", query = "SELECT d FROM Dsartb2 d WHERE d.b2r3s2 = :b2r3s2"),
    @NamedQuery(name = "Dsartb2.findByB2r3s3", query = "SELECT d FROM Dsartb2 d WHERE d.b2r3s3 = :b2r3s3"),
    @NamedQuery(name = "Dsartb2.findByB2r3s4", query = "SELECT d FROM Dsartb2 d WHERE d.b2r3s4 = :b2r3s4")})
public class Dsartb2 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nbsb2")
    private String nbsb2;
    @Basic(optional = false)
    @Column(name = "b2r1")
    private int b2r1;
    @Basic(optional = false)
    @Column(name = "b2r2")
    private int b2r2;
    @Basic(optional = false)
    @Column(name = "b2r3s1")
    private int b2r3s1;
    @Basic(optional = false)
    @Column(name = "b2r3s2")
    private int b2r3s2;
    @Basic(optional = false)
    @Column(name = "b2r3s3")
    private int b2r3s3;
    @Basic(optional = false)
    @Column(name = "b2r3s4")
    private int b2r3s4;
    @JoinColumn(name = "nbsb2", referencedColumnName = "nbs", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Dsartb1 dsartb1;

    public Dsartb2() {
    }

    public Dsartb2(String nbsb2) {
        this.nbsb2 = nbsb2;
    }

    public Dsartb2(String nbsb2, int b2r1, int b2r2, int b2r3s1, int b2r3s2, int b2r3s3, int b2r3s4) {
        this.nbsb2 = nbsb2;
        this.b2r1 = b2r1;
        this.b2r2 = b2r2;
        this.b2r3s1 = b2r3s1;
        this.b2r3s2 = b2r3s2;
        this.b2r3s3 = b2r3s3;
        this.b2r3s4 = b2r3s4;
    }

    public String getNbsb2() {
        return nbsb2;
    }

    public void setNbsb2(String nbsb2) {
        this.nbsb2 = nbsb2;
    }

    public int getB2r1() {
        return b2r1;
    }

    public void setB2r1(int b2r1) {
        this.b2r1 = b2r1;
    }

    public int getB2r2() {
        return b2r2;
    }

    public void setB2r2(int b2r2) {
        this.b2r2 = b2r2;
    }

    public int getB2r3s1() {
        return b2r3s1;
    }

    public void setB2r3s1(int b2r3s1) {
        this.b2r3s1 = b2r3s1;
    }

    public int getB2r3s2() {
        return b2r3s2;
    }

    public void setB2r3s2(int b2r3s2) {
        this.b2r3s2 = b2r3s2;
    }

    public int getB2r3s3() {
        return b2r3s3;
    }

    public void setB2r3s3(int b2r3s3) {
        this.b2r3s3 = b2r3s3;
    }

    public int getB2r3s4() {
        return b2r3s4;
    }

    public void setB2r3s4(int b2r3s4) {
        this.b2r3s4 = b2r3s4;
    }

    public Dsartb1 getDsartb1() {
        return dsartb1;
    }

    public void setDsartb1(Dsartb1 dsartb1) {
        this.dsartb1 = dsartb1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nbsb2 != null ? nbsb2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dsartb2)) {
            return false;
        }
        Dsartb2 other = (Dsartb2) object;
        if ((this.nbsb2 == null && other.nbsb2 != null) || (this.nbsb2 != null && !this.nbsb2.equals(other.nbsb2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.model.Dsartb2[ nbsb2=" + nbsb2 + " ]";
    }
    
}
