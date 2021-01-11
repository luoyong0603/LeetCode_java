package code;

/**
 * @auther luoyong
 * @date 2021/01/01 19:23
 */
public class 种花问题605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        if (flowerbed.length == 0) {
            return false;
        }
        if (flowerbed.length == 1) {
            if (flowerbed[0] == 0) {
                return true;
            }
            return false;
        }
        if (flowerbed.length == 2) {
            if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                return true;
            }
            return false;
        }
        //处理开头 0、0、1...
        if (flowerbed[0] == 0 && flowerbed[1] == 0 && flowerbed[2] == 1) {
            n--;
        }
        //处理结尾 1、0、0...
        if (flowerbed[flowerbed.length - 3] == 1 && flowerbed[flowerbed.length - 2] == 0 && flowerbed[flowerbed.length - 1] == 0) {
            n--;
        }
        //找连续三个零
        for (int i = 0; i < flowerbed.length; i++) {
            //放在循环里头判断，处理
            if (n <= 0) {
                return true;
            }
            //临界跳出
            if (i + 2 == flowerbed.length) {
                break;
            }
            if (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i + 2] == 0) {
                n--;
                i += 1;
                continue;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] l = new int[]{1, 0, 0, 0,0};
        int n = 2;
        System.out.println(canPlaceFlowers(l, n));
    }


}
