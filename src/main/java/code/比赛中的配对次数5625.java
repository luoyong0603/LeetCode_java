package code;

/**
 * @auther luoyong
 * @date 2020/12/13 10:35
 */
public class 比赛中的配对次数5625 {

    private static int ans = 0;

    public static int numberOfMatches(int n) {
        if(n == 1){
            return ans;
        }
        if (n % 2 == 0) {
            ans += n / 2;
            return numberOfMatches(n / 2);
        } else {
            ans += (n - 1) / 2;
            return numberOfMatches((n - 1) / 2+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(numberOfMatches(7));
    }

}
