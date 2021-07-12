package edu.uptc.country.view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import edu.uptc.country.view.*;

public class ActionsView implements MouseListener,ActionListener,WindowListener{
	



		
		private MainWinow mainWindow;
		
		public static final String BUSCAR = "buscar";
		public static final String MODIFICAR = "modificar";
		public static final String ELIMINAR = "eliminar";
		public static final String SALIR = "salir";
		public static final String ADD = "agregar";
		
		
		public static final String GUARDAR="guardar como";
		public static final String EXJSON="exportar json";

		
		
		 public ActionsView(MainWinow mainWindow) {
			this.mainWindow = mainWindow;
		}
		
		@Override
		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowClosing(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowOpened(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int row = mainWindow.getPanelDown().getTableCars().getSelectedRow();
			
			switch(e.getActionCommand()){
			case ADD: mainWindow.addCar();
				break;
			case BUSCAR: mainWindow.find();
				break;
			case ELIMINAR: 
				mainWindow.delete();
				
				break;
//			case INFO: 
//				mainWindow.about();
//				break;
			case SALIR:
				mainWindow.exit();
				break;
			case MODIFICAR:
				mainWindow.modifyCar();
				break;
			case GUARDAR:
				mainWindow.guardar();
				break;
//			case EXXML:
//				try {
//					mainWindow.expXml();
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				break;
			case EXJSON:
				try {
					mainWindow.expJson();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
//				break;
//			case IMPXML:
//				mainWindow.impXml();
//				break;
//			case IMPJSON:
//				mainWindow.impJson();
//				break;
				
			}
		}
		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}





