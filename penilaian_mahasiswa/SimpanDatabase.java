package penilaian_mahasiswa;

public class SimpanDatabase implements StudentRepository {
    @Override
    public void simpan(String nama, double nilai){
        System.out.println("Menyimpan ke database: " + nama + " = " + nilai);

    }
}
