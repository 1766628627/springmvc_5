package com.accp.springmvc_2.pojo;

public class FlightInfo {
    private Integer id;

    private String flightid;

    private String company;

    private String leaveairport;

    private String arriveairport;

    private String leavetime;

    private String arrivetime;

    private String airplane;

    
    @Override
	public String toString() {
		return "FlightInfo [id=" + id + ", flightid=" + flightid + ", company=" + company + ", leaveairport="
				+ leaveairport + ", arriveairport=" + arriveairport + ", leavetime=" + leavetime + ", arrivetime="
				+ arrivetime + ", airplane=" + airplane + "]";
	}

	public FlightInfo() {
		super();
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlightid() {
        return flightid;
    }

    public void setFlightid(String flightid) {
        this.flightid = flightid == null ? null : flightid.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getLeaveairport() {
        return leaveairport;
    }

    public void setLeaveairport(String leaveairport) {
        this.leaveairport = leaveairport == null ? null : leaveairport.trim();
    }

    public String getArriveairport() {
        return arriveairport;
    }

    public void setArriveairport(String arriveairport) {
        this.arriveairport = arriveairport == null ? null : arriveairport.trim();
    }

    public String getLeavetime() {
        return leavetime;
    }

    public void setLeavetime(String leavetime) {
        this.leavetime = leavetime == null ? null : leavetime.trim();
    }

    public String getArrivetime() {
        return arrivetime;
    }

    public void setArrivetime(String arrivetime) {
        this.arrivetime = arrivetime == null ? null : arrivetime.trim();
    }

    public String getAirplane() {
        return airplane;
    }

    public void setAirplane(String airplane) {
        this.airplane = airplane == null ? null : airplane.trim();
    }
}