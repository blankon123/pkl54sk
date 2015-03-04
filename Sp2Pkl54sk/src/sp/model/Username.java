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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thosan Girisona S
 */
@Entity
@Table(name = "username")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Username.findAll", query = "SELECT u FROM Username u"),
    @NamedQuery(name = "Username.findByUser", query = "SELECT u FROM Username u WHERE u.user = :user"),
    @NamedQuery(name = "Username.findByPw", query = "SELECT u FROM Username u WHERE u.pw = :pw"),
    @NamedQuery(name = "Username.findByNama", query = "SELECT u FROM Username u WHERE u.nama = :nama")})
public class Username implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "user")
    private String user;
    @Basic(optional = false)
    @Column(name = "pw")
    private String pw;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;

    public Username() {
    }

    public Username(String user) {
        this.user = user;
    }

    public Username(String user, String pw, String nama) {
        this.user = user;
        this.pw = pw;
        this.nama = nama;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (user != null ? user.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Username)) {
            return false;
        }
        Username other = (Username) object;
        if ((this.user == null && other.user != null) || (this.user != null && !this.user.equals(other.user))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.model.Username[ user=" + user + " ]";
    }
    
}
