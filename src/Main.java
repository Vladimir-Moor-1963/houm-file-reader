import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
      int[] nambers = new int[10];
       Random random = new Random();
      for (int i = 0; i < nambers.length; i++)
      nambers[i] = random.nextInt(10);

      try ( FileWriter writer = new FileWriter("Namber.text",false)){
          for (int i = 0; i < nambers.length; i++)
         {
              String s = Integer.toString(nambers[i]);
              writer.write(s);
             writer.write(System.lineSeparator());
            System.out.println(s);
           // int sum =0;
           // for (int namber : nambers) {
           //     sum = sum + namber;

           //     System.out.println("Summa " + sum);

           // }


         }

      }
     catch (IOException e){
          System.out.println(e.getMessage());
      }


    }
}
