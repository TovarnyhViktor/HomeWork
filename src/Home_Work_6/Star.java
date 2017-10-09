package Home_Work_6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Star extends Application{
    public int xcenter = 100;
    public int ycenter = 100;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        primaryStage.setWidth(900);
        primaryStage.setHeight(1000);
    Line line = new Line(xcenter,ycenter-50,xcenter+50,ycenter);
    root.getChildren().addAll(line);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
    primaryStage.show();
    }
}

