package com.reservation.hotel.view.frame;

import javax.swing.JFrame;

import com.reservation.hotel.view.panels.room.RoomMainPanel;

public class RoomHotelFrame extends JFrame{
	private RoomMainPanel roomPanel=new RoomMainPanel();
	
	public RoomHotelFrame() {
		setTitle("Registros Habitacion de Hotel");
		setBounds(300, 250, 750, 450);
		setVisible(true);
		
		add(roomPanel);
	}
}
