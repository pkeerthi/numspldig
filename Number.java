import java.util.*;
import java.io.*;
class Number
{
 public static void main(String args[])
 {
  int n;
  Scanner in=new Scanner(System.in);
  System.out.println("Enter a number");
  n=in.nextInt();
  for(char c : String.valueOf(n).toCharArray()) {
    System.out.print(c + " ");  }
    }
    }
