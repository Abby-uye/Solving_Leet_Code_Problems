import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public static double medianOfTwoSortedArray(int[] firstArray,int[] secondArray){
        if (firstArray.length>=0 &&firstArray.length<=1000 &&secondArray.length>=0 &&secondArray.length<=1000||firstArray.length+secondArray.length>=1&&firstArray.length+secondArray.length<=2000) {

            int[] newArray = new int[firstArray.length + secondArray.length];
            int count = 0;
            for (int element : firstArray) {
                newArray[count] = element;
                count++;
            }

            for (int element : secondArray) {
                newArray[count] = element;
                count++;
            }
            for (int index = 0; index < newArray.length; index++) {
                for (int index2 = index; index2 <newArray.length ; index2++) {
                    int temp =newArray[index];
                    if (temp > newArray[index2]){
                        newArray[index] = newArray[index2];
                        newArray[index2] = temp;
                    }
                }

            }

            double median;
            if (newArray.length % 2 != 0) {
                median = newArray[newArray.length / 2];
            } else median = (double) (newArray[newArray.length / 2] + newArray[newArray.length / 2 - 1]) / 2;
            return median;
        }else return 0;



    }

    public static void main(String[] args) {
        int [] firstArray = {7,3};
        int [] secondArray = {2,1};
        System.out.println(medianOfTwoSortedArray(firstArray,secondArray));
    }

}
