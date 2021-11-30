package homework.education;


import java.util.Scanner;

public class StudentLessonTest {
    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();


    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSONS_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";

    public static void main(String[] args) {
        boolean isRun = true;

        UserNamePassword();

        while (isRun) {

            printCommands();
            String commands = scanner.nextLine();
            switch (commands) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLesson();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                case DELETE_LESSONS_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.err.println("Անվավեր հրաման");
            }
        }
    }

    private static void UserNamePassword() {
        System.out.println("Ծածկանուն");
        String userName = scanner.nextLine();
        System.out.println("Գաղտնաբառ");
        String password = scanner.nextLine();
        if (userName.equals("ITSpaceAcademy") && password.equals("JavaCore21-22")) {
            System.out.println("մուտքը հաստատված է");
        } else {
            System.out.println("Անվավեր ծածկանուն կամ գաղտնաբառ");
            UserNamePassword();
        }
    }


    private static void deleteStudentByEmail() {
        System.out.println("խնդրում ենք մուտքագրել ուսանողի էլ․հասցեն");
        String email = scanner.nextLine();

        Student student = studentStorage.getByEmail(email);

        if (student != null) {
            studentStorage.deleteStudentBYEmail(email);
            System.out.println("ուսանողի տվյալները ջնջվել են");
        } else {
            System.out.println("Այս էլ․հասցեով ուսանող չկա");
            deleteStudentByEmail();
        }
    }

    private static void deleteLessonByName() {
        System.out.println("խնդրում եմ մուտքագրեք դասընթացի անվանումը");
        String name = scanner.nextLine();

        Lesson lesson = lessonStorage.getByName(name);

        if (lesson != null) {
            lessonStorage.deleteLessonByName(name);
            System.out.println("Այդ անունով դասընթացը ջնջվել է");
        } else {
            System.err.println("Այդ անունով դասընթաց չկա");
            deleteLessonByName();
        }
    }

    private static void printStudentsByLesson() {
        System.out.println("Խնդրում ենք մուտքագրել ուսանողական դասընթացի անունը");
        String lesson = scanner.nextLine();

        Student student = studentStorage.getByLesson(lesson);

        if (student != null) {
            studentStorage.getStudentLesson(student);
        } else {
            System.out.println("Այդ անունով դասընթաց չկա");
            printStudentsByLesson();
        }
    }

    private static void addStudent() {
        System.out.println("խնդրում ենք մուտքագրել ուսանողի էլ․հասցեն");
        String email = scanner.nextLine();

        Student student = studentStorage.getByEmail(email);

        if (student == null) {
            System.out.println("խնդրում ենք մուտքագրել ուսանողի անունը");
            String name = scanner.nextLine();
            System.out.println("խնդրում ենք մուտքագրել ուսանողի ազգանունը");
            String surname = scanner.nextLine();
            System.out.println("խնդրում ենք մուտքագրել ուսանողի տարիքը");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("խնդրում ենք մուտքագրել ուսանողի հեռախոսահամարը");
            String phone = scanner.nextLine();
            System.out.println("խնդրում եմ մուտքագրել  դասընթացը");
            String lesson = scanner.nextLine();

            Student students = new Student(name, surname, age, email, phone, lesson);

            studentStorage.add(students);

            System.out.println("շնորհակալություն ուսանողի տվյալները ավելացվեցին");
        } else {
            System.err.println("Այդ էլ․հասցեով արդեն ուսանող կար");
        }

    }

    private static void addLesson() {
        System.out.println("Խնդրում ենք մուտքագրել դասընթացի անունը");
        String name = scanner.nextLine();

        Lesson lesson = lessonStorage.getByName(name);

        if (lesson == null) {
            System.out.println("Խնդրում ենք մուտքագրել դասընթացի տևողությունը");
            String duration = scanner.nextLine();
            System.out.println("Խնդրում ենք մուտքագրել դասախոսի անունը");
            String lecturerName = scanner.nextLine();
            System.out.println("Խնդրում ենք մուտքագրել դասընթացի արժեքը");
            double price = Double.parseDouble(scanner.nextLine());

            Lesson lessons = new Lesson(name, duration, lecturerName, price);

            lessonStorage.add(lessons);

            System.out.println("Շնորհակալություն, դասընթացն ավելացվեց");
        } else {
            System.err.println("Այդ անունով դասընթաց արդեն կար");
        }
    }

    private static void printCommands() {
        System.out.println("\u001B[35m" + "Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_LESSON + " for ADD_LESSON");
        System.out.println("Please input " + ADD_STUDENT + " for ADD_STUDENT");
        System.out.println("Please input " + PRINT_STUDENTS + " for  PRINT_STUDENTS");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " for PRINT_STUDENTS_BY_LESSON");
        System.out.println("Please input " + PRINT_LESSONS + " for  PRINT_LESS0NS");
        System.out.println("Please input " + DELETE_LESSONS_BY_NAME + " for DELETE_LESSON_BY_NAME");
        System.out.println("Please input " + DELETE_STUDENT_BY_EMAIL + " for DELETE_STUDENT_BY_EMAIL" + "\u001B[36m");
    }


}

