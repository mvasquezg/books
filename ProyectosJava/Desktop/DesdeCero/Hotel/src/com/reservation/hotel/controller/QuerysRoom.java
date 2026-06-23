package com.reservation.hotel.controller;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.reservation.hotel.model.beans.RoomBean;
import com.reservation.hotel.view.panels.room.InputRoomPanel;
//import com.reservation.hotel.view.panels.room.InsertDataPanel;

public class QuerysRoom {
	
	private ConnectionToDB conect=new ConnectionToDB();
	private Connection cn=conect.getConnectionBD();
	
	private String querySql="";
	private Integer registerTotal;
	
	public QuerysRoom() {
		
	}
	
	public DefaultTableModel showTable(String search) {
		DefaultTableModel modelTable;
		
		String[] arrayColumnTitle= {"Id", "Número de Habitación", "Piso", "Descripción", "Característica", "Precio", "Estado Habitación", "Tipo de Habitación"};
		String[] arrayRegisters=new String[8];
		
		registerTotal=0;
		
		modelTable=new DefaultTableModel(null, arrayColumnTitle);
		
		querySql="SELECT * FROM room WHERE floor LIKE '%"+search+"%' ORDER BY idRoom";
				
		try {
			
			Statement myStatement=cn.createStatement();
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
			//showTable("");
			
			if(n!=0) {
				//pst.close();
				//cn.close();
				return true;
				
			}else {
				//pst.close();
				//cn.close();
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
				//pst.close();
				//cn.close();
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
