package edu.uptc.country.view;


import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class PanelDown extends JPanel{
	

		private MainWinow mainWindow;
		private JTable tableCars;
		private DefaultTableModel dtm;
		
		public PanelDown(MainWinow mainWindow){
			this.mainWindow = mainWindow;
			setBorder(new TitledBorder("Tabla de Paises"));
			setLayout(new GridLayout(1, 1));
			beginComponents();
			addComponents();
		}

		public void clear(){
			 DefaultTableModel modelo=(DefaultTableModel)tableCars.getModel();
			 while(modelo.getRowCount()>0)modelo.removeRow(0);
				 TableColumnModel modCol=tableCars.getColumnModel();
				 while(modCol.getColumnCount()>4)modCol.removeColumn(modCol.getColumn(0));
			 
		
			
		}
		private void beginComponents() {
			String [] titles = {"Id", "Nombre", "Capital", "Tipo de Paises"};		
			dtm = new DefaultTableModel(null, titles){
			public boolean isCellEditable(int row , int column){
				return false;
			}
		};
		tableCars= new JTable(dtm);
	}
		

		private void addComponents() {
			this.add(new JScrollPane(tableCars));
			
		}
		public void addRow(Object [] row){
			dtm.addRow(row);
		}
		
		public DefaultTableModel getDtm() {
			return dtm;
		}

		
		public void setDtm(DefaultTableModel dtm) {
			this.dtm = dtm;
		}

		public JTable getTableCars() {
			return tableCars;
		}

		public void setTableCars(JTable tableCars) {
			this.tableCars = tableCars;
		}

		
		 
		
	

}
