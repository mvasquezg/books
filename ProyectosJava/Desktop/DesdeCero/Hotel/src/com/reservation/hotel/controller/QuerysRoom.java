package com.reservation.hotel.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.reservation.hotel.model.beans.RoomBean;
import com.reservation.hotel.view.panels.room.InputRoomPanel;

public class QuerysRoom implements ActionListener{
	
	private ConnectionToDB conect=new ConnectionToDB();
	private Connection cn=conect.getConnectionBD();
	
	private String querySql="";
	private Integer registerTotal;
	
	private InputRoomPanel panelInput;
	private RoomBean room=new RoomBean();
	
	public QuerysRoom() {
		
	}
	
	public QuerysRoom(InputRoomPanel panelInput) {
		this.panelInput=panelInput;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(!panelInput.getjTxtRoomNumber().getText().equals("")) {
			room.setRoomNumber(panelInput.getjTxtRoomNumber().getText());
		}else {
			JOptionPane.showMessageDialog(panelInput,"El campo numero esta vacio");
		}
		
		if(!panelInput.getjCbxFloor().getSelectedItem().equals("Seleccione un piso")) {
			room.setFloor((String) panelInput.getjCbxFloor().getSelectedItem());
		}else {
			JOptionPane.showMessageDialog(panelInput,"No ha seleccionado un piso.");
		}
		
		if(!panelInput.getjTxtADescription().getText().equals("")) {
			room.setDescription(panelInput.getjTxtADescription().getText());
		}else {
			JOptionPane.showMessageDialog(panelInput,"El campo descripcion esta vacio");
		}
		
		if(!panelInput.getjTxtACharacteristics().getText().equals("")) {
			room.setCharacteristics(panelInput.getjTxtACharacteristics().getText());
		}else {
			JOptionPane.showMessageDialog(panelInput,"El campo caracteristca esta vacio");
		}
		
		if(!panelInput.getjTxtRoomNumber().getText().equals("")) {
			room.setRoomNumber(panelInput.getjTxtRoomNumber().getText());
		}else {
			JOptionPane.showMessageDialog(panelInput,"El campo numero esta vacio");
		}
		
		if(!panelInput.getjTxtPriceNight().getText().equals("")) {
			room.setPriceNight((Double.parseDouble(panelInput.getjTxtPriceNight().getText())));
		}else {
			JOptionPane.showMessageDialog(panelInput,"El campo precio esta vacio");
		}
		
		if(!panelInput.getjCbxStatusRoom().getSelectedItem().equals("Selecciona un estado de habitación")) {
			room.setStatusRoom((String) panelInput.getjCbxStatusRoom().getSelectedItem());
		}else {
			JOptionPane.showMessageDialog(panelInput,"No ha seleccionado algun estado");
		}

		if(!panelInput.getjCbxRoomType().getSelectedItem().equals("Seleccione un tipo de habitacion")) {
			room.setRoomType((String) panelInput.getjCbxRoomType().getSelectedItem());
			
		}else {
			JOptionPane.showMessageDialog(panelInput,"No ha seleccionado un tipo");
		}
		
			
		if(insertRoom(room)){
			JOptionPane.showMessageDialog(panelInput, "Se han registrado los datos correctamente.");
		}else {
			JOptionPane.showConfirmDialog(panelInput, "No se han registrado los datos.");
		}
		
		this.panelInput.cleanInputs();
		this.panelInput.disableInputs();
		showTable("");
		
	}
	
	public DefaultTableModel showTable(String search) {
		DefaultTableModel modelTable;
		
		String[] arrayColumnTitle= {"Id", "Número de Habitación", "Piso", "Descripción", "Característica", "Precio", "Estado Habitación", "Tipo de Habitación"};
		String[] arrayRegisters=new String[8];
		
		registerTotal=0;
		
		modelTable=new DefaultTableModel(null, arrayColumnTitle);
		
		querySql="SELECT * FROM room WHERE floor LIKE '%"+search+"%' ORDER BY idRoom";
		//querySql="SELECT * FROM room ORDER BY idRoom";
		
		try {
			
			Statement myStatement=cn.createStatement();
			//ResultSet myRs=myStatement.executeQuery(search);
			ResultSet myRs=myStatement.executeQuery(querySql);
			
			while(myRs.next()) {
				arrayRegisters[0]=myRs.getString("idRoom");
				arrayRegisters[1]=myRs.getString("roomNumber");
				arrayRegisters[2]=myRs.getString("floor");
				arrayRegisters[3]=myRs.getString("description");
				arrayRegisters[4]=myRs.getString("characteristics");
				arrayRegisters[5]=myRs.getString("priceNight");
				arrayRegisters[6]=myRs.getString("statusRoom");
				arrayRegisters[7]=myRs.getString("roomType");
				
				this.registerTotal+=1;
				modelTable.addRow(arrayRegisters);
			}
			return modelTable;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
	
	public boolean insertRoom(RoomBean room) {
		querySql="INSERT INTO room (roomNumber, floor, description, characteristics, priceNight, statusRoom, roomType)"+
				"VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement pst=cn.prepareStatement(querySql);
			
			pst.setString(1, room.getRoomNumber());
			pst.setString(2, room.getFloor());
			pst.setString(3, room.getDescription());
			pst.setString(4, room.getCharacteristics());
			pst.setDouble(5, room.getPriceNight());
			pst.setString(6, room.getStatusRoom());
			pst.setString(7, room.getRoomType());
			
			
			int n=pst.executeUpdate();
			showTable("");
			
			if(n!=0) {
				return true;
			}else {
				return false;
			}
			
		}
		catch(Exception e) {
			JOptionPane.showConfirmDialog(null, e);
			return false;
		}
		
	}//end insertRoom
	
	public boolean updateRoom(RoomBean room) {
		querySql="UPDATE room SET roomNumber=?, floor=?, description=?, characteristics=?, priceNight=?, statusRoom=?, roomType=?"+
				"WHERE idRoom=?";
		
		try {
			
			PreparedStatement pst=cn.prepareStatement(querySql);
			
			pst.setString(1, room.getRoomNumber());
			pst.setString(2, room.getFloor());
			pst.setString(3, room.getDescription());
			pst.setString(4, room.getCharacteristics());
			pst.setDouble(5, room.getPriceNight());
			pst.setString(6, room.getStatusRoom());
			pst.setString(7, room.getRoomType());
			pst.setInt(8, room.getIdRoom());
			
			
			int n=pst.executeUpdate();
			
			if(n!=0) {
				return true;
			}else {
				return false;
			}
			
			
		}
		catch(Exception e) {
			JOptionPane.showConfirmDialog(null, e);
			return false;
		}
	}//end updateRoom
	
	public boolean deleteRoom(RoomBean room) {
		querySql="DELETE FROM room WHERE idRoom=?";
		
		try {
			PreparedStatement pst=cn.prepareStatement(querySql);
			
			pst.setInt(1, room.getIdRoom());
			
			int n=pst.executeUpdate();
			
			if(n!=0) {
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			JOptionPane.showConfirmDialog(null, e);
			return false;
		}
	}//end deleteRoom
}
