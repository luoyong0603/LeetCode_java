package code;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther luoyong
 * @date 2020/12/10 10:48
 */
public class 柠檬水找零860 {


    public static boolean lemonadeChange(int[] bills) {
        if (bills.length == 0) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(5, 0);
        map.put(10, 0);
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5){
                map.put(bills[i],map.get(bills[i])+1);
                continue;
            }
            if (bills[i] == 10){
                if (map.get(5)<1){
                    return false;
                }
                map.put(bills[i],map.get(bills[i])+1);//+10
                map.put(5,map.get(5)-1);//-5
                continue;
            }
            if (bills[i] == 20){
                //找零15  5+5+5||10+5
                if(map.get(10)>=1&map.get(5)>=1){
                    map.put(10,map.get(10)-1);//-10
                    map.put(5,map.get(5)-1);//-5
                    continue;
                }else if (map.get(5)>=3){
                    map.put(5,map.get(5)-3);//-5
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] l = new int[]{10,10};
        System.out.println(lemonadeChange(l));
    }

}
