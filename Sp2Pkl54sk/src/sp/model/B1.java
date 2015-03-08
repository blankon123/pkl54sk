/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ristika Nugraha [12.7350]
 */
@Entity
@Table(name = "b1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B1.findAll", query = "SELECT b FROM B1 b"),
    @NamedQuery(name = "B1.findByNks", query = "SELECT b FROM B1 b WHERE b.nks = :nks"),
    @NamedQuery(name = "B1.findByB1r2", query = "SELECT b FROM B1 b WHERE b.b1r2 = :b1r2"),
    @NamedQuery(name = "B1.findByB1r3", query = "SELECT b FROM B1 b WHERE b.b1r3 = :b1r3"),
    @NamedQuery(name = "B1.findByB1r5", query = "SELECT b FROM B1 b WHERE b.b1r5 = :b1r5"),
    @NamedQuery(name = "B1.findByB1r6", query = "SELECT b FROM B1 b WHERE b.b1r6 = :b1r6"),
    @NamedQuery(name = "B1.findByB1r10", query = "SELECT b FROM B1 b WHERE b.b1r10 = :b1r10"),
    @NamedQuery(name = "B1.findByNim", query = "SELECT b FROM B1 b WHERE b.nim = :nim"),
    @NamedQuery(name = "B1.findByFlag", query = "SELECT b FROM B1 b WHERE b.flag = :flag"),
    @NamedQuery(name = "B1.findByFlag2", query = "SELECT b FROM B1 b WHERE b.flag2 = :flag2"),
    @NamedQuery(name = "B1.findByTimestamp", query = "SELECT b FROM B1 b WHERE b.timestamp = :timestamp")})
public class B1 implements Serializable {
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "b1")
    private B3 b3;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nks")
    private String nks;
    @Basic(optional = false)
    @Column(name = "b1r2")
    private String b1r2;
    @Basic(optional = false)
    @Column(name = "b1r3")
    private String b1r3;
    @Basic(optional = false)
    @Column(name = "b1r5")
    private String b1r5;
    @Basic(optional = false)
    @Column(name = "b1r6")
    private String b1r6;
    @Basic(optional = false)
    @Lob
    @Column(name = "b1r7")
    private String b1r7;
    @Basic(optional = false)
    @Lob
    @Column(name = "b1r8")
    private String b1r8;
    @Basic(optional = false)
    @Column(name = "b1r10")
    private String b1r10;
    @Basic(optional = false)
    @Column(name = "nim")
    private String nim;
    @Basic(optional = false)
    @Column(name = "flag")
    private String flag;
    @Basic(optional = false)
    @Column(name = "flag2")
    private String flag2;
    @Basic(optional = false)
    @Column(name = "timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;
    @JoinColumn(name = "b1r1", referencedColumnName = "Kode")
    @ManyToOne(optional = false)
    private OptionB1r1 b1r1;
    @JoinColumn(name = "b1r4", referencedColumnName = "Kode")
    @ManyToOne(optional = false)
    private OptionB1r4 b1r4;
    @JoinColumn(name = "b1r9", referencedColumnName = "Kode")
    @ManyToOne(optional = false)
    private OptionB1r9 b1r9;

    public B1() {
    }

    public B1(String nks) {
        this.nks = nks;
    }

    public B1(String nks, String b1r2, String b1r3, String b1r5, String b1r6, String b1r7, String b1r8, String b1r10, String nim, String flag, String flag2, Date timestamp) {
        this.nks = nks;
        this.b1r2 = b1r2;
        this.b1r3 = b1r3;
        this.b1r5 = b1r5;
        this.b1r6 = b1r6;
        this.b1r7 = b1r7;
        this.b1r8 = b1r8;
        this.b1r10 = b1r10;
        this.nim = nim;
        this.flag = flag;
        this.flag2 = flag2;
        this.timestamp = timestamp;
    }

    public String getNks() {
        return nks;
    }

    public void setNks(String nks) {
        this.nks = nks;
    }

    public String getB1r2() {
        return b1r2;
    }

    public void setB1r2(String b1r2) {
        this.b1r2 = b1r2;
    }

    public String getB1r3() {
        return b1r3;
    }

    public void setB1r3(String b1r3) {
        this.b1r3 = b1r3;
    }

    public String getB1r5() {
        return b1r5;
    }

    public void setB1r5(String b1r5) {
        this.b1r5 = b1r5;
    }

    public String getB1r6() {
        return b1r6;
    }

    public void setB1r6(String b1r6) {
        this.b1r6 = b1r6;
    }

    public String getB1r7() {
        return b1r7;
    }

    public void setB1r7(String b1r7) {
        this.b1r7 = b1r7;
    }

    public String getB1r8() {
        return b1r8;
    }

    public void setB1r8(String b1r8) {
        this.b1r8 = b1r8;
    }

    public String getB1r10() {
        return b1r10;
    }

    public void setB1r10(String b1r10) {
        this.b1r10 = b1r10;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getFlag2() {
        return flag2;
    }

    public void setFlag2(String flag2) {
        this.flag2 = flag2;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public OptionB1r1 getB1r1() {
        return b1r1;
    }

    public void setB1r1(OptionB1r1 b1r1) {
        this.b1r1 = b1r1;
    }

    public OptionB1r4 getB1r4() {
        return b1r4;
    }

    public void setB1r4(OptionB1r4 b1r4) {
        this.b1r4 = b1r4;
    }

    public OptionB1r9 getB1r9() {
        return b1r9;
    }

    public void setB1r9(OptionB1r9 b1r9) {
        this.b1r9 = b1r9;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nks != null ? nks.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof B1)) {
            return false;
        }
        B1 other = (B1) object;
        if ((this.nks == null && other.nks != null) || (this.nks != null && !this.nks.equals(other.nks))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.model.B1[ nks=" + nks + " ]";
    }

    public B3 getB3() {
        return b3;
    }

    public void setB3(B3 b3) {
        this.b3 = b3;
    }
    
}
