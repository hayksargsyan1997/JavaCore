package homework.charArrayUtil;

public class CharArrayUtil {

    void bol(char[] bolola) {
        char c = 'o';
        int cauntOfC = 0;
        for (char x : bolola) {
            if (c == x) {
                cauntOfC++;

            }
        }
        System.out.print("o=" + cauntOfC);
        System.out.println();
    }

    void bololy(char[] bolola) {
        System.out.print(bolola[bolola.length / 2]);
        System.out.print(bolola[bolola.length / 2 + 1]);
        System.out.println();
    }

    void bololu(char[] bolola) {
        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1] == 'y') {
            System.out.println(true);
        } else System.out.println(false);
    }

    void bob(char[] bob) {
        boolean bobik = false;
        for (int i = 0; i < bob.length - 2; i++) {
            if (bob[i] == 'b' && bob[i + 2] == 'b') {
                bobik = true;
                break;

            }
        }
        System.out.println(bobik);
    }

    void text(char[] text) {
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
