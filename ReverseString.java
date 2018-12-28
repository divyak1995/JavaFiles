import java.util.Scanner;

class ReverseString {
  public static String reverseString(String st) {
    int n=st.length();
    StringBuilder s=new StringBuilder("");
    for (int i=n-1; i>=0;i--) {
      s.append(st.charAt(i));
    }
    return s.toString();
  }
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Please enter the string:");
    String st=scanner.nextLine();
    String result=reverseString(st);
    System.out.println(result);
    scanner.close();
  }
}
