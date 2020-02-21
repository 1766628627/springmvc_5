package com.accp.springmvc_2.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Paper {
    private Integer id;

    private String title;

    private String type;

    private String papersummary;

   

    private String createdby;
    @DateTimeFormat(pattern="yyyy-mm-dd")
    private Date creationdate;

    private String modifyby;
    @DateTimeFormat(pattern="yyyy-mm-dd")
    private Date modifydate;

    private String filename;

    
    @Override
	public String toString() {
		return "Paper [id=" + id + ", title=" + title + ", type=" + type + ", papersummary=" + papersummary
				 + ", createdby=" + createdby + ", creationdate=" + creationdate
				+ ", modifyby=" + modifyby + ", modifydate=" + modifydate + ", filename=" + filename + "]";
	}
    
	public Paper(String title, String type, String papersummary, String createdby, Date creationdate, String modifyby,
			Date modifydate, String filename) {
		super();
		this.title = title;
		this.type = type;
		this.papersummary = papersummary;
		this.createdby = createdby;
		this.creationdate = creationdate;
		this.modifyby = modifyby;
		this.modifydate = modifydate;
		this.filename = filename;
	}

	public Paper() {
		super();
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPapersummary() {
        return papersummary;
    }

    public void setPapersummary(String papersummary) {
        this.papersummary = papersummary == null ? null : papersummary.trim();
    }


    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public String getModifyby() {
        return modifyby;
    }

    public void setModifyby(String modifyby) {
        this.modifyby = modifyby == null ? null : modifyby.trim();
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }
}