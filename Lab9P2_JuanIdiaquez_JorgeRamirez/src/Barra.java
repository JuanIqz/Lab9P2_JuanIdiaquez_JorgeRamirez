
import java.awt.Color;
import javax.swing.JProgressBar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanf
 */
public class Barra extends Thread{
    
   int distancia;
   JProgressBar barra; 
   Color color; 
   int tiempo;

    public Barra() {
           }
    
    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Barra(JProgressBar barra) {
        this.barra = barra;
    }
    
    
   
    @Override
    public void run(){ 
            for (int i = 0; i < 100; i++) {
                barra.setValue(i);
            try {
                Thread.sleep(tiempo);
            } catch (Exception e) {
            }
        }
    }
    
}
