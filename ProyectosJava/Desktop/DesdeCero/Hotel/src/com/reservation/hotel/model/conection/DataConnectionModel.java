package com.reservation.hotel.model.conection;

public class DataConnectionModel {
	
	private String URL;
	private String PORT;
	private String BD;
	private String USER;
	private String PASSWORD;
	
	public DataConnectionModel() {
		this.URL="jdbc:mysql://localhost";
		this.PORT="3306";
		this.BD="reserve";
		this.USER="root";
		this.PASSWORD="C4R0pao85";
		
	}
	
	public String getURL() {
		return this.URL;
	}
	public String getPORT() {
		return PORT;
	}
	public String getBD() {
		return BD;
	}
	public String getUSER() {
		return USER;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	
}
