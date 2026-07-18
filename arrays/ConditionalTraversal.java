import java.util.Scanner;
public class ConditionalTraversal {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of element: ");
        int n=sc.nextInt();
         int arr[]=new int[n] ;
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //print Even Elements from an array
        System.out.print("Even elements: ");
        for(int i=0;i<n;i++){// array traversal
            if(arr[i]%2==0){// Traverse the array and print only even elements
                System.out.print( arr[i] +" ");
            }   
        }
         System.out.println(" ");
          //print Odd Elements from an array
          System.out.print("Odd elements: ");
          for(int i=0;i<n;i++){// Traverse the array and print only odd elements
            if(arr[i]%2!=0){
                System.out.print(arr[i] +" ");
            }   
        }
        int sum=0;
        //Sum of elements of even elements
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){// Check whether the current element is even
                sum=sum+arr[i];
            }   
        }
        System.out.println(" ");// for next line 
        System.out.println("Sum Of even elements: " +sum);  
        int total = 0;
     //Sum of elements between 20 and 50 
     System.out.println(" ");
     for (int i = 0; i < n; i++) {
    if (arr[i] >= 20 && arr[i] <= 50) {
        total+= arr[i];
    }
}

System.out.println("Sum of elements between 20 and 50 = " +total);
     sc.close();
        }   
}
