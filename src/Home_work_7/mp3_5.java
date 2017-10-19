package Home_work_7;

public class mp3_5 extends mp3s {
    private final int cost;
    public mp3_5(String song,String song2,String song3) {
        super(song,song2,song3);
        cost = 400;
        for (int i = 0; i < playlist.length; i++) {
            if (i == 2) {
                playlist[i] = song;
            } else if (i == 1) {
                playlist[i] = song2;
            } else if(i==0){
                playlist[i] = song3;
            }
        }
    }
    public void playsong(){
        System.out.println("\nPlayer 5: ");
        System.out.println("Playing: "+getSong() );
    }
    public void playAllSongs(){
        System.out.print("Playing playlist: ");
            for (int i = 0; i < 3; i++) {
                System.out.print(" " + getPlaylist()[i]);
            }
        }
    public int getCost5(){
        return cost;
    }
}
