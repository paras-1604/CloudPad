import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MainWindow extends JFrame implements ActionListener
{
    JMenuItem saveFileMenuItem;
    JTextArea textarea;

    MainWindow() 
    {
        JMenuBar menuBar = new JMenuBar();
        textarea = new JTextArea();
        JFrame frame = new JFrame();
        frame.setTitle("Demo Bar");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenu filemenu = new JMenu("File");
        JMenu editmenu = new JMenu("Edit");
        JMenu helpmenu = new JMenu("Help");

        int const1 = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int const2 = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane sp = new JScrollPane(textarea, const1, const2);

        JMenuItem newFileItem = new JMenuItem("New File");
        JMenuItem newFolderItem = new JMenuItem("New Folder");
        JMenuItem openFileMenuItem = new JMenuItem("Open File");
        JMenuItem openFolderMenuItem = new JMenuItem("Open Folder");
        saveFileMenuItem = new JMenuItem("Save");
        JMenuItem saveAllFilesMenuItem = new JMenuItem("Save All");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        JMenuItem cutItem = new JMenuItem("Cut");

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
        menuBar.add(editmenu);
        menuBar.add(helpmenu);

        frame.add(menuBar, BorderLayout.NORTH);
        frame.add(sp);
        frame.setVisible(true);

        saveFileMenuItem.addActionListener(this);
        exitMenuItem.addActionListener(e -> System.exit(0));
    }

    public void actionPerformed(ActionEvent ae) 
    {
        if (ae.getSource() == saveFileMenuItem) 
        {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showSaveDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) 
            {
                File file = fileChooser.getSelectedFile();
                try (FileWriter fw = new FileWriter(file)) 
                {
                    fw.write(textarea.getText());
                } 
                catch (IOException e) 
                {
                    JOptionPane.showMessageDialog(this, "Error saving file", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public static void main(String[] args) {
        new MainWindow();
    }
} 