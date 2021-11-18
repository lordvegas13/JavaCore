package Lesson5;

import javax.imageio.IIOException;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        /* !InputStream и OutputStream! записывает все что угодно в 8 byte, музыка, картинки*/

        File file = new File("text.txt"); // обьект который мы передаем потокам ввода и вывода данных

        //заполнение массива данными
        byte[] arr = new byte[1024 * 1024];
        for (int i = 0; i < arr.length; i++){
            arr[i] = 70;
        }

         long startTime = System.currentTimeMillis(); // 1 замер времени выполнения процесса

        //запись массива в файл //OutputStream используем для чтения и записи файла
        try (OutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream(file))) { //закрытие потока ввода и вывода
            for (byte b: arr){
                fileOutputStream.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        long finalTime = System.currentTimeMillis(); // 2 замер времени выполнения процесса
        System.out.println(finalTime - startTime);

        char[] arr2 = new char[1024 * 1024];

        startTime = System.currentTimeMillis();  // 1 замер времени выполнения процесса

        //запись массива в файл //InputStream используем для чтения и записи файла
        try(InputStream byteArrayInputStream = new BufferedInputStream(new FileInputStream(file))){
            int count;
            int i = 0;
            while ((count = byteArrayInputStream.read()) != -1) {
                arr2[i] = (char) count;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

       /* for (char c: arr2){    //вывод
            System.out.print(c);
        }*/
        finalTime = System.currentTimeMillis(); // 2 замер времени выполнения процесса
        System.out.println(finalTime - startTime);
        //////////////////////////////////////////


//1-запись данных OutputStream
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file))) {
            dataOutputStream.writeDouble(25.2);    // запись дробного числа
            dataOutputStream.writeInt(4556);       // запись целого числа
        } catch (IOException e) {
            e.printStackTrace();
        }
//2-чтение данных InputStream
        try(DataInputStream dataArrayInputStream = new DataInputStream(new FileInputStream(file))){
            System.out.println(dataArrayInputStream.readDouble()); //прочтение записанных данных дробного числа
            System.out.println(dataArrayInputStream.readInt());    //прочтение записанных данных целого числа
        } catch (IOException e) {
            e.printStackTrace();
        }
///////////////////////////////////////////

        Employee employee1 = new Employee("Галина", 10000);
        Employee employee2 = new Employee("Петрушка", 18000);

        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(employee1);
        arrayList.add(employee2);


//1-запись данных OutputStream
        try (ObjectOutputStream objectFileOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            for (Employee e: arrayList){                 // для каждого работкика в arrayList
                objectFileOutputStream.writeObject(e);   // используется функционал objectFileOutputStream.writeObject и передается туда е
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//2-чтение данных InputStream
        try(ObjectInputStream objectArrayInputStream = new ObjectInputStream(new FileInputStream(file))){
            System.out.println(objectArrayInputStream.readObject().getClass());
            System.out.println(objectArrayInputStream.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        /*! Writer и Reader - записывается в символах, только для текстовой информации, размер 16byte !*/

        File file2 = new File("src/text2.txt");

//1-запись данных
        try (Writer outputStream = new FileWriter(file2)) {
          outputStream.write('я');
        } catch (IOException e) {
            e.printStackTrace();
        }

//2-чтение данных
        try(Reader inputStream = new FileReader(file2)){
            System.out.println((char) inputStream.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
// ОПЕРАЦИИ ВЫПОЛНЕНИЯ
// открытие доступа к файлу
// запись /чтение байта
// закрытие доступа к файлу
