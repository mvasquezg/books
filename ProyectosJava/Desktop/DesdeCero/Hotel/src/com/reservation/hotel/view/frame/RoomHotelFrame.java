package com.reservation.hotel.view.frame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import com.reservation.hotel.view.panels.room.RoomMainPanel;

public class RoomHotelFrame extends JFrame{
	private RoomMainPanel roomMainPanel=new RoomMainPanel();
	private double percentScreen=0.65;
	
	public RoomHotelFrame() {
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Dimension newScreenSize=toolkit.getScreenSize();

		setTitle("Habitaciones");
		
		//Calculte size screen
		int hight=(int) (newScreenSize.height*percentScreen);
		int width=(int) (newScreenSize.width*percentScreen);
		
		//Size frame
		setSize(width, hight);
		
		//Center frame
		setLocationRelativeTo(null);
		
		setVisible(true);
		
		add(roomMainPanel);
	}
}
