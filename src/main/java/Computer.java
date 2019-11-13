import java.util.HashMap;
import java.util.Map;

public class Computer {
    private Display display;
    private Map<Integer, Jizdenka> ticketsMap = new HashMap<>();
    private Map<Integer, Mince> MinceMap = new HashMap<>();
    private  JizdenkoMatState stavJizdenkomatu = JizdenkoMatState.START;
    private Jizdenka selectedJizdenka = null;
    private Mince mince;
    private Jizdenka jizdenka;


    public Computer() {
        this.display = new Display();
        this.initTickets();
        this.mince();
    }

    private void initTickets() {
        ticketsMap.put(1, new Jizdenka(16, 20));
        ticketsMap.put(2, new Jizdenka(32, 60));
        ticketsMap.put(3, new Jizdenka(40, 90));
        ticketsMap.put(4, new Jizdenka(70, 360));
        ticketsMap.put(5, new Jizdenka(100, 720));
        ticketsMap.put(6, new Jizdenka(200, 1440));
    }
    private void mince(){
        MinceMap.put(1, new Mince(1));
        MinceMap.put(2, new Mince(2));
        MinceMap.put(3, new Mince(5));
        MinceMap.put(4, new Mince(10));
        MinceMap.put(5, new Mince(20));
        MinceMap.put(6, new Mince(50));

    }

    public void displayTickets() {
        display.displayTickets(this.ticketsMap);
    }
    public void displayPrice(){display.displayPrice(this.MinceMap);}
    public void displayPridavaniMinci(){display.displayPridavaniMinci(mince);}

    public Map<Integer, Jizdenka> getTicketsMap() {
        return ticketsMap;
    }

    public Jizdenka handleScannedValue(String scannedValue)  {
        int key = Integer.parseInt(scannedValue);
        try{
        if (this.ticketsMap.containsKey(key)) {
            selectedJizdenka = ticketsMap.get(key);
            this.display.displayTicket(key, selectedJizdenka);
            stavJizdenkomatu = JizdenkoMatState.TICKET_GET;

        }else{
            System.out.println("Takový lístek neexistuje");
        }
        }catch (RuntimeException e) {
            e.getMessage();

        }
        return selectedJizdenka;
}

/*
    public int odecitaniMinci(String hodnotaMince)throws IllegalAccessException {
        int key2 = Integer.parseInt(hodnotaMince);
        int cena = jizdenka.getHodnota() ;
        if(cena > key2){
            jizdenka.setHodnota(mince.getHodnotaMince() - key2);
        } else if(cena < key2){
            System.out.println("Nic");
        } else if(cena == 0){
            System.out.println("Lístek je zaplacen");
        }
        return cena;


    }
*/

    public  JizdenkoMatState getStavJizdenkomatu()
    {return stavJizdenkomatu; }

    public void  setStavJizdenkomatu(JizdenkoMatState stavJizdenkomatu) {
        this.stavJizdenkomatu = stavJizdenkomatu; }


    public Jizdenka getSelectedJizdenka() {

       return selectedJizdenka;
    }
}
