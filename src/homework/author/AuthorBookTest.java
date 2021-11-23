package homework.author;

import java.util.Scanner;

public class AuthorBookTest {
    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String ADD_BOOK = "2";
    private static final String SEARCH_AUTHORS = "3";
    private static final String SEARCH_AUTHORS_BY_AGE = "4";
    private static final String SEARCH_BOOKS_BY_TITLE = "5";
    private static final String SEARCH_BOOKS_BY_AUTHOR = "6";
    private static final String COUNT_BOOKS_BY_AUTHOR = "7";
    private static final String CHANGE_AUTHOR = "8";
    private static final String CHANGE_BOOK_AUTHOR = "9";
    private static final String PRINT_AUTHORS = "10";
    private static final String PRINT_BOOKS = "11";

    public static void main(String[] args) {

        authorStorage.add(new Author("poxos", "poxosyan", "poxos@mail.com", 22, "male"));
        authorStorage.add(new Author("petros", "petrosyan", "petros@mail.com", 25, "male"));
        authorStorage.add(new Author("martiros", "martirosyan", "martiros@mail.com", 19, "male"));

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case SEARCH_AUTHORS:
                    searchByName();
                    break;
                case SEARCH_AUTHORS_BY_AGE:
                    searchByAge();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchBooksByTitle();
                    break;
                case SEARCH_BOOKS_BY_AUTHOR:
                    searchBooksByAuthor();
                    break;
                case COUNT_BOOKS_BY_AUTHOR:
                    countBooksByAuthor();
                    break;
                case CHANGE_AUTHOR:
                    changeAuthor();
                    break;
                case CHANGE_BOOK_AUTHOR:
                    changeBookAuthor();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                default:
                    System.out.println("Invalid command!");
            }

        }
    }

    private static void changeBookAuthor() {
        System.out.println("Please input book title");
        String title = scanner.nextLine();
        Book book = bookStorage.searchByTitle(title);

        if (book != null) {
            System.out.println("please input new author email");
            String email = scanner.nextLine();
            Author author = authorStorage.getByEmail(email);
            book.setAuthor(author);
            System.out.println("Thank you book's author is changed");

        } else {
            System.out.println("Invalid title");
            changeBookAuthor();
        }
    }


    private static void changeAuthor() {
        System.out.println("please choose author's email");
        System.out.println("--------");
        authorStorage.print();
        System.out.println("--------");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("please input author's name");
            String name = scanner.nextLine();
            System.out.println("please input author's surname");
            String surname = scanner.nextLine();
            System.out.println("please input author's gender");
            String gender = scanner.nextLine();
            System.out.println("please input author's age");
            int age = Integer.parseInt(scanner.nextLine());
            author.setName(name);
            author.setSurName(surname);
            author.setAge(age);
            author.setGender(gender);
            System.out.println("Thank you, the author was changed");
        }
    }

    private static void countBooksByAuthor() {
        System.out.println("please input author's email");
        String email = scanner.nextLine();
        bookStorage.countBooksByAuthor(email);
    }

    private static void searchBooksByAuthor() {
        System.out.println("please input author's email");
        String email = scanner.nextLine();
        bookStorage.searchBooksByAuthor(email);
    }

    private static void searchBooksByTitle() {
        System.out.println("please input keyword");
        String title = scanner.nextLine();
        bookStorage.searchByTitle(title);
    }

    private static void addBook() {

        System.out.println("please choose author's email");
        System.out.println("--------");
        authorStorage.print();
        System.out.println("--------");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("please input book's title");
            String title = scanner.nextLine();
            System.out.println("please input book's description");
            String desc = scanner.nextLine();
            System.out.println("please input book's price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("please input book's count");
            int count = Integer.parseInt(scanner.nextLine());
            Book book = new Book(title, desc, price, count, author);

            bookStorage.add(book);

            System.out.println("Thank you, Book was added");
        } else {
            System.out.println("invalid email! please try again");
            addBook();
        }

    }

    private static void searchByAge() {
        System.out.println("please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchByAge(minAge, maxAge);
    }

    private static void printCommands() {
        System.out.println("\u001B[34m" + "please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_AUTHOR + " for add author");
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + SEARCH_AUTHORS + " for search author by name");
        System.out.println("please input " + SEARCH_AUTHORS_BY_AGE + " for search author by age");
        System.out.println("please input " + SEARCH_BOOKS_BY_TITLE + " for search book by title");
        System.out.println("please input " + SEARCH_BOOKS_BY_AUTHOR + " for search book by author");
        System.out.println("please input " + COUNT_BOOKS_BY_AUTHOR + " for count book by author");
        System.out.println("please input " + CHANGE_AUTHOR + " to change author");
        System.out.println("please input " + CHANGE_BOOK_AUTHOR + " to change book");
        System.out.println("please input " + PRINT_AUTHORS + " for print authors");
        System.out.println("please input " + PRINT_BOOKS + " for print books" + "\u001B[0m");
    }

    private static void searchByName() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchByName(keyword);
    }

    private static void addAuthor() {
        System.out.println("please input author's name");
        String name = scanner.nextLine();
        System.out.println("please input author's surname");
        String surname = scanner.nextLine();
        System.out.println("please input author's email");
        String email = scanner.nextLine();
        System.out.println("please input author's gender");
        String gender = scanner.nextLine();
        System.out.println("please input author's age");
        int age = Integer.parseInt(scanner.nextLine());

        Author author = new Author(name, surname, email, age, gender);
        if (authorStorage.getByEmail(author.getEmail()) != null) {
            System.err.println("Invalid email. Author with this email already exists");
        } else {
            authorStorage.add(author);
            System.out.println("Thank you, author was added");
        }

    }
}
