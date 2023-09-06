import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Ange tal 1: ");
        int tal_ett = input.nextInt();

        System.out.print("Ange tal 2: ");
        int tal_två = input.nextInt();
        
        System.out.println(tal_ett+"*"+tal_två+"="+(tal_ett*tal_två));

    }
}
