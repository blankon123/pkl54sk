/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.model;

import java.io.Serializable;
import java.util.List;
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
 * @author Thosan Girisona S
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
    private List<B3> b3List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3r9s1d1")
    private List<B3> b3List1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3r9s1d2")
    private List<B3> b3List2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3r9s1d3")
    private List<B3> b3List3;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3r9s1d4")
    private List<B3> b3List4;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3r8s1")
    private List<B3> b3List5;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3r8s2")
    private List<B3> b3List6;

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
    public List<B3> getB3List() {
        return b3List;
    }

    public void setB3List(List<B3> b3List) {
        this.b3List = b3List;
    }

    @XmlTransient
    public List<B3> getB3List1() {
        return b3List1;
    }

    public void setB3List1(List<B3> b3List1) {
        this.b3List1 = b3List1;
    }

    @XmlTransient
    public List<B3> getB3List2() {
        return b3List2;
    }

    public void setB3List2(List<B3> b3List2) {
        this.b3List2 = b3List2;
    }

    @XmlTransient
    public List<B3> getB3List3() {
        return b3List3;
    }

    public void setB3List3(List<B3> b3List3) {
        this.b3List3 = b3List3;
    }

    @XmlTransient
    public List<B3> getB3List4() {
        return b3List4;
    }

    public void setB3List4(List<B3> b3List4) {
        this.b3List4 = b3List4;
    }

    @XmlTransient
    public List<B3> getB3List5() {
        return b3List5;
    }

    public void setB3List5(List<B3> b3List5) {
        this.b3List5 = b3List5;
    }

    @XmlTransient
    public List<B3> getB3List6() {
        return b3List6;
    }

    public void setB3List6(List<B3> b3List6) {
        this.b3List6 = b3List6;
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
