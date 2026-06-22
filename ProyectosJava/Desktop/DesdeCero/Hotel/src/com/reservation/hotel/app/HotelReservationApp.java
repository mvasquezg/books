package com.reservation.hotel.app;

import javax.swing.JFrame;

import com.reservation.hotel.view.frame.RoomHotelFrame;

public class HotelReservationApp {
	public static void main(String[] args) {
		RoomHotelFrame frmRoom=new RoomHotelFrame();
		frmRoom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
