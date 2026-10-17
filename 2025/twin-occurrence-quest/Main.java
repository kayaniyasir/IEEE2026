import java.io.*;
public class Main {
    static int lower(int[] a, int x) { int l=0,r=a.length;while(l<r){int m=(l+r)>>>1;if(a[m]<x)l=m+1;else r=m;}return l; }
    static int upper(int[] a, int x) { int l=0,r=a.length;while(l<r){int m=(l+r)>>>1;if(a[m]<=x)l=m+1;else r=m;}return l; }
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        int n=fs.nextInt(),q=fs.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=fs.nextInt();
        StringBuilder out=new StringBuilder();
        for(int i=0;i<q;i++){int x=fs.nextInt(),lo=lower(a,x);if(lo==n||a[lo]!=x)out.append("-1 -1\n");else out.append(lo+1).append(' ').append(upper(a,x)).append('\n');}
        System.out.print(out);
    }
    static class FastScanner {
        private final InputStream in;private final byte[] buf=new byte[1<<16];private int pos,size;
        FastScanner(InputStream in){this.in=in;}
        int read() throws IOException {if(pos>=size){size=in.read(buf);pos=0;if(size<0)return -1;}return buf[pos++];}
        int nextInt() throws IOException {int c;do{c=read();}while(c<=32&&c>=0);int sign=1;if(c=='-'){sign=-1;c=read();}int val=0;while(c>32){val=val*10+c-'0';c=read();}return val*sign;}
    }
}
