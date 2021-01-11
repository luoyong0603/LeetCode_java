package code;

/**
 * @auther luoyong
 * @date 2020/12/11 16:38
 */
public class 汉明距离461 {
    public static int hammingDistance1(int x, int y) {
        int ans = 0;
        String s1 = Integer.toBinaryString(x);
        String s2 = Integer.toBinaryString(y);
        //补0
        if (s1.length() < s2.length()) {
            int l = s2.length() - s1.length();
            for (int i = 0; i < l; i++) {
                s1 = '0' + s1;
            }
        }
        if (s1.length() > s2.length()) {
            int l = s1.length() - s2.length();
            for (int i = 0; i < l; i++) {
                s2 = '0' + s2;
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                ans++;
            }
        }
        return ans;
    }

    public static int hammingDistance2(int x, int y) {
        return Integer.bitCount(x ^ y);//^异或运算，同位为0，不同位为1，bitCount()统计1的个数
    }


    public static void main(String[] args) {
        System.out.println(hammingDistance1(1501377268, 258791155));
        System.out.println(hammingDistance2(1501377268, 258791155));
    }

}
