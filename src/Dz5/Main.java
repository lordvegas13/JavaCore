package Dz5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("test.cvs");


        AppData appData = new AppData();

        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(appData.getInfo());


        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {

            System.out.println((char[]) objectInputStream.readObject());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class AppData implements Serializable {

        private String[] header;
        private int[][] data;

        @Override
        public String toString() {
            return String.valueOf(getInfo());
        }


        static char[] getInfo() {
            String[] header = new String[]{"Value 1", "Value 2", "Value 3"};
            int[][] data = new int[][]{{111, 222, 333}, {444, 555, 666}};
            for (int i = 0; i < header.length; i++) {

                System.out.print(header[i] + ";");

            }
            System.out.println();

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    System.out.print(data[i][j] + ";");
                }
                System.out.println();
            }

            return new char[0];
        }
    }
}

