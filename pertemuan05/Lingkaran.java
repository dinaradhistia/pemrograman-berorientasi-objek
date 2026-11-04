package pertemuan05;

public class Lingkaran {
    double jariJari;

    public Lingkaran(double jariJari){
        if (jariJari <= 0){
            System.out.println("Jari-jari (" + jariJari + ") <= 0, diset ke default 1.0");
            this.jariJari = 1.0;
        } else{
            this.jariJari = jariJari;
        }
    }
    
    public double hitungLuas(){
        return Math.PI * jariJari * jariJari;
    }

    public void cetakInfo(){
        System.out.println("Jari-Jari : " + jariJari);
        System.out.printf("Luas      : " + hitungLuas() +"\n");
    }
}