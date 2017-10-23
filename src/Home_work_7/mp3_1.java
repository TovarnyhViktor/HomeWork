package Home_work_7;
public class mp3_1 extends mp3s {

    public mp3_1(String song,String song2,String song3,int cost) {
        super(song,song2,song3,cost);
    }
    public void playsong(){
        System.out.println("Player 1:");
        System.out.println("Playing: " +getSong());
        System.out.println(+cost);
    }
    public int getCost1(){
        return cost;
    }

}
