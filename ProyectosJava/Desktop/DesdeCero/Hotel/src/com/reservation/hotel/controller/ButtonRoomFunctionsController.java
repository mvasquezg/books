package com.reservation.hotel.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.reservation.hotel.model.beans.RoomBean;
import com.reservation.hotel.view.panels.room.ButtonRoomPanel;
//import com.reservation.hotel.view.panels.room.ButtonRoomPanel;
import com.reservation.hotel.view.panels.room.InputRoomPanel;
import com.reservation.hotel.view.panels.room.InsertDataPanel;
import com.reservation.hotel.view.panels.room.TablePanel;

public class ButtonRoomFunctionsController implements ActionListener{
	
	private ButtonRoomPanel buttonRoomPanel;
	private InputRoomPanel inputRoomPanel;
	
	private TablePanel tablePanel;
	
	private QuerysRoom queryRoom=new QuerysRoom();
	private RoomBean room=new RoomBean();	
	
	public ButtonRoomFunctionsController() {}
	public ButtonRoomFunctionsController(ButtonRoomPanel buttonRoomPanel, InputRoomPanel inputRoomPanel) {
		
		setButtonRoomPanel(buttonRoomPanel);
		setInputRoomPanel(inputRoomPanel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equalsIgnoreCase("Nuevo")) {
			getInputRoomPanel().cleanInputs();
			getInputRoomPanel().enableInputs();
			
			
			getButtonRoomPanel().getjBtnNew().setEnabled(false);
			
			getButtonRoomPanel().getjBtnSave().setText("Guardar");
			getButtonRoomPanel().getjBtnSave().setEnabled(true);
			
			getButtonRoomPanel().getjBtnCancel().setEnabled(true);
			
			
		}else if(e.getActionCommand().equalsIgnoreCase("Guardar")) {
			
			if(getRoomFill()!=null) {
				getQueryRoom().insertRoom(getRoomFill());
			
				getInputRoomPanel().cleanInputs();
				getInputRoomPanel().disableInputs();
			
				getButtonRoomPanel().getjBtnNew().setEnabled(true);
			
				getButtonRoomPanel().getjBtnSave().setEnabled(false);
				getButtonRoomPanel().getjBtnCancel().setEnabled(false);
			}
			
			
			
			
			
			/*if(getRoomFill()!=null) {
				boolean insertDatBase=queryRoom.insertRoom(getRoomFill());
				System.out.println(queryRoom.showTable("").getRowCount());
				
				if(insertDatBase) {
					//JOptionPane.showMessageDialog(this.insertPanel.getInputPanel(), "Se han registrado los datos correctamente");
					JOptionPane.showMessageDialog(this.inputRoomPanel, "Se han registrado los datos correctamente");
					//this.insertPanel.getInputPanel().cleanInputs();
					//this.insertPanel.getInputPanel().disableInputs();
					
					this.inputRoomPanel.cleanInputs();
					this.inputRoomPanel.disableInputs();
					getButonPanel().getjBtNew().setEnabled(true);
					
					getButonPanel().getjBtSave().setEnabled(false);
					getButonPanel().getjBtCancel().setEnabled(false);
					
					//this.panelTable.showData(queryRoom.showTable(""));
					
							
				}else {
					//JOptionPane.showMessageDialog(this.insertPanel.getInputPanel(), "No Se han registrado los datos.");
					JOptionPane.showMessageDialog(this.inputRoomPanel, "No Se han registrado los datos.");
				}
				
				modeloDeDatos=queryRoom.showTable("");
				
			}else {
				//JOptionPane.showMessageDialog(this.insertPanel.getInputPanel(), "Verifica los datos, Falta alguno por llenar");
				JOptionPane.showMessageDialog(this.inputRoomPanel, "Verifica los datos, Falta alguno por llenar");
			}*/
			
			
			
		}else if(e.getActionCommand().equalsIgnoreCase("Actualizar")) {
			/*if(getRoomFill()!=null) {
				boolean updateDataBase=queryRoom.updateRoom(getRoomFill());
				
				if(updateDataBase) {
					//JOptionPane.showMessageDialog(this.insertPanel.getInputPanel(), "Se han actulizado los datos correctamente");
					//this.insertPanel.getInputPanel().cleanInputs();
					//this.insertPanel.getInputPanel().disableInputs();
					
					JOptionPane.showMessageDialog(this.inputRoomPanel, "Se han actulizado los datos correctamente");
					this.inputRoomPanel.cleanInputs();
					this.inputRoomPanel.disableInputs();
					
					
				}else {
					//JOptionPane.showMessageDialog(this.insertPanel.getInputPanel(), "No Se han actualizado los datos.");
					JOptionPane.showMessageDialog(this.inputRoomPanel, "No Se han actualizado los datos.");
				}
				
			}else {
				//JOptionPane.showMessageDialog(this.insertPanel.getInputPanel(), "Verifica los datos, Falta alguno por llenar");
				JOptionPane.showMessageDialog(this.inputRoomPanel, "Verifica los datos, Falta alguno por llenar");
				
			}*/
		}else if(e.getActionCommand().equalsIgnoreCase("Cancelar")) {
			
			getInputRoomPanel().cleanInputs();
			getInputRoomPanel().disableInputs();
			
			
			getButtonRoomPanel().getjBtnNew().setEnabled(true);
			
			getButtonRoomPanel().getjBtnSave().setText("Guardar");
			getButtonRoomPanel().getjBtnSave().setEnabled(false);
			
			getButtonRoomPanel().getjBtnCancel().setEnabled(false);
			
		}
	}
	
