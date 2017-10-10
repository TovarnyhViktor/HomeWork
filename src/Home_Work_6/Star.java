package Home_Work_6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.Scanner;

public class Star extends Application{
    public static int xcenter;
    public static int ycenter;
    public static int widthtocenter;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите центральную точку х вашей звезды: ");
        xcenter = in.nextInt();
        System.out.print("Введите центральную точку у вашей звезды: ");
        ycenter = in.nextInt();
        System.out.print("растояние от центра до углов звезды: ");
        widthtocenter = in.nextInt();
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        primaryStage.setWidth(900);
        primaryStage.setHeight(1000);
         Line line = new Line(xcenter+20,ycenter+5,xcenter+15-widthtocenter,ycenter+15+widthtocenter);
        root.getChildren().addAll(line);
        Line line2 = new Line(xcenter+4-widthtocenter*2,ycenter+15+widthtocenter,xcenter+15-widthtocenter,ycenter+15+widthtocenter);
        root.getChildren().addAll(line2);
        Line line3 = new Line(xcenter+4-widthtocenter*2,ycenter+15+widthtocenter,xcenter+12-widthtocenter,ycenter+22+widthtocenter*2);
        root.getChildren().addAll(line3);
        Line line4 = new Line(xcenter+8-widthtocenter*1.5,ycenter+32+widthtocenter*3,xcenter+12-widthtocenter,ycenter+22+widthtocenter*2);
        root.getChildren().addAll(line4);
        Line line5 = new Line(xcenter+8-widthtocenter*1.5,ycenter+32+widthtocenter*3,xcenter+20,ycenter+22+widthtocenter*2.5);
        root.getChildren().addAll(line5);
        Line line6 = new Line(xcenter+32+widthtocenter*1.5,ycenter+32+widthtocenter*3,xcenter+20,ycenter+22+widthtocenter*2.5);
        root.getChildren().addAll(line6);
        Line line7 = new Line(xcenter+30+widthtocenter*1.5,ycenter+32+widthtocenter*3,xcenter+26+widthtocenter,ycenter+22+widthtocenter*2);
        root.getChildren().addAll(line7);
        Line line8 = new Line(xcenter+20,ycenter+5,xcenter+25+widthtocenter,ycenter+15+widthtocenter);
        root.getChildren().addAll(line8);
        Line line9 = new Line(xcenter+35+widthtocenter*2,ycenter+15+widthtocenter,xcenter+25+widthtocenter,ycenter+15+widthtocenter);
        root.getChildren().addAll(line9);
        Line line10 = new Line(xcenter+26+widthtocenter,ycenter+21+widthtocenter*2,xcenter+35+widthtocenter*2,ycenter+15+widthtocenter);
        root.getChildren().addAll(line10);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
    primaryStage.show();
    }
}

