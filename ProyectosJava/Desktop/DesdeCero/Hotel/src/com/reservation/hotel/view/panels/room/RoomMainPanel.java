package com.reservation.hotel.view.panels.room;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import com.reservation.hotel.view.frame.RoomHotelFrame;

public class RoomMainPanel extends JPanel{
	private static final long serialVersionUID = 2578356520289406250L;
	
	private InsertDataPanel insertDataPanel; 
	private ShowDataPanel showDataPanel;
	
	public RoomMainPanel()	{
		setLayout(new GridLayout(1, 2, 10, 10));//Divide el panel principal en dos a un tamaño
		
		setBackground(new Color(219, 213, 219));
		
		setBorder(BorderFactory.createTitledBorder("Panel Principal"));
		
		setInsertDataPanel(new InsertDataPanel());
		
		add(getInsertDataPanel());
				
		setShowDataPanel(new ShowDataPanel(getInsertDataPanel()));
		
		add(getShowDataPanel());
	}
	
	//Methos 
	public InsertDataPanel getInsertDataPanel() {
		return this.insertDataPanel;
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
