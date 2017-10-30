package Home_Work_9;

public class MyArrayList {
    public int listnumber=1;
    public MyArrayList(){
       // this.listnumber=listnumber;
    }
    public int[] myarraylist = new int[listnumber];

        public void add(int a){
            for (int i=0;i<myarraylist.length;i++){
                if(i+1==myarraylist.length){
                    listnumber++;
                    listnumber++;
                    int[] myarraylist1 = new int[listnumber];
                    myarraylist1[2]=a;
                }
            }
        }
    public void show(){
      //  System.out.println();
    }
    }
