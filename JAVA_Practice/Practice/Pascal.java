class Pascal{
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();

        for(int i = 0; i < n; i++){
            int val = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }

        }

}