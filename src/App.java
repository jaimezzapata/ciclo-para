import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        for (int index = 0; index < 100; index++) {
            System.out.println("Repetición del ciclo en la vuelta " + index);
        }
        sc.close();
    }
}