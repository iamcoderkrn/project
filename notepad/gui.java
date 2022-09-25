 

 
 
import java.awt.event.ActionEvent;
 
 
 

import javax.swing.*;
 
 
public class gui  implements   java.awt.event.ActionListener{

    
    JFrame window;
    JTextArea textArea;
    JScrollPane scrollPane;

    JMenuBar menuBar;
    JMenu menuFile,menuEdit,menuFormat,menuColor;
    JMenuItem inew,iopen,isave,isaveAs,iExit;

    JMenuItem icolor1,icolor4,icolor3,icolor2;

    JMenu menuFont,menuFontSize;
    JMenuItem iFontAria,iFontCSMS,iFontINR,iFontSize8,iFontSize16,iFontSize20,iFontSize24,iFontSize28;

    function_class File=new function_class(this);
    Function_Foramt foramt=new Function_Foramt(this);
    function_color color=new function_color(this);

    public static void main(String[] args) { 
        new gui();
        
        
    }
    public gui(){
        
        createWindow();
        createTextArea();
        CreatemenuBar();
        createFileMenu();
        createFormatMenu();
        CreateColormenu();
        
        color.Change_Color("White");
        
            
            
            
            window.setVisible(true);
            
        }
        public void createWindow(){
            window=new JFrame("NOTEPAD");
            window.setSize(800,600);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        }
            public void createTextArea() {
            textArea=new JTextArea();
            
            scrollPane= new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scrollPane.setBorder(BorderFactory.createEmptyBorder());
            window.add(scrollPane);
            
            
             
        }

        
        public void CreatemenuBar() {
            menuBar=new JMenuBar();
            window.setJMenuBar(menuBar); 
            
            

            menuFile=new JMenu("File");
            menuBar.add(menuFile); 

            menuEdit= new JMenu("Edit");
            menuBar.add(menuEdit);

            menuColor= new JMenu("Color");
            menuBar.add(menuColor);
            

            menuFormat= new JMenu("Format");
            menuBar.add(menuFormat); 
            
        }

        public void createFileMenu() {
            inew=new JMenuItem("New");
            inew.addActionListener(this);
            inew.setActionCommand("New");
            menuFile.add(inew);

            iExit=new JMenuItem("Exit");
            iExit.addActionListener(this);
            iExit.setActionCommand("Exit");
            menuFile.add(iExit);
             
            iopen=new JMenuItem("Open");
            iopen.addActionListener(this);
            iopen.setActionCommand("Open");
            menuFile.add(iopen);


            isaveAs=new JMenuItem("SaveAs");
            isaveAs.addActionListener(this);
            isaveAs.setActionCommand("SaveAs");
            menuFile.add(isaveAs);

            isave=new JMenuItem("Save");
            isave.addActionListener(this);
            isave.setActionCommand("Save");
            menuFile.add(isave);
            
            
        }

        public void createFormatMenu() {
            menuFont=new JMenu("Font");
            menuFormat.add(menuFont);

            menuFontSize=new JMenu("Font Size");
            menuFormat.add(menuFontSize);

            iFontAria = new JMenuItem("Arial");
            iFontAria.addActionListener(this);
            iFontAria.setActionCommand("Arial");
            menuFont.add(iFontAria);

            iFontCSMS = new JMenuItem("Comic Sans MS");
            iFontCSMS.addActionListener(this);
            iFontCSMS.setActionCommand("Comic Sans MS");
            menuFont.add(iFontCSMS);

            iFontINR = new JMenuItem("Times New Roman");
            iFontINR.addActionListener(this);
            iFontINR.setActionCommand("Times New Roman");
            menuFont.add(iFontINR);


            iFontSize8= new JMenuItem("8");
            iFontSize8.addActionListener(this);
            iFontSize8.setActionCommand("8");
            menuFontSize.add(iFontSize8);

            iFontSize16= new JMenuItem("16");
            iFontSize16.addActionListener(this);
            iFontSize16.setActionCommand("16");
            menuFontSize.add(iFontSize16);

            iFontSize20= new JMenuItem("20");
            iFontSize20.addActionListener(this);
            iFontSize20.setActionCommand("20");
            menuFontSize.add(iFontSize20);

            iFontSize24= new JMenuItem("24");
            iFontSize24.addActionListener(this);
            iFontSize24.setActionCommand("24");
            menuFontSize.add(iFontSize24);

            iFontSize28= new JMenuItem("28");
            iFontSize28.addActionListener(this);
            iFontSize28.setActionCommand("28");
            menuFontSize.add(iFontSize28);

            
        }

            public void CreateColormenu() {
                icolor1=new JMenuItem("white");
                menuColor.add(icolor1);
                icolor1.addActionListener(this);
                icolor1.setActionCommand("White");

                icolor2=new JMenuItem("Pink");
                menuColor.add(icolor2);
                icolor2.addActionListener(this);
                icolor2.setActionCommand("Pink");
                
                icolor3=new JMenuItem("Black");
                menuColor.add(icolor3);
                icolor3.addActionListener(this);
                icolor3.setActionCommand("Black");

                icolor4=new JMenuItem("Blue");
                menuColor.add(icolor4);
                icolor4.addActionListener(this);
                icolor4.setActionCommand("Blue");
            }
        @Override
        public void actionPerformed(ActionEvent e) {
            
            String command = e.getActionCommand();
            switch (command) {
                case "New":
                    File.newFile();
                     
                    break;
                case "Open":
                    File.open();
                    break;

                case "Save":
                    File.Save();
                    break;

                case "SaveAs":
                    File.SaveAs();
                //    System.out.println("save");
                    break;

                case "Exit":
                    File.Exit();
                    break;
                case "8":
                    foramt.createFont(8);
                    break;
                case "16":
                    foramt.createFont(16);
                    break;

                case "20":
                    foramt.createFont(20);
                    break;
                case "24":
                    foramt.createFont(24);
                    break;
                case "28":
                    foramt.createFont(28);
                    break;
                case "Arial":
                    foramt.setFont(command);
                    break;
                case "Comic Sans MS":
                    foramt.setFont(command);
                    break;
                case "Times New Roman":
                    foramt.setFont(command);
                    break;
                case "White":
                    color.Change_Color(command);
                    break;
                case "Pink":
                    color.Change_Color(command);
                    break;
                case "Black":
                System.out.println("\n\n\n\n"+color+"\n\n\n\n\n");
                    color.Change_Color(command);
                    break;
                case "Blue":
                    color.Change_Color(command);
                    break;




                 
            
                
            }

            
        }

        
    
}
 
  





 
   