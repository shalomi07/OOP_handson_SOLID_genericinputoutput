package penilaian_mahasiswa;

public class CetakLaporan implements ReportPrinter {
    @Override
    public void cetakLaporan(String nama, double nilai){
        System.out.println("Laporan Nilai Mahasiswa: " + nama + " = " + nilai);

    }
}
