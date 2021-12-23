package homework.file.fileSearch;

import java.io.File;
import java.util.Scanner;

public class fileSearch {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please input path");
        String pathStr = scanner.nextLine();

        File file = new File(pathStr);
        if (!file.exists() || file.isFile()) {
            System.err.println("Path does not exists or is not directory");
        } else {
            System.out.println("please input file name");
            String fileName = scanner.nextLine();
            boolean isFound = false;
            for (String s : file.list()) {
                if (s.contains(fileName)) {
                    isFound = true;
                }
            }
            System.out.println(isFound);
        }


    }
}