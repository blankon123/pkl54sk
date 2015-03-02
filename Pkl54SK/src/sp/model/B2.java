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
@Table(name = "b2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B2.findAll", query = "SELECT b FROM B2 b"),
    @NamedQuery(name = "B2.findByNksb2", query = "SELECT b FROM B2 b WHERE b.nksb2 = :nksb2"),
    @NamedQuery(name = "B2.findByB2r2s1", query = "SELECT b FROM B2 b WHERE b.b2r2s1 = :b2r2s1"),
    @NamedQuery(name = "B2.findByB2r2s2", query = "SELECT b FROM B2 b WHERE b.b2r2s2 = :b2r2s2"),
    @NamedQuery(name = "B2.findByB2r3s1d1", query = "SELECT b FROM B2 b WHERE b.b2r3s1d1 = :b2r3s1d1"),
    @NamedQuery(name = "B2.findByB2r3s1d2", query = "SELECT b FROM B2 b WHERE b.b2r3s1d2 = :b2r3s1d2"),
    @NamedQuery(name = "B2.findByB2r3s2d1", query = "SELECT b FROM B2 b WHERE b.b2r3s2d1 = :b2r3s2d1"),
    @NamedQuery(name = "B2.findByB2r3s2d2", query = "SELECT b FROM B2 b WHERE b.b2r3s2d2 = :b2r3s2d2")})
public class B2 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nksb2")
    private String nksb2;
    @Basic(optional = false)
    @Lob
    @Column(name = "b2r1s1")
    private String b2r1s1;
    @Basic(optional = false)
    @Lob
    @Column(name = "b2r1s2")
    private String b2r1s2;
    @Basic(optional = false)
    @Column(name = "b2r2s1")
    private String b2r2s1;
    @Basic(optional = false)
    @Column(name = "b2r2s2")
    private String b2r2s2;
    @Basic(optional = false)
    @Column(name = "b2r3s1d1")
    private String b2r3s1d1;
    @Basic(optional = false)
    @Column(name = "b2r3s1d2")
    private String b2r3s1d2;
    @Basic(optional = false)
    @Column(name = "b2r3s2d1")
    private String b2r3s2d1;
    @Basic(optional = false)
    @Column(name = "b2r3s2d2")
    private String b2r3s2d2;
    @JoinColumn(name = "nksb2", referencedColumnName = "nks", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private B1 b1;

    public B2() {
    }

    public B2(String nksb2) {
        this.nksb2 = nksb2;
    }

    public B2(String nksb2, String b2r1s1, String b2r1s2, String b2r2s1, String b2r2s2, String b2r3s1d1, String b2r3s1d2, String b2r3s2d1, String b2r3s2d2) {
        this.nksb2 = nksb2;
        this.b2r1s1 = b2r1s1;
        this.b2r1s2 = b2r1s2;
        this.b2r2s1 = b2r2s1;
        this.b2r2s2 = b2r2s2;
        this.b2r3s1d1 = b2r3s1d1;
        this.b2r3s1d2 = b2r3s1d2;
        this.b2r3s2d1 = b2r3s2d1;
        this.b2r3s2d2 = b2r3s2d2;
    }

    public String getNksb2() {
        return nksb2;
    }

    public void setNksb2(String nksb2) {
        this.nksb2 = nksb2;
    }

    public String getB2r1s1() {
        return b2r1s1;
    }

    public void setB2r1s1(String b2r1s1) {
        this.b2r1s1 = b2r1s1;
    }

    public String getB2r1s2() {
        return b2r1s2;
    }

    public void setB2r1s2(String b2r1s2) {
        this.b2r1s2 = b2r1s2;
    }

    public String getB2r2s1() {
        return b2r2s1;
    }

    public void setB2r2s1(String b2r2s1) {
        this.b2r2s1 = b2r2s1;
    }

    public String getB2r2s2() {
        return b2r2s2;
    }

    public void setB2r2s2(String b2r2s2) {
        this.b2r2s2 = b2r2s2;
    }

    public String getB2r3s1d1() {
        return b2r3s1d1;
    }

    public void setB2r3s1d1(String b2r3s1d1) {
        this.b2r3s1d1 = b2r3s1d1;
    }

    public String getB2r3s1d2() {
        return b2r3s1d2;
    }

    public void setB2r3s1d2(String b2r3s1d2) {
        this.b2r3s1d2 = b2r3s1d2;
    }

    public String getB2r3s2d1() {
        return b2r3s2d1;
    }

    public void setB2r3s2d1(String b2r3s2d1) {
        this.b2r3s2d1 = b2r3s2d1;
    }

    public String getB2r3s2d2() {
        return b2r3s2d2;
    }

    public void setB2r3s2d2(String b2r3s2d2) {
        this.b2r3s2d2 = b2r3s2d2;
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
        hash += (nksb2 != null ? nksb2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof B2)) {
            return false;
        }
        B2 other = (B2) object;
        if ((this.nksb2 == null && other.nksb2 != null) || (this.nksb2 != null && !this.nksb2.equals(other.nksb2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.model.B2[ nksb2=" + nksb2 + " ]";
    }
    
}
