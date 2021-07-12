package edu.uptc.country.view;
import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ResourceBundle.Control;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import edu.uptc.country.model.ManagementCountry;
public class MainWinow  extends JFrame{




		//private PanelImage panelImage;
		private MainMenu mainMenu;
		private PanelDown panelDown;
		private PanelCenter panelCenter;
		private Insert insert;
		private ActionsView actionViews;
		private ManagementCountry cc;
		private Search s;
//		private About about;
		private Exit salir;

		public MainWinow(){
			setTitle("PAISES");
			setSize(new Dimension(800, 500));
			setLocationRelativeTo(this);
			setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
			setResizable(false);

		}
		public void beginComponents() {
//			panelImage = new PanelImage(this);
			mainMenu = new MainMenu(this);
			panelDown = new PanelDown(this);
			panelCenter = new PanelCenter(this);
			actionViews = new ActionsView(this);
			cc = new ManagementCountry();
			s = new Search(this);
//			about = new About(this);
			salir = new Exit(this);
			//			text = new Text();
		}
		public void addComponents() {
			add(panelCenter, BorderLayout.SOUTH);
		//	add(panelImage, BorderLayout.NORTH);
			add(panelDown, BorderLayout.CENTER);
			this.setJMenuBar(mainMenu);


		}
		public void begin(){

			actionViews = new ActionsView(this);
			beginComponents();
			addComponents();
			addWindowListener(actionViews);

		}

		public void addCar(){
			Insert insert = new Insert(this);
			insert.setVisible(true);
		}
		public void modifyCar(){
			Modify modify=new Modify(this);
			modify.setVisible(true);
		}
		public void find() {
			Search search = new Search(this);
			search.setVisible(true);
		}

		public void cleanRow(){
			for (int i = (panelDown.getDtm().getRowCount()-1); i >= 0; i--){
				panelDown.getDtm().removeRow(i);
			}
		}
		//elimina un dato de la tabla
		public void delete(){
		Delete delete=new Delete(this);
		delete.setVisible(true);
		}
		//Elimina un dato del arreglo
		

//		public void about(){
//			About about = new About(this);
//			about.setVisible(true);
//		}
		public void exit(){
			Exit salir = new Exit(this);
			salir.setVisible(true);
		}
		
		public void guardar(){
			Save save=new Save(this);
			save.setVisible(true);
		}
		
//		public void expXml() throws IOException{
//			ExpXml xml=new ExpXml(this);
//			xml.setVisible(true);
	//    
//		}
	//	
		public void expJson() throws FileNotFoundException{
			ExpJson json=new ExpJson(this);
			json.setVisible(true);
		}
	//	
//		public void impXml(){
//			ImpXML xml=new ImpXML(this);
//			xml.setVisible(true);
//		}
	//	
//		public void impJson(){
//			ImpJson json=new ImpJson(this);
//			json.setVisible(true);
//			
//		}
	//	
		
		
		public PanelDown getPanelDown() {
			return panelDown;
		}
		public ActionsView getActionViews() {
			return actionViews;
		}
		public ManagementCountry getCc() {
			return cc;
		}



	}



