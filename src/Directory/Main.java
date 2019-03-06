
package Directory;

import Vista1.Controlador1;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;

/**
 * @author Kevin Jiménez
 */

public class Main extends Application{
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Registrar la variable en el singleton
        Singleton singleton = Singleton.getSingleton();
        singleton.setStage(primaryStage);
        
        //Modelo en memoria
        Modelo modelo = new Modelo();
        //Invocar el controlador de la vista que quiero visualizar
        Controlador1 ventana1 = new Controlador1(modelo);
        
        ventana1.mostrarVista();
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
