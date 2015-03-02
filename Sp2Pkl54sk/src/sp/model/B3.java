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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thosan Girisona S
 */
@Entity
@Table(name = "b3")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B3.findAll", query = "SELECT b FROM B3 b"),
    @NamedQuery(name = "B3.findByNksb3", query = "SELECT b FROM B3 b WHERE b.nksb3 = :nksb3"),
    @NamedQuery(name = "B3.findByB3r3", query = "SELECT b FROM B3 b WHERE b.b3r3 = :b3r3"),
    @NamedQuery(name = "B3.findByB3r4s1", query = "SELECT b FROM B3 b WHERE b.b3r4s1 = :b3r4s1"),
    @NamedQuery(name = "B3.findByB3r4s2", query = "SELECT b FROM B3 b WHERE b.b3r4s2 = :b3r4s2"),
    @NamedQuery(name = "B3.findByB3r5s1", query = "SELECT b FROM B3 b WHERE b.b3r5s1 = :b3r5s1"),
    @NamedQuery(name = "B3.findByB3r5s2", query = "SELECT b FROM B3 b WHERE b.b3r5s2 = :b3r5s2"),
    @NamedQuery(name = "B3.findByB3r9s2", query = "SELECT b FROM B3 b WHERE b.b3r9s2 = :b3r9s2"),
    @NamedQuery(name = "B3.findByB3r10", query = "SELECT b FROM B3 b WHERE b.b3r10 = :b3r10"),
    @NamedQuery(name = "B3.findByB3r11", query = "SELECT b FROM B3 b WHERE b.b3r11 = :b3r11")})
