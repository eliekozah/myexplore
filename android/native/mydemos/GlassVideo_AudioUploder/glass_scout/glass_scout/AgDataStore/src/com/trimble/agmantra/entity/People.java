package com.trimble.agmantra.entity;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table PEOPLE.
 */
public class People {

    private Long id;
    private String epaNum;
    private String name;
    private Integer status;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public People() {
    }

    public People(Long id) {
        this.id = id;
    }

    public People(Long id, String epaNum, String name, Integer status) {
        this.id = id;
        this.epaNum = epaNum;
        this.name = name;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEpaNum() {
        return epaNum;
    }

    public void setEpaNum(String epaNum) {
        this.epaNum = epaNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
