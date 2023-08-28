public class ConstructorExample {
    public ConstructorExample(){
        System.out.println("Salam");
    }

    public ConstructorExample a(){
        return new ConstructorExample();
    }


}
