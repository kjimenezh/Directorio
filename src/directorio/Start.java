
package directorio;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;

/**
 * @author Kevin Jiménez
 */
public class Start extends Application{
    public static void main(String[] args) {
        launch(args);
    }
      
    @Override
    public void start(Stage primaryStage) {
        
       // ambito de sesión / ámbito de aplicación ¡inicializar beans!
       // necesita ser pasado el controlador de la aplicacion
       DataBean dataBean = new DataBean(primaryStage);
        
 
       // LLamar el primer controlador
       EntryVC entradaVC = new EntryVC(dataBean);
       entradaVC.show();      
    }
}
