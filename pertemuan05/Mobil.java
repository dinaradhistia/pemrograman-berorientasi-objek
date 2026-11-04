package pertemuan05;

public class Mobil {
    String merek;
    String model;
    int tahun;

    public Mobil(String merek, String model){
        this.merek = merek;
        this.model = model;
        this.tahun = 2025; 
    }

    public Mobil(String merek, String model, int tahun){
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
    }

    public void cetakData(){
        System.out.println("Merek : " + merek);
        System.out.println("Model : " + model);
        System.out.println("Tahun : " + tahun + "\n");
    }
}