package Lesson6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static final int PORT = 1337; //Leet

    public static void main(String[] args) {        //* создание http сервера постоенного на сокетах

        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(Server.PORT);  //127.0.0.1 // открыли сокет для бесконечного прослушивания данных
            Socket socket = serverSocket.accept();

            BufferedReader bufferedReader = new BufferedReader(        // при входе данных прочитать их
                    new InputStreamReader(
                            socket.getInputStream()));


            PrintWriter printWriter = new PrintWriter(                 // отправка данных клиенту и сообщение в чат
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    socket.getOutputStream())), true);

            String request = bufferedReader.readLine();
            if (request.equals("Собаки")) {
                printWriter.println("Картинки собак отправиться клиенту");
            }
            else  if (request.equals("Кошки")){
                printWriter.println("Картинки кошек отправиться клиенту");
            }

            System.out.println(bufferedReader.readLine());             // и записать информацию в чат

            bufferedReader.close();    //закрытие потоков ввода и вывода
            printWriter.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
