package cs2130;

import java.util.ArrayList;
import java.util.Collections;


public class Sets {
  /**
   * Returns the intersection of two sets
   * @param set1, an ArrayList of integers that define a set
   * @param set2, an ArrayList of integers that define a set
   * @return, an ArrayList of integers that is the intersection of
   * the two parameter sets. The set returned is in order
   * from smallest to largest.
   */
   static ArrayList<Integer> intersectionOfSets(ArrayList<Integer> set1, ArrayList<Integer> set2) {

    ArrayList<Integer> tempList = new ArrayList<Integer>();

    // Cycle through all values in set1
     for(int i = 0; i < set1.size(); i++) {
       // Cycle through all values in set2
       for(int j = 0; j < set2.size(); j++) {
         // Compare each value from sets 1 and 2
         if(set2.get(j) == set1.get(i) && !tempList.contains(set1.get(i))) {
           // If they match and the value hasn't already been added, add the value to tempList
           tempList.add(set1.get(i));
         }
       }
     }

     // Sort tempList in numerical order
     Collections.sort(tempList);
     return tempList;
   }

  /**
   * Returns the union of two sets
   * @param set1, an ArrayList of integers that define a set
   * @param set2, an ArrayList of integers that define a set
   * @return, an ArrayList of integers that is the union of
   * the two parameter sets. The set returned is in order
   * from smallest to largest.
   */
  static ArrayList<Integer> unionOfSets(ArrayList<Integer> set1, ArrayList<Integer> set2) {

    ArrayList<Integer> tempList = new ArrayList<Integer>();

    // Add all non-duplicate values from set1 to tempList
    for(int i = 0; i < set1.size(); i++) {
      if(!tempList.contains(set1.get(i))) {
        tempList.add(set1.get(i));
      }
    }

    // Add all non-duplicate values from set2 to tempList
    for(int j = 0; j < set2.size(); j++) {
      if(!tempList.contains(set2.get(j))) {
        tempList.add(set2.get(j));
      }
    }

    // Sort tempList in numerical order
    Collections.sort(tempList);
    return tempList;
  }

}
