package com.reservation.hotel.model.beans;

public class RoomBean {
	
	private int idRoom;
	private String roomNumber;
	private String floor;
	private String description;
	private String characteristics;
	private double priceNight;
	private String statusRoom;
	private String roomType;
	
	//Construcors
	public RoomBean() {
		
	}
	
	public RoomBean(int idRoom, String roomNumber, String floor, String description, String characteristics,
			double priceNight, String statusRoom, String roomType) {
		super();
		this.idRoom = idRoom;
		this.roomNumber = roomNumber;
		this.floor = floor;
		this.description = description;
		this.characteristics = characteristics;
		this.priceNight = priceNight;
		this.statusRoom = statusRoom;
		this.roomType = roomType;
	}
	
	//Methods Get
	public int getIdRoom() {
		return idRoom;
	}

	public String getRoomNumber() {
		return roomNumber;
	}
	
	public String getFloor() {
		return floor;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getCharacteristics() {
		return characteristics;
	}
	
	public double getPriceNight() {
		return priceNight;
	}
	
	public String getStatusRoom() {
		return statusRoom;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	//Methods Set
	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}
		
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public void setFloor(String floor) {
		this.floor = floor;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	
	public void setPriceNight(double priceNight) {
		this.priceNight = priceNight;
	}
	
	public void setStatusRoom(String statusRoom) {
		this.statusRoom = statusRoom;
	}
	
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
}
