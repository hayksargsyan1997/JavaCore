package homework.file.contentSearch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ContentSearch {
    private static String FILE_PATH = "D:\\program\\Новая папка\\New Text Document.txt";
    static Scanner scanner = new Scanner(System.in);
    static File file = new File(FILE_PATH);

    public static void main(String[] args) {
        contentSearch();
    }

    private static void contentSearch() {
        try (BufferedReader inputStream = new BufferedReader(new FileReader(FILE_PATH))) {
            System.out.println("please input keyword");
            String keyword = scanner.nextLine();
            String line;
            while ((line = inputStream.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(file.getName());
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
