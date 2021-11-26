package homework.author;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;

    }

    private void extend() {
        Book[] books1 = new Book[size + 10];
        System.arraycopy(books, 0, books1, 0, books.length);
        books = books1;
    }


    public void print() {
        for (int i = 0; i < size; i++) {

            System.out.println(books[i]);
        }
    }

    public Book searchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(title)) {
                return books[i];
            }
        }
        return null;
    }


    public void searchBooksByAuthor(String email) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(email)) {
                System.out.println(books[i]);
            }
        }
    }


    public void countBooksByAuthor(String email) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(email)) {
                count++;
            }
        }
        System.out.println(count);
    }


    public void deleteAuthorBooks(String email) {
        int length = size;
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (books[i].getAuthor().getEmail().equals(email)) {
                books[i] = null;
                size--;
            } else {
                books[j] = books[i];
                books[i] = null;
                j++;
            }
        }
    }

    public void deleteBook(String title) {
        int length = size;
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (books[i].getTitle().equals(title)) {
                books[i] = null;
                size--;
            } else {
                books[j] = books[i];
                books[i] = null;
                j++;
            }
        }
    }
}








