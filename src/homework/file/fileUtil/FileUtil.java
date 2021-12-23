package homework.file.fileUtil;

import java.io.*;


public class FileUtil {
    public void findLines(String txtPath, String keyword) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(txtPath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printSizeOfPackage(String path) {
        File file = new File(path);
        File[] files = file.listFiles();
        double size = 0;
        if (files != null) {
            for (File listFile : files) {
                size = size + (listFile.length() / (double) (1024 * 1024));
            }
        }
        System.out.println(size);

    }

    public void createFileWithContent(String pathStr, String filename, String content) {
        File file = new File(pathStr);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename))) {
            bufferedWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
