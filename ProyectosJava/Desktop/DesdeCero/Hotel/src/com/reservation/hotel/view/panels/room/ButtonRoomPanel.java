package com.reservation.hotel.view.panels.room;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.reservation.hotel.controller.ButtonRoomFunctionsController;

public class ButtonRoomPanel extends JPanel{
	private static final long serialVersionUID = -1365304798766586098L;

	private JButton jBtSave=new JButton("Guardar");
	private JButton jBtCancel=new JButton("Cancelar");
	private JButton jBtNew=new JButton("Nuevo");
	
	private InputRoomPanel inputPanel=new InputRoomPanel();
	
	public ButtonRoomPanel() {
		
	}
	
	public ButtonRoomPanel(InputRoomPanel inputPanel) {
		//Aplicando transparencia
		setOpaque(false);
		setBackground(new Color(0, 0,  0, 0));
		
		jBtNew.addActionListener(new ButtonRoomFunctionsController(inputPanel, jBtNew, jBtSave, jBtCancel));
		
		add(jBtNew);
		
		jBtSave.addActionListener(new ButtonRoomFunctionsController(inputPanel, jBtSave, jBtSave, jBtCancel));
		add(jBtSave);
		
		add(jBtCancel);
	}

	public JButton getjBtSave() {
		return jBtSave;
	}

	public void setjBtSave(JButton jBtSave) {
		this.jBtSave = jBtSave;
	}

	public JButton getjBtCancel() {
		return jBtCancel;
	}

	public void setjBtCancel(JButton jBtCancel) {
		this.jBtCancel = jBtCancel;
	}

	public JButton getjBtNew() {
		return jBtNew;
	}

	public void setjBtNew(JButton jBtNew) {
		this.jBtNew = jBtNew;
	}

	public InputRoomPanel getInputPanel() {
		return inputPanel;
	}

	public void setInputPanel(InputRoomPanel inputPanel) {
		this.inputPanel = inputPanel;
	}	
}