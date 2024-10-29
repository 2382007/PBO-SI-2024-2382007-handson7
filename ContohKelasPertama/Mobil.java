package ContohKelasPertama;

public class Mobil {
    String warna;
    String merek;
    int kecepatanMaks;

    public Mobil(String warna, String merek, int kecepatanMaks) {
        this.warna = warna;
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void tampilkanInfo() {
        System.out.println("Warna : " + warna);
        System.out.println("Merek : " + merek);
        System.out.println("KecepatanMaks : " + kecepatanMaks);
    }

    public String getWarna() {
        return warna;
    }

    public String getMerek() {
        return merek;
    }

    public int getKecepatanMaks() {
        return kecepatanMaks;
    }
    public void setWarna(String warna) {
        this.warna;
    }
    public void setMerek(String merek) {
        this.merek;
    }
    public void setKecepatanMaks(String kecepatanMaks) {
        this.kecepatanMaks = kecepatanMaks;
    }
}
