package Home_Work_6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;
import java.util.Scanner;

public class SnowMan extends Application {
    public static int min;

    public static int max;

    public static int kolvo;

    public static final Random r = new Random();

    public int rad=RandomR();

    public int y = 862;

    public int q=3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите Минимальный радиус: ");
        min = in.nextInt();
        System.out.print("Введите Максимальный радиус: ");
        max = in.nextInt();
        System.out.print("Введите количество кругов для снеговика: ");
        kolvo = in.nextInt();
        launch(args);
    }

    private void initViews(Pane root) {
        {
            for(int i =1;i<=kolvo;i++){
            Circle circle = new Circle(450, centerY(), rad);
            circle.setFill(Paint.valueOf(String.valueOf(getRandom())));
            root.getChildren().addAll(circle);
            y = y - rad * 2;
            if(i<kolvo){
            rad = RandomR();}}
            q--;
            Circle circle2 = new Circle(435, centerY(), rad2());
            circle2.setFill(Paint.valueOf(String.valueOf(getRandom())));
            root.getChildren().addAll(circle2);
            Circle circle3 = new Circle(465, centerY(), rad2());
            circle3.setFill(Paint.valueOf(String.valueOf(getRandom())));
            root.getChildren().addAll(circle3);
            q--;
            Circle circle4 = new Circle(450, centerY(), rad2());
            circle4.setFill(Paint.valueOf(String.valueOf(getRandom())));
            root.getChildren().addAll(circle4);
        }
    }

    public int centerY(){
        if(q==3){
        int y1 = y - rad;
        return y1;}else if (q==2){
            int y1=y + 15;
            return y1;
        }else{
            int y1=y + rad;
            return y1;
        }
    }

    public static Color getRandom(){
        return Color.color(r.nextDouble(),r.nextDouble(),r.nextDouble());
    }

    public int rad2(){
        int r2 = rad/8;
        return r2;
    }

    public int RandomR() {
        int r = min+ (int)(Math.random()*max);
        return r;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setWidth(900);
        primaryStage.setHeight(1000);
        Pane root = new Pane();
        initViews(root);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}