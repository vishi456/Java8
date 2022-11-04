
interface a{
        void show();
    }
public class lambda{
public static void main(String args[]){
a obj;
obj =()->System.out.println("calling");
}
           obj.show();
}