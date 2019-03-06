
package Vista1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Kevin Jiménez
 */

public class Ventana1 {
    
    private Scene scene;
    private GridPane grid;
    private Label nombre;
    private TextField nombreT;
    private Label direccion;
    private TextField direccionT;
    private Label telefono;
    private TextField telefonoT;
    private Button adicionar;
    private Button listar;
    private Text mensaje;
    private BorderPane border;
    private ComboBox menutel;
  
    
    public Ventana1(){
        
      grid = new GridPane();
      grid.setAlignment(Pos.CENTER);
      grid.setHgap(10);
      grid.setVgap(10);
      grid.setPadding(new Insets(25, 25, 25, 25));
      
      nombre = new Label("Nombre: ");
      nombreT = new TextField();
      grid.add(nombre, 0, 1);
      grid.add(nombreT, 1, 1);
      
      direccion = new Label("Direccion: ");
      direccionT = new TextField();
      grid.add(direccion, 0, 2);
      grid.add(direccionT, 1, 2);
      
      telefono = new Label("Telefono: ");
      HBox fila2 = new HBox();
      telefonoT = new TextField();
      ObservableList names =
      FXCollections.observableArrayList();
      names.add("+57");
      names.add("+58");
      names.add("+59");
      
      menutel = new ComboBox(names);  
      fila2.getChildren().add(menutel);
      fila2.getChildren().add(telefonoT);
      grid.add(telefono, 0, 3);
      grid.add(fila2, 1, 3);
      
      HBox filaBt = new HBox();
      adicionar = new Button("Adicionar");
      listar = new Button("Listar Informacion");
      filaBt.getChildren().add(adicionar);
      filaBt.getChildren().add(listar);
      grid.add(filaBt, 1, 4);
      
      mensaje = new Text();
      grid.add(mensaje, 1, 5);
      border = new BorderPane();
      border.setTop(getMenuBar());
      border.setCenter(grid);
      
      scene = new Scene(border, 400, 300);
    }
    
    private MenuBar getMenuBar(){
        Menu menu1 = new Menu("Menu 1");
        MenuItem menuItem1 = new MenuItem("Item 1");
        MenuItem menuItem2 = new MenuItem("Item 2");
        menu1.getItems().add(menuItem1);
        menu1.getItems().add(menuItem2);

        Menu menu2 = new Menu("Menu 2");
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu1);
        menuBar.getMenus().add(menu2);
        return menuBar;
    }
    
    public void mostrar(Stage stage) {
      stage.setTitle("Registrar Datos");
      stage.setScene(scene);
      stage.show();
    }
    
    //Getters de layouts dinámicos

    public TextField getNombreT() {
        return nombreT;
    }

    public TextField getDireccionT() {
        return direccionT;
    }

    public TextField getTelefonoT() {
        return telefonoT;
    }

    public Button getAdicionar() {
        return adicionar;
    }

    public Text getMensaje() {
        return mensaje;
    }

    public Button getListar() {
        return listar;
    }
    
}
