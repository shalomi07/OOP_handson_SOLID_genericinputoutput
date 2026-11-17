package Smart_Vehicle;

public class Main {
    public static void main(String[] args){
        MobilListrik electriccar = new MobilListrik();
        electriccar.startEngine();
        electriccar.isiBaterai();

        Sepeda bicycle = new Sepeda();
        bicycle.kayuh(); // di soal startEngine tapi karena sepeda tidak punya fungsi startEngine karena sepeda tidak punya mesin, saya panggil fungsi kayuh yang ada di class sepeda

        // penerapan mobil bensin
        MobilBensin car = new MobilBensin();
        car.isiBahanBakar();
        car.startEngine();
    }
}
