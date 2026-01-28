
package program;

import entities.PrintService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        PrintService<Integer> ps = new PrintService<>();
        
        System.out.println("How many values: ");
        int values = sc.nextInt();
        
        for(int i = 0;i< values;i++){
            Integer n = sc.nextInt();
            
            ps.addValue(n);
            
        }
        ps.print();
        System.out.println("First: " + ps.first());
        
        
    }
}
