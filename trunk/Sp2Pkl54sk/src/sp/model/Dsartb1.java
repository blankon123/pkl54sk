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
 * @author StephenCN
 */
@Entity
@Table(name = "dsartb1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dsartb1.findAll", query = "SELECT d FROM Dsartb1 d"),
    @NamedQuery(name = "Dsartb1.findByNbs", query = "SELECT d FROM Dsartb1 d WHERE d.nbs = :nbs"),
    @NamedQuery(name = "Dsartb1.findByB1r2", query = "SELECT d FROM Dsartb1 d WHERE d.b1r2 = :b1r2"),
    @NamedQuery(name = "Dsartb1.findByB1r3", query = "SELECT d FROM Dsartb1 d WHERE d.b1r3 = :b1r3"),
    @NamedQuery(name = "Dsartb1.findByB1r4", query = "SELECT d FROM Dsartb1 d WHERE d.b1r4 = :b1r4"),
    @NamedQuery(name = "Dsartb1.findByB1r5", query = "SELECT d FROM Dsartb1 d WHERE d.b1r5 = :b1r5"),
    @NamedQuery(name = "Dsartb1.findByNim", query = "SELECT d FROM Dsartb1 d WHERE d.nim = :nim"),
    @NamedQuery(name = "Dsartb1.findByFlag", query = "SELECT d FROM Dsartb1 d WHERE d.flag = :flag"),
    @NamedQuery(name = "Dsartb1.findByFlag2", query = "SELECT d FROM Dsartb1 d WHERE d.flag2 = :flag2"),
    @NamedQuery(name = "Dsartb1.findByTimestamp", query = "SELECT d FROM Dsartb1 d WHERE d.timestamp = :timestamp"),
    @NamedQuery(name = "Dsartb1.findByIsLocked", query = "SELECT d FROM Dsartb1 d WHERE d.isLocked = :isLocked")})
public class Dsartb1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nbs")
    private String nbs;
    @Basic(optional = false)
    @Column(name = "b1r2")
    private String b1r2;
    @Basic(optional = false)
    @Column(name = "b1r3")
    private String b1r3;
    @Basic(optional = false)
    @Column(name = "b1r4")
    private String b1r4;
    @Basic(optional = false)
    @Column(name = "b1r5")
    private String b1r5;
    @Basic(optional = false)
    @Lob
    @Column(name = "b1r6s1")
    private String b1r6s1;
    @Basic(optional = false)
    @Lob
    @Column(name = "b1r6s2")
    private String b1r6s2;
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
    @Basic(optional = false)
    @Column(name = "isLocked")
    private String isLocked;
    @JoinColumn(name = "b1r1", referencedColumnName = "Kode")
    @ManyToOne(optional = false)
    private DsartoptionB1r1 b1r1;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "dsartb1")
    private Dsartb2 dsartb2;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "dsartb1")
    private Dsartb3 dsartb3;

    public Dsartb1() {
    }

    public Dsartb1(String nbs) {
        this.nbs = nbs;
    }

    public Dsartb1(String nbs, String b1r2, String b1r3, String b1r4, String b1r5, String b1r6s1, String b1r6s2, String nim, String flag, String flag2, Date timestamp, String isLocked) {
        this.nbs = nbs;
        this.b1r2 = b1r2;
        this.b1r3 = b1r3;
        this.b1r4 = b1r4;
        this.b1r5 = b1r5;
        this.b1r6s1 = b1r6s1;
        this.b1r6s2 = b1r6s2;
        this.nim = nim;
        this.flag = flag;
        this.flag2 = flag2;
        this.timestamp = timestamp;
        this.isLocked = isLocked;
    }

    public String getNbs() {
        return nbs;
    }

    public void setNbs(String nbs) {
        this.nbs = nbs;
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

    public String getB1r4() {
        return b1r4;
    }

    public void setB1r4(String b1r4) {
        this.b1r4 = b1r4;
    }

    public String getB1r5() {
        return b1r5;
    }

    public void setB1r5(String b1r5) {
        this.b1r5 = b1r5;
    }

    public String getB1r6s1() {
        return b1r6s1;
    }

    public void setB1r6s1(String b1r6s1) {
        this.b1r6s1 = b1r6s1;
    }

    public String getB1r6s2() {
        return b1r6s2;
    }

    public void setB1r6s2(String b1r6s2) {
        this.b1r6s2 = b1r6s2;
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

    public String getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(String isLocked) {
        this.isLocked = isLocked;
    }

    public DsartoptionB1r1 getB1r1() {
        return b1r1;
    }

    public void setB1r1(DsartoptionB1r1 b1r1) {
        this.b1r1 = b1r1;
    }

    public Dsartb2 getDsartb2() {
        return dsartb2;
    }

    public void setDsartb2(Dsartb2 dsartb2) {
        this.dsartb2 = dsartb2;
    }

    public Dsartb3 getDsartb3() {
        return dsartb3;
    }

    public void setDsartb3(Dsartb3 dsartb3) {
        this.dsartb3 = dsartb3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nbs != null ? nbs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dsartb1)) {
            return false;
        }
        Dsartb1 other = (Dsartb1) object;
        if ((this.nbs == null && other.nbs != null) || (this.nbs != null && !this.nbs.equals(other.nbs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.model.Dsartb1[ nbs=" + nbs + " ]";
    }
    
}
