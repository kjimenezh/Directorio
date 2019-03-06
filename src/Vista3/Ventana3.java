
package Vista3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * @author Kevin Jiménez
 */
public class Ventana3 {
    private Scene scene;
    private GridPane grid;
    private Button ventana1;
    private Button ventana2;
    
    public Ventana3(){
        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(15, 15, 15, 15));
        
        ventana1 = new Button("Ir a Registrar Datos");
        ventana2 = new Button("Ir a Información Directorio");
        
        HBox filabts = new HBox();
        filabts.getChildren().add(ventana1);
        filabts.getChildren().add(ventana2);
        
        grid.add(filabts,0,0);
        
        scene = new Scene(grid, 400, 300);
    }
    
    public void mostrar(Stage stage) {
      stage.setTitle("Regresar");
      stage.setScene(scene);
      stage.show();
    }

    public Button getVentana1() {
        return ventana1;
    }

    public Button getVentana2() {
        return ventana2;
    }
    
}
