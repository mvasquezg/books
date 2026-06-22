package com.reservation.hotel.view.panels.room;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class InsertDataPanel extends JPanel{
	
	private static final long serialVersionUID = 6631325402132818190L;

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

	public InputRoomPanel getInputPanel() {
		return inputPanel;
	}

	public void setInputPanel(InputRoomPanel inputPanel) {
		this.inputPanel = inputPanel;
	}

	public ButtonRoomPanel getButtonPanel() {
		return buttonPanel;
	}

	public void setButtonPanel(ButtonRoomPanel buttonPanel) {
		this.buttonPanel = buttonPanel;
	}	
}
