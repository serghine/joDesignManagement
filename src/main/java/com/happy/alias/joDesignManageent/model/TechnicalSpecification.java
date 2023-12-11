package com.happy.alias.joDesignManageent.model;

public class TechnicalSpecification {

    private Integer id;
    private String code;
    private String label;

    public TechnicalSpecification() {
    }

    public TechnicalSpecification(Integer id, String code, String label) {
        this.id = id;
        this.code = code;
        this.label = label;
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

    @Override
    public String toString() {
        return "TechnicalSpecification{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
