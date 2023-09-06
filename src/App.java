import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Uppgift a");
        Scanner inputA = new Scanner(System.in);
        System.out.print("Ange tal 1: ");
        int tal_ett = inputA.nextInt();

        System.out.print("Ange tal 2: ");
        int tal_två = inputA.nextInt();
        
        System.out.println(tal_ett+"*"+tal_två+"="+(tal_ett*tal_två));

        System.out.println("Uppgift b");
        Scanner inputB = new Scanner(System.in);
        System.out.print("Ange decimaltal 1: ");
        double deci_ett = inputB.nextDouble();

        System.out.print("Ange decimaltal 2: ");
        double deci_två = inputB.nextDouble();

        System.out.print(deci_ett+"/"+deci_två+"="+(deci_ett/deci_två));


    }
}
