
/**
 * Write a description of class Number18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Number18
{
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        
          System.out.print("Enter the size of the array: ");
        
          int size = scanner.nextInt();
          int[] array = new int[size];
        
          System.out.println("Enter the elements:");
        
          for (int i = 0; i < size; i++) {
              array[i] = scanner.nextInt();
          }
          boolean hasDup = false;
        
          for (int i = 0; i < array.length; i++) {
              for (int j = i + 1; j < array.length; j++) {
                  if (array[i] == array[j]) {
                      hasDup = true;
                      break;
                  }
              }
              if (hasDup) {
                  break;
              }
          }
          System.out.println("Has duplicates: " + hasDup);
          scanner.close();
      }
  }
