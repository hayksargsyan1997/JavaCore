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

        char[] bob = {'b', 'v', 'b', 'i', 'k'};
        boolean bobik = false;
        for (int i = 0; i < bob.length; i++) {
            if (bob[i] == 'b' && bob[i + 2] == 'b') {
                bobik = true;
            }
        }
        System.out.println(bobik);

        char[] text = {' ', ' ', ' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ', ' ', ' '};
        char[] result = new char[5];
        int caunt = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                result[caunt] = text[i];
                caunt++;
            }

        }
        for (int j = 0; j < result.length; j++) {
            if (result[j] == ' ') {
                break;
            }
            System.out.print(result[j]);
        }

    }
}
