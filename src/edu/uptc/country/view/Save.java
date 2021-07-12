package edu.uptc.country.view;

import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class Save  extends JDialog implements ActionListener{


		
		
		private MainWinow mainWindow;
		private JTextField txtName;
		private JButton btnAccept;
		private JButton btnCancel;
		
		public Save (MainWinow mainWindow) {
			this.mainWindow = mainWindow;
			setTitle("Modificar Vehiculo");
			setSize(400, 250);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setResizable(false);
			setLocationRelativeTo(this);
			setLayout(new GridLayout(7, 2));
			setModal(true);
			beginComponents();
			addComponents();
			
		}
		
		public void beginComponents(){
			txtName = new JTextField();
			txtName.setHorizontalAlignment(SwingConstants.CENTER);
			
			btnAccept = new JButton("Aceptar");
			btnAccept.addActionListener(this);
	        
			btnCancel = new JButton("Cancelar");
			btnCancel.addActionListener(this);
			
		}
		public void addComponents(){
			add(new JLabel("     Nombre"));
			add(txtName);
			
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
		public void mod(){
			
		}

	
}
