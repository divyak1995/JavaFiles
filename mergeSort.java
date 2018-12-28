import java.util.Scanner;


class Main {

  public static void mergeSort(int[] integers) {
    if(integers.length > 1) {
      int mid=(integers.length)/2;
      int n1 = mid; 
      int n2 = integers.length-mid;
      int l[] = new int [n1]; 
      int r[]=new int[n2]; 
      for (int i=0; i<n1; i++) { 
            l[i] = integers[i]; 
      }
      for (int j=0; j<n2; ++j) {
          r[j] = integers[mid + j]; 
      }
      mergeSort(l);
      mergeSort(r);

      int i,j,k;
      i=j=k=0;
      while(i< l.length && j < r.length) {
        if (l[i] < r[j]) {
          integers[k]=l[i];
          i+=1;
        }
        else {
          integers[k]=r[j];
          j+=1;
        } 
        k+=1;
      }

      while (i<l.length){
      integers[k]=l[i];
      i+=1;
      k+=1;
      }
    
    while (j< r.length) {
      integers[k]=r[j];
      j+=1;
      k+=1;
    }
  }
  }

  public static void printArray(int[] integers){
    for(int i=0;i<integers.length;i++) {
    System.out.print(integers[i]+ " ");
    }
  }
 
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Please enter the list of numbers:");
    String st=scanner.nextLine();
    String[] nums=st.split(" ");
    int[] integers=new int[nums.length];
    for(int i=0;i<nums.length;i++) {
      integers[i]=(Integer.parseInt(nums[i]));
    }
    mergeSort(integers);
    printArray(integers);
    scanner.close();
  }
}
