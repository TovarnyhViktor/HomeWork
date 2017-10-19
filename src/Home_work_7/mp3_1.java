package Home_work_7;
public class mp3_1 extends mp3s {
    private final int cost;
    public mp3_1(String song,String song2,String song3) {
        super(song,song2,song3);
        cost = 200;
    }
    public void playsong(){
        System.out.println("Player 1:");
        System.out.println("Playing: " +getSong());
    }
    public int getCost1(){
        return cost;
    }

}
