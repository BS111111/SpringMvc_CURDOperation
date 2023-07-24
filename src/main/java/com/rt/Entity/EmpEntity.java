package com.rt.Entity;

public class EmpEntity {
	private int id;
	private String uname;
	private String email;
	private String pwd;
	private String confpwd;
	private String adr;
	private long phone;
	private String city;
	private String state;
	private long zip;

	public EmpEntity(){}

	
	public EmpEntity(int id, String uname, String email, String pwd, String confpwd, String adr, long phone,
			String city, String state, long zip) {
		super();
		this.id = id;
		this.uname = uname;
		this.email = email;
		this.pwd = pwd;
		this.confpwd = confpwd;
		this.adr = adr;
		this.phone = phone;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getConfpwd() {
		return confpwd;
	}

	public void setConfpwd(String confpwd) {
		this.confpwd = confpwd;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}
	
	

}
