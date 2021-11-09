package homework.braceChecker;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack theStack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '{' || text.charAt(i) == '[' || text.charAt(i) == '(') {
                theStack.push(text.charAt(i));
            } else if (text.charAt(i) == '}' || text.charAt(i) == ']' || text.charAt(i) == ')') {

                switch (theStack.pop()) {
                    case '(':
                        if (text.charAt(i) != ')')
                            System.out.print("Error: " + text.charAt(i) + " at " + i);
                        break;
                    case '[':
                        if (text.charAt(i) != ']')
                            System.out.print("Error: " + text.charAt(i) + " at " + i);
                        break;
                    case '{':
                        if (text.charAt(i) != '}')
                            System.out.print("Error: " + text.charAt(i) + " at " + i);
                        break;


                }

            }


        }
    }
}