package code;

/**
 * @auther luoyong
 * @date 2021/01/04 09:45
 */
public class 斐波那契数509 {

    public static int fib(int n) {
        //递归法
        // int ans = 0;
        // if(n == 0 || n == 1){
        //     return n;
        // }
        // return fib(n-1)+fib(n-2);

        //替换法
        int ans = 0;
        if (n == 0 || n == 1) {
            return n;
        }
        int num1 = 0;
        int num2 = 1;
        for (int i = 2; i <= n; i++) {
            ans = num1 + num2;
            //每次记录前两个数
            num1 = num2;
            num2 = ans;
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(fib(1));
    }

}
