package homework.braceChecker;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack theStack = new Stack();
        boolean isValid = true;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int pop;
            switch (c) {
                case '(':
                case '{':
                case '[':
                    theStack.push(c);
                    break;
                case ')':
                    pop = theStack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println("Error:Closed " + c + "but nothing opened at " + i);
                    } else if (pop != '(') {
                        isValid = false;
                        System.err.println("Error:  closed " + c +
                                " but opened " + (char) pop + "at " + i);

                    }  break;
                case '}':
                    pop = theStack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println("Error:Closed " + c + "but nothing opened at " + i);
                    } else if (pop != '{') {
                        isValid = false;
                        System.err.println("Error:  closed " + c +
                                " but opened " + (char) pop + "at " + i);

                    } break;
                case ']':
                    pop = theStack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println("Error:Closed " + c + "but nothing opened at " + i);
                    } else if (pop != '[') {
                        isValid = false;
                        System.err.println("Error:  closed " + c +
                                " but opened " + (char) pop + "at " + i);

                    } break;


            }

        }

        while (!theStack.isEmpty()) {
            isValid = false;
            System.err.println("Error: opened " + (char) theStack.pop() + "but nothing closed");
        }


        if (isValid) {
            System.out.println("Everything is good:");
        }
    }
}









