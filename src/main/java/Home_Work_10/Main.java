package Home_Work_10;
import com.alibaba.fastjson.JSON;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Date datemain = new Date();

    public static void main(String[] args) throws FileNotFoundException {
    //save();
    load();
        SimpleDateFormat format = new SimpleDateFormat ("dd-MM-yyyy");
        //String datemainn = args.length == 0 ? datemain : args[0];
    }


    static void load() throws FileNotFoundException {
        String json = new Scanner(new File("files/forms.json")).useDelimiter("\\Z").next();
        Forms forms = JSON.parseObject(json, Forms.class);
        System.out.println(forms);
        System.out.println();
    }
    static void save(){
        Forms forms = new Forms();
        forms.forms.add(new Form(Fruit.apple,10,"04/11/2017",5));
        forms.forms.add(new Form(Fruit.banana,20,"04/11/2017",10));
        forms.forms.add(new Form(Fruit.fig,15,"07/11/2017",45));
        String json = JSON.toJSONString(forms);
        try(FileWriter writer = new FileWriter("files\\forms.json", false)){
            writer.write(json);
            writer.flush();
        }catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }
    /*List<Fruit> getSpoiledFruits(){

    }*/
}
