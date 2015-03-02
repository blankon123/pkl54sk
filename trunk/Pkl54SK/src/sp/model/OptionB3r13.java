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
@Table(name = "option_b3r13")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OptionB3r13.findAll", query = "SELECT o FROM OptionB3r13 o"),
    @NamedQuery(name = "OptionB3r13.findByKode", query = "SELECT o FROM OptionB3r13 o WHERE o.kode = :kode"),
    @NamedQuery(name = "OptionB3r13.findByKeterangan", query = "SELECT o FROM OptionB3r13 o WHERE o.keterangan = :keterangan")})
public class OptionB3r13 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Kode")
    private String kode;
    @Basic(optional = false)
    @Column(name = "Keterangan")
    private String keterangan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3r13")
    private Collection<B3> b3Collection;

    public OptionB3r13() {
    }

    public OptionB3r13(String kode) {
        this.kode = kode;
    }

    public OptionB3r13(String kode, String keterangan) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kode != null ? kode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OptionB3r13)) {
            return false;
        }
        OptionB3r13 other = (OptionB3r13) object;
        if ((this.kode == null && other.kode != null) || (this.kode != null && !this.kode.equals(other.kode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.model.OptionB3r13[ kode=" + kode + " ]";
    }
    
}
