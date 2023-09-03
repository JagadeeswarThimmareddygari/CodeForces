
import java.util.Scanner;
public class Team {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        int count = 0;
        int result = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count >= 2)
            {
                result++;
            }
            count = 0;
        }

        System.out.println(result);
    }
}
