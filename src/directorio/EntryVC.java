
package directorio;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * @author Kevin Jiménez
 */
public class EntryVC {
    private DataBean dataBean;
    private EntryView view;
    
    public EntryVC(DataBean dataBean) {
      this.dataBean = dataBean;
      this.view = new EntryView();
       
      view.getAdicionar().setOnAction(new adicionarEventHandler()); 
      view.getListar().setOnAction(new listarEventHandler());
    }
    
    public void show(){
        view.show(dataBean.getPrimaryStage());
    }
    
    class listarEventHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e) {   
            ExitVC VC = new ExitVC(dataBean);
            VC.show();   
        }
    }
    
    class adicionarEventHandler implements EventHandler<ActionEvent>{
 
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
            erg = dataBean.getDirectory().put(nombre, telefono);
          
            if(erg == null){
                view.getMensaje().setText("Información agregada :)");
            }else{
                view.getMensaje().setText("Ya existe la información");
            }
        }    
    }
}
