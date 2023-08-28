import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        ConstructorExample constructorExample = new ConstructorExample();
        System.out.println(constructorExample.a());


    }
}
