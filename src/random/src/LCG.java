public class LCG {
    static int seed = 0;
    static int a = 2;
    static int c = 3;
    static int m = 23;


    public static void main(String[] args) {

        randomJonas(a, seed, c, m, 20);
        randomFloat(a, seed, c, m, 4);
        randomBoolean(a, seed, c, m, 5);
    }


    public static void randomJonas(int a, int seed, int c, int m, int n) {

        for (int i = 0; i < n; i++) {
            seed = (a * seed + c) % m;
            System.out.print(seed+", ");

        }
        System.out.println();
    }

    public static void randomFloat(int a, int seed, int c, int m, int n) {
        for (int i = 0; i < n; i++) {
            seed = (a * seed + c) % m;
            System.out.print( (double) seed / m +", ");
        }
        System.out.println();
    }


    public static void randomBoolean (int a, int seed, int c, int m, int n){

        for (int i = 0; i < n; i++) {
            seed = (a * seed + c) % m;
            System.out.print(((seed & 1) == 0) +", " );
        }
        System.out.println();
    }
}
