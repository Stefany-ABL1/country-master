package edu.uptc.country.view;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
public class ExpJson extends JDialog implements ActionListener{


		private MainWinow mainWindow;
		private JTextField txtName;
		private JTextField txtPath;
		private JButton btnAccept;
		private JButton btnCancel;
		
		public ExpJson (MainWinow mainWindow) {
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
			txtName = new JTextField();
			txtName.setHorizontalAlignment(SwingConstants.CENTER);
			
			txtPath=new JTextField();
			txtPath.setHorizontalAlignment(SwingConstants.CENTER);
			
			btnAccept = new JButton("Aceptar");
			btnAccept.addActionListener(this);
	        
			btnCancel = new JButton("Cancelar");
			btnCancel.addActionListener(this);
		}
		public void addComponents(){
			add(new JLabel("     Nombre"));
			add(txtName);
			add(new JLabel("     Ruta"));
			add(txtPath);
			add(btnAccept);
			add(btnCancel);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== btnAccept){
				this.dispose();
				try {
					mod();
				} catch (JsonIOException | JsonSyntaxException | FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			else{
				this.dispose();
			}
			
		}
		private void mod() throws JsonIOException, JsonSyntaxException, IOException{
		 mainWindow.getCc().toXML(txtPath.getText(), txtName.getText());
			
		}


}
