package pertemuan04;

public class Sepeda {
    private String merk;
    private int jarakTempuh;
    
    //Constructor
    public Sepeda(String merk) {
        this.merk = merk;
        this.jarakTempuh = 0;
        System.out.println("Object " + this.merk + " dibuat, jarak tempuh awal 0 km");
    }

    public void maju() {
        this.jarakTempuh += 10;
        System.out.println("Bergerak Maju 10 Km");
        System.out.println("Object Sepeda " + this.merk + ", Jarak tempuh " + this.jarakTempuh + " Km");
    }

    public void mundur() {
        this.jarakTempuh -= 5;
        System.out.println("Bergerak Mundur 5 Km");
        System.out.println("Object Sepeda " + this.merk + ", Jarak tempuh " + this.jarakTempuh + " Km");
    }

    public void berhenti() {
        System.out.println("Sepeda Berhenti");
        System.out.println("Object Sepeda " + this.merk + ", Jarak tempuh akhir " + this.jarakTempuh + " Km");
    }
}