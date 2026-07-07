package com.reservation.hotel.view.panels.room;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.reservation.hotel.controller.QuerysRoom;
import com.reservation.hotel.controller.RowClickedInTable;

public class TablePanel extends JPanel{
	
	private static final long serialVersionUID = 9013245725270821436L;
	
	private QuerysRoom queryRoom=new QuerysRoom();
	private JTable tableRoom=new JTable();
	
	public TablePanel(InsertDataPanel insertPanel) {
		//Aplicando transparencia
		setOpaque(false);
		setBackground(new Color(0, 0,  0, 0));
		
		getTableRoom().setModel(getQueryRoom().showTable(""));
		hideColumns();
		getTableRoom().addMouseListener(new RowClickedInTable(this, insertPanel));
		add(new JScrollPane(getTableRoom()));
	}

	public JTable getTableRoom() {
		return tableRoom;
	}

	public void setTableRoom(JTable tableRoom) {
		this.tableRoom = tableRoom;
	}

	public QuerysRoom getQueryRoom() {
		return queryRoom;
	}

	public void setQueryRoom(QuerysRoom queryRoom) {
		this.queryRoom = queryRoom;
	}
	
	private void hideColumns() {
		getTableRoom().getColumnModel().getColumn(0).setMaxWidth(0);
		getTableRoom().getColumnModel().getColumn(0).setMinWidth(0);
		getTableRoom().getColumnModel().getColumn(0).setPreferredWidth(0);	
		
	}
}