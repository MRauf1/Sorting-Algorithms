import java.util.Arrays;

public class MergeSort {
    
    public static int[] mergeSort(int[] inputArray, int startIndex, int endIndex) {
        
        //Continue as long as the array has more than 1 element
        if(1 < endIndex) {
            
            int middleIndex = (startIndex + endIndex) / 2;
            
            int[] leftArray = Arrays.copyOfRange(inputArray, startIndex, middleIndex);
            int[] rightArray = Arrays.copyOfRange(inputArray, middleIndex, endIndex);
            
            //Recursively divide and sort the arrays
            leftArray = mergeSort(leftArray, startIndex, leftArray.length);
            rightArray = mergeSort(rightArray, startIndex, rightArray.length);
            
            //Merge the arrays
            int[] outputArray = merge(leftArray, rightArray);
            
            return outputArray;
            
        }
        
        return inputArray;
        
    }
    
    //Given 2 sorted arrays, concatenate them into 1 sorted array
    public static int[] merge(int[] leftArray, int[] rightArray) {
        
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;
        int outputLength = leftLength + rightLength;
        
        int[] outputArray = new int[outputLength];
        
        int leftIndex = 0;
        int rightIndex = 0;
        
        int leftElement = leftArray[leftIndex];
        int rightElement = rightArray[rightIndex];
        
        for(int i = 0; i < outputLength; i++) {
            
            //Append the lower value
            if(leftElement < rightElement) {
                
                outputArray[i] = leftElement;
                
                //If the left half has no numbers left
                if(leftIndex == leftLength - 1) {
                
                    //Fill with the right half if left half has no numbers left
                    for(int j = i + 1; j < outputLength; j++) {
                        
                        outputArray[j] = rightElement;
                        
                        if(j != outputLength - 1) {
                         
                            rightIndex++;
                            rightElement = rightArray[rightIndex];
                            
                        }
                        
                    }
                    
                    break;
                    
                } else {
                    
                    //If the left half has numbers left
                    leftIndex++;
                    leftElement = leftArray[leftIndex];   
                    
                }
                
            } else {
                
                outputArray[i] = rightElement;
                
                //If the right half has no numbers left
                if(rightIndex == rightLength - 1) {
                    
                    //Fill with the left half if right half has no numbers left
                    for(int j = i + 1; j < outputLength; j++) {
                        
                        outputArray[j] = leftElement;
                        
                        if(j != outputLength - 1) {
                         
                            leftIndex++;
                            leftElement = leftArray[leftIndex];
                            
                        }
                        
                    }
                    
                    break;
                    
                } else {
                    
                    //If the right half has numbers left
                    rightIndex++;
                    rightElement = rightArray[rightIndex];

                }
                
            }
            
        }
        
        return outputArray;
        
    }
    
}
