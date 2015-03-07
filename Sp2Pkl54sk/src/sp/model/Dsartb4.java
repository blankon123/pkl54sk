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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author StephenCN
 */
@Entity
@Table(name = "dsartb4")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dsartb4.findAll", query = "SELECT d FROM Dsartb4 d"),
    @NamedQuery(name = "Dsartb4.findByNuart", query = "SELECT d FROM Dsartb4 d WHERE d.nuart = :nuart"),
    @NamedQuery(name = "Dsartb4.findByB4r1", query = "SELECT d FROM Dsartb4 d WHERE d.b4r1 = :b4r1"),
    @NamedQuery(name = "Dsartb4.findByB4r2s1", query = "SELECT d FROM Dsartb4 d WHERE d.b4r2s1 = :b4r2s1"),
    @NamedQuery(name = "Dsartb4.findByB4r2s2", query = "SELECT d FROM Dsartb4 d WHERE d.b4r2s2 = :b4r2s2"),
    @NamedQuery(name = "Dsartb4.findByB4r2s3", query = "SELECT d FROM Dsartb4 d WHERE d.b4r2s3 = :b4r2s3"),
    @NamedQuery(name = "Dsartb4.findByB4r3", query = "SELECT d FROM Dsartb4 d WHERE d.b4r3 = :b4r3"),
    @NamedQuery(name = "Dsartb4.findByB4r5", query = "SELECT d FROM Dsartb4 d WHERE d.b4r5 = :b4r5")})
public class Dsartb4 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nuart")
    private String nuart;
    @Basic(optional = false)
    @Column(name = "b4r1")
    private String b4r1;
    @Basic(optional = false)
    @Column(name = "b4r2s1")
    private String b4r2s1;
    @Basic(optional = false)
    @Column(name = "b4r2s2")
    private String b4r2s2;
    @Basic(optional = false)
    @Column(name = "b4r2s3")
    private String b4r2s3;
    @Basic(optional = false)
    @Column(name = "b4r3")
    private String b4r3;
    @Basic(optional = false)
    @Column(name = "b4r5")
    private String b4r5;
    @Basic(optional = false)
    @Lob
    @Column(name = "b4r6")
    private String b4r6;
    @JoinColumn(name = "b4r4", referencedColumnName = "Kode")
    @ManyToOne(optional = false)
    private DsartoptionB4r4 b4r4;

    public Dsartb4() {
    }

    public Dsartb4(String nuart) {
        this.nuart = nuart;
    }

    public Dsartb4(String nuart, String b4r1, String b4r2s1, String b4r2s2, String b4r2s3, String b4r3, String b4r5, String b4r6) {
        this.nuart = nuart;
        this.b4r1 = b4r1;
        this.b4r2s1 = b4r2s1;
        this.b4r2s2 = b4r2s2;
        this.b4r2s3 = b4r2s3;
        this.b4r3 = b4r3;
        this.b4r5 = b4r5;
        this.b4r6 = b4r6;
    }

    public String getNuart() {
        return nuart;
    }

    public void setNuart(String nuart) {
        this.nuart = nuart;
    }

    public String getB4r1() {
        return b4r1;
    }

    public void setB4r1(String b4r1) {
        this.b4r1 = b4r1;
    }

    public String getB4r2s1() {
        return b4r2s1;
    }

    public void setB4r2s1(String b4r2s1) {
        this.b4r2s1 = b4r2s1;
    }

    public String getB4r2s2() {
        return b4r2s2;
    }

    public void setB4r2s2(String b4r2s2) {
        this.b4r2s2 = b4r2s2;
    }

    public String getB4r2s3() {
        return b4r2s3;
    }

    public void setB4r2s3(String b4r2s3) {
        this.b4r2s3 = b4r2s3;
    }

    public String getB4r3() {
        return b4r3;
    }

    public void setB4r3(String b4r3) {
        this.b4r3 = b4r3;
    }

    public String getB4r5() {
        return b4r5;
    }

    public void setB4r5(String b4r5) {
        this.b4r5 = b4r5;
    }

    public String getB4r6() {
        return b4r6;
    }

    public void setB4r6(String b4r6) {
        this.b4r6 = b4r6;
    }

    public DsartoptionB4r4 getB4r4() {
        return b4r4;
    }

    public void setB4r4(DsartoptionB4r4 b4r4) {
        this.b4r4 = b4r4;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nuart != null ? nuart.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dsartb4)) {
            return false;
        }
        Dsartb4 other = (Dsartb4) object;
        if ((this.nuart == null && other.nuart != null) || (this.nuart != null && !this.nuart.equals(other.nuart))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.model.Dsartb4[ nuart=" + nuart + " ]";
    }
    
}
