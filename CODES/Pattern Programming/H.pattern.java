
//Write a Program to print A using  pattern Programming logic ?
class patterH {
    public static void main(String args[]) {
        int n = 12;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - 1 || j == n - 2 || j == 1 || i == ((n - 1) / 2) + 1 || j == 0 || i == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
