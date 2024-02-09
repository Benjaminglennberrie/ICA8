import java.util.LinkedList;

public class InsertionSortOptimized {
    public static void insertionSort(LinkedList<Integer> input) {
        double startTime = System.currentTimeMillis(); // Start measuring time
        for (int i = 1; i < input.size(); i++) {
            int key = input.get(i);
            int j = i - 1;

            // Move elements of input[0..i-1] that are greater than key, to one position ahead of their current position
            while (j >= 0 && input.get(j) > key) {
                input.set(j + 1, input.get(j));
                j--;
            }
            input.set(j + 1, key);
        }
        double endTime = System.currentTimeMillis(); // End measuring time
        double executionTime = endTime - startTime; // Calculate execution time
        System.out.println("Execution time: " + executionTime + " milliseconds");
    }

    public static void main(String[] args) {
        LinkedList<Integer> myData = new LinkedList<>();

        myData.add(18);
        myData.add(7);
        myData.add(27);
        myData.add(92);
        myData.add(4);
        myData.add(5);
        myData.add(16);
        myData.add(13);
        myData.add(100);
        myData.add(1);
        myData.add(12);
        myData.add(35);
        myData.add(43);
        myData.add(41);
        myData.add(29);
        myData.add(33);
        myData.add(98);
        myData.add(99);
        myData.add(67);
        myData.add(76);

        System.out.println("Before sorting: " + myData);
        insertionSort(myData);
        System.out.println("After sorting: " + myData);
    }
}
