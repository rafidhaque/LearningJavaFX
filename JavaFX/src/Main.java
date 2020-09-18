import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main extends Application  {
    // Properly Close Application??
    // Save the state first.


    Stage window;
    Button button;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("hello");

        window.setOnCloseRequest(event -> {
            event.consume(); // we're gonna take care of it. 
            closeProgram();
        });

        button = new Button("Click");
        button.setOnAction(event -> closeProgram());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 200, 200);
        window.setScene(scene);
        window.show();
    }

    void closeProgram() {
//        System.out.println("File is Saved"); // haha!
//        window.close();

        Boolean answer = ConfirmBox.display("Title", "Sure???");
        if (answer == true) {
            window.close();
        }
    }

}
