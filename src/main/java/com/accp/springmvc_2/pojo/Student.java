package com.accp.springmvc_2.pojo;

public class Student {
    private String stuid;

    private String stuname;

    private String classname;

    private Integer mid;
    
    @Override
	public String toString() {
		return "Student [stuid=" + stuid + ", stuname=" + stuname + ", classname=" + classname + ", mid=" + mid + "]";
	}

	public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid == null ? null : stuid.trim();
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }
}