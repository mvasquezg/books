package com.reservation.hotel.view.panels.room;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InputRoomPanel extends JPanel{
	
	String[] arrayFloor= {"Seleccione un piso", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
	String[] arrayStatusRoom= {"Seleccione un estado de habitación", "Disponible", "Ocupado", "Mantenimiento"};
	String[] arrayRoomType= {"Seleccione el tipo de habitación", "Individual", "Matrimonial", "Individual", "Presidencial"};		
	
	//Los titulos de los cajas de texto
	private JLabel jLblIdRoom = new JLabel("Id Habitacion: ");
	private JLabel jLblRoomNumber = new JLabel("Número de Habitación: ");
	private JLabel jLblFloor = new JLabel("Piso: ");
	private JLabel jLblDescription = new JLabel("Descripción: ");
	private JLabel jLblCharacteristics = new JLabel("Características: ");
	private JLabel jLblPriceNight = new JLabel("Precio por Noche: ");
	private JLabel jLblStatusRoom = new JLabel("Estado de la Habitación: ");
	private JLabel jLblRoomType = new JLabel("Tipo de Habitación: ");

	//Cajas de Texto
	private JTextField jTxtIdRoom = new JTextField(20);
	private JTextField jTxtRoomNumber = new JTextField(20);
	private JComboBox jCbxFloor=new JComboBox(arrayFloor);
	private JTextArea jTxtADescription = new JTextArea();
	private JTextArea jTxtACharacteristics = new JTextArea();
	private JTextField jTxtPriceNight = new JTextField(20);
	private JComboBox jCbxStatusRoom=new JComboBox(arrayStatusRoom);
	private JComboBox jCbxRoomType = new JComboBox(arrayRoomType);

	public InputRoomPanel() {
		disableInputs();
		
		//Aplicando transparencia
		setOpaque(false);
		setBackground(new Color(0, 0,  0, 0));
		
		setLayout(new GridLayout(8, 2));
		
		add(jLblIdRoom);
		jTxtIdRoom.setEditable(false);
		add(jTxtIdRoom);
		
		add(jLblRoomNumber);
		add(jTxtRoomNumber);
		
		add(jLblFloor);
		add(jCbxFloor);
		
		add(jLblDescription);
		add(jTxtADescription);
		
		add(jLblCharacteristics);
		add(jTxtACharacteristics);

		add(jLblPriceNight);
		add(jTxtPriceNight);
		
		add(jLblStatusRoom);
		add(jCbxStatusRoom);
		
		add(jLblRoomType);
		add(jCbxRoomType);
	}//end constructor

	//Method set
	public void setjTxtIdRoom(JTextField jTxtIdRoom) {
		this.jTxtIdRoom = jTxtIdRoom;
	}
	
	public void setjTxtRoomNumber(JTextField jTxtRoomNumber) {
		this.jTxtRoomNumber = jTxtRoomNumber;
	}
	
	public void setjCbxFloor(JComboBox jCbxFloor) {
		this.jCbxFloor = jCbxFloor;
	}
	
	public void setjTxtADescription(JTextArea jTxtADescription) {
		this.jTxtADescription = jTxtADescription;
	}
	
	public void setjTxtACharacteristics(JTextArea jTxtACharacteristics) {
		this.jTxtACharacteristics = jTxtACharacteristics;
	}
	
	public void setjTxtPriceNight(JTextField jTxtPriceNight) {
		this.jTxtPriceNight = jTxtPriceNight;
	}

	public void setjCbxStatusRoom(JComboBox jCbxStatusRoom) {
		this.jCbxStatusRoom = jCbxStatusRoom;
	}

	public void setjCbxRoomType(JComboBox jCbxRoomType) {
		this.jCbxRoomType = jCbxRoomType;
	}
	
	//Method get
	public JTextField getjTxtIdRoom() {
		return jTxtIdRoom;
	}
	
	public JTextField getjTxtRoomNumber() {
		return jTxtRoomNumber;
	}
	
	public JComboBox getjCbxFloor() {
		return jCbxFloor;
	}
	
	public JTextArea getjTxtADescription() {
		return jTxtADescription;
	}
	
	public JTextArea getjTxtACharacteristics() {
		return jTxtACharacteristics;
	}
	
	public JTextField getjTxtPriceNight() {
		return jTxtPriceNight;
	}
	
	public JComboBox getjCbxStatusRoom() {
		return jCbxStatusRoom;
	}
	
	public JComboBox getjCbxRoomType() {
		return jCbxRoomType;
	}
	
	public void disableInputs() {
		this.jTxtRoomNumber.setEnabled(false);
		this.jCbxFloor.setEnabled(false);
		this.jTxtPriceNight.setEnabled(false);
		this.jCbxStatusRoom.setEnabled(false);
		this.jCbxRoomType.setEnabled(false);
	}
	
	public void enableInputs() {
		this.jTxtRoomNumber.setEnabled(true);
		this.jCbxFloor.setEnabled(true);
		this.jTxtPriceNight.setEnabled(true);
		this.jCbxStatusRoom.setEnabled(true);
		this.jCbxRoomType.setEnabled(true);
	}
	
	public void cleanInputs(){
      getjTxtIdRoom().setText("");
      getjTxtRoomNumber().setText("");
      getjCbxFloor().setSelectedIndex(0); 
      getjTxtRoomNumber().setText("");
      getjTxtADescription().setText("");
      getjTxtACharacteristics().setText("");
      getjTxtPriceNight().setText("");
      getjCbxStatusRoom().setSelectedIndex(0); 
      getjCbxRoomType().setSelectedIndex(0); 
    } 	
}