	public RoomBean getRoomFill() {
		
		if(!getInputRoomPanel().getjTxtIdRoom().getText().equalsIgnoreCase("")) {
			room.setIdRoom(Integer.parseInt(getInputRoomPanel().getjTxtIdRoom().getText()));
		}
		
		if(!getInputRoomPanel().getjTxtRoomNumber().getText().equals("")) {
			room.setRoomNumber(getInputRoomPanel().getjTxtRoomNumber().getText());
		}else {
			JOptionPane.showMessageDialog(getInputRoomPanel(),"El campo numero esta vacio");
		}
	
		if(!getInputRoomPanel().getjCbxFloor().getSelectedItem().equals("Seleccione un piso")) {
			room.setFloor((String) getInputRoomPanel().getjCbxFloor().getSelectedItem());
		
		}else {
			JOptionPane.showMessageDialog(getInputRoomPanel(),"No ha seleccionado un piso.");
		}
	
		if(!getInputRoomPanel().getjTxtADescription().getText().equals("")) {
			room.setDescription(getInputRoomPanel().getjTxtADescription().getText());
		}else {
			JOptionPane.showMessageDialog(getInputRoomPanel(),"El campo descripcion esta vacio");
		}
	
		if(!getInputRoomPanel().getjTxtACharacteristics().getText().equals("")) {
			room.setCharacteristics(getInputRoomPanel().getjTxtACharacteristics().getText());
		}else {
			JOptionPane.showMessageDialog(getInputRoomPanel(),"El campo caracteristca esta vacio");
		}
	
		if(!getInputRoomPanel().getjTxtRoomNumber().getText().equals("")) {
			room.setRoomNumber(getInputRoomPanel().getjTxtRoomNumber().getText());
		}else {
			JOptionPane.showMessageDialog(getInputRoomPanel(),"El campo numero esta vacio");
		}
	
		if(!getInputRoomPanel().getjTxtPriceNight().getText().equals("")) {
			room.setPriceNight((Double.parseDouble(getInputRoomPanel().getjTxtPriceNight().getText())));
		}else {
			JOptionPane.showMessageDialog(getInputRoomPanel(),"El campo precio esta vacio");
		}
	
		if(!getInputRoomPanel().getjCbxStatusRoom().getSelectedItem().equals("Seleccione un estado de habitación")) {
			room.setStatusRoom((String) getInputRoomPanel().getjCbxStatusRoom().getSelectedItem());
		}else {
			JOptionPane.showMessageDialog(getInputRoomPanel(),"No ha seleccionado algun estado");
		}

		if(!getInputRoomPanel().getjCbxRoomType().getSelectedItem().equals("Seleccione el tipo de habitación")) {
			room.setRoomType((String) getInputRoomPanel().getjCbxRoomType().getSelectedItem());
		
		}else {
			JOptionPane.showMessageDialog(getInputRoomPanel(),"No ha seleccionado un tipo");
		}
		
		return room;
	}

	//Methods get
	public ButtonRoomPanel getButtonRoomPanel() {
		return buttonRoomPanel;
	}
	
	public InputRoomPanel getInputRoomPanel() {
		return inputRoomPanel;
	}
	
	//Methods set
	public void setButtonRoomPanel(ButtonRoomPanel buttonRoomPanel) {
		this.buttonRoomPanel = buttonRoomPanel;
	}

	public void setInputRoomPanel(InputRoomPanel inputRoomPanel) {
		this.inputRoomPanel = inputRoomPanel;
	}
	public QuerysRoom getQueryRoom() {
		return queryRoom;
	}
	public void setQueryRoom(QuerysRoom queryRoom) {
		this.queryRoom = queryRoom;
	}
	
	
	
	
	
	
}
