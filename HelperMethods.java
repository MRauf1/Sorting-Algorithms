public class HelperMethods {
    
    public static void swap(int[] inputArray, int firstIndex, int secondIndex) {
        
        int temp = inputArray[firstIndex];
        inputArray[firstIndex] = inputArray[secondIndex];
        inputArray[secondIndex] = temp;
        
    }
    
}
