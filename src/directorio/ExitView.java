
package directorio;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Kevin Jiménez
 */
public class ExitView {
   private Scene scene;
    
   private GridPane grid;
   private ListView<String> list;   
    
   private Button regresar;
   
   public ExitView(){
      grid = new GridPane();
      grid.setAlignment(Pos.CENTER);
      grid.setHgap(10);
      grid.setVgap(10);
      grid.setPadding(new Insets(25, 25, 25, 25));
      
      list = new ListView<>();
      list.setMinWidth(200);
      grid.add(list, 0, 1);
      
      regresar = new Button("Regresar");
      grid.add(regresar, 0, 2);
      
      scene = new Scene(grid, 400, 300);
   }
   
   public void show(Stage stage) {
      stage.setTitle("Información Directorio");
      stage.setScene(scene);
      stage.show();
   }

    public ListView<String> getList() {
        return list;
    }

    public Button getRegresar() {
        return regresar;
    }
   
}
