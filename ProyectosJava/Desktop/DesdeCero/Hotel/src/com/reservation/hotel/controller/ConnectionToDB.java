package com.reservation.hotel.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

import com.reservation.hotel.model.conection.DataConnectionModel;

public class ConnectionToDB {
	
	private DataConnectionModel connectionModel=new DataConnectionModel();
	private Connection connectToDB=null;
	
	/*
	 * Empty Constructor
	* */
	public ConnectionToDB() {}
		
	/*
	* Mehod for conenct to BD
	* 
	* */
	public Connection getConnectionBD() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			this.connectToDB=DriverManager.getConnection(connectionModel.getURL()+":"+connectionModel.getPORT()+"/"+connectionModel.getBD(), connectionModel.getUSER(), connectionModel.getPASSWORD());
		}catch(Exception e) {
			JOptionPane.showConfirmDialog(null, e);
			
		}
		return this.connectToDB;
	}	
}//End class ConnecToD
