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
@Table(name = "dsartoption_b1r1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DsartoptionB1r1.findAll", query = "SELECT d FROM DsartoptionB1r1 d"),
    @NamedQuery(name = "DsartoptionB1r1.findByKode", query = "SELECT d FROM DsartoptionB1r1 d WHERE d.kode = :kode"),
    @NamedQuery(name = "DsartoptionB1r1.findByKeterangan", query = "SELECT d FROM DsartoptionB1r1 d WHERE d.keterangan = :keterangan")})
public class DsartoptionB1r1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Kode")
    private String kode;
    @Basic(optional = false)
    @Column(name = "Keterangan")
    private String keterangan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b1r1")
    private List<Dsartb1> dsartb1List;

    public DsartoptionB1r1() {
    }

    public DsartoptionB1r1(String kode) {
        this.kode = kode;
    }

    public DsartoptionB1r1(String kode, String keterangan) {
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
    public List<Dsartb1> getDsartb1List() {
        return dsartb1List;
    }

    public void setDsartb1List(List<Dsartb1> dsartb1List) {
        this.dsartb1List = dsartb1List;
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
        if (!(object instanceof DsartoptionB1r1)) {
            return false;
        }
        DsartoptionB1r1 other = (DsartoptionB1r1) object;
        if ((this.kode == null && other.kode != null) || (this.kode != null && !this.kode.equals(other.kode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.model.DsartoptionB1r1[ kode=" + kode + " ]";
    }
    
}
