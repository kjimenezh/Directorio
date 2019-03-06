
package Directory;

import javafx.stage.Stage;

/**
 * @author Kevin Jiménez
 */
public class Singleton {
    private static Singleton singleton = null;
    private Stage stage;
    
    public static Singleton getSingleton(){
        if(singleton == null){
            singleton= new Singleton();
        }
        return singleton;
    }
    
    public Stage getStage(){
        return stage;
    }
    
    public void setStage(Stage stage){
        this.stage = stage;
    }
}
