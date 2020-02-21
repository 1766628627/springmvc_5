package com.accp.springmvc_2.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Grade {
    private Integer gid;

    private Integer stuid;

    private Float score;
    @JSONField(format = "yyyy-MM-dd") //ajax
   	@DateTimeFormat(pattern = "yyyy-MM-dd") //mvc
    private Long time;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}