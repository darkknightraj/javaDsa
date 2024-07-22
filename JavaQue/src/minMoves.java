import java.util.Arrays;
import java.util.Scanner;

public class minMoves {

    public static int minMovesToSeat(int[] seats, int[] students) {
        int n = seats.length;
        
        Arrays.sort(seats);
        Arrays.sort(students);
        
        int minMoves = 0;
        for (int i = 0; i < n; i++) {
            minMoves += Math.abs(students[i] - seats[i]);
        }
        
        return minMoves;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] seats = new int[n];
        int[] students = new int[n];
        
        for (int i = 0; i < n; i++) {
            seats[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            students[i] = sc.nextInt();
        }
        
        int minMoves = minMovesToSeat(seats, students);
        System.out.println(minMoves);
        
        sc.close();
    }
}
