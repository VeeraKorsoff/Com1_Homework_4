public class Main {
    public static void main(String[] args) {

        //HW 1
        System.out.println("these are the integers in this array:");
        int[] numbers = {2, 5, -3, 11, 193, -2};
        int sum = 0;
        for (int number : numbers) {
            System.out.println(number);
            sum = sum + number;
        }
        System.out.println("the sum of the integers in this array is " + sum);

        //HW 2
        int count = 0;
        int S = 0;
        int[] NUMS = {3, 5, 0, 11, 1};

        for (int i = 0; i <= 4; i++) {
            if (NUMS[i] != 0) {
                S = S + NUMS[i];
                count = count + 1;
            }
        }
        if (count == 0)
            System.out.println(0);
        else
            System.out.println(S / count);

        //HW 3
        boolean result = true;
        int N = 4;
        int[] VALUES = {-3, 2, 5, 4, 7};

        if (result = true && N < 5) {
            if (VALUES[N] < VALUES[N - 1])
                result = false;
            N = N + 1;
        } else
            System.out.println(result);


        //HW 4
        int[] jarjestys = {5, 4, -7, -2, -1};
        // int counter = 0;

        for (int v = jarjestys.length - 1; v >= 0; v--)
            System.out.println(jarjestys[v]);

        // HW 5
        int[] arr1 = {-3, 2, 6, -11};
        int sum2 = 0;
        for (int y = 0; y <= arr1.length; y++) {
            sum2 = sum2 + arr1[y];
            System.out.println(sum2);

        }
        //HW 6
        int[] arrg = {4, -3, -5, 9, 1, 11};
        int m = 1;

        for (int w = 0; w <= arrg.length; w++) {
            if (arrg[w] < m)
                System.out.println(arrg[w]);
        }
        for (int q = 0; q <= arrg.length; q++) {
            if (arrg[q] > m)
                System.out.println(arrg[q]);
        }

    }
}
