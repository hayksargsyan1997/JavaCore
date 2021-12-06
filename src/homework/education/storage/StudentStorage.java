package homework.education.storage;

import homework.education.model.Lesson;
import homework.education.util.ArrayUtil;
import homework.education.model.Student;

public class StudentStorage {
    private Student[] students = new Student[10];
    private int size;

    public void add(Student student) {
        if (students.length == size) {
            extend();
        }
        students[size++] = student;
    }

    private void extend() {
        Student[] tmp = new Student[students.length + 10];
        System.arraycopy(students, 0, tmp, 0, students.length);
        students = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public Student getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                return students[i];
            }
        }
        return null;
    }

    public void getStudentLesson(Student student) {
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (students[i].getLesson().equals(student.getLesson())) {
                System.out.println(students[i]);
            }
        }
    }

    public void deleteStudentBYEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                ArrayUtil.deleteByIndex(students, i, size);
                size--;
            }
        }
    }


    public void printStudentsByLesson(Lesson lesson1) {
        for (int i = 0; i < size; i++) {
            for (Lesson lesson : students[i].getLesson()) {
                if (lesson.equals(lesson1)) {
                    System.out.println(students[i]);
                }
            }
        }
    }
}
