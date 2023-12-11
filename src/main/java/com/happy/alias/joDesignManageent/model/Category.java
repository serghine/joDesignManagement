package com.happy.alias.joDesignManageent.model;

public class Category {

    private Integer id;
    private String code;
    private String label;
    private String description;
    private String urlImage;

    public Category() {
    }

    public Category(Integer id, String code, String label, String description, String urlImage) {
        this.id = id;
        this.code = code;
        this.label = label;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                ", urlImage='" + urlImage + '\'' +
                '}';
    }
}
