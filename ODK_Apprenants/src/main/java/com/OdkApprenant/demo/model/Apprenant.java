/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.OdkApprenant.demo.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author amagarai.guindo
 */


@Entity

public class Apprenant {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id_apprenant;
    private String nom_apprenant, prenom_apprenant, email_apprenant;
    private int age;
    private long telphone;
    private String login;
    private String password;
    
    
    private String ApprenantStatus;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date create_date;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date modify_date;

    public Apprenant() {
    }

    public Integer getId_apprenant() {
        return id_apprenant;
    }

    public void setId_apprenant(Integer id_apprenant) {
        this.id_apprenant = id_apprenant;
    }

    public String getNom_apprenant() {
        return nom_apprenant;
    }

    public void setNom_apprenant(String nom_apprenant) {
        this.nom_apprenant = nom_apprenant;
    }

    public String getPrenom_apprenant() {
        return prenom_apprenant;
    }

    public void setPrenom_apprenant(String prenom_apprenant) {
        this.prenom_apprenant = prenom_apprenant;
    }

    public String getEmail_apprenant() {
        return email_apprenant;
    }

    public void setEmail_apprenant(String email_apprenant) {
        this.email_apprenant = email_apprenant;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getTelphone() {
        return telphone;
    }

    public void setTelphone(long telphone) {
        this.telphone = telphone;
    }

    public String getLogin_apprenant() {
        return login;
    }

    public void setLogin_apprenant(String login_apprenant) {
        this.login = login_apprenant;
    }

    public String getPassword_apprenant() {
        return password;
    }

    public void setPassword_apprenant(String password_apprenant) {
        this.password = password_apprenant;
    }

    public String getApprenantStatus() {
        return ApprenantStatus;
    }

    public void setApprenantStatus(String ApprenantStatus) {
        this.ApprenantStatus = ApprenantStatus;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getModify_date() {
        return modify_date;
    }

    public void setModify_date(Date modify_date) {
        this.modify_date = modify_date;
    }

    @Override
    public String toString() {
        return "Apprenant{" + "id_apprenant=" + id_apprenant + ", nom_apprenant=" + nom_apprenant + ", prenom_apprenant=" + prenom_apprenant + ", email_apprenant=" + email_apprenant + ", age=" + age + ", telphone=" + telphone + ", login_apprenant=" + login + ", password_apprenant=" + password + ", ApprenantStatus=" + ApprenantStatus + ", create_date=" + create_date + ", modify_date=" + modify_date + '}';
    }
    
    
    
    
    
}
