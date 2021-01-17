package code;

/**
 * @author LuoYong
 * @date 2021/1/17 21:56
 */
public class 缀点成线1232 {


    public static boolean checkStraightLine(int[][] coordinates) {

        //防止除0 ；所以判断(y1-y0)*(xi-x0)==(x1-x0)*(yi-y0)  x1 * y2 - y1 * x2 ！=0
//        int minus = (coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);
        int minus = (coordinates[1][1] * coordinates[0][1]) - (coordinates[1][0] - coordinates[0][0]);
        int l = coordinates.length - 1;
        for (int i = 1; i < coordinates.length; i++) {
            //判断是否都在同一横坐标上；
            if (coordinates[i - 1][0] == coordinates[i][0]) {
                l--;
                continue;
            }
            //判断是否都在同一纵坐标上
            if (coordinates[i - 1][1] == coordinates[i][1]) {
                l--;
                continue;
            }
            //判断斜线 斜率是否相等
            if ((coordinates[i][0] * coordinates[i - 1][1]) - (coordinates[i - 1][0] * coordinates[i][1]) == 0) {
                l--;
            }
        }
        if (l != 0) {
            return false;
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
