package penilaian_mahasiswa;

public class Main {
    public static void main(String[] args) {
        HitungNilai grader = new HitungNilai();
        CetakLaporan report = new CetakLaporan();
        SimpanDatabase data = new SimpanDatabase();

        double nilai = grader.hitung(80, 85, 90);
        report.cetakLaporan("Student A", nilai);
        data.simpan("Student A", nilai);
    }
}


