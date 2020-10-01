package com.hikingcarrot7.model.database.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author HikingCarrot7
 */
public class FileContentManager {

    public static final String BASE_PATH = "data\\";

    public File file;

    public FileContentManager(String path) throws IOException {
        this.file = new File(path);

        if (!file.exists())
            file.createNewFile();
    }

    public String readContent() throws IOException {
        String content = "";
        String line;

        try (BufferedReader buffer = new BufferedReader(new FileReader(file))) {
            while ((line = buffer.readLine()) != null)
                content += String.format("%s\n", line);
        }

        return content;
    }

    public void saveContent(List<String[]> contentToSave) {
        saveContent(contentToSave.stream());
    }

    public void saveContent(Stream<String[]> contentToSave) {
        String parsedContent = contentToSave
                .map(line -> Arrays.asList(line).stream().collect(Collectors.joining(CSVParser.DELIMITER)))
                .collect(Collectors.joining("\n"));

        saveContent(parsedContent);
    }

    public void saveContent(String content) {
        try (Formatter formatter = new Formatter(file)) {
            formatter.format("%s", content);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
