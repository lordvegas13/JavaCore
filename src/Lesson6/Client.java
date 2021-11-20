package Lesson6;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String request = sc.nextLine();
        Socket socket;

        try {
            socket = new Socket("localhost", Server.PORT);    //127.0.0.1 // открыли сокет для бесконечного прослушивания данных

            BufferedReader bufferedReader = new BufferedReader(     // при входе данных прочитать их
                    new InputStreamReader(
                            socket.getInputStream()));


            PrintWriter printWriter = new PrintWriter(              // отправка данных клиенту и сообщение в чат
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    socket.getOutputStream())), true);
            printWriter.println(request);
            System.out.println(bufferedReader.readLine());             // и записать информацию в чат

            bufferedReader.close();                                    //закрытие потоков ввода и вывода
            printWriter.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
