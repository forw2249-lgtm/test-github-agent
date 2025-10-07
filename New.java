import javafx.application.Application;
import javafx.scene.Group;
import javafx.stage.Stage;
import org.w3c.dom.DocumentFragment;

public class TreePusher extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        
        // Add your tree nodes here using any appropriate JavaFX node types like:
        // AnchorPane, HBox, VBox etc. to simulate a Tree structure visually for this example...
        Node childNode1 = createTreeNode("Child 1");
        root.getChildren().add(childNode1);
        
        Node grandchildNode2 = createTreeNode("Grandchild 2", childNode1);
        childNode1.getChildren().add(grandchildNode2);
    endregion
    
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}