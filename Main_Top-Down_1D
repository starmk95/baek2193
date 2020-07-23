import java.util.*;

public class Main {
    static long A[]; // n자리의 이친수의 개수를 저장하는 배열 (일차원 배열로 해결하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        A = new long[num+1];
        pinaryNum(num);
        System.out.println(A[num]);
    }

    public static void pinaryNum(int n) {
        // Bottom-Up 방식
        // A[i][j] = 마지막 자리 숫자가 j인 i자리 이친수의 개수
        // 점화식 : A[n] = A[n-1] + A[n-2]
        //         A[n-1] : 전 이진수가 0으로 끝나는 경우 -> 마지막 자리에 0, 1 모두 올 수 있음
        //         A[n-2] : 전 이진수가 1로 끝나는 경우 -> 마지막 자리에 0 밖에 올 수 없음
        //                  01을 한 묶음으로 생각해서 A[n-2]에 01을 추가한 경우를 생각하면 됨
        if (n < 2) {
            A[1] = 1;
            return;
        }
        if (A[n-1] == 0) {
            pinaryNum(n-1);
        }
        A[n] = A[n-1] + A[n-2];
    }
}
