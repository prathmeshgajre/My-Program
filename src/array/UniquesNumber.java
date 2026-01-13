package array;

public class UniquesNumber {
    static void main() {

        int[] a1 = {1, 3, 5};
        int[] a2 = {3, 7, 1};
        int[] a3 = {5, 9, 3};

        int[] u = new int[a1.length + a2.length + a3.length];
        int k = 0;

        int[][] all = {a1, a2, a3};

        for (int i = 0; i < all.length; i++) {
            for (int j = 0; j < all[i].length; j++) {

                boolean found = false;
                for (int x = 0; x < k; x++)
                    if (u[x] == all[i][j]) { found = true; break; }

                if (!found) u[k++] = all[i][j];
            }
        }

        for (int i = 0; i < k; i++)
            System.out.print(u[i] + " ");
    }
}
