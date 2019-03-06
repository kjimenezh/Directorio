
package Vista3;

import Directory.Modelo;
import Directory.Singleton;
import Vista1.Controlador1;
import Vista2.Controlador2;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * @author Kevin Jiménez
 */
public class Controlador3 {
    private Modelo modelo;
    private Ventana3 view;
    
    public Controlador3(Modelo modelo) {
      this.modelo = modelo;
      this.view = new Ventana3();
       
      view.getVentana1().setOnAction(new ventana1Evento());
      view.getVentana2().setOnAction(new ventana2Evento());
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        
        view.mostrar(singleton.getStage());
    }
    
    class ventana1Evento implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            Controlador1 controlador = new Controlador1(modelo);
            controlador.mostrarVista();
        }
     
    }
    
    class ventana2Evento implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            Controlador2 controlador = new Controlador2(modelo);
            controlador.mostrarVista();
        }
     
    }
}
