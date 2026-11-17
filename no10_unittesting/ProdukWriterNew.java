package no10_unittesting;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

class Produk<T, U, V> {
    private T nama;
    private U harga;
    private V stok;
    public Produk(T nama, U harga, V stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    public String toString() {
        return nama + "," + harga + "," + stok;
    }
}

public class ProdukWriterNew {
    public static void main(String[] args) {
        List<Produk<String, Double, Integer>> produkList = new ArrayList<>();
        produkList.add(new Produk<>("Laptop", 15000000.0, 5));
        produkList.add(new Produk<>("Mouse", 150000.0, 20));
        produkList.add(new Produk<>("Keyboard", 350000.0, 12));

        List<Produk<String, String, Boolean>> pelangganList = new ArrayList<>();
        pelangganList.add(new Produk<>("CUST-01", "Andi", true));
        pelangganList.add(new Produk<>("CUST-02", "Siti", false));

        Path filePath = Paths.get("produk_output.txt");
        try {
            List<String> lines = new ArrayList<>();
            for (Produk<String, Double, Integer> p : produkList) {
                lines.add(p.toString());
            }
            for (Produk<String, String, Boolean> c : pelangganList) {
                lines.add(c.toString());
            }

            Files.write(filePath, lines);
            System.out.println("Data berhasil disimpan menggunakan NIO.2\n");

            System.out.println("Isi file produk_output.txt:");
            List<String> readLines = Files.readAllLines(filePath);
            for (String line : readLines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Gagal memproses file: " + e.getMessage());
        }
    }
}
