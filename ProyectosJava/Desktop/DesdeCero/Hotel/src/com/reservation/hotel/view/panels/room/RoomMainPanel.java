package com.reservation.hotel.view.panels.room;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class RoomMainPanel extends JPanel{
	private InsertDataPanel insertDataPanel=new InsertDataPanel(); 
	private ShowDataPanel showDataPanel=new ShowDataPanel();
	
	public RoomMainPanel() {
		setLayout(new GridLayout(1, 2, 10, 10));//Divide el panel principal en dos a un tamaño
		//add(insertDataPanel, BorderLayout.WEST);
		//add(showDataPanel, BorderLayout.EAST);
		add(insertDataPanel);
		add(showDataPanel);
	};
}
