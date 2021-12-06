package homework.education.commands;

public interface PrimeCommand {
    String EXIT = "0";
    String LOGIN = "1";
    String REGISTER = "2";


    static void commands() {
        System.out.println("\u001B[30m" + "click " + EXIT + " TO EXIT");
        System.out.println("click " + LOGIN + " to LOGIN");
        System.out.println("click " + REGISTER + " TO REGISTER" + "\u001B[37m");

    }
}
