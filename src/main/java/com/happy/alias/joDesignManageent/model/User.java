package com.happy.alias.joDesignManageent.model;

import java.util.List;

public class User {

    private Integer id;
    private String code;
    private String avatar;
    private String userName;
    private String lastName;
    private String password;
    private String email;
    private String urlImage;
    List<Role> roles;

    public User() {
    }

    public User(Integer id, String code, String avatar,
                String userName, String lastName,
                String password, String email,
                String urlImage, List<Role> roles) {
        this.id = id;
        this.code = code;
        this.avatar = avatar;
        this.userName = userName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.urlImage = urlImage;
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", avatar='" + avatar + '\'' +
                ", userName='" + userName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", urlImage='" + urlImage + '\'' +
                ", roles=" + roles +
                '}';
    }
}
