package lv.rvt;
import java.io.BufferedReader;
// import java.io.IOException;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Helper{
    public static BufferedReader getReader(String fileName) throws Exception{
        return Files.newBufferedReader(getFilePath(fileName));
    }

    public static BufferedWriter getWriter(String fileName, StandardOpenOption option) throws Exception{
        return Files.newBufferedWriter(getFilePath(fileName), option);
    }

    public static Path getFilePath(String fileName) throws Exception{
        Path filePath = Paths.get("src/data/person.csv");
        return filePath;
    }   
    }