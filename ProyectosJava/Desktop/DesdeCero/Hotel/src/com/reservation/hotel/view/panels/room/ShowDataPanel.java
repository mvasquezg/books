package com.reservation.hotel.view.panels.room;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.reservation.hotel.controller.QuerysRoom;

public class ShowDataPanel extends JPanel{
	private SearchPanel searhPanel=new SearchPanel();
	private TablePanel tablePanel=new TablePanel();
	//private QuerysRoom queryTotal=new QuerysRoom();
	
	private JLabel jLblTotal=new JLabel("Total de Registros: ");
	public ShowDataPanel() {
		setLayout(new BorderLayout());
		
		//Assign color the panel
		setBackground(new Color(39, 245, 218));
				
		//Colorar titulo al panel
		setBorder(BorderFactory.createTitledBorder("Listado de Habitaciones"));
		
		add(searhPanel, BorderLayout.NORTH);
		add(tablePanel, BorderLayout.CENTER);
		//jLblTotal.setText("Total de registros: "+queryTotal.getRegisterTotal());
		add(jLblTotal, BorderLayout.SOUTH);
		
	}
}
