package no7_write_copy_files;

import java.io.IOException;
import java.nio.file.*;

public class FileCopyNew {
    public static void main(String[] args) {
        Path source = Paths.get("report.txt");
        Path backup = Paths.get("backup/report.txt");
        Path logFile = Paths.get("log.txt");

        try {
            Files.write(source,
                    java.util.List.of("Report Generated", "Status: OK"));

            if (Files.exists(source)) {
                if (Files.notExists(backup.getParent()))
                    Files.createDirectories(backup.getParent());

                Files.copy(source, backup, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Backup created successfully!");

                Files.write(logFile,
                        java.util.List.of("SUKSES: Backup berhasil disalin ke " + backup),
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } else {
                System.out.println("File sumber tidak ditemukan!");

                Files.write(logFile,
                        java.util.List.of("GAGAL: File sumber " + source + " tidak ditemukan."),
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}