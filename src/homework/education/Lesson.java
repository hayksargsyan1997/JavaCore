package homework.education;

import java.util.Objects;

public class Lesson {
    private String name;
    private String duration;
    private String lectureName;
    private double price;

    Lesson(String name, String duration,
           String lectureName, double price) {
        this.name = name;
        this.duration = duration;
        this.lectureName = lectureName;
        this.price = price;
    }

    Lesson() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return Double.compare(lesson.price, price) == 0
                && Objects.equals(name, lesson.name) && Objects.equals(duration, lesson.duration)
                && Objects.equals(lectureName, lesson.lectureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, duration, lectureName, price);
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", lectureName='" + lectureName + '\'' +
                ", price=" + price +
                '}';
    }
}
