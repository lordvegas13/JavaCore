package Lesson2;
import java.util.Scanner;


//      ИСКЛЮЧЕНИЯ
public class Main {
    public static void main(String[] args) throws MathFormulaException {


        Scanner sc = new Scanner(System.in);   // сканер вводимых значений в консоль

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (y == 5) {
            throw new MathFormulaException("В нашей формуле нельзя чтобы 2 аргумент был равен 5!");  // к созданию собственного класса исключений
        }

        // try-catch-finally перехватывает исключение, для того чтобы программа не прекратила работать
        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();
                                                       // Блок try-catch - обработчик исключений, перехватывает чтобы как то с этим работать
            try {                                      // try пробует выполнить код внутри скобок
                System.out.println(a/b);
                System.out.println();
            }

            catch (ArithmeticException e){                                                                // catch не прерывая работу программы пытается найти определенную ошибку и выполнить кусок кода внутри него
                System.out.println(" Я выполнюсь если будет выкинуто исключение арифметики " + e);       //обрабатывает конкретно заданные типы ошибок
            }
            catch (Exception e){
                System.out.println(" Я выполнюсь если выйдет хоть какое-нибуль исключение " + e);
            }
            finally {
                System.out.println(" Я выполнюсь в любом случае ");                                      //обычно не пишут, выполняет код внутри себя чтобы не происходило в конструкции try-catch
            }

        }

    }


    // СОЗДАНИЕ СОБСТВЕННОГО КЛАССА ИСКЛЮЧЕНИЙ
    // создание собственного класса исключений, чем больше уточнений тем лучше (не Exception, а ArithmeticException)
    static class MathFormulaException extends Throwable {
       public MathFormulaException(String message){
           super(message);
       }
    }


}
