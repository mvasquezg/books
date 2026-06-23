package com.reservation.hotel.view.panels.room;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.reservation.hotel.controller.ButtonRoomFunctionsController;

public class ButtonRoomPanel extends JPanel{
	private static final long serialVersionUID = -1365304798766586098L;

	private JButton jBtnSave=new JButton("Guardar");
	private JButton jBtnCancel=new JButton("Cancelar");
	private JButton jBtNew=new JButton("Nuevo");
	
	private InputRoomPanel inputPanel;
	
	public ButtonRoomPanel() {
		
	}
	
	public ButtonRoomPanel(InputRoomPanel inputPanel) {
		//Aplicando transparencia
		setOpaque(false);
		setBackground(new Color(0, 0,  0, 0));
		
		//this.inputPanel=inputPanel;
		setInputPanel(inputPanel);
		
		jBtNew.setEnabled(true);
		
		jBtNew.addActionListener(new ButtonRoomFunctionsController(this, this.inputPanel, jBtNew, jBtnSave, jBtnCancel));
		
		add(jBtNew);
		
		jBtnSave.setEnabled(false);
		jBtnSave.addActionListener(new ButtonRoomFunctionsController(this, this.inputPanel, jBtnSave, jBtnSave, jBtnCancel));
		add(jBtnSave);
		
		jBtnCancel.setEnabled(false);
		jBtnCancel.addActionListener(new ButtonRoomFunctionsController(this, this.inputPanel, jBtnSave, jBtnSave, jBtnCancel));
		add(jBtnCancel);
	}

	public JButton getjBtSave() {
		return jBtnSave;
	}

	public void setjBtSave(JButton jBtSave) {
		this.jBtnSave = jBtSave;
	}

	public JButton getjBtCancel() {
		return jBtnCancel;
	}

	public void setjBtCancel(JButton jBtnCancel) {
		this.jBtnCancel = jBtnCancel;
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