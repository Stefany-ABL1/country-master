package edu.uptc.country.view;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Modify extends JDialog implements ActionListener {


		private MainWinow mainWindow;
		private JTextField txtId;
		private JButton btnAccept;
		private JButton btnCancel;
		
		public Modify (MainWinow mainWindow) {
			this.mainWindow = mainWindow;
			setTitle("Modificar Pais");
			setSize(400, 250);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setResizable(false);
			setLocationRelativeTo(this);
			setLayout(new GridLayout(5, 2));
			setModal(true);
			beginComponents();
			addComponents();
			
		}
		public void beginComponents(){
			txtId = new JTextField();
			txtId.setHorizontalAlignment(SwingConstants.CENTER);
			btnAccept = new JButton("Aceptar");
			btnAccept.addActionListener(this);
	        
			btnCancel = new JButton("Cancelar");
			btnCancel.addActionListener(this);
		}
		public void addComponents(){
			add(new JLabel("     Id"));
			add(txtId);
			add(btnAccept);
			add(btnCancel);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== btnAccept){
				this.dispose();
				mod();
				
			}
			else{
				this.dispose();
			}
			
		}
		private void mod(){
			
			if (mainWindow.getCc().find(txtId.getText())!=null) {
				ModifyTwo mod=new ModifyTwo(mainWindow,txtId.getText());
				mod.setVisible(true);
				
			}
		}
		


}
