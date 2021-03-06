/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.house9ja.housenaija.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

/**
 *
 * @author bokon
 */
@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "surname", nullable = false, length = 50, columnDefinition = "VARCHAR(50)")
    private String surname;

    @Column(name = "other_names", nullable = false, length = 50, columnDefinition = "VARCHAR(50)")
    private String otherNames;

    @Column(name = "gender", nullable = false, length = 7, columnDefinition = "VARCHAR(7)")
    private String gender;

    @Column(name = "age_range", nullable = false, length = 5, columnDefinition = "VARCHAR(5)")
    private String ageRange;

    @Column(name = "country", nullable = false, length = 30, columnDefinition = "VARCHAR(30)")
    private String country = "NIGERIA";

    @Column(name = "user_state", nullable = false, length = 30, columnDefinition = "VARCHAR(30)")
    private String userState;

    @Column(name = "lga", nullable = false, length = 50, columnDefinition = "VARCHAR(50)")
    private String lga;

    @Column(name = "contact_address", nullable = false, length = 50, columnDefinition = "VARCHAR(50)")
    private String address;

    @Column(name = "specialization", nullable = false, length = 30, columnDefinition = "VARCHAR(30)")
    private String specialization;

    @Email
    @Column(name = "email", nullable = false, length = 50, columnDefinition = "VARCHAR(50)")
    private String email;

    @Column(name = "email_confirmed", nullable = false, columnDefinition = "BOOLEAN")
    private String emailConfirmed;

    @Column(name = "phone_numer", nullable = false, length = 11, columnDefinition = "VARCHAR(11)")
    private String phoneNumber;

    @Column(name = "user_type", nullable = false, length = 7, columnDefinition = "VARCHAR(7)")
    private String userType;

    @Column(name = "username", nullable = false, length = 15, columnDefinition = "VARCHAR(15)")
    private String username;

    @Transient
    @Size(min = 6)
    private String password;

    @Column(name = "encrypted_password", nullable = false, length = 255, columnDefinition = "VARCHAR(255)")
    private String encryptedPassword;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles = new ArrayList<>();

    @Column(name = "failed_attempts", columnDefinition = "INT")
    private int failedAttempts = 0;

    @Column(name = "picture", nullable = false, length = 255, columnDefinition = "VARCHAR(255)")
    private String picture;

    @Column(name = "membership", nullable = false, length = 10, columnDefinition = "VARCHAR(10)")
    private String membership;

    @Column(name = "date_added", nullable = false, columnDefinition = "DATETIME")
    private String dateAdded;

    @Column(name = "added_by", nullable = false, columnDefinition = "BIGINT")
    private String addedBy;

    @Column(name = "enabled", nullable = false, length = 10, columnDefinition = "VARCHAR(10)")
    private Boolean enabled = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public String getLga() {
        return lga;
    }

    public void setLga(String lga) {
        this.lga = lga;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailConfirmed() {
        return emailConfirmed;
    }

    public void setEmailConfirmed(String emailConfirmed) {
        this.emailConfirmed = emailConfirmed;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public void addRole(Role role) {
        if (!this.roles.contains(role)) {
            this.roles.add(role);
        }

        if (!role.getUsers().contains(this)) {
            role.getUsers().add(this);
        }
    }

    public void removeRole(Role role) {
        this.roles.remove(role);
        role.getUsers().remove(this);
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    public void setFailedAttempts(int failedAttempts) {
        this.failedAttempts = failedAttempts;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

}
