package com.reservation.hotel.view.panels.room;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.reservation.hotel.controller.ButtonRoomFunctionsController;

public class ButtonRoomPanel extends JPanel{
	private static final long serialVersionUID = -1365304798766586098L;

	private JButton jBtnSave=new JButton("Guardar");
	private JButton jBtnCancel=new JButton("Cancelar");
	private JButton jBtnNew=new JButton("Nuevo");
	
	private InputRoomPanel inputPanel;
	
	public ButtonRoomPanel() {
		
	}
	
	public ButtonRoomPanel(InputRoomPanel inputPanel) {
		//Aplicando transparencia
		setOpaque(false);
		setBackground(new Color(0, 0,  0, 0));
		
		setInputPanel(inputPanel);
		
		getjBtnNew().setEnabled(true);
		getjBtnNew().addActionListener(new ButtonRoomFunctionsController(this, getInputPanel()));
		add(getjBtnNew());
		
		getjBtnSave().setEnabled(false);
		getjBtnSave().addActionListener(new ButtonRoomFunctionsController(this, getInputPanel()));
		add(getjBtnSave());
		
		getjBtnCancel().setEnabled(false);
		getjBtnCancel().addActionListener(new ButtonRoomFunctionsController(this, getInputPanel()));
		add(getjBtnCancel());
	}

	public JButton getjBtnSave() {
		return jBtnSave;
	}

	public void setjBtnSave(JButton jBtnSave) {
		this.jBtnSave = jBtnSave;
	}

	public JButton getjBtnCancel() {
		return jBtnCancel;
	}

	public void setjBtnCancel(JButton jBtnCancel) {
		this.jBtnCancel = jBtnCancel;
	}

	public JButton getjBtnNew() {
		return this.jBtnNew;
	}

	public void setjBtNew(JButton jBtnNew) {
		this.jBtnNew = jBtnNew;
	}

	public InputRoomPanel getInputPanel() {
		return inputPanel;
	}

	public void setInputPanel(InputRoomPanel inputPanel) {
		this.inputPanel = inputPanel;
	}
}