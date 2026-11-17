package penilaian_mahasiswa;

public class HitungNilai {
    double nilai;
    public double hitung(double tugas, double uts, double uas) {
        nilai = 0.3 * tugas + 0.3 * uts + 0.4 * uas;
        return nilai;
    }
}
