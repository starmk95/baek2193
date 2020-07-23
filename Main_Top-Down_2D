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
        // Top-Down 방식
        // A[i][j] = 마지막 자리 숫자가 j인 i자리 이친수의 개수
        // 점화식 : A[n] = A[n][0] + A[n][1]
        //         A[n][0] = A[n-1][0] + A[n-1][1] (0은 0 또는 1 모두 앞에 올 수 있음)
        //         A[n][1] = A[n-1][0] (1은 0 앞에만 올 수 있음)
        // 이전 자리수가 0으로 끝나면 0또는 1 두가지 경우가 올 수 있지만
        // 전 자리수가 1로 끝나면 0밖에 올 수 없다. (한가지 경우만 존재) (끝에 10을 하나로 묶어서 생각할 수 있다 -> A[n-2]에 붙인다고 생각)
        if (n < 2) {
            A[1][1] = 1;
            return;
        }
        if (A[n-1][0] == 0 && A[n-1][1] == 0) {
            pinaryNum(n-1);
        }
        A[n][0] = A[n-1][0] + A[n-1][1];
        A[n][1] = A[n-1][0];
    }
}
