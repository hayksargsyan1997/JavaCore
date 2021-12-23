package homework.file.contentSearch;

import java.io.*;
import java.util.Scanner;

public class RecursionContentSearch {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("please input path");
        String pathStr = scanner.nextLine();
        File path = new File(pathStr);
        if (!path.exists() || path.isFile()) {
            System.err.println("Path does not exists or is not directory");
        } else {
            System.out.println("please input keyword");
            String keyword = scanner.nextLine();
            findFile(path, keyword);
        }
    }

    private static void findFile(File parent, String keyword) {
        for (File file : parent.listFiles()) {
            if (file.isDirectory()){
                findFile(file,keyword);
            }else

            if (file.getName().endsWith(".txt")){
               searchContent(file,keyword);

            }
        }

    }

    private static void searchContent(File file, String keyword) {
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(file))) {
         String line="";
         while ((line=bufferedReader.readLine())!=null){
             if (line.contains(keyword)){
                 System.out.println(file.getAbsoluteFile());
                 break;
             }
         }
        }
         catch (IOException e) {
            e.printStackTrace();
        }
    }
}
