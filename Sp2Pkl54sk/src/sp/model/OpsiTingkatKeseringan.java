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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar13")
    private List<B4> b4List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar9")
    private List<B4> b4List1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar7")
    private List<B4> b4List2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar2")
    private List<B4> b4List3;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar10")
    private List<B4> b4List4;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar11")
    private List<B4> b4List5;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar20")
    private List<B4> b4List6;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar12")
    private List<B4> b4List7;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar22")
    private List<B4> b4List8;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar14")
    private List<B4> b4List9;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar5")
    private List<B4> b4List10;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar24")
    private List<B4> b4List11;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar25")
    private List<B4> b4List12;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar15")
    private List<B4> b4List13;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar26")
    private List<B4> b4List14;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar8")
    private List<B4> b4List15;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar3")
    private List<B4> b4List16;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar27")
    private List<B4> b4List17;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar16")
    private List<B4> b4List18;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar4")
    private List<B4> b4List19;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar6")
    private List<B4> b4List20;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar21")
    private List<B4> b4List21;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar17")
    private List<B4> b4List22;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar19")
    private List<B4> b4List23;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar1")
    private List<B4> b4List24;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar23")
    private List<B4> b4List25;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b4ar18")
    private List<B4> b4List26;

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
    public List<B4> getB4List() {
        return b4List;
    }

    public void setB4List(List<B4> b4List) {
        this.b4List = b4List;
    }

    @XmlTransient
    public List<B4> getB4List1() {
        return b4List1;
    }

    public void setB4List1(List<B4> b4List1) {
        this.b4List1 = b4List1;
    }

    @XmlTransient
    public List<B4> getB4List2() {
        return b4List2;
    }

    public void setB4List2(List<B4> b4List2) {
        this.b4List2 = b4List2;
    }

    @XmlTransient
    public List<B4> getB4List3() {
        return b4List3;
    }

    public void setB4List3(List<B4> b4List3) {
        this.b4List3 = b4List3;
    }

    @XmlTransient
    public List<B4> getB4List4() {
        return b4List4;
    }

    public void setB4List4(List<B4> b4List4) {
        this.b4List4 = b4List4;
    }

    @XmlTransient
    public List<B4> getB4List5() {
        return b4List5;
    }

    public void setB4List5(List<B4> b4List5) {
        this.b4List5 = b4List5;
    }

    @XmlTransient
    public List<B4> getB4List6() {
        return b4List6;
    }

    public void setB4List6(List<B4> b4List6) {
        this.b4List6 = b4List6;
    }

    @XmlTransient
    public List<B4> getB4List7() {
        return b4List7;
    }

    public void setB4List7(List<B4> b4List7) {
        this.b4List7 = b4List7;
    }

    @XmlTransient
    public List<B4> getB4List8() {
        return b4List8;
    }

    public void setB4List8(List<B4> b4List8) {
        this.b4List8 = b4List8;
    }

    @XmlTransient
    public List<B4> getB4List9() {
        return b4List9;
    }

    public void setB4List9(List<B4> b4List9) {
        this.b4List9 = b4List9;
    }

    @XmlTransient
    public List<B4> getB4List10() {
        return b4List10;
    }

    public void setB4List10(List<B4> b4List10) {
        this.b4List10 = b4List10;
    }

    @XmlTransient
    public List<B4> getB4List11() {
        return b4List11;
    }

    public void setB4List11(List<B4> b4List11) {
        this.b4List11 = b4List11;
    }

    @XmlTransient
    public List<B4> getB4List12() {
        return b4List12;
    }

    public void setB4List12(List<B4> b4List12) {
        this.b4List12 = b4List12;
    }

    @XmlTransient
    public List<B4> getB4List13() {
        return b4List13;
    }

    public void setB4List13(List<B4> b4List13) {
        this.b4List13 = b4List13;
    }

    @XmlTransient
    public List<B4> getB4List14() {
        return b4List14;
    }

    public void setB4List14(List<B4> b4List14) {
        this.b4List14 = b4List14;
    }

    @XmlTransient
    public List<B4> getB4List15() {
        return b4List15;
    }

    public void setB4List15(List<B4> b4List15) {
        this.b4List15 = b4List15;
    }

    @XmlTransient
    public List<B4> getB4List16() {
        return b4List16;
    }

    public void setB4List16(List<B4> b4List16) {
        this.b4List16 = b4List16;
    }

    @XmlTransient
    public List<B4> getB4List17() {
        return b4List17;
    }

    public void setB4List17(List<B4> b4List17) {
        this.b4List17 = b4List17;
    }

    @XmlTransient
    public List<B4> getB4List18() {
        return b4List18;
    }

    public void setB4List18(List<B4> b4List18) {
        this.b4List18 = b4List18;
    }

    @XmlTransient
    public List<B4> getB4List19() {
        return b4List19;
    }

    public void setB4List19(List<B4> b4List19) {
        this.b4List19 = b4List19;
    }

    @XmlTransient
    public List<B4> getB4List20() {
        return b4List20;
    }

    public void setB4List20(List<B4> b4List20) {
        this.b4List20 = b4List20;
    }

    @XmlTransient
    public List<B4> getB4List21() {
        return b4List21;
    }

    public void setB4List21(List<B4> b4List21) {
        this.b4List21 = b4List21;
    }

    @XmlTransient
    public List<B4> getB4List22() {
        return b4List22;
    }

    public void setB4List22(List<B4> b4List22) {
        this.b4List22 = b4List22;
    }

    @XmlTransient
    public List<B4> getB4List23() {
        return b4List23;
    }

    public void setB4List23(List<B4> b4List23) {
        this.b4List23 = b4List23;
    }

    @XmlTransient
    public List<B4> getB4List24() {
        return b4List24;
    }

    public void setB4List24(List<B4> b4List24) {
        this.b4List24 = b4List24;
    }

    @XmlTransient
    public List<B4> getB4List25() {
        return b4List25;
    }

    public void setB4List25(List<B4> b4List25) {
        this.b4List25 = b4List25;
    }

    @XmlTransient
    public List<B4> getB4List26() {
        return b4List26;
    }

    public void setB4List26(List<B4> b4List26) {
        this.b4List26 = b4List26;
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
