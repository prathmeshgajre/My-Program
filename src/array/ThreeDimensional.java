package array;

public class ThreeDimensional {
    public static void main(String[] args) {

        String[] department = {"Electronics","CS","IT"};
        int dept, st, sc, total = 0;
        double perc = 0;

        int[][][] scores = {
                {{75, 87, 69}, {90, 87, 85},{56, 67, 76}},
                {{78, 67, 75}, {87, 98, 76}, {67, 56, 66}},
                {{72, 63, 72}, {82, 91, 71}, {64, 56, 66}}
        };

        for(dept = 0; dept < 3; dept++){
            for (int i = 0; i < 3; i++){
                System.out.println("Department " +department[i] + ": ");
                for (st = 0; st < 3; st++){
                    System.out.println("Student" + (st + 1)+ " scores: ");
                    for (sc = 0; sc < 3; sc++){
                        System.out.print(scores[dept][sc][st]+ " ");
                        total += scores[dept][sc][st];
                        perc = (double) total/3;
                    }
                    System.out.println("\nTotal scores: " +total);
                    System.out.println("Percentage: " +perc);
                    total = 0;
                }
                System.out.println();
            }
            break;
        }
    }
}
