package com.reservation.hotel.view.panels.room;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class InsertDataPanel extends JPanel{
	
	private static final long serialVersionUID = 6631325402132818190L;

	private InputRoomPanel inputRoomPanel=new InputRoomPanel();
	private ButtonRoomPanel buttonRoomPanel;
		
	public InsertDataPanel() {
		setLayout(new BorderLayout());
		
		//Assign color the panel
		setBackground(new Color(245, 214, 39));
				
		//Colorar titulo al panel
		setBorder(BorderFactory.createTitledBorder("Registro de Habitaciones"));
		
		add(getInputRoomPanel(), BorderLayout.NORTH);
		
		setButtonRoomPanel(new ButtonRoomPanel(getInputRoomPanel()));;
		add(getButtonRoomPanel(), BorderLayout.SOUTH);
	}

	public InputRoomPanel getInputRoomPanel() {
		return inputRoomPanel;
	}

	public void setInputRoomPanel(InputRoomPanel inputRoomPanel) {
		this.inputRoomPanel = inputRoomPanel;
	}

	public ButtonRoomPanel getButtonRoomPanel() {
		return buttonRoomPanel;
	}

	public void setButtonRoomPanel(ButtonRoomPanel buttonRoomPanel) {
		this.buttonRoomPanel = buttonRoomPanel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
		
}
