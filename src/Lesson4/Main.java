package Lesson4;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        /* Тема: КОЛЛЕКЦИИ */

        ArrayList<Integer> arrayList = new ArrayList<>();

        Integer test = 12345;
        arrayList.add(1111);                         // .add добавить в лист
        arrayList.add(2222);
        arrayList.add(3333);
        arrayList.add(4444);
        arrayList.add(12345);

        System.out.println(arrayList.size());         // .size вывод размера
        arrayList.remove(test);                       // удаление по названию
        arrayList.remove(3);                    // удаление по индексу
        System.out.println(arrayList);                // вывод содержимого
        System.out.println(arrayList.get(0));         // вывод содержимого по индексу

        //  LinkedList работает за счет хранения ссылки на кождый из следующих элементов, за счет этого вставка и удаление работаеют быстрее


        HashSet<String> hashSet = new HashSet<>(); //выводит только уникальные элементы не в попад
        hashSet.add("qqqq");
        hashSet.add("wwww");
        hashSet.add("rrrr");
        hashSet.add("qqqq");
        System.out.println(hashSet);


        LinkedHashSet<String> hashSet2 = new LinkedHashSet<>(); //выводит только уникальные элементы по порядку добавления
        hashSet2.add("qqqq");
        hashSet2.add("wwww");
        hashSet2.add("rrrr");
        hashSet2.add("qqqq");
        System.out.println(hashSet2);


        TreeSet<String> hashSet3 = new TreeSet<>(); //выводит только уникальные элементы с сортировкой, например String - сотировка от A-Я
        hashSet3.add("qqqq");
        hashSet3.add("wwww");
        hashSet3.add("rrrr");
        hashSet3.add("qqqq");
        hashSet3.add("aaaa");
        hashSet3.add("ffff");
        System.out.println(hashSet3);


        HashMap<String, String> hashMap = new HashMap<>();      //хранит в себе 2 типа данныех для 2 значений. например: логин и пароль, логин как ссылка на ячейку памяти где записан пароль.
        hashMap.put("Хотабыч", "qwerty12");                     // put - функция по добавлению элементов
        hashMap.put("МомКиллек", "qwerty555");


        if (hashMap.get("Хотабыч") == null){                    //функция для того чтобы нельзя было перезаписать пароль, если такой пользователь есть, то ничего не меняем, если нет то записать "Хотабыч", "1234"
            System.out.println("Такого пользователя нет");
            hashMap.put("Хотабыч", "1234");
        }
        else {
            System.out.println("Такой пользователь есть");
        }

        System.out.println(hashMap);

        System.out.println(hashMap.get("Хотабыч"));
        System.out.println(hashMap.get("МомКиллек"));


        // База данных библиотеки -> список авторов в все их книги, быстый поиск по авторам

        HashMap<String, ArrayList<String>> authors = new HashMap<>();
        Scanner sc = new Scanner(System.in);                                // ввод сканера

        while (true){
            String answer = sc.nextLine();
            if (answer.equals("Add")){                // добавление книги или автора
                String author = sc.nextLine();        // ввод автор которого хотим добавиться в список
                String book = sc.nextLine();          // ввод книги которую хотим добавиться в список

            // обработать ситуации когда автор ЕСТЬ и автора НЕТ
                if (authors.get(author) == null){                       // если автора НЕТ,т.е. равен нул,то мы должны добавить новую запись:
                    ArrayList<String> books = new ArrayList<>();        // заводим новый список книг
                    books.add(book);                                    // добавить книгу в список книг
                    authors.put(author, books);                         // завести нового атора, а потом его собрание книг в новый ArrayList
                }
                else{                                                   //если автор ЕСТЬ
                    authors.get(author).add(book);                      //то берем список автора и добавляем туда книгу
                }
            }

            else if (answer.equals("Show")){                //показ всех произведений автора
                String author = sc.nextLine();              //ввести автора в консоль
                System.out.println(authors.get(author));   //вывести список книг данного автора
            }

            else if (answer.equals("Exit")){           //выход
                break;
            }

        }




                   /* Тема: ИТЕРАТОРЫ */

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1111);
        arrayList.add(2222);
        arrayList.add(3333);
        arrayList.add(4444);
        arrayList.add(12345);

       Iterator<Integer> iterator = arrayList.iterator();    // Iterator - обьект который работает по перечислению
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer integer : arrayList) {              // упрощеная форма, аналог Iterator - это цикл фо ич
            System.out.println(integer);
        }




                /* Тема: СОРТИРОВКА */

        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee("Slava", 39870));
        arrayList.add(new Employee("Max", 41220));
        arrayList.add(new Employee("Masha", 51230));
        arrayList.add(new Employee("Vika", 62340));
        arrayList.add(new Employee("Pasha", 92345));

        System.out.println(arrayList);

        Collections.sort(arrayList);

        System.out.println(arrayList);

    }
}