public class B3 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nksb3")
    private String nksb3;
    @Basic(optional = false)
    @Lob
    @Column(name = "b3r1")
    private String b3r1;
    @Basic(optional = false)
    @Column(name = "b3r3")
    private String b3r3;
    @Basic(optional = false)
    @Column(name = "b3r4s1")
    private String b3r4s1;
    @Column(name = "b3r4s2")
    private String b3r4s2;
    @Basic(optional = false)
    @Column(name = "b3r5s1")
    private String b3r5s1;
    @Column(name = "b3r5s2")
    private String b3r5s2;
    @Column(name = "b3r9s2")
    private String b3r9s2;
    @Column(name = "b3r10")
    private String b3r10;
    @Basic(optional = false)
    @Column(name = "b3r11")
    private String b3r11;
    @JoinColumn(name = "b3r8s3", referencedColumnName = "Kode")
    @ManyToOne(optional = false)
    private OptionYaTidak b3r8s3;
    @JoinColumn(name = "nksb3", referencedColumnName = "nks", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private B1 b1;
    @JoinColumn(name = "b3r9s1d1", referencedColumnName = "Kode")
    @ManyToOne(optional = false)
    private OptionYaTidak b3r9s1d1;
    @JoinColumn(name = "b3r9s1d2", referencedColumnName = "Kode")
    @ManyToOne(optional = false)
    private OptionYaTidak b3r9s1d2;
    @JoinColumn(name = "b3r9s1d3", referencedColumnName = "Kode")
    @ManyToOne(optional = false)
    private OptionYaTidak b3r9s1d3;
    @JoinColumn(name = "b3r9s1d4", referencedColumnName = "Kode")
    @ManyToOne(optional = false)
    private OptionYaTidak b3r9s1d4;
    @JoinColumn(name = "b3r7", referencedColumnName = "Kode")
    @ManyToOne(optional = false)
    private OptionB3r7 b3r7;
    @JoinColumn(name = "b3r2", referencedColumnName = "Kode")
    @ManyToOne(optional = false)
    private OptionB3r2 b3r2;
    @JoinColumn(name = "b3r12", referencedColumnName = "Kode")
    @ManyToOne(optional = false)
    private OptionB3r12 b3r12;
    @JoinColumn(name = "b3r15", referencedColumnName = "Kode")
    @ManyToOne(optional = false)
    private OptionB3r15 b3r15;
    @JoinColumn(name = "b3r8s1", referencedColumnName = "Kode")
    @ManyToOne(optional = false)
    private OptionYaTidak b3r8s1;
    @JoinColumn(name = "b3r16", referencedColumnName = "Kode")
    @ManyToOne(optional = false)
    private OptionB3r16 b3r16;
    @JoinColumn(name = "b3r13", referencedColumnName = "Kode")
    @ManyToOne(optional = false)
    private OptionB3r13 b3r13;
    @JoinColumn(name = "b3r6", referencedColumnName = "Kode")
    @ManyToOne(optional = false)
    private OptionB3r6 b3r6;
    @JoinColumn(name = "b3r14", referencedColumnName = "Kode")
    @ManyToOne(optional = false)
    private OptionB3r14 b3r14;
    @JoinColumn(name = "b3r8s2", referencedColumnName = "Kode")
    @ManyToOne(optional = false)
    private OptionYaTidak b3r8s2;

    public B3() {
    }

    public B3(String nksb3) {
        this.nksb3 = nksb3;
    }

    public B3(String nksb3, String b3r1, String b3r3, String b3r4s1, String b3r5s1, String b3r11) {
        this.nksb3 = nksb3;
        this.b3r1 = b3r1;
        this.b3r3 = b3r3;
        this.b3r4s1 = b3r4s1;
        this.b3r5s1 = b3r5s1;
        this.b3r11 = b3r11;
    }

    public String getNksb3() {
        return nksb3;
    }

    public void setNksb3(String nksb3) {
        this.nksb3 = nksb3;
    }

    public String getB3r1() {
        return b3r1;
    }

    public void setB3r1(String b3r1) {
        this.b3r1 = b3r1;
    }

    public String getB3r3() {
        return b3r3;
    }

    public void setB3r3(String b3r3) {
        this.b3r3 = b3r3;
    }

    public String getB3r4s1() {
        return b3r4s1;
    }

    public void setB3r4s1(String b3r4s1) {
        this.b3r4s1 = b3r4s1;
    }

    public String getB3r4s2() {
        return b3r4s2;
    }

    public void setB3r4s2(String b3r4s2) {
        this.b3r4s2 = b3r4s2;
    }

    public String getB3r5s1() {
        return b3r5s1;
    }

    public void setB3r5s1(String b3r5s1) {
        this.b3r5s1 = b3r5s1;
    }

    public String getB3r5s2() {
        return b3r5s2;
    }

    public void setB3r5s2(String b3r5s2) {
        this.b3r5s2 = b3r5s2;
    }

    public String getB3r9s2() {
        return b3r9s2;
    }

    public void setB3r9s2(String b3r9s2) {
        this.b3r9s2 = b3r9s2;
    }

    public String getB3r10() {
        return b3r10;
    }

    public void setB3r10(String b3r10) {
        this.b3r10 = b3r10;
    }

    public String getB3r11() {
        return b3r11;
    }

    public void setB3r11(String b3r11) {
        this.b3r11 = b3r11;
    }

    public OptionYaTidak getB3r8s3() {
        return b3r8s3;
    }

    public void setB3r8s3(OptionYaTidak b3r8s3) {
        this.b3r8s3 = b3r8s3;
    }

    public B1 getB1() {
        return b1;
    }

    public void setB1(B1 b1) {
        this.b1 = b1;
    }

    public OptionYaTidak getB3r9s1d1() {
        return b3r9s1d1;
    }

    public void setB3r9s1d1(OptionYaTidak b3r9s1d1) {
        this.b3r9s1d1 = b3r9s1d1;
    }

    public OptionYaTidak getB3r9s1d2() {
        return b3r9s1d2;
    }

    public void setB3r9s1d2(OptionYaTidak b3r9s1d2) {
        this.b3r9s1d2 = b3r9s1d2;
    }

    public OptionYaTidak getB3r9s1d3() {
        return b3r9s1d3;
    }

    public void setB3r9s1d3(OptionYaTidak b3r9s1d3) {
        this.b3r9s1d3 = b3r9s1d3;
    }

    public OptionYaTidak getB3r9s1d4() {
        return b3r9s1d4;
    }

    public void setB3r9s1d4(OptionYaTidak b3r9s1d4) {
        this.b3r9s1d4 = b3r9s1d4;
    }

    public OptionB3r7 getB3r7() {
        return b3r7;
    }

    public void setB3r7(OptionB3r7 b3r7) {
        this.b3r7 = b3r7;
    }

    public OptionB3r2 getB3r2() {
        return b3r2;
    }

    public void setB3r2(OptionB3r2 b3r2) {
        this.b3r2 = b3r2;
    }

    public OptionB3r12 getB3r12() {
        return b3r12;
    }

    public void setB3r12(OptionB3r12 b3r12) {
        this.b3r12 = b3r12;
    }

    public OptionB3r15 getB3r15() {
        return b3r15;
    }

    public void setB3r15(OptionB3r15 b3r15) {
        this.b3r15 = b3r15;
    }

    public OptionYaTidak getB3r8s1() {
        return b3r8s1;
    }

    public void setB3r8s1(OptionYaTidak b3r8s1) {
        this.b3r8s1 = b3r8s1;
    }

    public OptionB3r16 getB3r16() {
        return b3r16;
    }

    public void setB3r16(OptionB3r16 b3r16) {
        this.b3r16 = b3r16;
    }

    public OptionB3r13 getB3r13() {
        return b3r13;
    }

    public void setB3r13(OptionB3r13 b3r13) {
        this.b3r13 = b3r13;
    }

    public OptionB3r6 getB3r6() {
        return b3r6;
    }

    public void setB3r6(OptionB3r6 b3r6) {
        this.b3r6 = b3r6;
    }

    public OptionB3r14 getB3r14() {
        return b3r14;
    }

    public void setB3r14(OptionB3r14 b3r14) {
        this.b3r14 = b3r14;
    }

    public OptionYaTidak getB3r8s2() {
        return b3r8s2;
    }

    public void setB3r8s2(OptionYaTidak b3r8s2) {
        this.b3r8s2 = b3r8s2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nksb3 != null ? nksb3.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof B3)) {
            return false;
        }
        B3 other = (B3) object;
        if ((this.nksb3 == null && other.nksb3 != null) || (this.nksb3 != null && !this.nksb3.equals(other.nksb3))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.model.B3[ nksb3=" + nksb3 + " ]";
    }
    
}
