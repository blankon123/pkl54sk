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
@Table(name = "dsartb3")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dsartb3.findAll", query = "SELECT d FROM Dsartb3 d"),
    @NamedQuery(name = "Dsartb3.findByNbs3", query = "SELECT d FROM Dsartb3 d WHERE d.nbs3 = :nbs3"),
    @NamedQuery(name = "Dsartb3.findByB3r1", query = "SELECT d FROM Dsartb3 d WHERE d.b3r1 = :b3r1"),
    @NamedQuery(name = "Dsartb3.findByB3r2", query = "SELECT d FROM Dsartb3 d WHERE d.b3r2 = :b3r2"),
    @NamedQuery(name = "Dsartb3.findByB3r3", query = "SELECT d FROM Dsartb3 d WHERE d.b3r3 = :b3r3")})
public class Dsartb3 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nbs3")
    private String nbs3;
    @Basic(optional = false)
    @Column(name = "b3r1")
    private String b3r1;
    @Basic(optional = false)
    @Column(name = "b3r2")
    private String b3r2;
    @Basic(optional = false)
    @Column(name = "b3r3")
    private String b3r3;
    @JoinColumn(name = "nbs3", referencedColumnName = "nbs", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Dsartb1 dsartb1;

    public Dsartb3() {
    }

    public Dsartb3(String nbs3) {
        this.nbs3 = nbs3;
    }

    public Dsartb3(String nbs3, String b3r1, String b3r2, String b3r3) {
        this.nbs3 = nbs3;
        this.b3r1 = b3r1;
        this.b3r2 = b3r2;
        this.b3r3 = b3r3;
    }

    public String getNbs3() {
        return nbs3;
    }

    public void setNbs3(String nbs3) {
        this.nbs3 = nbs3;
    }

    public String getB3r1() {
        return b3r1;
    }

    public void setB3r1(String b3r1) {
        this.b3r1 = b3r1;
    }

    public String getB3r2() {
        return b3r2;
    }

    public void setB3r2(String b3r2) {
        this.b3r2 = b3r2;
    }

    public String getB3r3() {
        return b3r3;
    }

    public void setB3r3(String b3r3) {
        this.b3r3 = b3r3;
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
        hash += (nbs3 != null ? nbs3.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dsartb3)) {
            return false;
        }
        Dsartb3 other = (Dsartb3) object;
        if ((this.nbs3 == null && other.nbs3 != null) || (this.nbs3 != null && !this.nbs3.equals(other.nbs3))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.model.Dsartb3[ nbs3=" + nbs3 + " ]";
    }
    
}
