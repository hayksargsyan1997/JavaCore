package homework.chapter12.language;

import java.util.Scanner;

public class LangTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Lang[] values = Lang.values();
        System.out.println("please choose language");
        for (Lang value : values) {
            System.out.print(value + " ");
        }
        String lang = scanner.nextLine();
        try {
            Lang userLang = Lang.valueOf(lang.toUpperCase());
            System.out.println(userLang);
            System.out.println(userLang.getCountryName());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
