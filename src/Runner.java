public class Runner {
    public static void main(String[] args){
        // Insertion Sort
        int[] testarray1 = InPlaceSorts.randIntArr(10);
        System.out.println("Insertion Sort:\n");
        System.out.println("Before: ");
        for( int num:testarray1){
            System.out.print(num+" ");
        }
        System.out.println();
        long time1 = System.nanoTime();
        InPlaceSorts.insertionSort(testarray1);
        time1 = System.nanoTime()-time1;

        System.out.println("After: ");
        for( int num:testarray1){
            System.out.print(num+" ");
        }
        System.out.println("\nTime taken: "+time1+"\n");



        // Selection Sort
        double[] testarray2 = InPlaceSorts.randdoubleArr(10);
        System.out.println("Selection Sort:\n");
        System.out.println("Before: ");
        for( double num:testarray2){
            System.out.print(num+" ");
        }
        System.out.println();
        long time2 = System.nanoTime();
        InPlaceSorts.selectionSort(testarray2);
        time2 = System.nanoTime()-time2;

        System.out.println("After: ");
        for( double num:testarray2){
            System.out.print(num+" ");
        }
        System.out.println("\nTime taken: "+time2+"\n");


        // Bubble Sort
        String[] testarray3 = InPlaceSorts.randomStringArr(10,5);
        System.out.println("Bubble Sort:\n");
        System.out.println("Before: ");
        for( String num:testarray3){
            System.out.print(num+" ");
        }
        System.out.println();
        long time3 = System.nanoTime();
        InPlaceSorts.bubbleSort(testarray3);
        time3 = System.nanoTime()-time3;

        System.out.println("After: ");
        for( String num :testarray3){
            System.out.print(num+" ");
        }
        System.out.println("\nTime taken: "+time3);

    }

}
