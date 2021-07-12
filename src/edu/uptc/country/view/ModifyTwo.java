package edu.uptc.country.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ModifyTwo extends JDialog implements ActionListener{


		private MainWinow mainWindow;
		private JTextField txtName;
		private JTextField txtId;
		private JTextField txtCapital;
		private JComboBox<String> typeCountry;
		
		private JButton btnAccept;
		private JButton btnCancel;
		private PanelCenter panelCenter;
		
		private String id;
		
		public ModifyTwo (MainWinow mainWindow,String id) {
			this.id=id;
			this.mainWindow = mainWindow;
			setTitle("Agregar Pais");
			setSize(400, 250);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setResizable(false);
			setLocationRelativeTo(this);
			setLayout(new GridLayout(5, 2));
			setModal(true);
			beginComponents();
			addComponents();
		}

		private void beginComponents() {
			
			
			txtName = new JTextField();
			txtName.setHorizontalAlignment(SwingConstants.CENTER);
			
			txtCapital = new JTextField();
			txtCapital.setHorizontalAlignment(SwingConstants.CENTER);
			
			typeCountry = new JComboBox<>();
			typeCountry.addItem("");
			typeCountry.addItem("Desarrollado");
			typeCountry.addItem("subdesarrollado");
			typeCountry.addItem("Otro");

			btnAccept = new JButton("Aceptar");
			btnAccept.addActionListener(this);
	        
			btnCancel = new JButton("Cancelar");
			btnCancel.addActionListener(this);
			
		}

		private void addComponents() {
			// TODO Auto-generated method stub
			add(new JLabel("     Id: "));
			add(new JLabel(id));
			
			add(new JLabel("     Nombre"));
			add(txtName);
			
			add(new JLabel("     Capital"));
			add(txtCapital);
			
			add(new JLabel("     Tipo Pais"));
			add(typeCountry);
			
			add(btnAccept);
			add(btnCancel);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			// TODO Auto-generated method stub
			if(e.getSource()== btnAccept){
				
				 addGrade();
			}
			else{
				this.dispose();
			}
		}

		private void addGrade() {
			// TODO Auto-generated method stub
			
			if(isValidateFields()){
//				Object [] row = { txtPlate.getText(), txtBrand.getText() ,txtModel.getText(), typeCar.getSelectedItem().toString()};
//				mainWindow.getPanelDown().addRow(row);
				JOptionPane.showMessageDialog(null, "hola");
				
				mainWindow.getCc().update(id, txtName.getText() ,txtCapital.getText(), typeCountry.getSelectedItem().toString());
				this.dispose();
				
			}else{
				JOptionPane.showMessageDialog(null, "Campos Vacios","Error" ,JOptionPane.ERROR_MESSAGE);
			}
			
		}
		
		

		private void cleanFields() {
			// TODO Auto-generated method stub
			
			txtName.setText("");
			txtId.setText("");
			txtCapital.setText("");
			typeCountry.setSelectedIndex(0);
			
		}

		private boolean isValidateFields() {
			// TODO Auto-generated method stub
			if(txtName.getText().length()>0  && txtCapital.getText().length()>0 && typeCountry.getSelectedItem().toString().length() > 0){
				return true;
			}
			return false;
		}


}
