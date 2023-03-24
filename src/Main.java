import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    private static Trade trade;

    public static void main(String[] args) {

        trade = new Trade();

        trade.availableCars.add(new Car("Ford", 100000, "czerwony", "kompaktowy", 20000, true, true, true, true, true, true, 200));
        trade.availableCars.add(new Car("Toyota", 50000, "niebieski", "miejski", 30000, true, true, true, true, true, true, 150));
        trade.availableCars.add(new Car("Audi", 40000, "czarny", "kombi", 51200, true, true, true, true, true, true,  600));
        trade.availableCars.add(new Car("Honda", 140000, "srebrny", "sedan", 33000, true, true, true, true, true, true,  300));
        trade.availableCars.add(new Car("BMW", 4000, "zielony", "SUV", 500000, true, true, true, true, true, true,  350));
        trade.availableCars.add(new Car("Nissan", 41000, "biały", "SUV", 55000, true, true, true, true, true, true,  350));

        while (true) {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Przeglądanie bazy samochodów do kupienia");
            System.out.println("2. Kupowanie samochodu");
            System.out.println("3. Przeglądanie bazy posiadanych samochodów");
            System.out.println("4. Naprawa samochódów");
            System.out.println("5. Przeglądanie listy potencjalnych klientów");
            System.out.println("6. Sprzedaj samochód za określoną cenę potencjalnemu klientowi");
            System.out.println("7. Kup reklamę");
            System.out.println("8. Sprawdzanie stanu konta");
            System.out.println("9. Sprawdzanie historii transakcji");
            System.out.println("10. Sprawdzanie historii napraw każdego pojazdu");
            System.out.println("11. Sprawdzanie sumy kosztów napraw i mycia dla każdego z posiadanych pojazdów");
            System.out.println("12. Zakończ grę");

            scanner = new Scanner(System.in);
            Integer option = scanner.nextInt();

            switch (option) {
                case 1: trade.showAvailableCars();
                    break;
                case 2:
                    System.out.println("Podaj indeks samochodu do kupienia: ");
                    Integer carIndex = scanner.nextInt();
                    trade.buyCar(carIndex);
                    break;
                case 3: trade.showOwnedCars();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                default:
                    System.out.println("Niepoprawny wybór. Spróbuj ponownie.");
                    break;
            }
        }
    }
}