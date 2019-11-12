public class Jizdenka {
    private int hodnota; // hodnota jizdenky v Kč
    private int trvani; // doba trvání jízdenky

    public Jizdenka(int hodnota, int trvani) {
        this.hodnota = hodnota;
        this.trvani = trvani;
    }

    public int getHodnota() {
        return hodnota;
    }

    public void setHodnota(int hodnota) {
        this.hodnota = hodnota;
    }

    public int getTrvani() {
        return trvani;
    }

    public void setTrvani(int trvani) {
        this.trvani = trvani;
    }
}
