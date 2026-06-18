package com.reservation.hotel.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.reservation.hotel.view.panels.room.InputRoomPanel;

public class ButtonFunctions implements ActionListener{
	
	private InputRoomPanel panelInputs;
	
	public ButtonFunctions(InputRoomPanel panelInputs) {
		this.panelInputs=panelInputs;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		panelInputs.enableInputs();
	}
	

}
