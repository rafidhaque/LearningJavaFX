import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application  {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // entire window is stage.
        // inside the stage in scene, stuff that's inside.

        primaryStage.setTitle("Title of my name");
        button = new Button("Click me man");

        button.setOnAction(e -> printer()); // also can use lambda expression.


        // layout: how everything is staged.
        StackPane layout = new StackPane(); // position button in the middle
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void printer() {
        System.out.println("hello from");
    }

}
