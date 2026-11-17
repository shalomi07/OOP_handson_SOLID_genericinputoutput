package Smart_Vehicle;

public class MobilListrik implements Battery, Engine {
    @Override
    public void startEngine(){
        System.out.println("Menyalakan mesin...");
    }
    @Override
    public void isiBaterai(){
        System.out.println("Mengisi baterai kendaraan listrik...");
    }
}
