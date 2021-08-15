import java.util.Scanner;  
public class MaximumNumbers 
{  
public static void main(String[] args)   
{  
int i,n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements: ");  
n=sc.nextInt();  
int[] array = new int[100];  
System.out.println("Enter the elements of the array: ");  
for(i=0; i<n; i++)  
{  
  array[i]=sc.nextInt();  
}
  int max=array[0];

  for(int i=0;i<n;i++)
  {
    if(array[i]>max)
      max=array[i];
  }
  System.out.println("Largest element present in the array:"+max);
}
}
