package com.happy.alias.joDesignManageent.model.views;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;

@Entity
@Immutable
@Table(name = "ROLES")
public class RoleView {

    @Column(name = "ROLE_ID")
    private Integer ROLE_ID;
    @Column(name = "CODE_ROLE")
    private String CODE_ROLE;
    @Column(name = "LABEL_ROLE")
    private String LABEL_ROLE;
    @Column(name = "description_role")
    private String description_role;
    public Integer getROLE_ID() {
        return ROLE_ID;
    }

    public void setROLE_ID(Integer ROLE_ID) {
        this.ROLE_ID = ROLE_ID;
    }

    public String getCODE_ROLE() {
        return CODE_ROLE;
    }

    public void setCODE_ROLE(String CODE_ROLE) {
        this.CODE_ROLE = CODE_ROLE;
    }

    public String getLABEL_ROLE() {
        return LABEL_ROLE;
    }

    public void setLABEL_ROLE(String LABEL_ROLE) {
        this.LABEL_ROLE = LABEL_ROLE;
    }

    public String getDescription_role() {
        return description_role;
    }

    public void setDescription_role(String description_role) {
        this.description_role = description_role;
    }
}
