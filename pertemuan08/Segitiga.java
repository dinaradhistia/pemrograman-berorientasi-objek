package pertemuan08;

public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;

    @Override
    protected float luas(){
        float luas = 0.5f * alas * tinggi;
        System.out.println("Luas segitiga = " + luas);
        return luas;
    }

    @Override
    protected float keliling(){
        float sisiMiring = (float) Math.sqrt((alas * alas) + (tinggi * tinggi));
        float keliling = alas + tinggi + sisiMiring;
        System.out.println("Keliling segitiga = " + keliling);
        return keliling;
    }

    public void setAlas(float alas){
        this.alas = alas;
    }
    
    public void setTinggi(float tinggi){
        this.tinggi = tinggi;
    }

    public float getAlas(){
        return alas;
    }

    public float getTinggi(){
        return tinggi;
    }
    
    @Override
    public float getLuas(){
        return luas();
    }
    
    @Override
    public float getKeliling(){
        return keliling();
    }
}