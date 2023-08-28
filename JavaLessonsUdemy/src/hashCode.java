import java.util.HashMap;
import java.util.Map;

public class hashCode {
    public static void main(String[] args) {
        //hashTest hash = new hashTest(1, 1);
   //     hashTest hash2 = new hashTest(1, 1);
     //   HashTestExtends yoxla = new HashTestExtends(1,1);

       // System.out.println(hash.equals(hash2));

       // System.out.println(yoxla.equals(hash2));

        //reflexive- odemekdir ki obyekt ozu ozune beraberdir
        // symetric- odemekdir ki hash == hash2 onda hash2==hash
        // transmisive- a=b ve b=c dir se onda a=c olur

        Map<hashTest, String> m = new HashMap<>();

        m.put(new hashTest(1,2), "Test");

        System.out.println(m.get(new hashTest(1,2)));
    }





}
