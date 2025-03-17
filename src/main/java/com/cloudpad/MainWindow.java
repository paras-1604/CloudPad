
package com.cloudpad;
import javax.swing.*;
import java.awt.*;



public class MainWindow extends JFrame{

    MainWindow(){

        JMenuBar menuBar = new JMenuBar();
        JTextArea textarea = new JTextArea();
        JFrame frame = new JFrame();
        frame.setTitle("demo bar");
        frame.setSize(350,500);
        frame.setVisible(true);
    
        JMenu filemenu = new JMenu("File");
        JMenu editmenu = new JMenu("edit");
        JMenu helpmenu = new JMenu("help");
    
        JMenuItem newFileItem =  new JMenuItem("New File");
        JMenuItem newFolderItem =  new JMenuItem("New Folder");
        JMenuItem openFileMenuItem = new JMenuItem("open file");
        JMenuItem openFolderMenuItem = new JMenuItem("open folder");
        JMenuItem saveFileMenuItem = new JMenuItem("Save");
        JMenuItem saveAllFilesMenuItem = new JMenuItem("Save All");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
    
        JMenuItem copyItem = new JMenuItem("copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        JMenuItem cutItem = new JMenuItem("cut");
    
        JMenuItem helpItem = new JMenuItem("Help");
        JMenuItem aboutItem = new JMenuItem("About");
    
        filemenu.add(newFileItem);
        filemenu.add(newFolderItem);
        filemenu.add(openFileMenuItem);
        
        filemenu.add(openFolderMenuItem);
        filemenu.add(saveFileMenuItem);
        filemenu.add(saveAllFilesMenuItem);
        filemenu.add(exitMenuItem);
        
        editmenu.add(copyItem);
        editmenu.add(pasteItem);
        editmenu.add(cutItem);
    
        helpmenu.add(helpItem);
        helpmenu.add(aboutItem);
    
        menuBar.add(filemenu);
       // menuBar.addSeparator();
        menuBar.add(editmenu);
        menuBar.add(helpmenu);
    
        frame.add(menuBar,BorderLayout.NORTH);
        frame.add(textarea, BorderLayout.CENTER);
        frame.setVisible(true);
    }
   public static void main(String[] args) {
    new MainWindow();
   }
}
