package com.trimble.agmantra.entity;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table JOB.
 */
public class Job {

    private Long id;
    private java.util.Date starttime;
    private java.util.Date endtime;
    private String jobfilepath;
    private Integer status;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Job() {
    }

    public Job(Long id) {
        this.id = id;
    }

    public Job(Long id, java.util.Date starttime, java.util.Date endtime, String jobfilepath, Integer status) {
        this.id = id;
        this.starttime = starttime;
        this.endtime = endtime;
        this.jobfilepath = jobfilepath;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.util.Date getStarttime() {
        return starttime;
    }

    public void setStarttime(java.util.Date starttime) {
        this.starttime = starttime;
    }

    public java.util.Date getEndtime() {
        return endtime;
    }

    public void setEndtime(java.util.Date endtime) {
        this.endtime = endtime;
    }

    public String getJobfilepath() {
        return jobfilepath;
    }

    public void setJobfilepath(String jobfilepath) {
        this.jobfilepath = jobfilepath;
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
