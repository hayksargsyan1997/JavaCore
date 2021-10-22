package homework.charutil;

public class CharUtil {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int cauntOfC = 0;
        for (char x : bolola) {
            if (c == x) {
                cauntOfC++;

            }
        }
        System.out.print("o=" + cauntOfC);
        System.out.println();

        char[] bololy = {'b', 'o', 'l', 'o', 'l', 'a'};
        System.out.print(bololy[bololy.length / 2]);
        System.out.print(bololy[bololy.length / 2 + 1]);
        System.out.println();

        char[] bololu = {'b', 'o', 'l', 'o', 'l', 'a'};
        if (bololu[bololu.length - 2] == 'l' && bololu[bololu.length - 1] == 'y') {
            System.out.println(true);
        } else System.out.println(false);

        char[] bob = {'a', 'v', 'a', 'b', 's', 'b'};
        boolean bobik = false;
        for (int i = 0; i < bob.length - 2; i++) {
            if (bob[i] == 'b' && bob[i + 2] == 'b') {
                bobik = true;
                break;

            }
        }
        System.out.println(bobik);


        char[] text = {' ', ' ', 'b', 'a', ' ', 'r', 'e', 'v', ' ', ' '};
        int first = 0;
        int end = text.length - 1;
        while (first < end && text[first] == ' ') {
            first++;
        }
        while (first < end && text[end] == ' ') {
            end--;
        }

        char[] result = new char[(end - first) + 1];
        int index = 0;
        for (int i = first; i < end + 1; i++) {
            result[index++] = text[i];
        }
        for (char x : result) {
            System.out.print(x);
        }

    }
}









































