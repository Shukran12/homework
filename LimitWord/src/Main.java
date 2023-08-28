import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String sentc = sc.nextLine();
         String[] wrd = sentc.split(" ");
        System.out.println("Limit");
         int limit = sc.nextInt();


        try {
            BufferedWriter bfr = new BufferedWriter(new FileWriter("test.txt"));
            if(wrd.length < limit){
                bfr.write(Arrays.toString(wrd).replace("[", "").replace("]", "").replace(",", ""));
                bfr.close();
            }else{
                String[] newWrd = new String[limit];
                for(int i=0; i<limit; i++){
                    newWrd[i] = wrd[i];
                }
                bfr.write(Arrays.toString(newWrd).replace("[", "").replace("]", "").replace(",", ""));
                bfr.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}