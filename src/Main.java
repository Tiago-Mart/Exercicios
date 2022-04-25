import java.io.*;
import java.util.Scanner;
import java.util.stream.*;
import java.nio.file.*;


public class Main {
   public static void main(String args[]) {
       //Arquivos que serão utilizados no exercício
      String arquivo1 = "exerc1.txt";
      String arquivo2 = "exerc2.txt";
      String arquivo3 = "exerc3.txt";

     


    //Primeiro exercício - Buffered reader
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo1))){
            System.out.println("Testando o método do BufferedReader...");
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Um erro ocorreu!");
            e.printStackTrace();
        }
    


    
    //Segundo exercício - Stream
        try (Stream<String> stream = Files.lines(Paths.get(arquivo2))){
            System.out.println("\n");
            System.out.println("Testando o método stream...");
            stream.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Um erro ocorreu!");
            e.printStackTrace();
        }
    
    //Terceiro exercício - Scanner
        try (Scanner scan = new Scanner(new File(arquivo3))){
            System.out.println("\n");
            System.out.println("Testando através do Scanner...");
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Um erro ocorreu!");
            e.printStackTrace();
        }
   } 
}
