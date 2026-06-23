package com.reservation.hotel.view.panels.room;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.reservation.hotel.controller.QuerysRoom;
import com.reservation.hotel.controller.RowClickedInTable;

public class TablePanel extends JPanel{
	private QuerysRoom queryRoom=new QuerysRoom();
	
	//private DefaultTableModel modeloTabla=queryRoom.showTable("");
	private DefaultTableModel modeloTabla;
	
	//private JTable tableRoom=new JTable(modeloTabla);
	private JTable tableRoom=new JTable();
	
	public TablePanel(InsertDataPanel insertPanel) {
		//Aplicando transparencia
		setOpaque(false);
		setBackground(new Color(0, 0,  0, 0));
		
		setModeloTabla(queryRoom.showTable(""));
		
		setTableRoom(getModeloTabla());
		
		getModeloTabla();
		
		hideColumns();
		
		getTableRoom().addMouseListener(new RowClickedInTable(this, insertPanel));
		
		
		add(new JScrollPane(getTableRoom()));
	}
	
	private void hideColumns() {
		getTableRoom().getColumnModel().getColumn(0).setMaxWidth(0);
		getTableRoom().getColumnModel().getColumn(0).setMinWidth(0);
		getTableRoom().getColumnModel().getColumn(0).setPreferredWidth(0);	
	}

	public DefaultTableModel getModeloTabla() {
		return modeloTabla;
	}

	public void setModeloTabla(DefaultTableModel modeloTabla) {
		this.modeloTabla = modeloTabla;
	}

	public JTable getTableRoom() {
		return tableRoom;
	}

	public void setTableRoom(DefaultTableModel tableRoom) {
		this.tableRoom.setModel(tableRoom); 
	}
}
