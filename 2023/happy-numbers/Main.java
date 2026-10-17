import java.io.*;import java.util.*;
public class Main {
  static final long MOD=1000000007L;
  static int[] state;
  static boolean happy(int n){
    if(n==0)return false;
    ArrayList<Integer> path=new ArrayList<>();
    while(n!=1&&n!=4&&state[n]==0){
      path.add(n);int x=n,s=0;
      while(x>0){int d=x%10;s+=d*d;x/=10;}
      n=s;
    }
    boolean ok=n==1||state[n]==1;
    for(int x:path)state[x]=ok?1:2;
    return ok;
  }
  static String minus(String s){
    char[] a=s.toCharArray();int i=a.length-1;
    while(i>=0&&a[i]=='0')a[i--]='9';
    if(i<0)return "0";a[i]--;
    int j=0;while(j<a.length-1&&a[j]=='0')j++;
    return new String(a,j,a.length-j);
  }
  static long count(String s){
    if(s.equals("0"))return 0;
    int max=81*s.length();state=new int[Math.max(max,1000)+1];state[1]=1;state[4]=2;
    long[] loose=new long[max+1],tight=new long[max+1];tight[0]=1;
    int range=0;
    for(int p=0;p<s.length();p++){
      long[] nl=new long[max+1],nt=new long[max+1];int limit=s.charAt(p)-'0';
      for(int sum=0;sum<=range;sum++){
        long a=loose[sum],b=tight[sum];
        if(a>0)for(int d=0;d<=9;d++){int z=sum+d*d;nl[z]=(nl[z]+a)%MOD;}
        if(b>0)for(int d=0;d<=limit;d++){int z=sum+d*d;long[] dest=d==limit?nt:nl;dest[z]=(dest[z]+b)%MOD;}
      }
      loose=nl;tight=nt;range+=81;
    }
    long ans=0;for(int i=1;i<=max;i++)if(happy(i))ans=(ans+loose[i]+tight[i])%MOD;
    return ans;
  }
  public static void main(String[] args)throws Exception{
    BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer(r.readLine());
    String l=st.nextToken(),hi=st.nextToken();
    System.out.println((count(hi)-count(minus(l))+MOD)%MOD);
  }
}
