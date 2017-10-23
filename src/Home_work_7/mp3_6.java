package Home_work_7;
public class mp3_6 extends mp3s {
    int r = 0+ (int)(Math.random()*2);
    public mp3_6(String song,String song2,String song3,int cost) {
        super(song,song2,song3,cost);
        for (int i = 0; i < playlist.length; i++) {
            if (i == 0) {
                playlist[i] = song;
            } else if (i == 1) {
                playlist[i] = song2;
            } else if (i==2){
                playlist[i] = song3;
            }
        }
    }
    public void playsong(){
        System.out.println("\nPlayer 6: ");
        System.out.println("Playing: "+getSong() );
    }
    public void playAllSongs(){
        System.out.print("Playing playlist: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(" " + getPlaylist()[i]);
        }
    }
    public void shuffle(){
        int a = 0;
        int l;
        System.out.print("\nPlaying with shuffle: ");
            System.out.print(" " + getPlaylist()[r]+" ");
        if(r==0){
            a=1;
            System.out.print(" " + getPlaylist()[a]+" ");
        }else if (r==1){
            a=2;
            System.out.print(" " + getPlaylist()[a]+" ");
        }else if(r==2){
            a=0;
            System.out.print(" " + getPlaylist()[a]+" ");
        }
        if((r==0 || r==1 )&& (a==1 || a==0)){
            l=2;
            System.out.print(" " + getPlaylist()[l]+" ");
        }else if((r==1 || r==2)&& (a==2 || a==1)){
            l=0;
            System.out.print(" " + getPlaylist()[l]+" ");
        }else if((r==2 || r==0)&& (a==0 || a==2)){
            l=1;
            System.out.print(" " + getPlaylist()[l]+" ");
        }
    }

    public int getCost6(){
        return cost;
    }

}

