package java.Lesson1;

import java.util.Objects;

public abstract class Employee {
    private String name;
    private int age;
    private double salary;
    private String hobby;
    private Position position;
    private static int countOfWorkers = 0;
    public final String nameOfCorp = "Корп";

    public Employee(String name, int age, double salary, String hobby) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hobby = hobby;
        ++countOfWorkers;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hobby = "none";
        ++countOfWorkers;
    }

    public final void info() {
        System.out.println(this.name + " " + this.age + " " + this.salary + " " + this.hobby + " " + this.position);
    }

    public abstract double getBonus();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHobby() {
        return this.hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public static int getCountOfWorkers() {
        return countOfWorkers;
    }

    public String toString() {
        return this.name + " " + this.salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(hobby, employee.hobby) && position == employee.position && Objects.equals(nameOfCorp, employee.nameOfCorp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary, hobby, position, nameOfCorp);
    }
}
