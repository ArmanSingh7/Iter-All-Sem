import java.util.Scanner;
public class program4_String {

	public static void main(String[] args) {
        char[] arr = {'c', 'a', 'r', 'b', 'o', 'n'};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    for (int l = 0; l < n; l++) {
                        if (l == i || l == j || l == k) continue;
                        for (int m = 0; m < n; m++) {
                            if (m == i || m == j || m == k || m == l) continue;
                            for (int o = 0; o < n; o++) {
                                if (o == i || o == j || o == k || o == l || o == m) continue;
                                System.out.println("" + arr[i] + arr[j] + arr[k] + arr[l] + arr[m] + arr[o]);
                            }
                        }
                    }
                }
            }
        }
    }
}     