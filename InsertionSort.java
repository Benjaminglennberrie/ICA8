import java.util.Vector;

public class InsertionSort {
    public static void insertionSort(Vector<Integer> input) {
        double startTime = System.currentTimeMillis(); // Start measuring time


        System.out.println("You have started a sorting algorithim. This will sort the array from smallest to largest. . . \n");
    for (int j = 2; j < input.size(); j++ ) {
        key = input.get(j);
        System.out.print(key + " ");

        //Insert A[j] into the sorted sequence A[1..j - 1]
        int i = j - 1;

        while (i >= 0 && input.get(i) > key) {

            input.set(i + 1, input.get(i));

            i = i - 1;

        }

        input.set(i + 1, key);

        double endTime = System.currentTimeMillis(); // End measuring time
        double executionTime = endTime - startTime; // Calculate execution time
        System.out.println("Execution time: " + executionTime + " milliseconds");

    }


    }

    public static void main(String[] args) {
        Vector<Integer> myData = new Vector<Integer>();

        myData.addElement(18);
        myData.addElement(7);
        myData.addElement(27);
        myData.addElement(92);
        myData.addElement(4);
        myData.addElement(5);
        myData.addElement(16);
        myData.addElement(13);
        myData.addElement(100);
        myData.addElement(1);
        myData.addElement(12);
        myData.addElement(35);
        myData.addElement(43);
        myData.addElement(41);
        myData.addElement(29);
        myData.addElement(33);
        myData.addElement(98);
        myData.addElement(99);
        myData.addElement(67);
        myData.addElement(76);


        insertionSort(myData);

        System.out.println("\n\nArray Should be sorted now . . . \n\n" + myData);

    }

    private static int key;
}
