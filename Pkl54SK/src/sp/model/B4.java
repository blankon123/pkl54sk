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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ristika Nugraha [12.7350]
 */
@Entity
@Table(name = "b4")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B4.findAll", query = "SELECT b FROM B4 b"),
    @NamedQuery(name = "B4.findByNksb4", query = "SELECT b FROM B4 b WHERE b.nksb4 = :nksb4"),
    @NamedQuery(name = "B4.findByB4br1", query = "SELECT b FROM B4 b WHERE b.b4br1 = :b4br1"),
    @NamedQuery(name = "B4.findByB4br2", query = "SELECT b FROM B4 b WHERE b.b4br2 = :b4br2"),
    @NamedQuery(name = "B4.findByB4br3", query = "SELECT b FROM B4 b WHERE b.b4br3 = :b4br3"),
    @NamedQuery(name = "B4.findByB4br4", query = "SELECT b FROM B4 b WHERE b.b4br4 = :b4br4"),
    @NamedQuery(name = "B4.findByB4br5", query = "SELECT b FROM B4 b WHERE b.b4br5 = :b4br5"),
    @NamedQuery(name = "B4.findByB4br6", query = "SELECT b FROM B4 b WHERE b.b4br6 = :b4br6"),
    @NamedQuery(name = "B4.findByB4br7", query = "SELECT b FROM B4 b WHERE b.b4br7 = :b4br7"),
    @NamedQuery(name = "B4.findByB4br8", query = "SELECT b FROM B4 b WHERE b.b4br8 = :b4br8"),
    @NamedQuery(name = "B4.findByB4br9", query = "SELECT b FROM B4 b WHERE b.b4br9 = :b4br9"),
    @NamedQuery(name = "B4.findByB4br10", query = "SELECT b FROM B4 b WHERE b.b4br10 = :b4br10"),
    @NamedQuery(name = "B4.findByB4br11", query = "SELECT b FROM B4 b WHERE b.b4br11 = :b4br11"),
    @NamedQuery(name = "B4.findByB4br12", query = "SELECT b FROM B4 b WHERE b.b4br12 = :b4br12"),
    @NamedQuery(name = "B4.findByB4br13", query = "SELECT b FROM B4 b WHERE b.b4br13 = :b4br13"),
    @NamedQuery(name = "B4.findByB4br14", query = "SELECT b FROM B4 b WHERE b.b4br14 = :b4br14"),
    @NamedQuery(name = "B4.findByB4br15", query = "SELECT b FROM B4 b WHERE b.b4br15 = :b4br15"),
    @NamedQuery(name = "B4.findByB4br16", query = "SELECT b FROM B4 b WHERE b.b4br16 = :b4br16"),
    @NamedQuery(name = "B4.findByB4br17", query = "SELECT b FROM B4 b WHERE b.b4br17 = :b4br17"),
    @NamedQuery(name = "B4.findByB4br18", query = "SELECT b FROM B4 b WHERE b.b4br18 = :b4br18"),
    @NamedQuery(name = "B4.findByB4br19", query = "SELECT b FROM B4 b WHERE b.b4br19 = :b4br19"),
    @NamedQuery(name = "B4.findByB4br20", query = "SELECT b FROM B4 b WHERE b.b4br20 = :b4br20"),
    @NamedQuery(name = "B4.findByB4br21", query = "SELECT b FROM B4 b WHERE b.b4br21 = :b4br21"),
    @NamedQuery(name = "B4.findByB4br22", query = "SELECT b FROM B4 b WHERE b.b4br22 = :b4br22"),
    @NamedQuery(name = "B4.findByB4br23", query = "SELECT b FROM B4 b WHERE b.b4br23 = :b4br23"),
    @NamedQuery(name = "B4.findByB4br24", query = "SELECT b FROM B4 b WHERE b.b4br24 = :b4br24"),
    @NamedQuery(name = "B4.findByB4br25", query = "SELECT b FROM B4 b WHERE b.b4br25 = :b4br25"),
    @NamedQuery(name = "B4.findByB4br26", query = "SELECT b FROM B4 b WHERE b.b4br26 = :b4br26"),
    @NamedQuery(name = "B4.findByB4br27", query = "SELECT b FROM B4 b WHERE b.b4br27 = :b4br27"),
    @NamedQuery(name = "B4.findByB4br28", query = "SELECT b FROM B4 b WHERE b.b4br28 = :b4br28"),
    @NamedQuery(name = "B4.findByB4br29", query = "SELECT b FROM B4 b WHERE b.b4br29 = :b4br29"),
    @NamedQuery(name = "B4.findByB4br30", query = "SELECT b FROM B4 b WHERE b.b4br30 = :b4br30"),
    @NamedQuery(name = "B4.findByB4br31", query = "SELECT b FROM B4 b WHERE b.b4br31 = :b4br31"),
    @NamedQuery(name = "B4.findByB4br32", query = "SELECT b FROM B4 b WHERE b.b4br32 = :b4br32"),
    @NamedQuery(name = "B4.findByB4br33", query = "SELECT b FROM B4 b WHERE b.b4br33 = :b4br33"),
    @NamedQuery(name = "B4.findByB4br34", query = "SELECT b FROM B4 b WHERE b.b4br34 = :b4br34"),
    @NamedQuery(name = "B4.findByB4br35", query = "SELECT b FROM B4 b WHERE b.b4br35 = :b4br35"),
    @NamedQuery(name = "B4.findByB4br36", query = "SELECT b FROM B4 b WHERE b.b4br36 = :b4br36"),
    @NamedQuery(name = "B4.findByB4br37", query = "SELECT b FROM B4 b WHERE b.b4br37 = :b4br37"),
    @NamedQuery(name = "B4.findByB4br38", query = "SELECT b FROM B4 b WHERE b.b4br38 = :b4br38"),
    @NamedQuery(name = "B4.findByB4br39", query = "SELECT b FROM B4 b WHERE b.b4br39 = :b4br39"),
    @NamedQuery(name = "B4.findByB4br40", query = "SELECT b FROM B4 b WHERE b.b4br40 = :b4br40"),
    @NamedQuery(name = "B4.findByB4br41", query = "SELECT b FROM B4 b WHERE b.b4br41 = :b4br41"),
    @NamedQuery(name = "B4.findByB4br42", query = "SELECT b FROM B4 b WHERE b.b4br42 = :b4br42"),
    @NamedQuery(name = "B4.findByB4br43", query = "SELECT b FROM B4 b WHERE b.b4br43 = :b4br43"),
    @NamedQuery(name = "B4.findByB4br44", query = "SELECT b FROM B4 b WHERE b.b4br44 = :b4br44"),
    @NamedQuery(name = "B4.findByB4br45", query = "SELECT b FROM B4 b WHERE b.b4br45 = :b4br45"),
    @NamedQuery(name = "B4.findByB4br46", query = "SELECT b FROM B4 b WHERE b.b4br46 = :b4br46"),
    @NamedQuery(name = "B4.findByB4br47", query = "SELECT b FROM B4 b WHERE b.b4br47 = :b4br47"),
    @NamedQuery(name = "B4.findByB4br48", query = "SELECT b FROM B4 b WHERE b.b4br48 = :b4br48"),
    @NamedQuery(name = "B4.findByB4br49", query = "SELECT b FROM B4 b WHERE b.b4br49 = :b4br49"),
    @NamedQuery(name = "B4.findByB4br50", query = "SELECT b FROM B4 b WHERE b.b4br50 = :b4br50"),
    @NamedQuery(name = "B4.findByB4br51", query = "SELECT b FROM B4 b WHERE b.b4br51 = :b4br51"),
    @NamedQuery(name = "B4.findByB4br52", query = "SELECT b FROM B4 b WHERE b.b4br52 = :b4br52"),
    @NamedQuery(name = "B4.findByB4br53", query = "SELECT b FROM B4 b WHERE b.b4br53 = :b4br53"),
    @NamedQuery(name = "B4.findByB4br54", query = "SELECT b FROM B4 b WHERE b.b4br54 = :b4br54"),
    @NamedQuery(name = "B4.findByB4br55", query = "SELECT b FROM B4 b WHERE b.b4br55 = :b4br55"),
    @NamedQuery(name = "B4.findByB4br56", query = "SELECT b FROM B4 b WHERE b.b4br56 = :b4br56"),
    @NamedQuery(name = "B4.findByB4br57", query = "SELECT b FROM B4 b WHERE b.b4br57 = :b4br57"),
    @NamedQuery(name = "B4.findByB4br58", query = "SELECT b FROM B4 b WHERE b.b4br58 = :b4br58"),
    @NamedQuery(name = "B4.findByB4br59", query = "SELECT b FROM B4 b WHERE b.b4br59 = :b4br59"),
    @NamedQuery(name = "B4.findByB4br60", query = "SELECT b FROM B4 b WHERE b.b4br60 = :b4br60"),
    @NamedQuery(name = "B4.findByB4br61", query = "SELECT b FROM B4 b WHERE b.b4br61 = :b4br61"),
    @NamedQuery(name = "B4.findByB4br62", query = "SELECT b FROM B4 b WHERE b.b4br62 = :b4br62"),
    @NamedQuery(name = "B4.findByB4br63", query = "SELECT b FROM B4 b WHERE b.b4br63 = :b4br63"),
    @NamedQuery(name = "B4.findByB4br64", query = "SELECT b FROM B4 b WHERE b.b4br64 = :b4br64")})
