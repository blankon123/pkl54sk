/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ristika Nugraha [12.7350]
 */
@Entity
@Table(name = "option_ya_tidak")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OptionYaTidak.findAll", query = "SELECT o FROM OptionYaTidak o"),
    @NamedQuery(name = "OptionYaTidak.findByKode", query = "SELECT o FROM OptionYaTidak o WHERE o.kode = :kode"),
    @NamedQuery(name = "OptionYaTidak.findByKeterangan", query = "SELECT o FROM OptionYaTidak o WHERE o.keterangan = :keterangan")})
public class OptionYaTidak implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Kode")
    private String kode;
    @Basic(optional = false)
    @Column(name = "Keterangan")
    private String keterangan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3r8s3")
    private Collection<B3> b3Collection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3r9s1d1")
    private Collection<B3> b3Collection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3r9s1d2")
    private Collection<B3> b3Collection2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3r9s1d3")
    private Collection<B3> b3Collection3;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3r9s1d4")
    private Collection<B3> b3Collection4;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3r8s1")
    private Collection<B3> b3Collection5;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3r8s2")
    private Collection<B3> b3Collection6;

    public OptionYaTidak() {
    }

    public OptionYaTidak(String kode) {
        this.kode = kode;
    }

    public OptionYaTidak(String kode, String keterangan) {
        this.kode = kode;
        this.keterangan = keterangan;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    @XmlTransient
    public Collection<B3> getB3Collection() {
        return b3Collection;
    }

    public void setB3Collection(Collection<B3> b3Collection) {
        this.b3Collection = b3Collection;
    }

    @XmlTransient
    public Collection<B3> getB3Collection1() {
        return b3Collection1;
    }

    public void setB3Collection1(Collection<B3> b3Collection1) {
        this.b3Collection1 = b3Collection1;
    }

    @XmlTransient
    public Collection<B3> getB3Collection2() {
        return b3Collection2;
    }

    public void setB3Collection2(Collection<B3> b3Collection2) {
        this.b3Collection2 = b3Collection2;
    }

    @XmlTransient
    public Collection<B3> getB3Collection3() {
        return b3Collection3;
    }

    public void setB3Collection3(Collection<B3> b3Collection3) {
        this.b3Collection3 = b3Collection3;
    }

    @XmlTransient
    public Collection<B3> getB3Collection4() {
        return b3Collection4;
    }

    public void setB3Collection4(Collection<B3> b3Collection4) {
        this.b3Collection4 = b3Collection4;
    }

    @XmlTransient
    public Collection<B3> getB3Collection5() {
        return b3Collection5;
    }

    public void setB3Collection5(Collection<B3> b3Collection5) {
        this.b3Collection5 = b3Collection5;
    }

    @XmlTransient
    public Collection<B3> getB3Collection6() {
        return b3Collection6;
    }

    public void setB3Collection6(Collection<B3> b3Collection6) {
        this.b3Collection6 = b3Collection6;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kode != null ? kode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OptionYaTidak)) {
            return false;
        }
        OptionYaTidak other = (OptionYaTidak) object;
        if ((this.kode == null && other.kode != null) || (this.kode != null && !this.kode.equals(other.kode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.model.OptionYaTidak[ kode=" + kode + " ]";
    }
    
}
