//Write a Program to print B using  pattern Programming logic ?
class patternB {
    public static void main(String args[]) {
        int n = 12;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == (n - 1) / 2 && j < n - 1 || i == 0 && j < n - 1 || i == n - 1
                        || j == 0 || j == 1 || i == 1 || i == n - 2 || j == n - 1 && i > 0 && i < n - 1 || j == n - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
