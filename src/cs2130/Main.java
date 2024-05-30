package cs2130;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

  //  // run the ArrayList example function
  //  System.out.println("Calling the ExampleFunction function");
  //  ArrayListExample.exampleFunction();

  //  // run the ArrayList example function that has parameters and return value of type ArrayList
  //  System.out.println("Calling the ExampleParameterAndReturn function");
  //  ArrayList<Integer> my_array_list = new ArrayList<Integer>();
  //  my_array_list.add(19);
  //  my_array_list.add(23);
  //  my_array_list.add(41);
  //  my_array_list.add(5);
  //  my_array_list.add(8);

  //  ArrayList<Integer> my_array_list_2 = new ArrayList<Integer>();
  //  my_array_list_2 = ArrayListExample.exampleParameterAndReturn(my_array_list);


    // Part 1 Sets
    System.out.println();
    System.out.println("Part 1");

    ArrayList<Integer> setA = new ArrayList<Integer>() {
      {
        add(2);
        add(3);
        add(6);
        add(4);
        add(9);
      }
    };

    ArrayList<Integer> setB = new ArrayList<Integer>() {
      {
        add(1);
        add(7);
        add(4);
        add(9);
        add(8);
      }
    };

    ArrayList<Integer> setC = new ArrayList<Integer>() {
      {
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);
        add(7);
        add(8);
      }
    };

    System.out.println();
    System.out.println("Sets:");
    System.out.println("A: " + setA);
    System.out.println("B: " + setB);
    System.out.println("C: " + setC);

    System.out.println();
    System.out.println("Union of Sets A and B:");
    System.out.println(Sets.unionOfSets(setA, setB));

    System.out.println();
    System.out.println("Intersection of Sets A and B:");
    System.out.println(Sets.intersectionOfSets(setA, setB));

    System.out.println();
    System.out.println("Union of Sets A, B, and C:");
    System.out.println(Sets.unionOfSets(setA, Sets.unionOfSets(setB, setC)));

    System.out.println();
    System.out.println("Intersection of Sets A, B, and C:");
    System.out.println(Sets.intersectionOfSets(setA, Sets.intersectionOfSets(setB, setC)));

    System.out.println();
    System.out.println("Intersection of the Union of Sets A and B and Set C:");
    System.out.println(Sets.intersectionOfSets(Sets.unionOfSets(setA, setB), setC));

    System.out.println();
    System.out.println("Union of Set A and the Intersection of Sets B and C:");
    System.out.println(Sets.unionOfSets(setA, Sets.intersectionOfSets(setB, setC)));

    System.out.println();
    System.out.println("Union of the Intersection of Sets A and C and Set B:");
    System.out.println(Sets.unionOfSets(Sets.intersectionOfSets(setA, setC), setB));

    System.out.println();
    System.out.println("Intersection of Set A and the Union of Sets C and B:");
    System.out.println(Sets.intersectionOfSets(setA, Sets.unionOfSets(setC, setB)));

    // Part 2 Functions
    System.out.println();
    System.out.println("\nPart 2");

    ArrayList<Integer> setW = new ArrayList<Integer>() {
      {
        add(7);
        add(3);
        add(5);
        add(9);
        add(12);
        add(15);
      }
    };
    
    ArrayList<Integer> setX = new ArrayList<Integer>() {
      {
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
      }
    };

    ArrayList<Integer> setY = new ArrayList<Integer>() {
      {
        add(3);
        add(6);
        add(9);
        add(12);
        add(15);
      }
    };

    ArrayList<Integer> setZ = new ArrayList<Integer>() {
      {
        add(4);
        add(9);
        add(7);
        add(2);
      }
    };

    System.out.println();
    System.out.println("Sets:");
    System.out.println("W: " + setW);
    System.out.println("X: " + setX);
    System.out.println("Y: " + setY);
    System.out.println("Z: " + setZ);

    ArrayList<Integer> fRange = new ArrayList<Integer>() {
      {
        add(3);
        add(5);
        add(7);
        add(9);
        add(15);
      }
    };

    System.out.println();
    System.out.println("f: X -> W");
    System.out.println("Domain: " + setX);
    System.out.println("Target: " + setW);
    System.out.println("Range: " + fRange);

    System.out.println("One-To-One: " + Functions.isOneToOne(setX, setW, fRange));
    System.out.println("Onto: " + Functions.isOnto(setX, setW, fRange));
    System.out.println("Bijection: " + Functions.isBijection(setX, setW, fRange));

    ArrayList<Integer> gRange = new ArrayList<Integer>() {
      {
        add(4);
        add(9);
        add(7);
        add(4);
        add(2);
      }
    };

    System.out.println();
    System.out.println("g: X -> Z");
    System.out.println("Domain: " + setX);
    System.out.println("Target: " + setZ);
    System.out.println("Range: " + gRange);

    System.out.println("One-To-One: " + Functions.isOneToOne(setX, setZ, gRange));
    System.out.println("Onto: " + Functions.isOnto(setX, setZ, gRange));
    System.out.println("Bijection: " + Functions.isBijection(setX, setZ, gRange));

    ArrayList<Integer> hRange = new ArrayList<Integer>() {
      {
        add(3);
        add(6);
        add(9);
        add(12);
        add(15);
      }
    };

    System.out.println();
    System.out.println("h: X -> Y");
    System.out.println("Domain: " + setX);
    System.out.println("Target: " + setY);
    System.out.println("Range: " + hRange);

    System.out.println("One-To-One: " + Functions.isOneToOne(setX, setY, hRange));
    System.out.println("Onto: " + Functions.isOnto(setX, setY, hRange));
    System.out.println("Bijection: " + Functions.isBijection(setX, setY, hRange));
  }
}
