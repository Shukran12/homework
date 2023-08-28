import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class hashTest {
    private int a;
    private int b;

    public hashTest(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }

        if(!(o instanceof hashTest)){
            return false;
        }

        hashTest c  =  (hashTest) o;
        return Integer.compare(a, c.a) == 0
                && Integer.compare(b, c.b) == 0;


    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(a);
        result = 31*result + Integer.hashCode(b);
        return result;
    }





   
}
