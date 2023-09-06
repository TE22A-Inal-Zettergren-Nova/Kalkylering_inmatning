import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Uppgift a");
        Scanner input = new Scanner(System.in);
        System.out.print("Ange tal 1: ");
        int tal_ett = input.nextInt();
        System.out.print("Ange tal 2: ");
        int tal_två = input.nextInt();
        System.out.println(tal_ett+"*"+tal_två+"="+(tal_ett*tal_två));

        System.out.println("Uppgift b");
        System.out.print("Ange ett decimaltal: ");
        double deci_ett = input.nextDouble();
        System.out.print("Ange ett till decimaltal: ");
        double deci_två = input.nextDouble();

        System.out.println(deci_ett+"/"+deci_två+"="+(deci_ett/deci_två));

        System.out.println("Uppgift c");
        System.out.print("Ange tal 1: ");
        int modulo_ett = input.nextInt();
        System.out.print("Ange tal 2: ");
        int modulo_två = input.nextInt();

        System.out.println(modulo_ett+"%"+modulo_två+"="+(modulo_ett%modulo_två));

        System.out.println("Uppgift d");
        System.out.print("Ange ett decimaltal: ");
        double potens_ett = input.nextDouble();
        System.out.print("Ange ett till decimaltal: ");
        double potens_två = input.nextDouble();

        System.out.println(potens_ett+"^"+potens_två+"="+(Math.pow(potens_ett, potens_två)));
        
    }
}
