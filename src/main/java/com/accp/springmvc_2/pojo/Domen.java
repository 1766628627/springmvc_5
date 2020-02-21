package com.accp.springmvc_2.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Domen {
    private Integer pid;

    private String pname;

    private String name;

    private String phone;

    private String cid;
    @JSONField(format = "yyyy-MM-dd") //ajax
	@DateTimeFormat(pattern = "yyyy-MM-dd") //mvc
    private Date time;

    @Override
	public String toString() {
		return "Domen [pid=" + pid + ", pname=" + pname + ", name=" + name + ", phone=" + phone + ", cid=" + cid
				+ ", time=" + time + "]";
	}

	public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}