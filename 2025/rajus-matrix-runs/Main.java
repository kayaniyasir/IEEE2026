import java.io.*;
public class Main {
    static final int[] DR={-1,1,0,0}, DC={0,0,-1,1};
    public static void main(String[] args) throws Exception {
        FastScanner fs=new FastScanner(System.in);int n=fs.nextInt(),m=fs.nextInt(),size=n*m;
        int[] a=new int[size], higher=new int[size], dp=new int[size],queue=new int[size];
        for(int i=0;i<size;i++){a[i]=fs.nextInt();dp[i]=1;}
        int front=0,back=0,answer=1;
        for(int r=0;r<n;r++)for(int c=0;c<m;c++){
            int id=r*m+c;
            for(int d=0;d<4;d++){int nr=r+DR[d],nc=c+DC[d];if(nr>=0&&nr<n&&nc>=0&&nc<m&&a[nr*m+nc]>a[id])higher[id]++;}
            if(higher[id]==0)queue[back++]=id;
        }
        while(front<back){int id=queue[front++],r=id/m,c=id%m;answer=Math.max(answer,dp[id]);
            for(int d=0;d<4;d++){int nr=r+DR[d],nc=c+DC[d];if(nr<0||nr>=n||nc<0||nc>=m)continue;int nxt=nr*m+nc;
                if(a[nxt]<a[id]){dp[nxt]=Math.max(dp[nxt],dp[id]+1);if(--higher[nxt]==0)queue[back++]=nxt;}
            }
        }
        System.out.println(answer);
    }
    static class FastScanner {
        private final InputStream in;private final byte[] buf=new byte[1<<16];private int p,len;
        FastScanner(InputStream in){this.in=in;}
        int read() throws IOException {if(p>=len){len=in.read(buf);p=0;if(len<0)return -1;}return buf[p++];}
        int nextInt() throws IOException {int c;do{c=read();}while(c<=32&&c>=0);int s=1;if(c=='-'){s=-1;c=read();}int x=0;while(c>32){x=x*10+c-'0';c=read();}return x*s;}
    }
}
