package algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author ：ikaros
 * @date ：Created in 2020/9/13 10:07
 * @description：
 * @email:478308676@qq.com
 * @modified By：
 * @version: $
 */
public class SubStringFind {
    public static void main(String[] args){
        System.out.println(new SubStringFind().hasAllCodes("00110",2));
//        System.out.println(Integer.parseInt("10110111",2));
    }

        public boolean hasAllCodes(String s, int k) {
            int[] groups=new int[(int)Math.pow(2,k)];
            for(int i=0;i<=s.length()-k;i++){
                groups[(int)Integer.parseInt(s.substring(i,i+k),2)]=1;
            }
        for(int i:groups){
            if(i!=1)
                return false;
        }
        return true;
        }

}
