package edu.uptc.country.view;

	import java.awt.BorderLayout;
	import java.awt.FlowLayout;
	import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import edu.uptc.country.model.Conutry;


	public class PanelCenter extends JPanel implements ActionListener{
		
		private MainWinow mainWindow;
		private JRadioButton btnPlaca;
		private JRadioButton btnMarca;
		private JRadioButton btnModelo;
		private ButtonGroup buttonGroup;
		private JButton btnMostrar;
		private JButton btnEx;
		private PanelDown panelDown;
		
		public PanelCenter(MainWinow mainWindow){
			this.mainWindow = mainWindow;
			setLayout(new GridLayout(1, 5));
			beginComponents();
			addComponents();
		}
		
		public void beginComponents(){
			buttonGroup=new ButtonGroup();
			btnPlaca=new JRadioButton("Placa",false);
			btnMarca=new JRadioButton("Marca",false);
			btnModelo=new JRadioButton("Modelo",false);
			buttonGroup.add(btnPlaca);
			buttonGroup.add(btnMarca);
			buttonGroup.add(btnModelo);
			
			btnMostrar=new JButton("Mostrar");
			btnMostrar.addActionListener(this);
			btnEx=new JButton("Salir");
			btnEx.addActionListener((ActionListener) mainWindow.getActionViews());
			btnEx.setActionCommand(ActionsView.SALIR);
			btnEx.addActionListener(mainWindow.getActionViews());
		}
		
		public void addComponents(){
			add(new JLabel("Ordenar por: "));
			setLayout(new FlowLayout());
			add(btnMarca);
			add(btnPlaca);
			add(btnModelo);
			add(btnMostrar);
			add(btnEx);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnMostrar){
			if (btnPlaca.isSelected()) {
				sortPlate();
			}else{
				if (btnMarca.isSelected()) {
					sortBrand();
				}else{
					if (btnModelo.isSelected()) {
						sortModel();
					}
				}
			}
			}

			
		}
	

		private void sortPlate() {
			mainWindow.getPanelDown().clear();
			ArrayList<Conutry> aux=(ArrayList<Conutry>) mainWindow.getCc().sortId().clone();
			for(Conutry c:aux){

				Object [] row = { c.getIdConuntry(),c.getNameConutry(),c.getMainCapital(),c.getTypeCountry().toString()};
			mainWindow.getPanelDown().addRow(row);
			}
			

		}
		private void sortBrand(){
			mainWindow.getPanelDown().clear();
			ArrayList<Conutry> aux=(ArrayList<Conutry>)mainWindow.getCc().sortBrand().clone();
			for(Conutry c:aux){

				Object [] row = { c.getIdConuntry(),c.getNameConutry(),c.getMainCapital(),c.getTypeCountry().toString()};
			mainWindow.getPanelDown().addRow(row);
			}
		
		}
		public void sortModel(){
			mainWindow.getPanelDown().clear();
			ArrayList<Conutry> aux=(ArrayList<Conutry>)mainWindow.getCc().sortModel().clone();
			for(Conutry c:aux){

				Object [] row = { c.getIdConuntry(),c.getNameConutry(),c.getMainCapital(),c.getTypeCountry().toString()};
			mainWindow.getPanelDown().addRow(row);
			}
		}
		
	}


