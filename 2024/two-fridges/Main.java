import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().trim());
        int[] lo = new int[n], hi = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer t = new StringTokenizer(reader.readLine());
            lo[i] = Integer.parseInt(t.nextToken());
            hi[i] = Integer.parseInt(t.nextToken());
        }
        for (int x = -100; x <= 100; x++) {
            for (int y = x; y <= 100; y++) {
                boolean valid = true;
                for (int i = 0; i < n; i++) {
                    if (!((lo[i] <= x && x <= hi[i]) || (lo[i] <= y && y <= hi[i]))) {
                        valid = false; break;
                    }
                }
                if (valid) { System.out.println(x + " " + y); return; }
            }
        }
        System.out.println(-1);
    }
}
