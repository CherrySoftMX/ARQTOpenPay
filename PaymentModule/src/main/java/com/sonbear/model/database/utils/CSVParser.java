package com.sonbear.model.database.utils;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author HikingCarrot7
 */
public class CSVParser {

    public static final String DELIMITER = ",";

    private FileContentManager fileReader;

    public CSVParser(String path) throws IOException {
        this(new FileContentManager(path));
    }

    public CSVParser(FileContentManager fileReader) {
        this.fileReader = fileReader;
    }

    public Stream<String[]> parseContent() throws IOException {
        return parseContent(fileReader.readContent());
    }

    public Stream<String[]> parseContent(String contentToParse) {
        if (contentToParse.isEmpty())
            return Stream.<String[]>of();

        return Arrays.asList(contentToParse.split("\n"))
                .stream()
                .map(deviceRegistry -> deviceRegistry.split(DELIMITER));
    }

}
