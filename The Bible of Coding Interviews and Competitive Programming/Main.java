class Main {
    public static void main(String arg[]) {
        long result = fastExpo(2, 13, 5);
        System.out.println(result);
    }


    private static long fastExpo(long a, long n, int MOD) {
        long ans = 1;

        while(n>=1) {
            if(n%2==0) {
                a = (a*a)%MOD;
                n /= 2;
            } else {
                ans = ans * a;
                n -= 1;
            }
        }

        return ans;
    }
}