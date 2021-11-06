package Lesson3;
import java.util.ArrayList;

public class Container<T extends Materials, S> {             // <T> передаем внутрь класса название другого класса (4)

    ArrayList<T> boxes;                                      // массив определенного типа в который можно постоянно добавлять коробки
    S name;

    public Container(S name) {
        boxes = new ArrayList<>();
        this.name = name;
    }


    public S getName() {
        return name;
    }

    public double getWeightOfContainer(){                                  // измерять сколько весят все наши контейнеры
        return boxes.get(0).getWeight() * boxes.size();
    }

    public boolean compare (Container <?, ?> container){                    // сравнение контейнеров. вместео ? подставляются любые параметры
        if (this.getWeightOfContainer() > container.getWeightOfContainer()){
            return true;
        }
        else {
            return false;
        }
    }

    public void  addBoxToContainer(T t){
        boxes.add(t);
    }
}

   /*
   основные методы ArrayList
   boxes.add();  - добавить в конец списка
   boxes.get(0);  - получить из списка по определенному индексу
   так же методы для удаления коробок и т.п.

    */