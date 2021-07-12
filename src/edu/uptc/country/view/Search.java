package edu.uptc.country.view;
import java.awt.FlowLayout;
	import java.awt.Font;
	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.*;

import edu.uptc.country.model.Conutry;

public class Search extends JDialog implements ActionListener{


			private MainWinow mainWindow;
			private JLabel label;
			private JTextField txt;
			private JButton btnAccept;
			private JButton btnCancel;
			private JPanel p;
			
			public Search(MainWinow mainWindow){
				this.mainWindow = mainWindow;
				setTitle("Buscar ");
				setSize(320,160);
				setLocationRelativeTo(this);
				setResizable(false);
				setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				setLayout(new GridLayout(3, 1));
				beginComponents();
				addComponents();
			}
			
			public void beginComponents(){
				label = new JLabel("Ingrese el id");
				label.setHorizontalAlignment(SwingConstants.CENTER);
				label.setFont(new Font("Calibri", 0, 20));
				
				txt = new JTextField();
				txt.setHorizontalAlignment(SwingConstants.CENTER);
				txt.setFont(new Font("Calibri", 0, 20));
				
				
				btnAccept = new JButton("Aceptar");
				btnAccept.addActionListener(this);
				
				btnCancel = new JButton("Cancelar");
				btnCancel.addActionListener(this);
				
				p = new JPanel();
				p.setLayout(new FlowLayout());
			}
			public void addComponents(){
				add(label);
				add(txt);
				add(p);
				p.add(btnAccept);
				p.add(btnCancel);
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == btnAccept) {
					search();
					dispose();
				}
				else if(e.getSource() == btnCancel){
					dispose();
				}
				
			}

			public JTextField getTxt() {
				return txt;
			}

			public void setTxt(JTextField txt) {
				this.txt = txt;
			}
			private void search(){
				Conutry country = mainWindow.getCc().find(txt.getText());
				if (country != null) {
					JOptionPane.showMessageDialog(null, "Nombre: " + country.getNameConutry() + "\n"
							+ "Id: " + country.getIdConuntry()+ "\n"
							+ "Capital: " + country.getMainCapital()+ "\n"
							+ "Tipo de pais: " + country.getTypeCountry());
				}
				else if(country == null){
					JOptionPane.showMessageDialog(null, "No se encontro el Id ");
				}
				
			}
			
	

}
