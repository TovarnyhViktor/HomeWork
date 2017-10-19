package Home_work_7;

public class mp3_2 extends mp3s {
    private final int cost;
    public mp3_2(String song,String song2,String song3) {
        super(song,song2,song3);
        cost = 300;
    }
    public void playsong(){
        System.out.println("Player 2: ");
        System.out.println("Playing: error" );
    }
    public int getCost2(){
        return cost;
    }

}
