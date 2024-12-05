
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author reymen
 */
public class NestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height of the rectangle");
        int length = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter the width of the rectangle");
        int width = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        
        scanner.close();
    }
}
