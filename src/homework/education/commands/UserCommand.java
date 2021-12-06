package homework.education.commands;

public interface UserCommand extends AdminCommand {
    static void printCommands() {
        System.out.println("\u001B[35m" + "Please input " + PrimeCommand.EXIT + " for EXIT");
        System.out.println("Please input " + ADD_LESSON + " for ADD_LESSON");
        System.out.println("Please input " + ADD_STUDENT + " for ADD_STUDENT");
        System.out.println("Please input " + PRINT_STUDENTS + " for  PRINT_STUDENTS");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " for PRINT_STUDENTS_BY_LESSON");
        System.out.println("Please input " + PRINT_LESSONS + " for  PRINT_LESS0NS" + "\u001B[36m");

    }
}
