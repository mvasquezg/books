package com.reservation.hotel.view.panels.room;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.reservation.hotel.controller.ButtonFunctions;
import com.reservation.hotel.controller.QuerysRoom;

public class ButtonRoomPanel extends JPanel{
	private JButton jBtSave=new JButton("Guardar");
	private JButton jBtCancel=new JButton("Cancelar");
	private JButton jBtNew=new JButton("Nuevo");
	
	private InputRoomPanel inputPanel=new InputRoomPanel();
	
	private String actionBtn="Guardar";
	
	public ButtonRoomPanel(InputRoomPanel inputPanel) {
		//Aplicando transparencia
		setOpaque(false);
		setBackground(new Color(0, 0,  0, 0));
		
		jBtNew.addActionListener(new ButtonFunctions(inputPanel));
		
		add(jBtNew);
		
		jBtSave.addActionListener(new QuerysRoom(inputPanel));
		add(jBtSave);
		
		add(jBtCancel);
	}
}
