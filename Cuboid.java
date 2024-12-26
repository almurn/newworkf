import java.sql.SQLOutput;
import java.util.Scanner;

public class Cuboid {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int length, breadth, height;
            int totalArea, volume;

            System.out.println("Enter length: ");
            length = sc.nextInt();
            System.out.println("Enter breadth ");
            breadth = sc.nextInt();
            System.out.println("Enter height ");
            height = sc.nextInt();

             totalArea = 2 * ( length*breadth + length*height + breadth*height );
             volume = length * breadth *height;

            System.out.println("Total area: " +totalArea);
            System.out.println("Volume: " +volume);
        }
    }

