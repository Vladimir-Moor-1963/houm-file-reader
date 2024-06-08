import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Nambers {
    public static void main(String[] args) throws IOException {
        File file = new File("Namber.text");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);


        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            String string = bufferedReader.readLine();
            int number = Integer.parseInt(string);
            array[i] = number;
        }
            int sum = 0;
            for (int j = 0; j < array.length; j++){
                 sum += array[j];


            }
            int min = array[0];
            for (int j = 0; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                }


            }
            int max = array[0];
            for (int j = 0; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                }


                int count = 0;
                if (array[j] % 2 == 0){
                    count++;
                }
                int resalt = 0;
                for (int k = 1; k < array.length - 1; k++) {
                    if (array[k] > array[k - 1] && array[k] < array[k + 1]){
                        resalt++;

                    }


                    

                }
                System.out.println(resalt);
                

                 // int sum =0;
                 // for (int j = 0; j < array.length; j++) {
                 //     sum = sum ++;

                System.out.println(  sum);


            }
            System.out.println(Arrays.toString(array));


            //
            //  while (true) {
            //      String line = bufferedReader.readLine();
            //      if (line == null) {
            //          break;
            //      }

            //          int numbers = Integer.parseInt(line);
            //          array[i] = numbers;
            //          i++;


        }


    }


// System.out.println(nam);


