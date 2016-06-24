package com.trimble.agmantra.entity;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table UNITS.
 */
public class Units {

    private Long id;
    private Integer locked;
    private Integer metric;
    private Integer ushort;
    private Integer singular;
    private Integer type;
    private Integer unitConv;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Units() {
    }

    public Units(Long id) {
        this.id = id;
    }

    public Units(Long id, Integer locked, Integer metric, Integer ushort, Integer singular, Integer type, Integer unitConv) {
        this.id = id;
        this.locked = locked;
        this.metric = metric;
        this.ushort = ushort;
        this.singular = singular;
        this.type = type;
        this.unitConv = unitConv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public Integer getMetric() {
        return metric;
    }

    public void setMetric(Integer metric) {
        this.metric = metric;
    }

    public Integer getUshort() {
        return ushort;
    }

    public void setUshort(Integer ushort) {
        this.ushort = ushort;
    }

    public Integer getSingular() {
        return singular;
    }

    public void setSingular(Integer singular) {
        this.singular = singular;
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
