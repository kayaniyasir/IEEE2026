import java.io.*;
public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
    String s=r.readLine();if(s==null)return;int t=Integer.parseInt(s.trim());
    StringBuilder o=new StringBuilder();
    for(int z=0;z<t;z++){
      String line=r.readLine();if(line==null)line="";
      int[] cnt=new int[7];
      for(int i=0;i<line.length();i++){char c=Character.toUpperCase(line.charAt(i));if(c>='A'&&c<='G')cnt[c-'A']++;}
      int best=0;for(int j=1;j<7;j++)if(cnt[j]>cnt[best])best=j;
      o.append((char)('A'+best)).append('\n');
    }
    System.out.print(o);
  }
}
