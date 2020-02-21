package com.accp.springmvc_2.pojo;

public class User {
    private String username;

    private Integer id;

    private String userpassword;

    @Override
	public String toString() {
		return "User [username=" + username + ", id=" + id + ", userpassword=" + userpassword + "]";
	}

	public User() {
		super();
	}

	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }
}