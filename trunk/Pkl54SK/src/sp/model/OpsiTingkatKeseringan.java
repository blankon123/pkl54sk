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
@Table(name = "opsi_tingkat_keseringan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OpsiTingkatKeseringan.findAll", query = "SELECT o FROM OpsiTingkatKeseringan o"),
    @NamedQuery(name = "OpsiTingkatKeseringan.findByKode", query = "SELECT o FROM OpsiTingkatKeseringan o WHERE o.kode = :kode"),
    @NamedQuery(name = "OpsiTingkatKeseringan.findByKeterangan", query = "SELECT o FROM OpsiTingkatKeseringan o WHERE o.keterangan = :keterangan")})
public class OpsiTingkatKeseringan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode")
    private String kode;
    @Basic(optional = false)
    @Column(name = "keterangan")
    private String keterangan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar12")
    private Collection<B4> b4Collection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar9")
    private Collection<B4> b4Collection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar10")
    private Collection<B4> b4Collection2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar20")
    private Collection<B4> b4Collection3;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar26")
    private Collection<B4> b4Collection4;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar11")
    private Collection<B4> b4Collection5;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar13")
    private Collection<B4> b4Collection6;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar27")
    private Collection<B4> b4Collection7;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar5")
    private Collection<B4> b4Collection8;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar2")
    private Collection<B4> b4Collection9;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar14")
    private Collection<B4> b4Collection10;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar15")
    private Collection<B4> b4Collection11;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar22")
    private Collection<B4> b4Collection12;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar3")
    private Collection<B4> b4Collection13;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar4")
    private Collection<B4> b4Collection14;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar16")
    private Collection<B4> b4Collection15;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar19")
    private Collection<B4> b4Collection16;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar21")
    private Collection<B4> b4Collection17;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar23")
    private Collection<B4> b4Collection18;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar8")
    private Collection<B4> b4Collection19;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar17")
    private Collection<B4> b4Collection20;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar6")
    private Collection<B4> b4Collection21;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar1")
    private Collection<B4> b4Collection22;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar18")
    private Collection<B4> b4Collection23;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar25")
    private Collection<B4> b4Collection24;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar24")
    private Collection<B4> b4Collection25;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar7")
    private Collection<B4> b4Collection26;

    public OpsiTingkatKeseringan() {
    }

    public OpsiTingkatKeseringan(String kode) {
        this.kode = kode;
    }

    public OpsiTingkatKeseringan(String kode, String keterangan) {
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
    public Collection<B4> getB4Collection() {
        return b4Collection;
    }

    public void setB4Collection(Collection<B4> b4Collection) {
        this.b4Collection = b4Collection;
    }

    @XmlTransient
    public Collection<B4> getB4Collection1() {
        return b4Collection1;
    }

    public void setB4Collection1(Collection<B4> b4Collection1) {
        this.b4Collection1 = b4Collection1;
    }

    @XmlTransient
    public Collection<B4> getB4Collection2() {
        return b4Collection2;
    }

    public void setB4Collection2(Collection<B4> b4Collection2) {
        this.b4Collection2 = b4Collection2;
    }

    @XmlTransient
    public Collection<B4> getB4Collection3() {
        return b4Collection3;
    }

    public void setB4Collection3(Collection<B4> b4Collection3) {
        this.b4Collection3 = b4Collection3;
    }

    @XmlTransient
    public Collection<B4> getB4Collection4() {
        return b4Collection4;
    }

    public void setB4Collection4(Collection<B4> b4Collection4) {
        this.b4Collection4 = b4Collection4;
    }

    @XmlTransient
    public Collection<B4> getB4Collection5() {
        return b4Collection5;
    }

    public void setB4Collection5(Collection<B4> b4Collection5) {
        this.b4Collection5 = b4Collection5;
    }

    @XmlTransient
    public Collection<B4> getB4Collection6() {
        return b4Collection6;
    }

    public void setB4Collection6(Collection<B4> b4Collection6) {
        this.b4Collection6 = b4Collection6;
    }

    @XmlTransient
    public Collection<B4> getB4Collection7() {
        return b4Collection7;
    }

    public void setB4Collection7(Collection<B4> b4Collection7) {
        this.b4Collection7 = b4Collection7;
    }

    @XmlTransient
    public Collection<B4> getB4Collection8() {
        return b4Collection8;
    }

    public void setB4Collection8(Collection<B4> b4Collection8) {
        this.b4Collection8 = b4Collection8;
    }

    @XmlTransient
    public Collection<B4> getB4Collection9() {
        return b4Collection9;
    }

    public void setB4Collection9(Collection<B4> b4Collection9) {
        this.b4Collection9 = b4Collection9;
    }

    @XmlTransient
    public Collection<B4> getB4Collection10() {
        return b4Collection10;
    }

    public void setB4Collection10(Collection<B4> b4Collection10) {
        this.b4Collection10 = b4Collection10;
    }

    @XmlTransient
    public Collection<B4> getB4Collection11() {
        return b4Collection11;
    }

    public void setB4Collection11(Collection<B4> b4Collection11) {
        this.b4Collection11 = b4Collection11;
    }

    @XmlTransient
    public Collection<B4> getB4Collection12() {
        return b4Collection12;
    }

    public void setB4Collection12(Collection<B4> b4Collection12) {
        this.b4Collection12 = b4Collection12;
    }

    @XmlTransient
    public Collection<B4> getB4Collection13() {
        return b4Collection13;
    }

    public void setB4Collection13(Collection<B4> b4Collection13) {
        this.b4Collection13 = b4Collection13;
    }

    @XmlTransient
    public Collection<B4> getB4Collection14() {
        return b4Collection14;
    }

    public void setB4Collection14(Collection<B4> b4Collection14) {
        this.b4Collection14 = b4Collection14;
    }

    @XmlTransient
    public Collection<B4> getB4Collection15() {
        return b4Collection15;
    }

    public void setB4Collection15(Collection<B4> b4Collection15) {
        this.b4Collection15 = b4Collection15;
    }

    @XmlTransient
    public Collection<B4> getB4Collection16() {
        return b4Collection16;
    }

    public void setB4Collection16(Collection<B4> b4Collection16) {
        this.b4Collection16 = b4Collection16;
    }

    @XmlTransient
    public Collection<B4> getB4Collection17() {
        return b4Collection17;
    }

    public void setB4Collection17(Collection<B4> b4Collection17) {
        this.b4Collection17 = b4Collection17;
    }

    @XmlTransient
    public Collection<B4> getB4Collection18() {
        return b4Collection18;
    }

    public void setB4Collection18(Collection<B4> b4Collection18) {
        this.b4Collection18 = b4Collection18;
    }

    @XmlTransient
    public Collection<B4> getB4Collection19() {
        return b4Collection19;
    }

    public void setB4Collection19(Collection<B4> b4Collection19) {
        this.b4Collection19 = b4Collection19;
    }

    @XmlTransient
    public Collection<B4> getB4Collection20() {
        return b4Collection20;
    }

    public void setB4Collection20(Collection<B4> b4Collection20) {
        this.b4Collection20 = b4Collection20;
    }

    @XmlTransient
    public Collection<B4> getB4Collection21() {
        return b4Collection21;
    }

    public void setB4Collection21(Collection<B4> b4Collection21) {
        this.b4Collection21 = b4Collection21;
    }

    @XmlTransient
    public Collection<B4> getB4Collection22() {
        return b4Collection22;
    }

    public void setB4Collection22(Collection<B4> b4Collection22) {
        this.b4Collection22 = b4Collection22;
    }

    @XmlTransient
    public Collection<B4> getB4Collection23() {
        return b4Collection23;
    }

    public void setB4Collection23(Collection<B4> b4Collection23) {
        this.b4Collection23 = b4Collection23;
    }

    @XmlTransient
    public Collection<B4> getB4Collection24() {
        return b4Collection24;
    }

    public void setB4Collection24(Collection<B4> b4Collection24) {
        this.b4Collection24 = b4Collection24;
    }

    @XmlTransient
    public Collection<B4> getB4Collection25() {
        return b4Collection25;
    }

    public void setB4Collection25(Collection<B4> b4Collection25) {
        this.b4Collection25 = b4Collection25;
    }

    @XmlTransient
    public Collection<B4> getB4Collection26() {
        return b4Collection26;
    }

    public void setB4Collection26(Collection<B4> b4Collection26) {
        this.b4Collection26 = b4Collection26;
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
        if (!(object instanceof OpsiTingkatKeseringan)) {
            return false;
        }
        OpsiTingkatKeseringan other = (OpsiTingkatKeseringan) object;
        if ((this.kode == null && other.kode != null) || (this.kode != null && !this.kode.equals(other.kode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.model.OpsiTingkatKeseringan[ kode=" + kode + " ]";
    }
    
}
