package com.trimble.agmantra.entity;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table SUPPLY.
 */
public class Supply {

    private Long id;
    private Integer carrierRate;
    private Integer chemicalReaction;
    private Integer lastRate;
    private String name;
    private String pest;
    private Integer restrictedUse;
    private Integer status;
    private Integer type;
    private Integer unitConv;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Supply() {
    }

    public Supply(Long id) {
        this.id = id;
    }

    public Supply(Long id, Integer carrierRate, Integer chemicalReaction, Integer lastRate, String name, String pest, Integer restrictedUse, Integer status, Integer type, Integer unitConv) {
        this.id = id;
        this.carrierRate = carrierRate;
        this.chemicalReaction = chemicalReaction;
        this.lastRate = lastRate;
        this.name = name;
        this.pest = pest;
        this.restrictedUse = restrictedUse;
        this.status = status;
        this.type = type;
        this.unitConv = unitConv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCarrierRate() {
        return carrierRate;
    }

    public void setCarrierRate(Integer carrierRate) {
        this.carrierRate = carrierRate;
    }

    public Integer getChemicalReaction() {
        return chemicalReaction;
    }

    public void setChemicalReaction(Integer chemicalReaction) {
        this.chemicalReaction = chemicalReaction;
    }

    public Integer getLastRate() {
        return lastRate;
    }

    public void setLastRate(Integer lastRate) {
        this.lastRate = lastRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPest() {
        return pest;
    }

    public void setPest(String pest) {
        this.pest = pest;
    }

    public Integer getRestrictedUse() {
        return restrictedUse;
    }

    public void setRestrictedUse(Integer restrictedUse) {
        this.restrictedUse = restrictedUse;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getUnitConv() {
        return unitConv;
    }

    public void setUnitConv(Integer unitConv) {
        this.unitConv = unitConv;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
