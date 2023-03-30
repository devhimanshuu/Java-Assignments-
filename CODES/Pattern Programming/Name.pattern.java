//Write a Program to print My name (HIMANSHU GUPTA) using  pattern Programming logic ?
class NAME {
    public static void main(String args[]) {
        int n = 11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == 1 || i == (n - 1) / 2 || i == (n - 3) / 2 || j == n - 1 || j == n - 2) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == 1 || j == (n - 1) / 2 || j == (n - 3) / 2 || i == n - 1 || i == n - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == 1 || i == j && i < (n - 1) / 2 || i == j - 1 && i < (n - 1) / 2
                        || i + j == n - 1 && i < (n - 1) / 2 || i + j == n - 2 && i < (n - 1) / 2 || j == n - 1
                        || j == n - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == 1 || j == 0 || j == 1 || j == n - 1 || j == n - 2
                        || i == (n - 1) / 2
                        || i == (n - 3) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == 1 || i == j || i == j - 1 || j == n - 1 || j == n - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == 1 || j == 0 && i < (n - 1) / 2 || j == 1 && i < (n - 1) / 2 || i == (n - 1) / 2
                        || i == (n - 3) / 2 || j == n - 1 && i > (n - 1) / 2 || j == n - 3 && i > (n - 1) / 2
                        || i == n - 1 || i == n - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == 1 || i == (n - 1) / 2 || i == (n - 3) / 2 || j == n - 1 || j == n - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == 1 || i == n - 1 || i == n - 2 || j == n - 1 || j == n - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j == 6 && i > n - 3 || j == 5 && i > n - 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == 1 || j == 0 || j == 1 || i == n - 1 && j < (n - 1) / 2
                        || i == n - 2 && j < (n - 1) / 2
                        || j == (n - 1) / 2 && i >= (n - 1) / 2 || j == (n - 2) / 2 && i >= (n - 1) / 2
                        || i == (n - 1) / 2 && j >= (n - 1) / 2 || i == (n - 2) / 2 && j >= (n - 1) / 2
                        || j == n - 1 && i >= (n - 1) / 2 || j == n - 2 && i >= (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == 1 || i == n - 1 || i == n - 2 || j == n - 1 || j == n - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == 1 || i == 0 || i == 1 || j == n - 1 && i < (n - 1) / 2
                        || j == n - 2 && i < (n - 1) / 2 || i == (n - 1) / 2 || i == (n - 2) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == 1 || j == (n - 1) / 2 || j == (n - 2) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == 1 || j == 0 || j == 1 || j == n - 1 || j == n - 2
                        || i == (n - 1) / 2
                        || i == (n - 3) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
