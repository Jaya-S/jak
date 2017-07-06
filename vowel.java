# jak
import java.io.BufferedReader;
	import java.io.InputStreamReader;

  import java.io.IOException;     


public class vowel{
  public static void main(String []args)throws IOException{
    
    
    
    BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
    char n;
    System.out.println("Enter the character");
    n= r.readLine().charAt(0);
    if(n=='A'||n== 'a'|| n=='E'|| n=='e'||n=='I'|| n=='i'|| n=='O'||  n=='o'||  n=='U'||   n=='u'){
      
      System.out.println("It is a vowel");
    }
    else{
      
      System.out.println("It is not a vowel");
    }
  }
}
