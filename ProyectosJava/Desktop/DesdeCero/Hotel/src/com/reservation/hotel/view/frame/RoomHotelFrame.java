package com.reservation.hotel.view.frame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import com.reservation.hotel.view.panels.room.RoomMainPanel;

public class RoomHotelFrame extends JFrame{
	
	private static final long serialVersionUID = -499229605463088406L;
	
	private RoomMainPanel roomMainPanel=new RoomMainPanel();
	//private double percentScreen=0.65;
	private double percentScreen;
	
	public RoomHotelFrame() {
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Dimension newScreenSize=toolkit.getScreenSize();

		setTitle("Habitaciones");
		
		//Calculte size screen
		setPercentScreen(0.65);
		int hight=(int) (newScreenSize.height*getPercentScreen());
		int width=(int) (newScreenSize.width*getPercentScreen());
		
		//Size frame
		setSize(width, hight);
		
		//Center frame
		setLocationRelativeTo(null);
		
		setVisible(true);
		
		add(getRoomMainPanel());
	}

	//Methods get
	public RoomMainPanel getRoomMainPanel() {
		return roomMainPanel;
	}

	public double getPercentScreen() {
		return percentScreen;
	}
	
	//Methods set
	public void setRoomMainPanel(RoomMainPanel roomMainPanel) {
		this.roomMainPanel = roomMainPanel;
	}	

	public void setPercentScreen(double percentScreen) {
		this.percentScreen = percentScreen;
	}
	
}
