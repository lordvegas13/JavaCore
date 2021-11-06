package Lesson3;

public class Materials {                    // строительные материалы (1)

    private double weight;                  // указываем вес

    public Materials(double weight) {       // генерируем конструктор
        this.weight = weight;
    }

    public double getWeight() {              // генерируем гетер
        return weight;
    }

}
