
package Vista1;

import Vista2.Controlador2;
import Directory.Modelo;
import Directory.Singleton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * @author Kevin Jiménez
 */
public class Controlador1 {
    private Modelo modelo;
    private Ventana1 view;
    
    public Controlador1(Modelo modelo) {
      this.modelo = modelo;
      this.view = new Ventana1();
       
      view.getAdicionar().setOnAction(new adicionarEvento()); //se la pasa referencia a un objeto que implementa EventHandler
      view.getListar().setOnAction(new listarEvento());
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        
        view.mostrar(singleton.getStage());
    }

    //clases interna / inner class
    class listarEvento implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e) {   
            Controlador2 controlador2 = new Controlador2(modelo);
            controlador2.mostrarVista();   
        }
    }
    
    class adicionarEvento implements EventHandler<ActionEvent>{
 
        @Override
        public void handle(ActionEvent e) {   
            view.getMensaje().setText("");
          
            String nombre = view.getNombreT().getText();
            String direccion = view.getDireccionT().getText();
            String telefono = view.getTelefonoT().getText();
         
            view.getNombreT().setText("");
            view.getDireccionT().setText("");
            view.getTelefonoT().setText("");
          
            if(nombre.isEmpty()){
                view.getMensaje().setText("Ingrese el nombre!");
            return;
            }
            if(direccion.isEmpty()){
                view.getMensaje().setText("Ingrese la direccion!");
            return;
            }
            if(telefono.isEmpty()){
                view.getMensaje().setText("Ingrese el telefono!");
            return;
            }
            
            String erg = null;
            erg = modelo.getDirectory().put(nombre, telefono);
          
            if(erg == null){
                view.getMensaje().setText("Información agregada :)");
            }else{
                view.getMensaje().setText("Ya existe la información");
            }
        }    
    }
}
