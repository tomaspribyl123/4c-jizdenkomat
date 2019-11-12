import java.util.HashMap;
import java.util.Map;

public class Computer {
    private Display display;
    private Map<Integer, Jizdenka> ticketsMap = new HashMap<>();
    private  JizdenkoMatState stavJizdenkomatu = JizdenkoMatState.START;
    private Jizdenka selectedJizdenka = null;


    public Computer() {
        this.display = new Display();
        this.initTickets();
    }


    private void initTickets() {
        ticketsMap.put(1, new Jizdenka(16, 20));
        ticketsMap.put(2, new Jizdenka(32, 60));
        ticketsMap.put(3, new Jizdenka(40, 90));
        ticketsMap.put(4, new Jizdenka(70, 360));
        ticketsMap.put(5, new Jizdenka(100, 720));
        ticketsMap.put(6, new Jizdenka(200, 1440));
    }

    public void displayTickets() {
        display.displayTickets(this.ticketsMap);
    }

    public Map<Integer, Jizdenka> getTicketsMap() {
        return ticketsMap;
    }

    public Jizdenka handleScannedValue(String scannedValue) throws IllegalAccessException {
        int key = Integer.parseInt(scannedValue);

        if (this.ticketsMap.containsKey(key)) {
            Jizdenka jzd = ticketsMap.get(key);
            this.display.displayTicket(key, jzd);
            stavJizdenkomatu = JizdenkoMatState.TICKET_GET;
            return jzd;
        }else{
            stavJizdenkomatu = JizdenkoMatState.TICKET_ERROR;
            throw new IllegalAccessException("Nejedná se o platnou jízdenku!");
        }

    }

    public  JizdenkoMatState getStavJizdenkomatu()
    {return stavJizdenkomatu; }

    public void  setStavJizdenkomatu(JizdenkoMatState stavJizdenkomatu) {
        this.stavJizdenkomatu = stavJizdenkomatu; }


    public Jizdenka getSelectedJizdenka() {
        return selectedJizdenka;
    }
}
