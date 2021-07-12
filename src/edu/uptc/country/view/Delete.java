package edu.uptc.country.view;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Delete extends JDialog implements ActionListener{

		private MainWinow mainWindow;
		private JTextField idCountry;
		private JButton btnAccept;
		private JButton btnCancel;
		
		public Delete (MainWinow mainWindow) {
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
			idCountry = new JTextField();
			idCountry.setHorizontalAlignment(SwingConstants.CENTER);
			btnAccept = new JButton("Aceptar");
			btnAccept.addActionListener(this);
	        
			btnCancel = new JButton("Cancelar");
			btnCancel.addActionListener(this);
		}
		public void addComponents(){
			add(new JLabel("    Id"));
			add(idCountry);
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
			
			if (mainWindow.getCc().find(idCountry.getText())!=null); {
				mainWindow.getCc().delete(idCountry.getText());
				
			}
		}
	


}
