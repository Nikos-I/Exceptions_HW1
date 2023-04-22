import java.util.Arrays;
import java.util.Scanner;

public class Modules {
    void arrayOper(int[] array1, int[] array2, String op) {
        int[] arrayResult = new int[array1.length];
        if (array1.length != array2.length) {
            System.out.println("Длины массивов не равны (array1=" + array1.length + "), array2=" + array2.length + ")");
        }
        try {
            for (int i = 0; i < array1.length; i++) {
                switch (op) {
                    case "Sub":
                        arrayResult[i] = array1[i] - array2[i];
                    case "Div":
                        arrayResult[i] = array1[i] / array2[i];
                    case "Add":
                        arrayResult[i] = array1[i] + array2[i];
                }
            }
            System.out.println(op);
            System.out.println("array1: " + Arrays.toString(array1));
            System.out.println("array2: " + Arrays.toString(array2));
            System.out.println("arrayResult:  " + Arrays.toString(arrayResult));
        } catch (Exception e) {
            System.out.println("RuntimeException");
            System.out.println(e);
        }
    }

    void checkTriangularArray(int[][] inpArray) {
        String illegalVal = "";
        boolean err = false;
        for (int i = 0; i < inpArray.length; i++) {
            System.out.println((char) 27 + "[37m");
            if (inpArray[i].length != i) {
                illegalVal = (char) 27 + "[31m" + "Неверное кол-во столбцов:";
                err = true;
            }
            System.out.printf("Для строки %d столбцов %d %s", i, inpArray[i].length, illegalVal);
            illegalVal = "";
        }
        if (err) System.out.println("\n" + (char) 27 + "[31m Есть ошибки" + (char) 27 + "[37m");
    }

    String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    int promptInt(String inputPrompt) {
        int intValue = 0;
        try {
            intValue = Integer.parseInt(prompt(inputPrompt));
        } catch (NumberFormatException nfe) {
            System.out.println("Неверный формат ввода числа: " + nfe.getMessage());
        }
        return intValue;
    }
}
