import java.util.Scanner;

public class Main {

  public static void main(String... args){
    Scanner input = new Scanner(System.in);
    float radius;
    while (true) {
      System.out.println("Write the radius of the circle: ");
      if(input.hasNextFloat()){
        radius = input.nextFloat();
        input.nextLine();
        break;
      }
      else{
        System.out.println("Invalid input");
        input.nextLine();
      }
    }
  
    System.out.println("Circunference: " + (2 * radius * 3.1415f));
    System.out.println("Area: " + (radius * radius * 3.1415f));

  }
}
