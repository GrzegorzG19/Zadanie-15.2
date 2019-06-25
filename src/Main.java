import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Vehicle> vehicleQueue = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Vehicle("sam", "Toyota", "V12", 1992, 299999, 1199391));
        vehicles.add(new Vehicle("sam", "BMV", "V43", 1932, 234423, 1123442341));
        vehicles.add(new Vehicle("sam", "Maluch", "dfgdg", 1943, 2992234, 112235235));
        int a = 0;
        int i = 0;
        do {
            System.out.println("Wpisz 1 2 lub 0 do zakonczenia");
            a = scan.nextInt();

            switch (a) {
                case 1:
                    System.out.println("Wczytuje informacje o nowym pojezdzie...");
                    vehicleQueue.offer(vehicles.get(i));
                    i++;
                    break;
                case 2:
                    if (!vehicleQueue.isEmpty()) {
                        System.out.println("Pojazd " + vehicleQueue.element().getMark() + " zostaje poddany przeglądowi ");
                        System.out.println(vehicleQueue.poll());
                    }
                    break;
                case 0:
                    i = 3;
                    break;
            }
        } while (a != 0);


    }
}
