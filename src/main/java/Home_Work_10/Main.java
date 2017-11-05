package Home_Work_10;

import com.alibaba.fastjson.JSON;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    Forms forms = new Forms();
    forms.forms.add(new Form(Fruit.apple,10,"04/11/2017",5));
    forms.forms.add(new Form(Fruit.banana,20,"04/11/2017",10));
    String json = JSON.toJSONString(forms);
        System.out.println(json);
        readforms();

    }
    static void readforms() throws FileNotFoundException {
        String json = new Scanner(new File("files/forms.json")).useDelimiter("\\Z").next();
        Forms forms = JSON.parseObject(json, Forms.class);
        System.out.println(json);
        System.out.println(forms);
        System.out.println();
    }
}
