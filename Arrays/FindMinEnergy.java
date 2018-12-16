import java.util.*;

public class FindMinEnergy{

    
    // Program to min energy
    
    
    public static int findMinEnergy(int[] arr)
    {
       
       int initialNum = 0, sum =0;
       
       for(int i=0; i < arr.length; i++)
       {
           sum += arr[i];
           
           if(sum <= 0)
           {
               initialNum += (-sum) + 1;
               
               // Make sum to 1 to adjust current value
               sum = 1;
           }
       }
       
       
       return initialNum;  
    }
    
    public static void main(String []args){
       int arr[] = {-5,-4,-3,1,2,3,4};
       
       int minEnergy = findMinEnergy(arr);
       
       System.out.println("Minimum energy required is " + minEnergy);
        
        
    }
}