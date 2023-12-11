package com.happy.alias.joDesignManageent.model;

import java.util.List;

public class Product {

    private Integer id;
    private String code;
    private String label;
    private String description;
    private Integer quantity;
    private Integer stock;
    private Double priceWithVat;
    private Double priceWithoutVat;
    private String urlImage;
    List<TechnicalSpecification> technicalSpecifications;
    private Category category;

    public Product() {
    }

    public Product(Integer id, String code, String label, String description, Integer stock, Double priceWithVat,Double priceWithoutVat, String urlImage, List<TechnicalSpecification> technicalSpecifications, Category category, Integer quantity) {
        this.id = id;
        this.code = code;
        this.label = label;
        this.description = description;
        this.stock = stock;
        this.priceWithoutVat = priceWithoutVat;
        this.priceWithVat = priceWithVat;
        this.urlImage = urlImage;
        this.technicalSpecifications = technicalSpecifications;
        this.category = category;
        this.quantity = quantity;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPriceWithVat() {
        return priceWithVat;
    }

    public void setPriceWithVat(Double priceWithVat) {
        this.priceWithVat = priceWithVat;
    }

    public Double getPriceWithoutVat() {
        return priceWithoutVat;
    }

    public void setPriceWithoutVat(Double priceWithoutVat) {
        this.priceWithoutVat = priceWithoutVat;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public List<TechnicalSpecification> getTechnicalSpecifications() {
        return technicalSpecifications;
    }

    public void setTechnicalSpecifications(List<TechnicalSpecification> technicalSpecifications) {
        this.technicalSpecifications = technicalSpecifications;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", stock=" + stock +
                ", priceWithVat=" + priceWithVat +
                ", priceWithoutVat=" + priceWithoutVat +
                ", urlImage='" + urlImage + '\'' +
                ", technicalSpecifications=" + technicalSpecifications +
                ", category=" + category +
                '}';
    }
}
