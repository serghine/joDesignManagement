package com.happy.alias.joDesignManageent.model;

import java.util.List;

public class History {

    private Integer id;
    private String code;
    private List<Facture> factures;
    private List<Devis> devisList;

    public History() {
    }

    public History(Integer id, String code, List<Facture> factures, List<Devis> devisList) {
        this.id = id;
        this.code = code;
        this.factures = factures;
        this.devisList = devisList;
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

    public List<Facture> getFactures() {
        return factures;
    }

    public void setFactures(List<Facture> factures) {
        this.factures = factures;
    }

    public List<Devis> getDevisList() {
        return devisList;
    }

    public void setDevisList(List<Devis> devisList) {
        this.devisList = devisList;
    }

    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", factures=" + factures +
                ", devisList=" + devisList +
                '}';
    }
}
