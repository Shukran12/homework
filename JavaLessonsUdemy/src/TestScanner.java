import java.util.Arrays;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
    String a  = "abd224";
    String[] ae = a.split("");
    String[] ar = {"a","b", "c", "d"};
    String test = "";
    StringBuilder str = new StringBuilder();
    for(int i=0; i< ae.length; i++){
        for(int j=0; j< ar.length; j++){
           if(ae[i].equals(ar[j])){
              str.append(ae[i]);

           }
        }
    }
        System.out.println(str);




    }
}
