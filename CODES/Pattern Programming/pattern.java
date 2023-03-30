//Write a Program to print  given pattern using  pattern Programming logic ?
class pattern {
    public static void main(String args[]) {
        int n = 13;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n - 1) / 2 || j == 0 && i < (n - 1) / 2 || i + j <= (n - 1) / 2
                        || i == 0 && j > (n - 1) / 2 || j == n - 1 && i < (n - 1) / 2 || j - i >= (n - 1) / 2
                        || j == 0 && i > (n - 1) / 2 || j == n - 1 && i > (n - 1) / 2 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
