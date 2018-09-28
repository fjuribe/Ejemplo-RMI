package interfaz;
import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame{

    public Ventana(){     
       setventana(); 
       iniciarcomponentes();
      
    }
    
    private void setventana(){
    
        setSize(400,400);
        setTitle("Mi primera ventana(título)");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(200,200));
        this.setMaximumSize(new Dimension(600, 600));  
        this.getContentPane().setBackground(Color.WHITE);
        this.setLayout(null);
       // this.setResizable(false); no permite que maximizemos o minimizemos el frame
       // this.iniciarComponsetMaximumSizeclsentes();
    
    }
    
  private void colocarpaneles(){
     //this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.X_AXIS));
      
     // this.setLayout(new FlowLayout());
      
       JPanel centro=new JPanel();
       centro.setBackground(Color.blue);
       centro.setBounds(0, 0,100,100);
       this.getContentPane().add(centro);
       
       
       JPanel norte=new JPanel();
       norte.setBackground(Color.GRAY);
       norte.setBounds(100, 100,100,100);
       this.getContentPane().add(norte);
       
       JPanel sur = new JPanel();
       sur.setBackground(Color.YELLOW);
       sur.setBounds(0, 100,100,100);
       this.getContentPane().add(sur);
       
       
       
       JPanel oeste=new JPanel();
       oeste.setBackground(Color.GREEN);
       oeste.setBounds(100, 0,100,100);
       this.getContentPane().add(oeste);
       
       
       JPanel este=new JPanel();
       este.setBackground(Color.PINK);
       este.setBounds(200, 200,100,100);
       this.getContentPane().add(este);


    }
    
    private void iniciarcomponentes(){
                  colocarpaneles();
    }
    
    
   public static void main(String[] args){
            Ventana v=new Ventana();
            v.setVisible(true);
    }

  
    
    /*****************
    private void iniciarComponentes(){
       addWindowListener(new java.awt.event.WindowAdapter() {
            
           @Override
           public void windowClosing(java.awt.event.WindowEvent e){
               System.exit(0);      
           }
     });
    
    }
   ***********/
    
    //ejecucion

    /**
     *
     * @param args
     */
   

  
    
}
