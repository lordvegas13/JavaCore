package Lesson5;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    int salary;

    @Override
    public String toString(){
        return name + " " + salary;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
