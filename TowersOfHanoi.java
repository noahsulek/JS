

// Code from: http://www.javawithus.com/programs/towers-of-hanoi
// added disk # to output - RH Stalvey

import java.util.*;
public class TowersOfHanoi {

   public void solve(int n, String start, String auxiliary, String end) {
       if (n == 1) {
           System.out.println("disk: " + n + " " + start + " -> " + end);
       } else {
           solve(n - 1, start, end, auxiliary);
           System.out.println("disk: " + n + " " + start + " -> " + end);
           solve(n - 1, auxiliary, start, end);
       }
   }

   public static void main(String[] args) {
       TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
       System.out.print("Enter number of discs: ");
       Scanner scanner = new Scanner(System.in);
       int discs = scanner.nextInt();
       towersOfHanoi.solve(discs, "A", "B", "C");
   }
}