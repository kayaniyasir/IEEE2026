import java.io.*;
public class Main {
  static String encode(String s,int shift){
    boolean decode=false;
    for(String word:s.split(" ",-1))if(word.equals("the")){decode=true;break;}
    int delta=Math.floorMod(decode?-shift:shift,26);
    StringBuilder out=new StringBuilder();
    for(int i=0;i<s.length();i++){
      char c=s.charAt(i);
      if(c>='a'&&c<='z')out.append((char)('a'+(c-'a'+delta)%26));else out.append(c);
    }
    return out.toString();
  }
  public static void main(String[] args)throws Exception{
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(in.readLine().trim());StringBuilder ans=new StringBuilder();
    for(int i=0;i<t;i++){
      int sh=Integer.parseInt(in.readLine().trim());
      String line=in.readLine();if(line==null)line="";
      ans.append(encode(line,sh)).append('\n');
    }
    System.out.print(ans);
  }
}
