package THEME14.CLASSWORK;

public class QuickSortMethods {
    public static  void QuickSort(int[] myArr, int start , int end) {
        if (start < end) {

            int pi = Partition(myArr, start, end);

            QuickSort(myArr, start, pi - 1);

            QuickSort(myArr, pi + 1, end);
        }
    }


    private static int Partition(int[] myArr , int low , int high) {
        int pivot= myArr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1 ; j++) {
            if (myArr[j] < pivot){
                i++;

                int temp = myArr[j];
                myArr[j] = myArr[i];
                myArr[i] = temp;
            }

        }
        i++;
        int temp = myArr[i];
        myArr[i] = pivot;
        myArr[high] = temp;

        return i;
    }
}
