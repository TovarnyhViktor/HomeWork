package Home_work_7;

public class mp3s {
    public int cost;
    private String song;
    private String song2;
    private String song3;

    public mp3s(String song, String song2, String song3,int cost) {
        this.song = song;
        this.song2 = song2;
        this.song3 = song3;
        this.cost=cost;
    }

    public String[] playlist = new String[]{song, song2, song3};

    public String getSong() {
        return song;
    }

    public String getSong2() {
        return song2;
    }

    public String getSong3() {
        return song3;
    }

    public String[] getPlaylist() {
        return playlist;
    }
}
