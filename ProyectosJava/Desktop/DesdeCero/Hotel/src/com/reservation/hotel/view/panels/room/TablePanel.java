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

public class TablePanel extends JPanel{
	private QuerysRoom queryRoom=new QuerysRoom();
	
	//private DefaultTableModel modeloTabla=queryRoom.showTable("");
	private DefaultTableModel modeloTabla;
	
	//private JTable tableRoom=new JTable(modeloTabla);
	private JTable tableRoom;
	
	public TablePanel() {
		//Aplicando transparencia
		setOpaque(false);
		setBackground(new Color(0, 0,  0, 0));
		
		//hideColumns();
		
		/*tableRoom.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tableRoomMouseCliked();
			}
			
			
		});*/
		modeloTabla=queryRoom.showTable("");
		tableRoom=new JTable(modeloTabla);
		
		add(new JScrollPane(tableRoom));
	}
	
	private void hideColumns() {
		tableRoom.getColumnModel().getColumn(0).setMaxWidth(0);
		tableRoom.getColumnModel().getColumn(0).setMinWidth(0);
		tableRoom.getColumnModel().getColumn(0).setPreferredWidth(0);
		
	}
	
	private void tableRoomMouseCliked() {
		//int rowActual=tableRoom.rowAtPoint();
		
		//if(rowActual>=0) {
			JOptionPane.showMessageDialog(tableRoom, "hola Mundo");
		//}
		
		
	}
}
