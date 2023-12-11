package com.happy.alias.joDesignManageent.model.views;


import com.happy.alias.joDesignManageent.model.Role;
import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import java.util.Collection;
import java.util.List;


@Entity
@Immutable
@Table(name = "USERS_ROLES_VIEW")
public class UserRole implements UserDetails {

    @Id
    @Column(name = "USERS_ID")
    private Integer USERS_ID;
    @Column(name = "CODE_USER")
    private String CODE_USER;
    @Column(name = "AVATAR")
    private String AVATAR;
    @Column(name = "USERNAME")
    private String USERNAME;
    @Column(name = "LAST_NAME")
    private String LAST_NAME;
    @Column(name = "PASSWORD_USER")
    private String PASSWORD_USER;
    @Column(name = "EMAIL_USER")
    private String EMAIL_USER;
    @Column(name = "URL_IMAGE")
    private String URL_IMAGE;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Role> roles;

    public Integer getUSERS_ID() {
        return USERS_ID;
    }

    public void setUSERS_ID(Integer USERS_ID) {
        this.USERS_ID = USERS_ID;
    }

    public String getCODE_USER() {
        return CODE_USER;
    }

    public void setCODE_USER(String CODE_USER) {
        this.CODE_USER = CODE_USER;
    }

    public String getAVATAR() {
        return AVATAR;
    }

    public void setAVATAR(String AVATAR) {
        this.AVATAR = AVATAR;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getPASSWORD_USER() {
        return PASSWORD_USER;
    }

    public void setPASSWORD_USER(String PASSWORD_USER) {
        this.PASSWORD_USER = PASSWORD_USER;
    }

    public String getEMAIL_USER() {
        return EMAIL_USER;
    }

    public void setEMAIL_USER(String EMAIL_USER) {
        this.EMAIL_USER = EMAIL_USER;
    }

    public String getURL_IMAGE() {
        return URL_IMAGE;
    }

    public void setURL_IMAGE(String URL_IMAGE) {
        this.URL_IMAGE = URL_IMAGE;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
