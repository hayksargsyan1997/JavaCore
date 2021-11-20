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
        System.arraycopy(books,0,books1,0,books.length);
        books = books1;
    }



    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(books[i] + " ");
        }
    }
    public void searchBooksByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword) ) {
                System.out.println(books[i]);
            }
        }
    }


}
