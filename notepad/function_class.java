import java.awt.FileDialog;
 
import java.io.BufferedReader;
 
 
import java.io.FileReader;
import java.io.FileWriter;
 
public class function_class{
    gui GUI;
    String FileName;
    String fileAdress; 

  public function_class(gui GUI) {
      this.GUI=GUI;

      
  }
  public void newFile() {
      GUI.textArea.setText("");
      GUI.window.setTitle("NEW");
      FileName=null;
      fileAdress=null;        
  }




  public void Save() {
      if (FileName==null) {
          
      }else{
          try {
              FileWriter fw= new FileWriter(  fileAdress+FileName);
              fw.write(GUI.textArea.getText());
              GUI.window.setTitle(FileName);
              fw.close();
              
          } catch (Exception e) {
             
          }
      }
  }



  public void SaveAs() {
      FileDialog fd = new FileDialog(GUI.window,"SaveAs",FileDialog.SAVE);
      fd.setVisible(true);

      if(fd.getFile()!=null){
          FileName = fd.getFile();
          fileAdress = fd.getDirectory();
          GUI.window.setTitle(FileName);
      }
      try {
          FileWriter fw= new FileWriter(  fileAdress+FileName);
          fw.write(GUI.textArea.getText());
          fw.close();
      } catch (Exception e) {
          System.out.println("not save");
      }

      }



      public void Exit() {
          System.exit(0);
      }
  
  public void open() {
      FileDialog fd= new FileDialog(GUI.window,"open", FileDialog.LOAD);
      fd.setVisible(true);

      if(fd.getFile()!=null){
              FileName = fd.getFile();
              fileAdress = fd.getDirectory();
            GUI.window.setTitle(FileName);

            BufferedReader bf;
          try {
              bf = new BufferedReader(new FileReader(fileAdress + FileName));

              GUI.textArea.setText("");

            String line =null;

            while ((line = bf.readLine())!=null) {
              GUI.textArea.append(line+"\n");
              
            }
          } catch ( Exception e) {
             
          }   
      }
          
  }

}