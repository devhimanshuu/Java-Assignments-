//Write a Program to print D using  pattern Programming logic ?
class patternD {
    public static void main(String args[]) {
        int n = 13;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == 1 || i == 1 || i == 0 && j < n - 1 || j == n - 1 && i > 0 && i < n - 1 || j == n - 2
                        || i == n - 2
                        || i == n - 1 && j < n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

}
