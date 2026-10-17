import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        int n = fs.nextInt(), m = fs.nextInt();
        int[] group = new int[n], indegree = new int[n];
        ArrayList<Integer>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++) { group[i] = fs.nextInt(); g[i] = new ArrayList<>(); }
        for (int i = 0; i < m; i++) { int u=fs.nextInt()-1,v=fs.nextInt()-1; g[u].add(v); indegree[v]++; }
        PriorityQueue<Integer> ready = new PriorityQueue<>((a,b) -> group[a] == group[b] ? Integer.compare(a,b) : Integer.compare(group[a], group[b]));
        for (int i = 0; i < n; i++) if (indegree[i] == 0) ready.add(i);
        StringBuilder ans = new StringBuilder();
        int processed = 0;
        while (!ready.isEmpty()) {
            int u = ready.poll();
            if (processed++ > 0) ans.append(' ');
            ans.append(u + 1);
            for (int v : g[u]) if (--indegree[v] == 0) ready.add(v);
        }
        System.out.println(processed == n ? ans : "-1");
    }
    static class FastScanner {
        private final InputStream in; private final byte[] buffer = new byte[1<<16];
        private int ptr, len;
        FastScanner(InputStream in) { this.in=in; }
        int read() throws IOException { if(ptr>=len){len=in.read(buffer);ptr=0;if(len<0)return -1;}return buffer[ptr++]; }
        int nextInt() throws IOException {int c;do{c=read();}while(c<=32&&c>=0);int v=0,sgn=1;if(c=='-'){sgn=-1;c=read();}while(c>32){v=v*10+c-'0';c=read();}return v*sgn;}
    }
}
