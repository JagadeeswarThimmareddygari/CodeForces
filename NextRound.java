import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalParticipants = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[totalParticipants+1];
        int minScore = 0;
        int count = 0;
        for (int i = 1; i <= totalParticipants; i++) {
            arr[i] = sc.nextInt();
            if (i == k)
            {
                minScore = arr[i];
            }
        }
        for (int j = 1; j <= totalParticipants; j++)
        {
            if (arr[j] >= minScore && arr[j] > 0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
