import java.util.Scanner;

public class App {
    public static void main(String [] args) throws IllegalAccessException {
        Scanner SCANNER = new Scanner(System.in);
        Computer computer = new Computer();
        String scannedValue = null;

        do {
            switch (computer.getStavJizdenkomatu()) {
                case START:
                    computer.displayTickets();
                    scannedValue = SCANNER.nextLine();
                    computer.handleScannedValue(scannedValue);
                    break;
                case TICKET_GET:
                    Jizdenka selectedJizdenka = computer.getSelectedJizdenka(scannedValue);
                    System.out.println("Máš vybranou jízdenku: " + selectedJizdenka);
                    System.out.println("Požadovaná cena za jízdenku: " + selectedJizdenka.getHodnota());
                    System.out.println("Vložce požadované mince:");
                    computer.displayPrice();
                    // TODO: ...

                default:
                    scannedValue = "end";
            }
        } while (!scannedValue.equals("end"));


        System.out.println("Ukončení jízdenko-matu");
    }
}

