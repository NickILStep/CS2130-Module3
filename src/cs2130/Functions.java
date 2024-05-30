package cs2130;
import java.util.ArrayList;
import java.util.Collections;

public class Functions {
  /**
   * Returns the intersection of two sets
   * @param domain, an ArrayList of integers that define the
   *                domain of a function
   * @param target, an ArrayList of integers that define the
   *                target of a function
   * @param range, an ArrayList of integers that define the
   *               range of a function.
   *  The domain and range must be in matching order. Each value in the
   *               domain is to have a matching value in the range at the
   *               same index that forms an ordered pair.
   * @return, returns true if the function has the one-to-one property
   * and false otherwise
   */
  static boolean isOneToOne(ArrayList<Integer> domain,
                            ArrayList<Integer> target,
                            ArrayList<Integer> range)  {
    for(int i = 0; i < range.size(); i++) {
      for(int j = 0; j < range.size(); j++) {
        if(i != j) {
          if(range.get(i) == range.get(j)) {
            return false;
          }
        }
      }
    }
    return true;
  }
  /**
   * Returns the intersection of two sets
   * @param domain, an ArrayList of integers that define the
   *                domain of a function
   * @param target, an ArrayList of integers that define the
   *                target of a function
   * @param range, an ArrayList of integers that define the
   *               range of a function.
   *  The domain and range must be in matching order. Each value in the
   *               domain is to have a matching value in the range at the
   *               same index that forms an ordered pair.
   * @return, returns true if the function has the onto property
   * and false otherwise
   */
  static boolean isOnto(ArrayList<Integer> domain,
                        ArrayList<Integer> target,
                        ArrayList<Integer> range) {

    ArrayList<Integer> tempTarget = new ArrayList<Integer>();
    ArrayList<Integer> tempRange = new ArrayList<Integer>();

    for(int i = 0; i < target.size(); i++) {
      if(!tempTarget.contains(target.get(i))) {
        tempTarget.add(target.get(i));
      }
    }

    for(int j = 0; j < range.size(); j++) {
      if(!tempRange.contains(range.get(j))) {
        tempRange.add(range.get(j));
      }
    }

    Collections.sort(tempTarget);
    Collections.sort(tempRange);

    if(tempTarget.equals(tempRange)) {
      return true;
    }
    return false;
  }
  /**
   * Returns the intersection of two sets
   * @param domain, an ArrayList of integers that define the
   *                domain of a function
   * @param target, an ArrayList of integers that define the
   *                target of a function
   * @param range, an ArrayList of integers that define the
   *               range of a function.
   *  The domain and range must be in matching order. Each value in the
   *               domain is to have a matching value in the range at the
   *               same index that forms an ordered pair.
   * @return, returns true if the function is a bijection
   */
  static boolean isBijection(ArrayList<Integer> domain,
                             ArrayList<Integer> target,
                             ArrayList<Integer> range) {
    if(isOneToOne(domain, target, range) && isOnto(domain, target, range)) {
      return true;
    }
    return false;
  }
}
