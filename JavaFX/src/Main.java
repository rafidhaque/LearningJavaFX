import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler<ActionEvent> {

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

        button.setOnAction(this); // "this" here, is a class where the handle() method for the button is located.


        // layout: how everything is staged.
        StackPane layout = new StackPane(); // position button in the middle
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == button) {// which object or button caused (pressed)
            System.out.printf("I love it");
        }
    }
}
