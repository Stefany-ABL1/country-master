package edu.uptc.country.view;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Exit  extends JDialog implements ActionListener{
	

		private MainWinow mainWindow;
		private JLabel label;
		private JButton btnAccept;
		private JButton btnCancel;
		private JLabel label1;
//		private JPanel panel;
		
		public Exit(MainWinow mainwindow){
			this.mainWindow = mainWindow;
			setTitle("SALIR");
			setSize(340, 120);
			setLayout(new FlowLayout());
			setLocationRelativeTo(this);
			beginComponents();
			addComponents();
		}

		private void addComponents() {
			// TODO Auto-generated method stub
			add(label1);
			add(label);
			add(btnAccept);
			add(btnCancel);
			
		}

		private void beginComponents() {
			// TODO Auto-generated method stub
			label = new JLabel("¿segur@ salir?");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setFont(new Font("Times New Roman", 0, 20));
			
			label1 = new JLabel("");
			label.setIcon(new ImageIcon("resorce/icons/salir.png"));
			
			btnAccept = new JButton("Aceptar");
			btnAccept.addActionListener(this);
			
			btnCancel = new JButton("Cancelar");
			btnCancel.addActionListener(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == btnAccept) {
				System.exit(0);
				dispose();
				
			}
			else if(e.getSource() == btnCancel){
				this.dispose();
			}
			
		}
	}



