
/** *******************************************************************
 * Purpose/Description: <This class will use two Stacks in order sort the original
 * stack in ascending order. The run time is O(N^2).>
 * Author’s Panther ID: <4734845>
 * Certification: I hereby certify that this work is my own and none of it is
 * the work of any other person.
 * ******************************************************************
 */
import java.util.Arrays; // imports the Arrays class to print the stack neatly.
import java.util.Stack; //imports Stack class to use for your class.

public class SortStack {

    
    /**
     * This method will read the original stack and use a temp stack to help it
     * sort the numbers on the stack in ascending order.
     *
     * @param original is the original stack from the main class
     * @return the original stack sorted
     */
    public static Stack sort(Stack<Integer> original) {
        Stack<Integer> temp = new Stack();
        while (!original.isEmpty()) {
            int current = original.pop();
            while (!temp.isEmpty() && temp.peek() > current) {
                original.push(temp.pop());
            }
            temp.push(current);
        }
        original = temp;
        return original;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Integer> original = new Stack();
        final int FIRST_ELEMENT = 3, SECOND_ELEMENT = 9, THIRD_ELEMENT = 6, FOURTH_ELEMENT = 0;
        final int FIFTH_ELEMENT = 12, SIXTH_ELEMENT = 18, SEVENTH_ELEMENT = 15, EIGHTH_ELEMENT = 21;
        original.add(FIRST_ELEMENT);
        original.add(SECOND_ELEMENT);
        original.add(THIRD_ELEMENT);
        original.add(FOURTH_ELEMENT);
        original.add(FIFTH_ELEMENT);
        original.add(SIXTH_ELEMENT);
        original.add(SEVENTH_ELEMENT);
        original.add(EIGHTH_ELEMENT);
        System.out.print("Original Stack: ");
        System.out.println(Arrays.toString(original.toArray()));
        System.out.print("Sorted Stack: ");
        Stack fixed = sort(original);
        System.out.println(fixed);

    }

}
