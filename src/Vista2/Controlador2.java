
package Vista2;

import Directory.Modelo;
import Directory.Singleton;
import Vista1.Controlador1;
import Vista3.Controlador3;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * @author Kevin Jiménez
 */
public class Controlador2 {
   private Modelo modelo;
   private Ventana2 view;
    
    
   public Controlador2(Modelo modelo) {
      this.modelo = modelo;
      this.view = new Ventana2();
       
      view.getRegresar().setOnAction(new regresarEventHandler());   
      view.getSiguiente().setOnAction(new siguienteEventHandler());  
   }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        
        int a = 1;
        for (String key : modelo.getDirectory().keySet()) {
            
            view.getList().getItems().add(a + ": " + key + ", " + modelo.getDirectory().get(key));
            a++;
        }      
     
        view.mostrar(singleton.getStage());
   }
    
   class regresarEventHandler implements EventHandler<ActionEvent>{
 
        @Override
        public void handle(ActionEvent e) {   
            // Regresar 
            Controlador1 controlador1 = new Controlador1(modelo);
            controlador1.mostrarVista();   
        }   
    }
   
   class siguienteEventHandler implements EventHandler<ActionEvent>{
 
        @Override
        public void handle(ActionEvent e) {   
            // Ir a la siguiente pagina.
            Controlador3 controlador3 = new Controlador3(modelo);
            controlador3.mostrarVista();   
        }   
    }
}
