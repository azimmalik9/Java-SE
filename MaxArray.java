// class MaxArray{
// public static void main(String[] args){
    // IntArray[] arr = {};
	// //arr.maxValue(1,2,3,4,5,6,7,8,9,10);
	
// }
// }

// class Biggest{
	// public int biggestValue(int array[]){
		// // Finding the largest element
      // double max = arr[0];
      // for (int i = 1; i < arr.length; i++) {
         // if (arr[i] > max) max = arr[i];
      // }
      // System.out.println("Max is " + max);  
	// }
// }

public class TestArray {

   public static void main(String[] args) {
      double[] myList = {1.9, 2.9, 3.4, 3.5};

      // Print all the array elements
      for (int i = 0; i < myList.length; i++) {
         System.out.println(myList[i] + " ");
      }
     
      // Summing all elements
      double total = 0;
      for (int i = 0; i < myList.length; i++) {
         total += myList[i];
      }
      System.out.println("Total is " + total);
      
      // Finding the largest element
      double max = myList[0];
      for (int i = 1; i < myList.length; i++) {
         if (myList[i] > max) max = myList[i];
      }
      System.out.println("Max is " + max);  
   }
}