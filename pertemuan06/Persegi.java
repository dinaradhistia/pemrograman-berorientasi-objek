package pertemuan06;

public class Persegi extends BangunDatar {
    float sisi;
    
    public void luas(){
        System.out.println("Object Persegi dibuat");
        System.out.println("Luas persegi = " + (sisi * sisi));
    }
    
    public void keliling(){
        System.out.println("Keliling persegi = " + (4 * sisi) + "\n");
    }
}