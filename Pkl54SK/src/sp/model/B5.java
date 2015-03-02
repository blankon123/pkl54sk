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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ristika Nugraha [12.7350]
 */
@Entity
@Table(name = "b5")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B5.findAll", query = "SELECT b FROM B5 b"),
    @NamedQuery(name = "B5.findByNksb5", query = "SELECT b FROM B5 b WHERE b.nksb5 = :nksb5")})
public class B5 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nksb5")
    private String nksb5;
    @Lob
    @Column(name = "catatan")
    private String catatan;
    @JoinColumn(name = "nksb5", referencedColumnName = "nks", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private B1 b1;

    public B5() {
    }

    public B5(String nksb5) {
        this.nksb5 = nksb5;
    }

    public String getNksb5() {
        return nksb5;
    }

    public void setNksb5(String nksb5) {
        this.nksb5 = nksb5;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    public B1 getB1() {
        return b1;
    }

    public void setB1(B1 b1) {
        this.b1 = b1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nksb5 != null ? nksb5.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof B5)) {
            return false;
        }
        B5 other = (B5) object;
        if ((this.nksb5 == null && other.nksb5 != null) || (this.nksb5 != null && !this.nksb5.equals(other.nksb5))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.model.B5[ nksb5=" + nksb5 + " ]";
    }
    
}
