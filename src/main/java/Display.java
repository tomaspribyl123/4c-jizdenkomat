import java.util.Map;

public class Display {
    public void displayTickets(Map<Integer, Jizdenka> tickets) {
        if (!tickets.isEmpty()) {
            for (Map.Entry<Integer, Jizdenka> entry : tickets.entrySet()) {
                Jizdenka jizdenka = entry.getValue();

                System.out.println(String.format("%s: Jizdenka na %s min za %s Kč",
                        entry.getKey(), jizdenka.getTrvani(), jizdenka.getHodnota()));
            }
        } else {
            System.out.println("Nejsou jizdenky");
        }
    }

    public void displayTicket(int position, Jizdenka jizdenka) {
        System.out.println(String.format("Byla vybrána jízdenka na pozici %s délka %s min za %s Kč",
                position, jizdenka.getTrvani(), jizdenka.getHodnota()));
    }


    public void displayPrice(Map<Integer,Mince> minceMap) {
        if (!minceMap.isEmpty()) {
            for (Map.Entry<Integer, Mince> entry : minceMap.entrySet()) {
                Mince mince = entry.getValue();

                System.out.println(String.format("%s: Mince v hodnotě %s kč ",
                        entry.getKey(), mince.getHodnotaMince()));
            }
        }
    }
}
