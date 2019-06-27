import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Vehicle> vehicleQueue = new LinkedList<>();
        Scanner scan = new Scanner(System.in);

        int a;
        do {
            System.out.println("Wpisz 1 2 lub 0 do zakonczenia");
            a = scan.nextInt();
            scan.nextLine();
            switch (a) {
                case 1:
                    System.out.println("Wczytuje informacje o nowym pojezdzie... \n wpisz rodzaj, marke, model, rok, przebieg,vin");
                    vehicleQueue.offer(new Vehicle(scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextInt(),scan.nextDouble(),scan.nextInt()));
                    break;
                case 2:
                    if (!vehicleQueue.isEmpty()) {
                        System.out.println("Pojazd " + vehicleQueue.element().getMark() + " zostaje poddany przeglądowi ");
                        System.out.println(vehicleQueue.poll());
                    }
                    break;
                case 0:
                    System.out.println("Zamykam program");
                    break;
            }
        } while (a != 0);


    }
}
