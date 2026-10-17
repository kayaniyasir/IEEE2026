import java.io.*;
import java.util.*;
public class Main {
    static int solve(int n, int k, String s) {
        int[] ends = new int[n + 1]; int parity = 0, operations = 0;
        for(int i=0;i<n;i++) {
            parity ^= ends[i];
            boolean sad = s.charAt(i) == 'S';
            if (sad ^ (parity == 1)) {
                if (i + k > n) return -1;
                operations++; parity ^= 1; ends[i+k] ^= 1;
            }
        }
        return operations;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        while(t-- > 0){StringTokenizer st=new StringTokenizer(br.readLine());int n=Integer.parseInt(st.nextToken());int k=Integer.parseInt(st.nextToken());String s=st.nextToken();out.append(solve(n,k,s)).append('\n');}
        System.out.print(out);
    }
}
