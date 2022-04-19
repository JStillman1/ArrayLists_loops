import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list

//  ------Uses add(Index, element) to add a new element at the given index -----
        scottishIslands.add(0, "Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(scottishIslands.indexOf("Jura") + 1, "Islay");

//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index

        //Note - used indexOf rather than a specific index to adapt to any changes
        scottishIslands.remove(scottishIslands.indexOf("Arran"));

//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands.size());

//        8. Sort the list alphabetically

        // Preset function to alphabetically sort the list -- note: may not work with lower case vs upper case!
        java.util.Collections.sort(scottishIslands);

//        9. Print out all the islands using a for loop

        //For each island in the list of islands
        for(String island : scottishIslands){
            //Print out this island
            System.out.println(island);
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers

        //Initialise new list to contain the even numbers
        List<Integer> evens = new ArrayList<>();

        //For each num in the list of numbers
        for(int num : numbers){
            //If even
            if(num % 2 == 0) {
                //Add to our new list
                evens.add(num);
            }
        }
        System.out.println(evens);

//        2. Print the difference between the largest and smallest value

        //Initialise the min and max to be the first element
        int min = numbers.get(0);
        int max = numbers.get(0);

        //Iterate through the numbers
        for(int num : numbers){
            //If current number is less than min or greater than max, adjust values accordingly
            if(num < min){
                min = num;
            }
            else if (num > max){
                max = num;
            }
        }
        //Print the difference
        System.out.println(max - min);

//        3. Print true if the list contains a 1 next to a 1 somewhere

        //Start at the second number, stop at the final number, increment by 1
        for (int i = 1; i < numbers.size(); i++ ){
            //If this number AND the previous number are both 1
            if(numbers.get(i) == 1 && numbers.get(i - 1) == 1){
                //Then print true
                System.out.println("true");
            }
            //Otherwise, skip to the next number
        }

//        4. Print the sum of the numbers
        int sum = 0;    //Initialise the sum as 0
        for(int num : numbers){   //Iterate through the numbers
            sum += num;   //Add current number to the current sum
        }
        System.out.println(sum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count
//          HINT - You will need to track the index throughout the loop
//
//          So [7, 13, 2] would have sum of 9.

        int specialSum = 0;    //Initialise the special sum
        if(numbers.get(0) != 13){   //If the first number isn't 13 then add the first value
            specialSum += numbers.get(0);
        }

        for (int i = 1; i < numbers.size(); i++){   //Iterate through the numbers, starting at the second
            if(numbers.get(i) == 13 || numbers.get(i - 1) == 13){   //Check if either this number OR the previous are 13
                continue; //If either is 13, then we skip this iteration to the next
            }
            specialSum += numbers.get(i);  //If not, then we add the current number
        }
        System.out.println(specialSum);

    }

}
