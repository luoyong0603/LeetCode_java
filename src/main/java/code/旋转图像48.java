package code;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther luoyong
 * @date 2020/12/19 13:55
 */

/*
* 给定一个 n × n 的二维矩阵表示一个图像。
将图像顺时针旋转 90 度。
说明：你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
*
* */
public class 旋转图像48 {

    //顺序遍历 · 拷贝
    public static void rotate(int[][] matrix) {
        //数组暂存
        int[][] tempList = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                tempList[i][j] = matrix[matrix.length - 1 - j][i];
            }
        }
        //数组复制
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = tempList[i][j];
            }
        }
    }

    //层次遍历 · 旋转
    public static void rotate1(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[][] l = new int[][]{
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        rotate(l);
    }


}
