package Home_Work_10;

public class Form {
    public Fruit fruits;
    public int shelfLife;
    public String  date;
    public int price;
    public Form(Fruit fruits,int shelfLife,String date,int price){
        this.fruits=fruits;
        this.shelfLife=shelfLife;
        this.date=date;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Form{" +
                "fruits=" + fruits +
                ", shelfLife=" + shelfLife +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}
