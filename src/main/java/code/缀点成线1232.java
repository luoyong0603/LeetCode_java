package code;

/**
 * @author LuoYong
 * @date 2021/1/17 21:56
 */
public class 缀点成线1232 {


    public static boolean checkStraightLine(int[][] coordinates) {

        //防止除0 ；即不用判断斜率公式 (y3-y2) / (x3-x2)  ?= (y2-y1) / (x2-x1)
        // 所以改成乘法判断(y3-y2)*(x2-x1) ?=(y2-y1)* (x3-x2) 即可
        for (int i = 1; i < coordinates.length - 1; i++) {
            //判断k1 ！=k2 即可
            int x1 = coordinates[i][0] - coordinates[i - 1][0];
            int y1 = coordinates[i][1] - coordinates[i - 1][1];
            int x2 = coordinates[i + 1][0] - coordinates[i][0];
            int y2 = coordinates[i + 1][1] - coordinates[i][1];
            if (y1 * x2 != y2 * x1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[][] l1 = new int[][]{{0, 0}, {0, 1}, {0, -1}};
        int[][] l2 = new int[][]{{1, 0}, {2, 0}, {-1, 0}};
        int[][] l3 = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        int[][] l4 = new int[][]{{2, 1}, {4, 2}, {6, 3}};
        System.out.println(checkStraightLine(l3));
    }

}
