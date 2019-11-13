import java.util.Scanner;

public class App {
    public static void main(String [] args) throws IllegalAccessException {
        Scanner SCANNER = new Scanner(System.in);
        Computer computer = new Computer();
        String scannedValue = null;
        String hodnotaMince;

        do {
            switch (computer.getStavJizdenkomatu()) {
                case START:
                    computer.displayTickets();
                    scannedValue = SCANNER.nextLine();
                    computer.handleScannedValue(scannedValue);
                    break;
                case TICKET_GET:
                    computer.displayPrice();




                default:
                    scannedValue = "end";
            }
        } while (!scannedValue.equals("end"));


        System.out.println("Ukončení jízdenko-matu");
    }
}

