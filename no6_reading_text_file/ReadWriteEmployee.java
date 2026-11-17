package no6_reading_text_file;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteEmployee {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("employees.txt");
        Path destPath = Paths.get("copy_employees.txt");
        List<String> employeeList = new ArrayList<>();

        // Deteksi apakah file sumber ada
        if (Files.notExists(sourcePath)) {
            System.out.println("Error: File " + sourcePath + " tidak ditemukan!");
            return;
        }

        // Membaca file dan menyimpan hasilnya ke ArrayList<String>
        try (BufferedReader br = Files.newBufferedReader(sourcePath, StandardCharsets.UTF_8)) {
            br.lines().forEach(line -> {
                employeeList.add(line);
                System.out.println(line); // Menampilkan ke konsol
            });
        } catch (NoSuchFileException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
            return;
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
            return;
        }

        // Menuliskan isi ArrayList ke file baru copy_employees.txt
        try {
            Files.write(destPath, employeeList, StandardCharsets.UTF_8);
            System.out.println("\nBerhasil menyalin data ke " + destPath);
        } catch (IOException e) {
            System.out.println("Gagal menulis ke file baru: " + e.getMessage());
        }
    }
}


