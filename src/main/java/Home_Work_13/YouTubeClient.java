package Home_Work_13;

import Home_Work_13.entities.YouTubeResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.exceptions.UnirestException;

public class YouTubeClient {
    private static final String YOUTUBE="https://www.googleapis.com/youtube/v3/{method}";
    private static final String YOUTUBE_KEY="AIzaSyDgk1XZHWW3nlN3f1Rx9rlktusHV-nBmYk";
    private YouTubeClient(){}
    public static HttpResponse<YouTubeResponse> getSearching1(int maxResults,String q){
        try {
            return Unirest.get(YOUTUBE)
                    .routeParam("method","activities")
                    .queryString("type","search")
                    .queryString("q",q)
                    .queryString("maxResults",maxResults)
                    .queryString("part","snippet")
                    .queryString("key",YOUTUBE_KEY)
                    .asObject(YouTubeResponse.class);
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static HttpResponse<String> getSearching(int maxResults){
        try {
            return Unirest.get(YOUTUBE)
                    .routeParam("method","search")
                    .queryString("q","surfing")
                    .queryString("maxResults",maxResults)
                    .queryString("part","snippet")
                    .queryString("key",YOUTUBE_KEY)
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return null;
    }
}
