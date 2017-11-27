package Home_Work_13;

import Home_Work_13.entities.YouTubeResponse;
import com.mashape.unirest.http.HttpResponse;
import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.text.html.ImageView;

public class YouTubeFrame extends Application {
    ExecutorService pool = Executors.newFixedThreadPool(4);
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        TextField textSearching=new TextField("Liker");
        textSearching.setTranslateX(10);
        textSearching.setTranslateY(10);
        Button sendSearch = new Button("Search");
        sendSearch.setTranslateX(180);
        sendSearch.setTranslateY(10);
        HttpResponse<String> result = YouTubeClient.getActivitiesString(25);
        System.out.println(result.getBody());
        root.getChildren().addAll(textSearching,sendSearch);
        sendSearch.setOnMouseClicked((event -> {
            String searchingfinal = textSearching.getText();
            pool.submit(()->{
                HttpResponse<YouTubeResponse> response =YouTubeClient.getActivities(25,searchingfinal,searchingfinal,searchingfinal);

                System.out.println("Response Code"+ response.getStatus());
                YouTubeResponse body = response.getBody();
                Platform.runLater(()->{
                    printResult(root,body);
                });
            });
        }));
        primaryStage.setScene(new Scene(root));
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        primaryStage.show();

    }
    void printResult(Pane root,YouTubeResponse response){
       /* ImageView imageView = new ImageView();
        imageView.setFitWidth(500);
        imageView.setFitWidth(500);
        root.getChildren().add(imageView);*/
    }
}
