
package Directory;

import java.util.HashMap;
import java.util.Map;
import javafx.stage.Stage;

/**
 * @author Kevin Jiménez
 */
public class Modelo {
    private Stage primaryStage = null;   
    private Map<String , String> directory = null;
    
    public Modelo() {
        this.directory = new HashMap<>();
    }
 
    public Map<String, String> getDirectory() {
        return directory;
    }
 
    public Stage getPrimaryStage() {
        return primaryStage;
    }
}