public class B4 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nksb4")
    private String nksb4;
    @Basic(optional = false)
    @Column(name = "b4br1")
    private String b4br1;
    @Basic(optional = false)
    @Column(name = "b4br2")
    private String b4br2;
    @Basic(optional = false)
    @Column(name = "b4br3")
    private String b4br3;
    @Basic(optional = false)
    @Column(name = "b4br4")
    private String b4br4;
    @Basic(optional = false)
    @Column(name = "b4br5")
    private String b4br5;
    @Basic(optional = false)
    @Column(name = "b4br6")
    private String b4br6;
    @Basic(optional = false)
    @Column(name = "b4br7")
    private String b4br7;
    @Basic(optional = false)
    @Column(name = "b4br8")
    private String b4br8;
    @Basic(optional = false)
    @Column(name = "b4br9")
    private String b4br9;
    @Basic(optional = false)
    @Column(name = "b4br10")
    private String b4br10;
    @Basic(optional = false)
    @Column(name = "b4br11")
    private String b4br11;
    @Basic(optional = false)
    @Column(name = "b4br12")
    private String b4br12;
    @Basic(optional = false)
    @Column(name = "b4br13")
    private String b4br13;
    @Basic(optional = false)
    @Column(name = "b4br14")
    private String b4br14;
    @Basic(optional = false)
    @Column(name = "b4br15")
    private String b4br15;
    @Basic(optional = false)
    @Column(name = "b4br16")
    private String b4br16;
    @Basic(optional = false)
    @Column(name = "b4br17")
    private String b4br17;
    @Basic(optional = false)
    @Column(name = "b4br18")
    private String b4br18;
    @Basic(optional = false)
    @Column(name = "b4br19")
    private String b4br19;
    @Basic(optional = false)
    @Column(name = "b4br20")
    private String b4br20;
    @Basic(optional = false)
    @Column(name = "b4br21")
    private String b4br21;
    @Basic(optional = false)
    @Column(name = "b4br22")
    private String b4br22;
    @Basic(optional = false)
    @Column(name = "b4br23")
    private String b4br23;
    @Basic(optional = false)
    @Column(name = "b4br24")
    private String b4br24;
    @Basic(optional = false)
    @Column(name = "b4br25")
    private String b4br25;
    @Basic(optional = false)
    @Column(name = "b4br26")
    private String b4br26;
    @Basic(optional = false)
    @Column(name = "b4br27")
    private String b4br27;
    @Basic(optional = false)
    @Column(name = "b4br28")
    private String b4br28;
    @Basic(optional = false)
    @Column(name = "b4br29")
    private String b4br29;
    @Basic(optional = false)
    @Column(name = "b4br30")
    private String b4br30;
    @Basic(optional = false)
    @Column(name = "b4br31")
    private String b4br31;
    @Basic(optional = false)
    @Column(name = "b4br32")
    private String b4br32;
    @Basic(optional = false)
    @Column(name = "b4br33")
    private String b4br33;
    @Basic(optional = false)
    @Column(name = "b4br34")
    private String b4br34;
    @Basic(optional = false)
    @Column(name = "b4br35")
    private String b4br35;
    @Basic(optional = false)
    @Column(name = "b4br36")
    private String b4br36;
    @Basic(optional = false)
    @Column(name = "b4br37")
    private String b4br37;
    @Basic(optional = false)
    @Column(name = "b4br38")
    private String b4br38;
    @Basic(optional = false)
    @Column(name = "b4br39")
    private String b4br39;
    @Basic(optional = false)
    @Column(name = "b4br40")
    private String b4br40;
    @Basic(optional = false)
    @Column(name = "b4br41")
    private String b4br41;
    @Basic(optional = false)
    @Column(name = "b4br42")
    private String b4br42;
    @Basic(optional = false)
    @Column(name = "b4br43")
    private String b4br43;
    @Basic(optional = false)
    @Column(name = "b4br44")
    private String b4br44;
    @Basic(optional = false)
    @Column(name = "b4br45")
    private String b4br45;
    @Basic(optional = false)
    @Column(name = "b4br46")
    private String b4br46;
    @Basic(optional = false)
    @Column(name = "b4br47")
    private String b4br47;
    @Basic(optional = false)
    @Column(name = "b4br48")
    private String b4br48;
    @Basic(optional = false)
    @Column(name = "b4br49")
    private String b4br49;
    @Basic(optional = false)
    @Column(name = "b4br50")
    private String b4br50;
    @Basic(optional = false)
    @Column(name = "b4br51")
    private String b4br51;
    @Basic(optional = false)
    @Column(name = "b4br52")
    private String b4br52;
    @Basic(optional = false)
    @Column(name = "b4br53")
    private String b4br53;
    @Basic(optional = false)
    @Column(name = "b4br54")
    private String b4br54;
    @Basic(optional = false)
    @Column(name = "b4br55")
    private String b4br55;
    @Basic(optional = false)
    @Column(name = "b4br56")
    private String b4br56;
    @Basic(optional = false)
    @Column(name = "b4br57")
    private String b4br57;
    @Basic(optional = false)
    @Column(name = "b4br58")
    private String b4br58;
    @Basic(optional = false)
    @Column(name = "b4br59")
    private String b4br59;
    @Basic(optional = false)
    @Column(name = "b4br60")
    private String b4br60;
    @Basic(optional = false)
    @Column(name = "b4br61")
    private String b4br61;
    @Basic(optional = false)
    @Column(name = "b4br62")
    private String b4br62;
    @Basic(optional = false)
    @Column(name = "b4br63")
    private String b4br63;
    @Basic(optional = false)
    @Column(name = "b4br64")
    private String b4br64;
    @JoinColumn(name = "b4ar12", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar12;
    @JoinColumn(name = "b4ar9", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar9;
    @JoinColumn(name = "nksb4", referencedColumnName = "nks", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private B1 b1;
    @JoinColumn(name = "b4ar10", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar10;
    @JoinColumn(name = "b4ar20", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar20;
    @JoinColumn(name = "b4ar26", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar26;
    @JoinColumn(name = "b4ar11", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar11;
    @JoinColumn(name = "b4ar13", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar13;
    @JoinColumn(name = "b4ar27", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar27;
    @JoinColumn(name = "b4ar5", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar5;
    @JoinColumn(name = "b4ar2", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar2;
    @JoinColumn(name = "b4ar14", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar14;
    @JoinColumn(name = "b4ar15", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar15;
    @JoinColumn(name = "b4ar22", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar22;
    @JoinColumn(name = "b4ar3", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar3;
    @JoinColumn(name = "b4ar4", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar4;
    @JoinColumn(name = "b4ar16", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar16;
    @JoinColumn(name = "b4ar19", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar19;
    @JoinColumn(name = "b4ar21", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar21;
    @JoinColumn(name = "b4ar23", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar23;
    @JoinColumn(name = "b4ar8", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar8;
    @JoinColumn(name = "b4ar17", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar17;
    @JoinColumn(name = "b4ar6", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar6;
    @JoinColumn(name = "b4ar1", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar1;
    @JoinColumn(name = "b4ar18", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar18;
    @JoinColumn(name = "b4ar25", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar25;
    @JoinColumn(name = "b4ar24", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar24;
    @JoinColumn(name = "b4ar7", referencedColumnName = "kode")
    @ManyToOne(optional = false)
    private OpsiTingkatKeseringan b4ar7;

    public B4() {
    }

    public B4(String nksb4) {
        this.nksb4 = nksb4;
    }

    public B4(String nksb4, String b4br1, String b4br2, String b4br3, String b4br4, String b4br5, String b4br6, String b4br7, String b4br8, String b4br9, String b4br10, String b4br11, String b4br12, String b4br13, String b4br14, String b4br15, String b4br16, String b4br17, String b4br18, String b4br19, String b4br20, String b4br21, String b4br22, String b4br23, String b4br24, String b4br25, String b4br26, String b4br27, String b4br28, String b4br29, String b4br30, String b4br31, String b4br32, String b4br33, String b4br34, String b4br35, String b4br36, String b4br37, String b4br38, String b4br39, String b4br40, String b4br41, String b4br42, String b4br43, String b4br44, String b4br45, String b4br46, String b4br47, String b4br48, String b4br49, String b4br50, String b4br51, String b4br52, String b4br53, String b4br54, String b4br55, String b4br56, String b4br57, String b4br58, String b4br59, String b4br60, String b4br61, String b4br62, String b4br63, String b4br64) {
        this.nksb4 = nksb4;
        this.b4br1 = b4br1;
        this.b4br2 = b4br2;
        this.b4br3 = b4br3;
        this.b4br4 = b4br4;
        this.b4br5 = b4br5;
        this.b4br6 = b4br6;
        this.b4br7 = b4br7;
        this.b4br8 = b4br8;
        this.b4br9 = b4br9;
        this.b4br10 = b4br10;
        this.b4br11 = b4br11;
        this.b4br12 = b4br12;
        this.b4br13 = b4br13;
        this.b4br14 = b4br14;
        this.b4br15 = b4br15;
        this.b4br16 = b4br16;
        this.b4br17 = b4br17;
        this.b4br18 = b4br18;
        this.b4br19 = b4br19;
        this.b4br20 = b4br20;
        this.b4br21 = b4br21;
        this.b4br22 = b4br22;
        this.b4br23 = b4br23;
        this.b4br24 = b4br24;
        this.b4br25 = b4br25;
        this.b4br26 = b4br26;
        this.b4br27 = b4br27;
        this.b4br28 = b4br28;
        this.b4br29 = b4br29;
        this.b4br30 = b4br30;
        this.b4br31 = b4br31;
        this.b4br32 = b4br32;
        this.b4br33 = b4br33;
        this.b4br34 = b4br34;
        this.b4br35 = b4br35;
        this.b4br36 = b4br36;
        this.b4br37 = b4br37;
        this.b4br38 = b4br38;
        this.b4br39 = b4br39;
        this.b4br40 = b4br40;
        this.b4br41 = b4br41;
        this.b4br42 = b4br42;
        this.b4br43 = b4br43;
        this.b4br44 = b4br44;
        this.b4br45 = b4br45;
        this.b4br46 = b4br46;
        this.b4br47 = b4br47;
        this.b4br48 = b4br48;
        this.b4br49 = b4br49;
        this.b4br50 = b4br50;
        this.b4br51 = b4br51;
        this.b4br52 = b4br52;
        this.b4br53 = b4br53;
        this.b4br54 = b4br54;
        this.b4br55 = b4br55;
        this.b4br56 = b4br56;
        this.b4br57 = b4br57;
        this.b4br58 = b4br58;
        this.b4br59 = b4br59;
        this.b4br60 = b4br60;
        this.b4br61 = b4br61;
        this.b4br62 = b4br62;
        this.b4br63 = b4br63;
        this.b4br64 = b4br64;
    }

    public String getNksb4() {
        return nksb4;
    }

    public void setNksb4(String nksb4) {
        this.nksb4 = nksb4;
    }

    public String getB4br1() {
        return b4br1;
    }

    public void setB4br1(String b4br1) {
        this.b4br1 = b4br1;
    }

    public String getB4br2() {
        return b4br2;
    }

    public void setB4br2(String b4br2) {
        this.b4br2 = b4br2;
    }

    public String getB4br3() {
        return b4br3;
    }

    public void setB4br3(String b4br3) {
        this.b4br3 = b4br3;
    }

    public String getB4br4() {
        return b4br4;
    }

    public void setB4br4(String b4br4) {
        this.b4br4 = b4br4;
    }

    public String getB4br5() {
        return b4br5;
    }

    public void setB4br5(String b4br5) {
        this.b4br5 = b4br5;
    }

    public String getB4br6() {
        return b4br6;
    }

    public void setB4br6(String b4br6) {
        this.b4br6 = b4br6;
    }

    public String getB4br7() {
        return b4br7;
    }

    public void setB4br7(String b4br7) {
        this.b4br7 = b4br7;
    }

    public String getB4br8() {
        return b4br8;
    }

    public void setB4br8(String b4br8) {
        this.b4br8 = b4br8;
    }

    public String getB4br9() {
        return b4br9;
    }

    public void setB4br9(String b4br9) {
        this.b4br9 = b4br9;
    }

    public String getB4br10() {
        return b4br10;
    }

    public void setB4br10(String b4br10) {
        this.b4br10 = b4br10;
    }

    public String getB4br11() {
        return b4br11;
    }

    public void setB4br11(String b4br11) {
        this.b4br11 = b4br11;
    }

    public String getB4br12() {
        return b4br12;
    }

    public void setB4br12(String b4br12) {
        this.b4br12 = b4br12;
    }

    public String getB4br13() {
        return b4br13;
    }

    public void setB4br13(String b4br13) {
        this.b4br13 = b4br13;
    }

    public String getB4br14() {
        return b4br14;
    }

    public void setB4br14(String b4br14) {
        this.b4br14 = b4br14;
    }

    public String getB4br15() {
        return b4br15;
    }

    public void setB4br15(String b4br15) {
        this.b4br15 = b4br15;
    }

    public String getB4br16() {
        return b4br16;
    }

    public void setB4br16(String b4br16) {
        this.b4br16 = b4br16;
    }

    public String getB4br17() {
        return b4br17;
    }

    public void setB4br17(String b4br17) {
        this.b4br17 = b4br17;
    }

    public String getB4br18() {
        return b4br18;
    }

    public void setB4br18(String b4br18) {
        this.b4br18 = b4br18;
    }

    public String getB4br19() {
        return b4br19;
    }

    public void setB4br19(String b4br19) {
        this.b4br19 = b4br19;
    }

    public String getB4br20() {
        return b4br20;
    }

    public void setB4br20(String b4br20) {
        this.b4br20 = b4br20;
    }

    public String getB4br21() {
        return b4br21;
    }

    public void setB4br21(String b4br21) {
        this.b4br21 = b4br21;
    }

    public String getB4br22() {
        return b4br22;
    }

    public void setB4br22(String b4br22) {
        this.b4br22 = b4br22;
    }

    public String getB4br23() {
        return b4br23;
    }

    public void setB4br23(String b4br23) {
        this.b4br23 = b4br23;
    }

    public String getB4br24() {
        return b4br24;
    }

    public void setB4br24(String b4br24) {
        this.b4br24 = b4br24;
    }

    public String getB4br25() {
        return b4br25;
    }

    public void setB4br25(String b4br25) {
        this.b4br25 = b4br25;
    }

    public String getB4br26() {
        return b4br26;
    }

    public void setB4br26(String b4br26) {
        this.b4br26 = b4br26;
    }

    public String getB4br27() {
        return b4br27;
    }

    public void setB4br27(String b4br27) {
        this.b4br27 = b4br27;
    }

    public String getB4br28() {
        return b4br28;
    }

    public void setB4br28(String b4br28) {
        this.b4br28 = b4br28;
    }

    public String getB4br29() {
        return b4br29;
    }

    public void setB4br29(String b4br29) {
        this.b4br29 = b4br29;
    }

    public String getB4br30() {
        return b4br30;
    }

    public void setB4br30(String b4br30) {
        this.b4br30 = b4br30;
    }

    public String getB4br31() {
        return b4br31;
    }

    public void setB4br31(String b4br31) {
        this.b4br31 = b4br31;
    }

    public String getB4br32() {
        return b4br32;
    }

    public void setB4br32(String b4br32) {
        this.b4br32 = b4br32;
    }

    public String getB4br33() {
        return b4br33;
    }

    public void setB4br33(String b4br33) {
        this.b4br33 = b4br33;
    }

    public String getB4br34() {
        return b4br34;
    }

    public void setB4br34(String b4br34) {
        this.b4br34 = b4br34;
    }

    public String getB4br35() {
        return b4br35;
    }

    public void setB4br35(String b4br35) {
        this.b4br35 = b4br35;
    }

    public String getB4br36() {
        return b4br36;
    }

    public void setB4br36(String b4br36) {
        this.b4br36 = b4br36;
    }

    public String getB4br37() {
        return b4br37;
    }

    public void setB4br37(String b4br37) {
        this.b4br37 = b4br37;
    }

    public String getB4br38() {
        return b4br38;
    }

    public void setB4br38(String b4br38) {
        this.b4br38 = b4br38;
    }

    public String getB4br39() {
        return b4br39;
    }

    public void setB4br39(String b4br39) {
        this.b4br39 = b4br39;
    }

    public String getB4br40() {
        return b4br40;
    }

    public void setB4br40(String b4br40) {
        this.b4br40 = b4br40;
    }

    public String getB4br41() {
        return b4br41;
    }

    public void setB4br41(String b4br41) {
        this.b4br41 = b4br41;
    }

    public String getB4br42() {
        return b4br42;
    }

    public void setB4br42(String b4br42) {
        this.b4br42 = b4br42;
    }

    public String getB4br43() {
        return b4br43;
    }

    public void setB4br43(String b4br43) {
        this.b4br43 = b4br43;
    }

    public String getB4br44() {
        return b4br44;
    }

    public void setB4br44(String b4br44) {
        this.b4br44 = b4br44;
    }

    public String getB4br45() {
        return b4br45;
    }

    public void setB4br45(String b4br45) {
        this.b4br45 = b4br45;
    }

    public String getB4br46() {
        return b4br46;
    }

    public void setB4br46(String b4br46) {
        this.b4br46 = b4br46;
    }

    public String getB4br47() {
        return b4br47;
    }

    public void setB4br47(String b4br47) {
        this.b4br47 = b4br47;
    }

    public String getB4br48() {
        return b4br48;
    }

    public void setB4br48(String b4br48) {
        this.b4br48 = b4br48;
    }

    public String getB4br49() {
        return b4br49;
    }

    public void setB4br49(String b4br49) {
        this.b4br49 = b4br49;
    }

    public String getB4br50() {
        return b4br50;
    }

    public void setB4br50(String b4br50) {
        this.b4br50 = b4br50;
    }

    public String getB4br51() {
        return b4br51;
    }

    public void setB4br51(String b4br51) {
        this.b4br51 = b4br51;
    }

    public String getB4br52() {
        return b4br52;
    }

    public void setB4br52(String b4br52) {
        this.b4br52 = b4br52;
    }

    public String getB4br53() {
        return b4br53;
    }

    public void setB4br53(String b4br53) {
        this.b4br53 = b4br53;
    }

    public String getB4br54() {
        return b4br54;
    }

    public void setB4br54(String b4br54) {
        this.b4br54 = b4br54;
    }

    public String getB4br55() {
        return b4br55;
    }

    public void setB4br55(String b4br55) {
        this.b4br55 = b4br55;
    }

    public String getB4br56() {
        return b4br56;
    }

    public void setB4br56(String b4br56) {
        this.b4br56 = b4br56;
    }

    public String getB4br57() {
        return b4br57;
    }

    public void setB4br57(String b4br57) {
        this.b4br57 = b4br57;
    }

    public String getB4br58() {
        return b4br58;
    }

    public void setB4br58(String b4br58) {
        this.b4br58 = b4br58;
    }

    public String getB4br59() {
        return b4br59;
    }

    public void setB4br59(String b4br59) {
        this.b4br59 = b4br59;
    }

    public String getB4br60() {
        return b4br60;
    }

    public void setB4br60(String b4br60) {
        this.b4br60 = b4br60;
    }

    public String getB4br61() {
        return b4br61;
    }

    public void setB4br61(String b4br61) {
        this.b4br61 = b4br61;
    }

    public String getB4br62() {
        return b4br62;
    }

    public void setB4br62(String b4br62) {
        this.b4br62 = b4br62;
    }

    public String getB4br63() {
        return b4br63;
    }

    public void setB4br63(String b4br63) {
        this.b4br63 = b4br63;
    }

    public String getB4br64() {
        return b4br64;
    }

    public void setB4br64(String b4br64) {
        this.b4br64 = b4br64;
    }

    public OpsiTingkatKeseringan getB4ar12() {
        return b4ar12;
    }

    public void setB4ar12(OpsiTingkatKeseringan b4ar12) {
        this.b4ar12 = b4ar12;
    }

    public OpsiTingkatKeseringan getB4ar9() {
        return b4ar9;
    }

    public void setB4ar9(OpsiTingkatKeseringan b4ar9) {
        this.b4ar9 = b4ar9;
    }

    public B1 getB1() {
        return b1;
    }

    public void setB1(B1 b1) {
        this.b1 = b1;
    }

    public OpsiTingkatKeseringan getB4ar10() {
        return b4ar10;
    }

    public void setB4ar10(OpsiTingkatKeseringan b4ar10) {
        this.b4ar10 = b4ar10;
    }

    public OpsiTingkatKeseringan getB4ar20() {
        return b4ar20;
    }

    public void setB4ar20(OpsiTingkatKeseringan b4ar20) {
        this.b4ar20 = b4ar20;
    }

    public OpsiTingkatKeseringan getB4ar26() {
        return b4ar26;
    }

    public void setB4ar26(OpsiTingkatKeseringan b4ar26) {
        this.b4ar26 = b4ar26;
    }

    public OpsiTingkatKeseringan getB4ar11() {
        return b4ar11;
    }

    public void setB4ar11(OpsiTingkatKeseringan b4ar11) {
        this.b4ar11 = b4ar11;
    }

    public OpsiTingkatKeseringan getB4ar13() {
        return b4ar13;
    }

    public void setB4ar13(OpsiTingkatKeseringan b4ar13) {
        this.b4ar13 = b4ar13;
    }

    public OpsiTingkatKeseringan getB4ar27() {
        return b4ar27;
    }

    public void setB4ar27(OpsiTingkatKeseringan b4ar27) {
        this.b4ar27 = b4ar27;
    }

    public OpsiTingkatKeseringan getB4ar5() {
        return b4ar5;
    }

    public void setB4ar5(OpsiTingkatKeseringan b4ar5) {
        this.b4ar5 = b4ar5;
    }

    public OpsiTingkatKeseringan getB4ar2() {
        return b4ar2;
    }

    public void setB4ar2(OpsiTingkatKeseringan b4ar2) {
        this.b4ar2 = b4ar2;
    }

    public OpsiTingkatKeseringan getB4ar14() {
        return b4ar14;
    }

    public void setB4ar14(OpsiTingkatKeseringan b4ar14) {
        this.b4ar14 = b4ar14;
    }

    public OpsiTingkatKeseringan getB4ar15() {
        return b4ar15;
    }

    public void setB4ar15(OpsiTingkatKeseringan b4ar15) {
        this.b4ar15 = b4ar15;
    }

    public OpsiTingkatKeseringan getB4ar22() {
        return b4ar22;
    }

    public void setB4ar22(OpsiTingkatKeseringan b4ar22) {
        this.b4ar22 = b4ar22;
    }

    public OpsiTingkatKeseringan getB4ar3() {
        return b4ar3;
    }

    public void setB4ar3(OpsiTingkatKeseringan b4ar3) {
        this.b4ar3 = b4ar3;
    }

    public OpsiTingkatKeseringan getB4ar4() {
        return b4ar4;
    }

    public void setB4ar4(OpsiTingkatKeseringan b4ar4) {
        this.b4ar4 = b4ar4;
    }

    public OpsiTingkatKeseringan getB4ar16() {
        return b4ar16;
    }

    public void setB4ar16(OpsiTingkatKeseringan b4ar16) {
        this.b4ar16 = b4ar16;
    }

    public OpsiTingkatKeseringan getB4ar19() {
        return b4ar19;
    }

    public void setB4ar19(OpsiTingkatKeseringan b4ar19) {
        this.b4ar19 = b4ar19;
    }

    public OpsiTingkatKeseringan getB4ar21() {
        return b4ar21;
    }

    public void setB4ar21(OpsiTingkatKeseringan b4ar21) {
        this.b4ar21 = b4ar21;
    }

    public OpsiTingkatKeseringan getB4ar23() {
        return b4ar23;
    }

    public void setB4ar23(OpsiTingkatKeseringan b4ar23) {
        this.b4ar23 = b4ar23;
    }

    public OpsiTingkatKeseringan getB4ar8() {
        return b4ar8;
    }

    public void setB4ar8(OpsiTingkatKeseringan b4ar8) {
        this.b4ar8 = b4ar8;
    }

    public OpsiTingkatKeseringan getB4ar17() {
        return b4ar17;
    }

    public void setB4ar17(OpsiTingkatKeseringan b4ar17) {
        this.b4ar17 = b4ar17;
    }

    public OpsiTingkatKeseringan getB4ar6() {
        return b4ar6;
    }

    public void setB4ar6(OpsiTingkatKeseringan b4ar6) {
        this.b4ar6 = b4ar6;
    }

    public OpsiTingkatKeseringan getB4ar1() {
        return b4ar1;
    }

    public void setB4ar1(OpsiTingkatKeseringan b4ar1) {
        this.b4ar1 = b4ar1;
    }

    public OpsiTingkatKeseringan getB4ar18() {
        return b4ar18;
    }

    public void setB4ar18(OpsiTingkatKeseringan b4ar18) {
        this.b4ar18 = b4ar18;
    }

    public OpsiTingkatKeseringan getB4ar25() {
        return b4ar25;
    }

    public void setB4ar25(OpsiTingkatKeseringan b4ar25) {
        this.b4ar25 = b4ar25;
    }

    public OpsiTingkatKeseringan getB4ar24() {
        return b4ar24;
    }

    public void setB4ar24(OpsiTingkatKeseringan b4ar24) {
        this.b4ar24 = b4ar24;
    }

    public OpsiTingkatKeseringan getB4ar7() {
        return b4ar7;
    }

    public void setB4ar7(OpsiTingkatKeseringan b4ar7) {
        this.b4ar7 = b4ar7;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nksb4 != null ? nksb4.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof B4)) {
            return false;
        }
        B4 other = (B4) object;
        if ((this.nksb4 == null && other.nksb4 != null) || (this.nksb4 != null && !this.nksb4.equals(other.nksb4))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.model.B4[ nksb4=" + nksb4 + " ]";
    }
    
}
