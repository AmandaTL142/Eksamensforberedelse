package Eksamensspørgsmål;

public class Arrays {

    public static void main(String[] args) {
        int[] intList = new int[]{11, 22, 33, 44, 55, 66};

        int sum = 0;
        int oddSum = 0;

        System.out.println("Odd numbers in the array:");
        for(int integer:intList){
            if(integer%2 !=0){
                System.out.println(integer);
                oddSum +=integer;
            }
            sum += integer;
        }

        System.out.println("\nSum: " + sum);
        System.out.println("\nOddsum: " + oddSum);

    }

}







/*
int[] integers = new int[6];
        integers[0] =11;
        integers[1] =22;
        integers[2] =33;
        integers[3] =44;
        integers[4] =55;
        integers[5] =66;
 */
