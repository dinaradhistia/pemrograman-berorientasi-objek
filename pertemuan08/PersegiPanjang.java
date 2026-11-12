package pertemuan08;

public class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;

    @Override
    protected float luas(){
        float luas = panjang * lebar;
        System.out.println("Luas persegi panjang = " + luas);
        return luas;
    }

    @Override
    protected float keliling(){
        float keliling = 2 * (panjang + lebar);
        System.out.println("Keliling persegi panjang = " + keliling);
        return keliling;
    }

    public void setPanjang(float panjang){
        this.panjang = panjang;
    }
    
    public void setLebar(float lebar){
        this.lebar = lebar;
    }

    public float getPanjang(){
        return panjang;
    }

    public float getLebar(){
        return lebar;
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