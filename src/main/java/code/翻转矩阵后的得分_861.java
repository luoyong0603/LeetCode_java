package code;

/**
 * @auther luoyong
 * @date 2020/12/08 16:15
 */
public class 翻转矩阵后的得分_861 {

    public static int matrixScore(int[][] A) {
        int hang = A.length;
        int lie = A[0].length;
        //1、先翻转第一列是0的行，0变成1  目的保证最高位为1；
        for (int i = 0; i < hang; i++) {
            //头位为1的直接跳过
            if (A[i][0] == 1) {
                continue;
            }
            //翻转该行
            for(int j=0;j<lie;j++){
                //0,1换值
                A[i][j] = A[i][j]^1;//二目运算符;同位为0；否则为1
            }
        }
        //2、然后保证让后几列的1尽量多；按列统计
        for (int j = 1; j < lie; j++) {
            int count = 0;//统计每一列的0个数
            for (int i = 0; i < hang; i++) {
                if (A[i][j] == 0) {
                    count++;
                }
            }
            //0的数量超过1，则该行0，1换值
            if (count > hang / 2) {
                for (int i = 0; i < hang; i++) {
                    A[i][j] = A[i][j]^1;//二目运算符;同位为0；否则为1
                }
            }
        }
        //二进制计算；
        int ans = 0;
        for (int z = 0; z < hang; z++) {
            for (int k = lie - 1; k >= 0; k--) {
                ans += (A[z][k] * Math.pow(2, lie - k - 1));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] l = new int[][]{{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}};
        System.out.println(matrixScore(l));

    }


}
