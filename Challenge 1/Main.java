import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


// Harry Peng 2021 Internship Assignment: Algorithms

class Main {
  public static void main(String[] args) {
    int[] testArray = {2, 4, 5, 1, 3, 5, 4};
    int targetSum = 6;
    // test data for findPairs()

    int[] a = {1, 2, 4, 5, 19};
    int[] b = {7, 2, 3, 5, 23};
    // test data for reconcileHelper()

    findPairs(testArray,targetSum);
    reconcileHelper(a, b);
  }




  /*Algorithm #1
  I used a very simple algorithm:
  1. check if array has less than two elements, if yes, return nothing
  2. create a HashSet to contain all the pairs
  3. looping through each combination of each element in the two arrays. if they add up to the target sum:
    a. Create a local List variable to contain the two numbers
    b. Sort the local list variable to prevent duplication later on
    c. add the local list variable to the HashSet
  4. Print out the HashSet
  */
  
  public static void findPairs(int[] testArray, int targetSum) {
        if (testArray.length < 2) {
            return; 
            // if there's less than two integers in the array, there cannot be a pair
        }
        
        Set<List<Integer>> pairs = new HashSet<>(); 
        // creating a HashSet to store the pairs later

        for(int i = 0; i < testArray.length; i++){
          for(int j = i + 1; j < testArray.length; j++){ 
            
          // looping through each combination of each element in the two arrays
            if(testArray[i] + testArray[j] == targetSum){
              List<Integer> pair = Arrays.asList(testArray[i], testArray[j]);
              Collections.sort(pair); // they have to be sorted to prevent (5,1) (1,5) duplication
              pairs.add(pair);
              
              // if they add up to the target sum, add them to the HashSet
            }
          }
        }
        System.out.println(pairs);
  }
  


  /*Algorithm #2
  1. create two arraylists to store the unique values
  2. turn the input arrays into arraylists for ease of use later on
  3. loop through each element in each arraylist 
    a. if a unique (uncommon) element is found, store it in the respective arraylist
  4. Print out a formatted version of both arraylists
  */
  public static void reconcileHelper(int[] a, int[] b) {
    List<Integer> notInB = new ArrayList<Integer>();
    List<Integer> notInA = new ArrayList<Integer>();
    // creating two arraylists to store the unique values (later)
    
    List<Integer> bList = new ArrayList<Integer>();
    List<Integer> aList = new ArrayList<Integer>();
    
    for(int i = 0; i < a.length; i++){
      aList.add(a[i]);
    }
    for(int i = 0; i < b.length; i++){
      bList.add(b[i]);
    }
    // turning the input arrays into ArrayLists

    for(int i = 0; i < a.length; i++){
      if(!bList.contains(a[i])){
        notInB.add(a[i]);
      }
    }

    for(int i = 0; i < b.length; i++){
      if(!aList.contains(b[i])){
        notInA.add(b[i]);
      }
    }
    // checking if the arrays contain anything not contained in the other array, if yes, storing those unique values in notInX arraylist
    
    String answerA = notInA.toString().replace(",", "").replace("[", "").replace("]", "").trim();   
    String answerB = notInB.toString().replace(",", "").replace("[", "").replace("]", "").trim();    
    System.out.println("Numbers in array a that aren't in array b: "+"\n"+answerB);
    System.out.println("Numbers in array b that aren't in array a: "+"\n"+answerA);
    //formatting and printing the answer
  }
}
