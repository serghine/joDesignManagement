package com.happy.alias.joDesignManageent.model;

import java.util.List;

public class Boutique {

    private Integer id;
    private String code;
    private String label;
    private List<User> users;
    private String urlImage;
    private List<Product> products;
    private History history;

    public Boutique() {
    }

    public Boutique(Integer id, String code, String urlImage, String label, List<User> users, List<Product> products, History history) {
        this.id = id;
        this.code = code;
        this.label = label;
        this.users = users;
        this.products = products;
        this.history = history;
        this.urlImage = urlImage;
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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    @Override
    public String toString() {
        return "Boutique{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", label='" + label + '\'' +
                ", users=" + users +
                ", urlImage='" + urlImage + '\'' +
                ", products=" + products +
                ", history=" + history +
                '}';
    }
}
