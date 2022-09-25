 
import java.awt.Font;
  
 
 
 
public class Function_Foramt {
    gui GUI;
    String selectedFont;
    Font arial,comicSansMS,timeNewRoman;
    public  Function_Foramt(gui GUI) {
        this.GUI=GUI;
        
    }
    public void createFont(int fontSize) {
        arial= new Font("Arial",Font.PLAIN,fontSize);
        comicSansMS= new Font("Comic Sans MS",Font.PLAIN,fontSize);
        timeNewRoman= new Font("Times New Roman",Font.PLAIN,fontSize);
        
        setFont(selectedFont);

    }
    public void setFont(String font) {
          selectedFont = font;
        switch (selectedFont) {
            case "Arial":
                GUI.textArea.setFont(arial);
                break;
            case "Comic Sans MS":
                GUI.textArea.setFont(comicSansMS);
                break;
            case "Times New Roman":
                GUI.textArea.setFont(timeNewRoman);
                break;
        
            default:
                break;
        }
    }


    
}
