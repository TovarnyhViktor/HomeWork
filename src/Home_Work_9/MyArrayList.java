package Home_Work_9;

public class MyArrayList {
    public int listnumber=0;
    public int[] myarraylist = new int[listnumber];
    public MyArrayList(){
        }
        public void add(int a){
            for (int i=0;i<=myarraylist.length;i++){
                if(i==myarraylist.length){
                    listnumber++;
                    myarraylist[1]=a;
                }
            }
        }

    public int[] getMyarraylist() {
        return myarraylist;
    }

    public void show(){

    }
    }
