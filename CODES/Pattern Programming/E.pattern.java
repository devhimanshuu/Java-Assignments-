//Write a Program to print E using  pattern Programming logic ?
class patterE {
    public static void main(String args[]) {
        int n = 12;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == 1 || i == 1 || i == (n - 1) / 2 || i == n - 1 || i == n - 2
                        || i == ((n - 1) / 2) + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
