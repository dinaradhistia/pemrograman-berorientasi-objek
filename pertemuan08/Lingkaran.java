package pertemuan08;

public class Lingkaran extends BangunDatar {
    private float jari;

    @Override
    protected float luas(){
        float luas = 3.14f * jari * jari;
        System.out.println("Luas lingkaran = " + luas);
        return luas;
    }

    @Override
    protected float keliling(){
        float keliling = 2 * 3.14f * jari;
        System.out.println("Keliling lingkaran = " + keliling);
        return keliling;
    }

    public void setJari(float jari){
        this.jari = jari;
    }

    public float getJari(){
        return jari;
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