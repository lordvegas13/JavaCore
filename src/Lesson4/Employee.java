package Lesson4;

public class Employee implements Comparable {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return name + " " + salary;
    }
/*
    @Override
    public int compareTo(Object o){       //сортировка по зарплате, правила для определения сортировки
        Employee secondEmployee = (Employee) o;
        if (salary > secondEmployee.salary){
            return 1;
        }
        else if (salary < secondEmployee.salary){
            return -1;
        }
        else {
            return 0;
        }
    }

 */
    @Override  //сокращенная версия сотрировки по зарплате
    public int compareTo(Object o){
        return salary - ((Employee)o).salary;
    }

}
