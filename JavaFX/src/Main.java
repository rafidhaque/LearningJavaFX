import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main extends Application  {
    // Embedding Layouts
    // Using BorderPane


    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("hello");

        HBox hBox = new HBox();
        Button button1 = new Button("File");
        Button button2 = new Button("Edit");
        Button button3 = new Button("View");
        hBox.getChildren().addAll(button1, button2, button3);

        VBox vBox = new VBox();
        Button buttonA = new Button("A");
        Button buttonB = new Button("B");
        Button buttonC = new Button("C");
        vBox.getChildren().addAll(buttonA, buttonB, buttonC);

        BorderPane layout = new BorderPane();
        layout.setTop(hBox);
        layout.setLeft(vBox);

        Scene scene = new Scene(layout, 400, 400);
        window.setScene(scene);
        window.show();
    }

}
