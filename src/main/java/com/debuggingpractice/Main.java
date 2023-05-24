package com.debuggingpractice;

public class Main {


    public static void main(String[] args) {

        //Test your method with an array containing the numbers 1, 2, 3, 4, 5.
        int[] array = {1, 2, 3, 4, 5};

        //average of the array
        double average = calculateAverage(array);
        System.out.println("Average: " + average);

        //int[] array2 = null;
        int [] array2 = {1, 2, 3, 4, 5};
        // null and exception
        double array2Average = calculateAverage(array2);
        System.out.println("Average: " + array2Average);

        //int[] array3 = {9};
        int [] array3 ={1};
        // out of bound exception
        double array3Average = calculateAverage(array3);
        System.out.println("Average: " + array3Average);
    }


        //Write a Java method that calculates the average of an array of integers.
        //This method should take an array of integers as input and return a double as output.

        /**
         * get the average of the array
         * @param array = the integers
         * @return the average
         */
        public static double calculateAverage ( int[] array){
            if (array == null) {
                throw new IllegalArgumentException("NULL!");
            }
            int sum = 0;

            // iterate through and add to the sum of array
            for (int i = 0; i < array.length; i++) {
                // a logic error by subtracting instead of adding
                //sum -= array[i];

                  sum += array[i];
            }
            // divide the sum by the length to get average
            return (double) sum / array.length;
        }
    }


    // Line16,Line 37 , Line43; I used the debugger by setting breakpoints in the code to be able to inspect my code in specific areas to identify the errors

