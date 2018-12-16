import java.util.*;

public class FindMaxDiff{

    
    // Array of numbers which have max diff such that a[i] < a[j] and i<j
    
    
    public static int findMaxDiff(Integer[] arr)
    {
       
       List<Integer> givenList = new ArrayList<Integer>(Arrays.asList(arr));
       System.out.println("Given arrays is "+ givenList);
       
       Integer[] sortedArr = sortNumbers(arr);
       List<Integer> sortedList = new ArrayList<Integer>(Arrays.asList(sortedArr));
       
       System.out.println("Sorted Array is " + sortedList);
       int maxDiff =-1;
       
       for(int i = sortedList.size() - 1; i>0 ;i--)
       {
           for(int j=0 ; j<sortedList.size(); j++)
           {
               int minValue = sortedList.get(j);
               int maxValue = sortedList.get(i);
               
               if(givenList.indexOf(maxValue) > givenList.indexOf(minValue))
               {
                   int diff = maxValue - minValue;
                  
                   if(diff > maxDiff)
                     maxDiff = diff;
                     
                break;
               }
               
              
           }
           
       }
       
       return maxDiff;
      
    }
    
    private static Integer[] sortNumbers(Integer[] arr)
    {
        for(int i=0; i< arr.length; i++)
        {
            for(int j=0; j < arr.length - 1 - i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        
        return arr;
        
    }
    
    
    public static void main(String []args){
       Integer arr[] = {2,5,4,3,1};
       
       Integer maxDiff = findMaxDiff(arr);
       
       System.out.println("Max diff is " + maxDiff);
        
        
    }
}