
package directorio;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * @author Kevin Jiménez
 */
public class ExitVC {
   private DataBean dataBean;
   private ExitView view;
    
    
   public ExitVC(DataBean dataBean) {
      this.dataBean = dataBean;
      this.view = new ExitView();
       
      view.getRegresar().setOnAction(new regresarEventHandler());   
   }
    
    public void show(){
        // LLena vista con datos.
        int a = 1;
        for (String key : dataBean.getDirectory().keySet()) {
            // 1: Name
            view.getList().getItems().add(a + ": " + key + ", " + dataBean.getDirectory().get(key));
            a++;
        }      
     
        view.show(dataBean.getPrimaryStage());
   }
    
   class regresarEventHandler implements EventHandler<ActionEvent>{
 
        @Override
        public void handle(ActionEvent e) {   
            // Ir a la siguiente pagina.
            EntryVC VC = new EntryVC(dataBean);
            VC.show();   
        }   
    }
}
