package homework.file.fileUtil;

import java.util.Scanner;

public class FileUtilTest {
     static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        FileUtil fu = new FileUtil();
        System.out.println("please input path");
        String txtPath = scanner.nextLine();
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();

        fu.findLines(txtPath, keyword);


        System.out.println("Please input folders path");
        String path = scanner.nextLine();

        fu.printSizeOfPackage(path);

        System.out.println("please input path");
        String pathStr = scanner.nextLine();
        System.out.println("please input file name");
        String filename = scanner.nextLine();
        System.out.println("please input content");
        String content = scanner.nextLine();

        fu.createFileWithContent(pathStr, filename, content);


    }


}
