import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        /*System.out.println("Hello World");
        int var1 = 1, var2 = 4;
        System.out.println(var1 + " " + var2);
        boolean tr = true;
        float v1 = 9f;
        double v2 = 2d;
        char var = '\u00A8';
        System.out.println(var);

        // big data

        double value1 = 1.05;
        double val = 12.55;

        BigDecimal bigDecimal = new BigDecimal("1.05");
        BigDecimal bigDecimal1 = new BigDecimal("12.55");
        System.out.println(bigDecimal1.add(bigDecimal));
        // (a+b)square = ((a*a) + 2*a*b + (b*b))

        System.out.println((cebr(2, 5.5f)));

        Collectio collectio = new Collectio();

*/

        System.out.println(cebr(12, 1.3F));

        Set<Employee> set=new TreeSet<>();
        set.add(new Employee());



    }

    public static double  cebr(int a, float b){
        int be = (int) b;
        double value = ((a*a) + (2 * a*b) + (b*b));
         return value;
    }


    public static void a(){

    }



}