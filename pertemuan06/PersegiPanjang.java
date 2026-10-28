package pertemuan06;

public class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;
    
    public void luas(){
        System.out.println("Object persegi panjang dibuat");
        System.out.println("Luas persegi panjang = " + (panjang * lebar));
    }
    
    public void keliling(){
        System.out.println("Keliling persegi panjang = " + (2 * (panjang + lebar)) + "\n");
    }
}