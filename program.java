import java.util.Scanner;
 /**
  * program
  */
 public class program {
  public static void main(String[] args) {
    int a = 19;  int i = 5;
    int x = 5; int j = 2;
    int y = 4;
    int b = 5;   
    int c = add(a, b);  
    int d = mul(x, y);  
    float e = divion(i, j);  
    System.out.println("The sum of a and b is= " + c);  
    System.out.println("The Multiprlication of a and b is= " + d);  
    System.out.println("The Divion of a and b is= " + e);  
  }
  public static int add(int n1, int n2)    
{  
int s;  
s=n1+n2;  
return s;   
}
  public static int mul(int n1, int n2)    
{  
int s;  
s=n1*n2;  
return s;   
} 
  public static float divion(int n1, int n2)    
{  
int s;  
s=n1/n2;  
return s;   
} 
}
