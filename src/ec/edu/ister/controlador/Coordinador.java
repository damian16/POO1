package ec.edu.ister.controlador;

import ec.edu.ister.vista.*;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Coordinador {
    Login login= new Login(this);
    Circulo circulo = new Circulo(this);
   
    Triangulo triangulo =new Triangulo(this);
    areaCirculo areacirculo =new areaCirculo(this);
    
    
    public void mostrarLogin(){
        login.setVisible(true);
    }
    public void mostrarCirculo(){
        circulo.setVisible(true);
    }

    public void mostarTriangulo(){
        triangulo.setVisible(true);
    }

     public void ocultarLogin(){
        login.setVisible(false);
    }
    public void ocultarCirculo(){
        circulo.setVisible(false);
    }

    public void ocultarTriangulo(){
        triangulo.setVisible(false);
    }
    
    
    
    public void mostrarAreaCirculo(){
       areacirculo.setVisible(true);
    }
    public void ocultarAreaCirculo(){
       areacirculo.setVisible(false);
    }
    
 
}
