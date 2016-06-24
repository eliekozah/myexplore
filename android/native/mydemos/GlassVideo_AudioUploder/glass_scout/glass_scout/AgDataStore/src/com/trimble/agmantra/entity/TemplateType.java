package com.trimble.agmantra.entity;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table TEMPLATE_TYPE.
 */
public class TemplateType {

    private Long id;
    private Integer templateid;
    private String name;
    private String fdtTag;
    private byte[] templateXml;
    private Integer status;
    private Integer jobtypeid;
    private Integer featuretypeid;
    private String locale;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public TemplateType() {
    }

    public TemplateType(Long id) {
        this.id = id;
    }

    public TemplateType(Long id, Integer templateid, String name, String fdtTag, byte[] templateXml, Integer status, Integer jobtypeid, Integer featuretypeid, String locale) {
        this.id = id;
        this.templateid = templateid;
        this.name = name;
        this.fdtTag = fdtTag;
        this.templateXml = templateXml;
        this.status = status;
        this.jobtypeid = jobtypeid;
        this.featuretypeid = featuretypeid;
        this.locale = locale;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTemplateid() {
        return templateid;
    }

    public void setTemplateid(Integer templateid) {
        this.templateid = templateid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFdtTag() {
        return fdtTag;
    }

    public void setFdtTag(String fdtTag) {
        this.fdtTag = fdtTag;
    }

    public byte[] getTemplateXml() {
        return templateXml;
    }

    public void setTemplateXml(byte[] templateXml) {
        this.templateXml = templateXml;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getJobtypeid() {
        return jobtypeid;
    }

    public void setJobtypeid(Integer jobtypeid) {
        this.jobtypeid = jobtypeid;
    }

    public Integer getFeaturetypeid() {
        return featuretypeid;
    }

    public void setFeaturetypeid(Integer featuretypeid) {
        this.featuretypeid = featuretypeid;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
