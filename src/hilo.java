/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cesar
 */
public class hilo 
{
 public Thread hiloF;

    public hilo(){
      hiloF =new Thread(){
           @Override
           public void run() {
               super.run(); //el metodo run es el corazon del subprocesos
               try {
                    Figuras fig = new Figuras();
                    fig.getClass();
                } catch (Exception e) {
                    e.printStackTrace();
                }
           }
                    
       };
     
    }     
}
