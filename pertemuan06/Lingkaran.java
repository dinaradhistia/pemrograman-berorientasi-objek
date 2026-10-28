package pertemuan06;

public class Lingkaran extends BangunDatar {
    final float pi = 3.14f;
   float r;
   
   public void luas(){
       System.out.println("Object lingkaran dibuat");
       System.out.println("Luas lingkaran = " + (pi * (r * r)));
   }
    
   public void keliling(){
       System.out.println("Keliling lingkaran = " + (2 * pi * r) + "\n");
   }
}