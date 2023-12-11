package com.happy.alias.joDesignManageent.model;

import java.util.Date;
import java.util.List;

public class Facture {

    private Integer id;
    private String code;
    private String urlImage;
    private User user;
    private List<Product> productAddList;
    private Double totalPriceWithVat;
    private Double totalPriceWithoutVat;
    private Date startDate;
    private Date updateDte;


    public Facture() {
    }

    public Facture(Integer id, String code,String urlImage, User user, List<Product> productAddList, Double totalPriceWithVat, Double totalPriceWithoutVat, Date startDate, Date updateDte) {
        this.id = id;
        this.code = code;
        this.user = user;
        this.productAddList = productAddList;
        this.totalPriceWithVat = totalPriceWithVat;
        this.totalPriceWithoutVat = totalPriceWithoutVat;
        this.startDate = startDate;
        this.updateDte = updateDte;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProductAddList() {
        return productAddList;
    }

    public void setProductAddList(List<Product> productAddList) {
        this.productAddList = productAddList;
    }

    public Double getTotalPriceWithVat() {
        return totalPriceWithVat;
    }

    public void setTotalPriceWithVat(Double totalPriceWithVat) {
        this.totalPriceWithVat = totalPriceWithVat;
    }

    public Double getTotalPriceWithoutVat() {
        return totalPriceWithoutVat;
    }

    public void setTotalPriceWithoutVat(Double totalPriceWithoutVat) {
        this.totalPriceWithoutVat = totalPriceWithoutVat;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getUpdateDte() {
        return updateDte;
    }

    public void setUpdateDte(Date updateDte) {
        this.updateDte = updateDte;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", urlImage='" + urlImage + '\'' +
                ", user=" + user +
                ", productAddList=" + productAddList +
                ", totalPriceWithVat=" + totalPriceWithVat +
                ", totalPriceWithoutVat=" + totalPriceWithoutVat +
                ", startDate=" + startDate +
                ", updateDte=" + updateDte +
                '}';
    }
}
