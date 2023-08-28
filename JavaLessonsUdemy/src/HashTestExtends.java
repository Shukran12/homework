public class HashTestExtends extends Collectio{
    private int a;
    private int b;

    public HashTestExtends(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }




        HashTestExtends c = (HashTestExtends) o;
        return Integer.compare(a, c.a)  == 0 && Integer.compare(b,c.b) == 0;
    }
}
