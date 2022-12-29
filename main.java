/**
 * main
 */
public class main {
    public static void main(String[] args) {

    }

    /*
     * Write a method maximum that returns the largest integer in the list. You can
     * assume that the list has at least one element.
     */
    public Integer maximum(Integer[] numList) {
        int max = 0;
        for (Integer i : numList) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    /*
     * Write a program called printNumberInWord which prints "ONE", "TWO",... ,
     * "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other,
     * respectively. Use:
     * 
     * (a) a "nested-if" statement;
     * 
     * (b) a "switch-case-default" statement.
     */
    public String printNumberInWord(int num) {
        /* A */
        /*
         * if(num == 1)
         * return "ONE";
         * else if(num == 2)
         * return "TWO";
         * else if(num == 3)
         * return "THREE";
         * else if(num == 4)
         * return "FOUR";
         * else if(num == 5)
         * return "FIVE";
         * else if(num == 6)
         * return "SIX";
         * else if(num == 7)
         * return "SEVEN";
         * else if(num == 8)
         * return "EIGHT";
         * else if(num == 9)
         * return "NINE";
         * else
         * return "OTHER";
         * }
         */
        /* B */
        switch (num) {
            case 1:
                return "ONE";
            case 2:
                return "TWO";
            case 3:
                return "THREE";
            case 4:
                return "FOUR";
            case 5:
                return "FIVE";
            case 6:
                return "SIX";
            case 7:
                return "SEVEN";
            case 8:
                return "EIGHT";
            case 9:
                return "NINE";
            default:
                return "OTHER";
        }
    }

    /*
     * Write a method called checkOddEven which prints "Odd Number" if the int
     * variable “number” is odd, or “Even Number” otherwise.
     * 
     * Hint n is an even number if (n % 2) is 0; otherwise, it is an odd number. Use
     * == for comparison, e.g., (n % 2) == 0.
     */
    public int checkOddEven(int num) {
        int number = 5;
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        return number; /* I write this to avoid an error */
    }

    /*
     * Write a method average that returns the average of the integer in the list.
     * You can assume that the list has at least one element.
     */
    public double average(Integer[] numList) {
        int a[] = { 3, 1, 19, 2, 3, 5 };
        int n = 6;
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += a[i];
        }
        System.out.println("Average is " + total / (float) n);
        return 0; /* I write this to avoid an error */
    }

}