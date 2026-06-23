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
	
	//private InsertDataPanel insertPanel;
	private ButtonRoomPanel butonPanel;
	private InputRoomPanel inputRoomPanel;
	
	private DefaultTableModel modeloDeDatos;
	
	private QuerysRoom queryRoom=new QuerysRoom();
	private RoomBean room=new RoomBean();	
	
	private TablePanel panelTable;
	
	
	private JButton jBtnNew, jBtnSave, jBtnCancel;
	
	public ButtonRoomFunctionsController(InputRoomPanel inputRoomPanel, ButtonRoomPanel butonPanel) {
		this.inputRoomPanel=inputRoomPanel;
		
		this.inputRoomPanel=inputRoomPanel;	
	}
	
	public ButtonRoomFunctionsController(InputRoomPanel inputRoomPanel, ButtonRoomPanel butonPanel, TablePanel paneltable) {
		this.inputRoomPanel=inputRoomPanel;
		
		this.butonPanel=butonPanel;
		
		this.panelTable=paneltable;
	}
	
	public ButtonRoomFunctionsController(ButtonRoomPanel btnPanel,InputRoomPanel inputRoomPanel, JButton jBtnNew, JButton jBtnSave, JButton jBtnCancel) {
		this.inputRoomPanel=inputRoomPanel;
		this.butonPanel=btnPanel;
		this.jBtnNew=jBtnNew; 
		this.jBtnSave=jBtnSave;
		this.jBtnCancel=jBtnCancel;

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equalsIgnoreCase("Nuevo")) {
			//this.insertPanel.getInputPanel().enableInputs();
			//this.insertPanel.getInputPanel().cleanInputs();
			
			this.inputRoomPanel.enableInputs();
			this.inputRoomPanel.cleanInputs();
			
			//Estatus de los bonote al oprimir nuevo
			getButonPanel().getjBtNew().setEnabled(false);
			
			getButonPanel().getjBtSave().setText("Guardar");
			getButonPanel().getjBtSave().setEnabled(true);
			
			getButonPanel().getjBtCancel().setEnabled(true);
			
			
		}else if(e.getActionCommand().equalsIgnoreCase("Guardar")) {
			
			if(getRoomFill()!=null) {
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
			}
			
			
			
		}else if(e.getActionCommand().equalsIgnoreCase("Actualizar")) {
			if(getRoomFill()!=null) {
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
				
			}
		}else if(e.getActionCommand().equalsIgnoreCase("Cancelar")) {
			
			this.inputRoomPanel.cleanInputs();
			this.inputRoomPanel.disableInputs();
			
			getButonPanel().getjBtNew().setEnabled(true);
			
			getButonPanel().getjBtSave().setEnabled(false);
			getButonPanel().getjBtCancel().setEnabled(false);
			
		}
	}
	
	public RoomBean getRoomFill() {
		/*if(!this.insertPanel.getInputPanel().getjTxtIdRoom().getText().equalsIgnoreCase("")) {
			room.setIdRoom(Integer.parseInt(this.insertPanel.getInputPanel().getjTxtIdRoom().getText()));
		}
		
		if(!this.insertPanel.getInputPanel().getjTxtRoomNumber().getText().equals("")) {
			room.setRoomNumber(this.insertPanel.getInputPanel().getjTxtRoomNumber().getText());
		}else {
			JOptionPane.showMessageDialog(this.insertPanel.getInputPanel(),"El campo numero esta vacio");
		}
	
		if(!this.insertPanel.getInputPanel().getjCbxFloor().getSelectedItem().equals("Seleccione un piso")) {
			room.setFloor((String) this.insertPanel.getInputPanel().getjCbxFloor().getSelectedItem());
		
		}else {
			JOptionPane.showMessageDialog(this.insertPanel.getInputPanel(),"No ha seleccionado un piso.");
		}
	
		if(!this.insertPanel.getInputPanel().getjTxtADescription().getText().equals("")) {
			room.setDescription(this.insertPanel.getInputPanel().getjTxtADescription().getText());
		}else {
			JOptionPane.showMessageDialog(this.insertPanel.getInputPanel(),"El campo descripcion esta vacio");
		}
	
		if(!this.insertPanel.getInputPanel().getjTxtACharacteristics().getText().equals("")) {
			room.setCharacteristics(this.insertPanel.getInputPanel().getjTxtACharacteristics().getText());
		}else {
			JOptionPane.showMessageDialog(this.insertPanel.getInputPanel(),"El campo caracteristca esta vacio");
		}
	
		if(!this.insertPanel.getInputPanel().getjTxtRoomNumber().getText().equals("")) {
			room.setRoomNumber(this.insertPanel.getInputPanel().getjTxtRoomNumber().getText());
		}else {
			JOptionPane.showMessageDialog(this.insertPanel.getInputPanel(),"El campo numero esta vacio");
		}
	
		if(!this.insertPanel.getInputPanel().getjTxtPriceNight().getText().equals("")) {
			room.setPriceNight((Double.parseDouble(this.insertPanel.getInputPanel().getjTxtPriceNight().getText())));
		}else {
			JOptionPane.showMessageDialog(this.insertPanel.getInputPanel(),"El campo precio esta vacio");
		}
	
		if(!this.insertPanel.getInputPanel().getjCbxStatusRoom().getSelectedItem().equals("Selecciona un estado de habitación")) {
			room.setStatusRoom((String) this.insertPanel.getInputPanel().getjCbxStatusRoom().getSelectedItem());
		}else {
			JOptionPane.showMessageDialog(this.insertPanel.getInputPanel(),"No ha seleccionado algun estado");
		}

		if(!this.insertPanel.getInputPanel().getjCbxRoomType().getSelectedItem().equals("Seleccione un tipo de habitacion")) {
			room.setRoomType((String) this.insertPanel.getInputPanel().getjCbxRoomType().getSelectedItem());
		
		}else {
			JOptionPane.showMessageDialog(this.insertPanel.getInputPanel(),"No ha seleccionado un tipo");
		}*/
		
		if(!this.inputRoomPanel.getjTxtIdRoom().getText().equalsIgnoreCase("")) {
			room.setIdRoom(Integer.parseInt(this.inputRoomPanel.getjTxtIdRoom().getText()));
		}
		
		if(!this.inputRoomPanel.getjTxtRoomNumber().getText().equals("")) {
			room.setRoomNumber(this.inputRoomPanel.getjTxtRoomNumber().getText());
		}else {
			JOptionPane.showMessageDialog(this.inputRoomPanel,"El campo numero esta vacio");
		}
	
		if(!this.inputRoomPanel.getjCbxFloor().getSelectedItem().equals("Seleccione un piso")) {
			room.setFloor((String) this.inputRoomPanel.getjCbxFloor().getSelectedItem());
		
		}else {
			JOptionPane.showMessageDialog(this.inputRoomPanel,"No ha seleccionado un piso.");
		}
	
		if(!this.inputRoomPanel.getjTxtADescription().getText().equals("")) {
			room.setDescription(this.inputRoomPanel.getjTxtADescription().getText());
		}else {
			JOptionPane.showMessageDialog(this.inputRoomPanel,"El campo descripcion esta vacio");
		}
	
		if(!this.inputRoomPanel.getjTxtACharacteristics().getText().equals("")) {
			room.setCharacteristics(this.inputRoomPanel.getjTxtACharacteristics().getText());
		}else {
			JOptionPane.showMessageDialog(this.inputRoomPanel,"El campo caracteristca esta vacio");
		}
	
		if(!this.inputRoomPanel.getjTxtRoomNumber().getText().equals("")) {
			room.setRoomNumber(this.inputRoomPanel.getjTxtRoomNumber().getText());
		}else {
			JOptionPane.showMessageDialog(this.inputRoomPanel,"El campo numero esta vacio");
		}
	
		if(!this.inputRoomPanel.getjTxtPriceNight().getText().equals("")) {
			room.setPriceNight((Double.parseDouble(this.inputRoomPanel.getjTxtPriceNight().getText())));
		}else {
			JOptionPane.showMessageDialog(this.inputRoomPanel,"El campo precio esta vacio");
		}
	
		if(!this.inputRoomPanel.getjCbxStatusRoom().getSelectedItem().equals("Selecciona un estado de habitación")) {
			room.setStatusRoom((String) this.inputRoomPanel.getjCbxStatusRoom().getSelectedItem());
		}else {
			JOptionPane.showMessageDialog(this.inputRoomPanel,"No ha seleccionado algun estado");
		}

		if(!this.inputRoomPanel.getjCbxRoomType().getSelectedItem().equals("Seleccione un tipo de habitacion")) {
			room.setRoomType((String) this.inputRoomPanel.getjCbxRoomType().getSelectedItem());
		
		}else {
			JOptionPane.showMessageDialog(this.inputRoomPanel,"No ha seleccionado un tipo");
		}
		
		
		
		return room;
	}


	public ButtonRoomPanel getButonPanel() {
		return butonPanel;
	}


	public void setButonPanel(ButtonRoomPanel butonPanel) {
		this.butonPanel = butonPanel;
	}
	
	
}
