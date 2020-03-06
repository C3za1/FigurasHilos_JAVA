

import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cesar
 */
public class Figuras extends Thread 
{
   
    public void cuadrado(Graphics g)
    {
       g.drawRect(50, 50, 90, 90);
      
    }
      
    public void circulo(Graphics c)
    {
        c.drawOval(50, 150, 90, 90);
    }
    
    public void rectangulo(Graphics r)
    {
        r.drawRect(150, 100, 100, 200);
    }
    
}
