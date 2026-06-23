package com.reservation.hotel.view.panels.room;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import com.reservation.hotel.controller.QuerysRoom;

public class ShowDataPanel extends JPanel{
	private static final long serialVersionUID = -2784717459731900318L;
	private SearchPanel searchPanel=new SearchPanel();
	private TablePanel tablePanel;
		
	private JLabel jLblTotal=new JLabel("Total de Registros: ");
	
	public ShowDataPanel(InsertDataPanel panelInput) {
	tablePanel=new TablePanel(panelInput);
		
		setLayout(new BorderLayout());
		
		//Assign color the panel
		setBackground(new Color(39, 245, 218));
				
		//Colorar titulo al panel
		setBorder(BorderFactory.createTitledBorder("Listado de Habitaciones"));
		
		add(searchPanel, BorderLayout.NORTH);
		
		add(tablePanel, BorderLayout.CENTER);
		add(jLblTotal, BorderLayout.SOUTH);	
	}
	
	//Methods Set
	public void setSearchPanel(SearchPanel searchPanel) {
		this.searchPanel = searchPanel;
	}
	
	public void setTablePanel(TablePanel tablePanel) {
		this.tablePanel = tablePanel;
	}
	
	public void setjLblTotal(JLabel jLblTotal) {
		this.jLblTotal = jLblTotal;
	}
	
	//Method Get
	public TablePanel getTablePanel() {
		return tablePanel;
	}
	
	public SearchPanel getSearchPanel() {
		return searchPanel;
	}
	
	public JLabel getjLblTotal() {
		return jLblTotal;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
