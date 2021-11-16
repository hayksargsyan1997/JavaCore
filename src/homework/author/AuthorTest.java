package homework.author;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Քանի հեղինակ կա։ ");
        int num = scanner.nextInt();
        AuthorStorage as = new AuthorStorage();

        for (int i = 0; i < num; i++) {

            System.out.println("Անուն: ");
            String name = scanner.next();


            System.out.println("Ազգանուն: ");
            String surName = scanner.next();


            System.out.println("Էլ․հասցե: ");
            String email = scanner.next();


            System.out.println("Տարիք: ");
            int age = scanner.nextInt();


            System.out.println("Սեռ: ");
            String gender = scanner.next();

            Author au = new Author();
            au.setName(name);

            au.setSurName(surName);

            au.setEmail(email);

            au.setAge(age);

            au.setGender(gender);

            as.add(au);
        }
        as.print();
    }


}
