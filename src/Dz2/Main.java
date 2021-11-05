package Dz2;

public class Main {
    public static void main(String[] args) {
        String[][] arr44 = new String[][]{
                {"4","4","4","4"},
                {"4","4","4","4"},
                {"4","4","4","4"},
                {"4","4","4","4"}
        };

        try {
            try {
                int result = mуMethod(arr44);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива больше, чем нужно ");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неверное значение массива! ");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }

    public static int mуMethod(String[][] arr44) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr44.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr44.length; i++) {
            if (arr44[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr44[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr44[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }

}

class MyArrayDataException extends Throwable {
    public int i;
    public int j;

    MyArrayDataException(int i, int j){
        this.i = i;
        this.j = j;
    }

}

class MyArraySizeException extends Throwable {

}
