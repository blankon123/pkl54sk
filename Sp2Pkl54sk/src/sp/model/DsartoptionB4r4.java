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
@Table(name = "dsartoption_b4r4")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DsartoptionB4r4.findAll", query = "SELECT d FROM DsartoptionB4r4 d"),
    @NamedQuery(name = "DsartoptionB4r4.findByKode", query = "SELECT d FROM DsartoptionB4r4 d WHERE d.kode = :kode"),
    @NamedQuery(name = "DsartoptionB4r4.findByKeterangan", query = "SELECT d FROM DsartoptionB4r4 d WHERE d.keterangan = :keterangan")})
public class DsartoptionB4r4 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Kode")
    private String kode;
    @Basic(optional = false)
    @Column(name = "Keterangan")
    private String keterangan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4r4")
    private List<Dsartb4> dsartb4List;

    public DsartoptionB4r4() {
    }

    public DsartoptionB4r4(String kode) {
        this.kode = kode;
    }

    public DsartoptionB4r4(String kode, String keterangan) {
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
    public List<Dsartb4> getDsartb4List() {
        return dsartb4List;
    }

    public void setDsartb4List(List<Dsartb4> dsartb4List) {
        this.dsartb4List = dsartb4List;
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
        if (!(object instanceof DsartoptionB4r4)) {
            return false;
        }
        DsartoptionB4r4 other = (DsartoptionB4r4) object;
        if ((this.kode == null && other.kode != null) || (this.kode != null && !this.kode.equals(other.kode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.model.DsartoptionB4r4[ kode=" + kode + " ]";
    }
    
}
