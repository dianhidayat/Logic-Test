public class NearestFibonacci {
    
    public static void main(String[] args) {

        // input
        int[] arr = {15, 1, 3};
        int jumlah = 0, i = 0;

        for (; i < arr.length; i++) {
            jumlah += arr[i];
        }

        System.out.print("Output : ");
        nearestFibonacci(jumlah);
    }

    public static void nearestFibonacci(int n) {
        int f_n, f_n_1, f_n_2;
    
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        for (int i = 1; i <= n; i++) {
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;

            if (n < f_n) {
                System.out.println(f_n - n);
                break;
            }
        }
    }
}