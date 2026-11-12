package pertemuan08;

public class Persegi extends BangunDatar {
    private float sisi;
    
    @Override
    protected float luas(){
        float luas = sisi * sisi;
        System.out.println("Luas persegi = " + luas);
        return luas;
    }
    
    @Override
    protected float keliling(){
        float keliling = 4 * sisi;
        System.out.println("Keliling persegi = " + keliling);
        return keliling;
    }
    
    public void setSisi(float sisi){
        this.sisi = sisi;
    }
    
    public float getSisi(){
        return sisi;
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