import java.util.*;

public class Main {
    static long A[][]; // n자리의 이친수의 개수를 저장하는 배열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        A = new long[num+1][2];
        pinaryNum(num);
        System.out.println(A[num][0] + A[num][1]);
    }

    public static void pinaryNum(int n) {
        // Bottom-Up 방식
        // A[i][j] = 마지막 자리 숫자가 j인 i자리 이친수의 개수
        // 점화식 : A[n] = A[n][0] + A[n][1]
        //         A[n][0] = A[n-1][0] + A[n-1][1] (0은 0 또는 1 모두 앞에 올 수 있음)
        //         A[n][1] = A[n-1][0] (1은 0 앞에만 올 수 있음)
        A[1][1] = 1;
        for (int i=2;i<n+1;i++) {
            A[i][0] = A[i-1][0] + A[i-1][1];
            A[i][1] = A[i-1][0];
        }
    }
}
