/**
 * Created by imac on 11/4/15.
 */
public class Sorts {

        public static void bubbleSort(int[] array)
        {
            for (int i = 0; i < array.length - 2; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        int tmp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        }
        private static int minIndex;
        private static int temp;
        public static void selectionSort(int[] array)
        {
            for (int i=0;i<array.length -2;i++)
            {
                minIndex=i;
                for (int s=0;s<array.length-1;s++)
                {

                    if (array[s]<array[minIndex])
                    {
                        minIndex=s;
                    }
                }

                temp=array[minIndex];
                array[minIndex]=array[i];
                array[i]=temp;
            }
        }






}
