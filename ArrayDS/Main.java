package ArrayDS;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int sum = 0;
        for(int i:numbers){
            sum += i;
        }
        System.out.println(sum);

        String[] names = {"Madison","Hannibal","David"};
        for(String s : names){
            System.out.println(s.toUpperCase());
        }

        String[] values = {"a","b","c","d","e"};
        for(String s : values){
            System.out.println(s);
        }
        System.out.println(Arrays.toString(values));

        int[] nums = {12,54,31,35,87,16};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int[] numbers2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.binarySearch(numbers2, 5));
        
        int[] nums2 = new int[5];
        Arrays.fill(nums2, 5);
        System.out.println(Arrays.toString(nums2));

        char[] variables = {'a','b','c','d'};
        System.out.println(variables);

        int[][] array = {
                        {0},{1},
                        {2},{3}
                        };
        System.out.println(Arrays.deepToString(array));

        double[][] array2 = new double[2][2];
        array2[0][0] = 0.0;
        array2[0][1] = 0.1;
        array2[1][0] = 1.0;
        array2[1][1] = 1.1;
        System.out.println(Arrays.deepToString(array2));
    
        
        




    }
}
