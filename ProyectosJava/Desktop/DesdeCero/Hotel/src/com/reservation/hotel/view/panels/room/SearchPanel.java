package com.reservation.hotel.view.panels.room;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SearchPanel extends JPanel{
	private JLabel jLblSearch=new JLabel("Buscar: ");
	private JTextField jTxtSearch=new JTextField(30);
	
	private JButton jBtnSearch=new JButton("Buscar");
	private JButton jBtnDelete=new JButton("Eliminar");
	private JButton jBtnExit=new JButton("Salir");
	
	
	public SearchPanel() {
		//Aplicando transparencia
		setOpaque(false);
		setBackground(new Color(0, 0,  0, 0));
		
		setLayout(new GridLayout(1, 5));
		
		add(jLblSearch);
		add(jTxtSearch);
		add(jBtnSearch);
		add(jBtnDelete);
		add(jBtnExit);
		
	}
}
