package pertemuan06;

public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;
    
    public void luas(){
        System.out.println("Object segitiga dibuat");
        System.out.println("Luas segitiga = " + (0.5f * alas * tinggi));
    }
    
    public void keliling(){
        float sisiMiring = (float) Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        float keliling = alas + tinggi + sisiMiring;
        
        System.out.println("Keliling segitiga = " + keliling);
    }
}