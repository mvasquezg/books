package com.reservation.hotel.view.panels.room;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class InsertDataPanel extends JPanel{
	
	private InputRoomPanel inputPanel=new InputRoomPanel();
	private ButtonRoomPanel buttonPanel;
	
	public InsertDataPanel() {
		setLayout(new BorderLayout());
		
		//Assign color the panel
		setBackground(new Color(245, 214, 39));
				
		//Colorar titulo al panel
		setBorder(BorderFactory.createTitledBorder("Registro de Habitaciones"));
		
		
		add(inputPanel, BorderLayout.NORTH);
		buttonPanel=new ButtonRoomPanel(inputPanel);
		add(buttonPanel, BorderLayout.SOUTH);
	}
	
}
