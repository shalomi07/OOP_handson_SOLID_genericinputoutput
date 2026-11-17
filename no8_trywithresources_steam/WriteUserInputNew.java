package no8_trywithresources_steam;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WriteUserInputNew {
        public static void main(String[] args) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            try (Scanner sc = new Scanner(System.in);
                 BufferedWriter bw = Files.newBufferedWriter(Paths.get("user_input.txt"))) {

                System.out.println("Masukkan teks (ketik 'exit' untuk berhenti):");

                while (true) {
                    System.out.print("> ");
                    String text = sc.nextLine();

                    if (text.equalsIgnoreCase("exit")) {
                        break;
                    }

                    String timestamp = LocalDateTime.now().format(formatter);
                    bw.write("[" + timestamp + "] " + text);
                    bw.newLine();
                }

                System.out.println("Saved!");
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

