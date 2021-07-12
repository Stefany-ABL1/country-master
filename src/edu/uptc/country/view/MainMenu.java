package edu.uptc.country.view;
import java.awt.event.ActionListener;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MainMenu  extends JMenuBar{

	
		
		private JMenu file;
		private JMenu tool;
		
		private JMenuItem insert;
		private JMenuItem search;
		private JMenuItem modified;
		private JMenuItem delete;
		private JMenuItem exit;
		
		private JMenuItem save;
		private JMenuItem exJson;
		private MainWinow mainWindow;
			
		public MainMenu(MainWinow mainWindow){
			this.mainWindow = mainWindow;
			beginComponents();
			addComponents();
		}
		
		private void beginComponents(){
			
			file = new JMenu("Archivo");
			file.setMnemonic('A');
			tool=new JMenu("Herramientas");
			

			
			insert = new JMenuItem("Ingresar Pais");
			insert.setMnemonic('I');
			insert.setActionCommand(ActionsView.ADD);
			insert.addActionListener(mainWindow.getActionViews());
			insert.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_MASK));
			
			search = new JMenuItem("Buscar Pais");
			search.setMnemonic('B');
			search.setActionCommand(ActionsView.BUSCAR);
			search.addActionListener(mainWindow.getActionViews());
			search.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
			
			modified = new JMenuItem("Modificar Pais");
			modified.setMnemonic('M');
			modified.setActionCommand(ActionsView.MODIFICAR);
			modified.addActionListener(mainWindow.getActionViews());
			modified.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_MASK));
			
			delete = new JMenuItem("Eliminar Pais");
			delete.setMnemonic('E');
			delete.setActionCommand(ActionsView.ELIMINAR);
			delete.addActionListener(mainWindow.getActionViews());
			delete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK));
			
			exit = new JMenuItem("Salir");
			exit.setMnemonic('S');
			exit.setActionCommand(ActionsView.SALIR);
			exit.addActionListener(mainWindow.getActionViews());
			exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_MASK));
			
			save= new JMenuItem("Guardar como...");
			save.setMnemonic('G');
			save.setActionCommand(ActionsView.GUARDAR);
			save.addActionListener(mainWindow.getActionViews());
			save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
		
			
			exJson = new JMenuItem("Exportar a XML");
			exJson.setIcon(new ImageIcon("resorce/icons/"));
			exJson.setMnemonic('J');
			exJson.setActionCommand(ActionsView.EXJSON);
			exJson.addActionListener(mainWindow.getActionViews());
			exJson.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, InputEvent.CTRL_MASK));
			
			
		}
		private void addComponents(){

			tool.add(insert);
			tool.add(search);
			tool.add(delete);
			tool.add(modified);
			
			file.add(exJson);
			file.add(save);
	
			this.add(file);
			this.add(tool);

		}
		


}
