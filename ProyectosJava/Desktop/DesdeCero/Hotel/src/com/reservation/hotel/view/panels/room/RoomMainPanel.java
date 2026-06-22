package com.reservation.hotel.view.panels.room;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class RoomMainPanel extends JPanel{
	
	private static final long serialVersionUID = 2578356520289406250L;
	
	private InsertDataPanel insertDataPanel=new InsertDataPanel(); 
	private ShowDataPanel showDataPanel;
	
	public RoomMainPanel() {
		setLayout(new GridLayout(1, 2, 10, 10));//Divide el panel principal en dos a un tamaño
		
		add(insertDataPanel);
		showDataPanel=new ShowDataPanel(insertDataPanel);
		add(showDataPanel);
	}

	public InsertDataPanel getInsertDataPanel() {
		return insertDataPanel;
	}

	public void setInsertDataPanel(InsertDataPanel insertDataPanel) {
		this.insertDataPanel = insertDataPanel;
	}

	public ShowDataPanel getShowDataPanel() {
		return showDataPanel;
	}

	public void setShowDataPanel(ShowDataPanel showDataPanel) {
		this.showDataPanel = showDataPanel;
	}	
}
