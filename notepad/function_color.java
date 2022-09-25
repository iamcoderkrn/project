import java.awt.Color;

public class function_color {
    
 
    
    gui GUI;
 
    public function_color(gui GUI) {
        this.GUI =GUI;
    }



    public void Change_Color(String color) {
        
        switch (color) {
            case "White":
                GUI.window.getContentPane().setBackground(Color.WHITE);
                GUI.textArea.setBackground(Color.WHITE);
                GUI.textArea.setForeground(Color.BLACK);
                
                break;
            case "Pink":
                GUI.window.getContentPane().setBackground(Color.pink);
                GUI.textArea.setBackground(Color.pink);
                GUI.textArea.setForeground(Color.BLACK);
                break;
            case "Black":
                GUI.window.getContentPane().setBackground(Color.BLACK);
                GUI.textArea.setBackground(Color.BLACK);
                GUI.textArea.setForeground(Color.WHITE);
                System.out.println("\n\n\n\ntested"+color+"\t\t\n\n\n\n");
                break;
            case "Blue":
                GUI.window.getContentPane().setBackground(Color.BLUE);
                GUI.textArea.setBackground(Color.BLUE);
                GUI.textArea.setForeground(Color.yellow);
               
                break;
        
            default:
                break;
        }
    }

}
    

