package homework.author;

public class AuthorStorage {
    private Author[] authors = new Author[10];
    private int size;

    public void add(Author author) {
        if (size == authors.length) {
            extend();
        }
        authors[size++] = author;

    }

    private void extend() {
        Author[] authors1 = new Author[size + 10];
       System.arraycopy(authors,0,authors1,0,authors.length);
        authors = authors1;
    }

    public Author getByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid Index:" + index);
            return null;
        }
        return authors[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(authors[i] + " ");
        }
    }
    public void searchByName(String keyword) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(keyword) ||
                    authors[i].getSurname().contains(keyword)) {
                System.out.println(authors[i]);
            }
        }
    }

    public void searchByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getAge() > minAge &&
                    authors[i].getAge() < maxAge) {
                System.out.println(authors[i]);
            }
        }
    }
}
