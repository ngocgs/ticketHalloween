/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ticket.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nguye
 */
@Entity
@Table(name = "TICKET2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ticket2.findAll", query = "SELECT t FROM Ticket2 t")
    , @NamedQuery(name = "Ticket2.findByRollnumber", query = "SELECT t FROM Ticket2 t WHERE t.rollnumber = :rollnumber")
    , @NamedQuery(name = "Ticket2.findByName", query = "SELECT t FROM Ticket2 t WHERE t.name = :name")
    , @NamedQuery(name = "Ticket2.findByClass1", query = "SELECT t FROM Ticket2 t WHERE t.class1 = :class1")
    , @NamedQuery(name = "Ticket2.findByEmail", query = "SELECT t FROM Ticket2 t WHERE t.email = :email")})
public class Ticket2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROLLNUMBER")
    private Long rollnumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "CLASS")
    private String class1;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "EMAIL")
    private String email;

    public Ticket2() {
    }

    public Ticket2(Long rollnumber) {
        this.rollnumber = rollnumber;
    }

    public Ticket2(Long rollnumber, String name, String class1, String email) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.class1 = class1;
        this.email = email;
    }

    public Long getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(Long rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rollnumber != null ? rollnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ticket2)) {
            return false;
        }
        Ticket2 other = (Ticket2) object;
        if ((this.rollnumber == null && other.rollnumber != null) || (this.rollnumber != null && !this.rollnumber.equals(other.rollnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ticket.entity.Ticket2[ rollnumber=" + rollnumber + " ]";
    }
    
}
