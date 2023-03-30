//Write a Program to print PWSKILLS using  pattern Programming logic ?
class PWSKILLS {
    public static void main(String args[]) {
        int n = 13;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == n - 1 && i < (n - 1) / 2 || i == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i + j == (n - 1) && j < (n - 1) / 2 || i == j && i >= (n - 1) / 2 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 && i < (n - 1) / 2 || i == (n - 1) / 2 || j == n - 1 && i > (n - 1) / 2
                        || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i + j == (n - 1) / 2 || i - j == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 && i < (n - 1) / 2 || i == (n - 1) / 2 || j == n - 1 && i > (n - 1) / 2
                        || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
