package Smart_Vehicle;

public class MobilBensin implements Fuel, Engine{
    @Override
    public void startEngine(){
        System.out.println("Menyalakan mesin...");
    }

    @Override
    public void isiBahanBakar(){
        System.out.println("Mengisi bensin...");
    }
}
