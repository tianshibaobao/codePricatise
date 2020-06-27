package algorithm;

/**
 * @author ：ikaros
 * @date ：Created in 2020/6/27 12:17
 * @description：强密码检测器
 * @email:478308676@qq.com
 * @modified By：
 * @version: $
 */

/*
*难度困难36收藏分享切换为英文关注反馈一个强密码应满足以下所有条件：
	由至少6个，至多20个字符组成。
	至少包含一个小写字母，一个大写字母，和一个数字。
	同一字符不能连续出现三次 (比如 "...aaa..." 是不允许的, 但是 "...aa...a..." 是可以的)。
编写函数 strongPasswordChecker(s)，s 代表输入字符串，如果 s 已经符合强密码条件，则返回0；否则返回要将 s 修改为满足强密码条件的字符串所需要进行修改的最小步数。
插入、删除、替换任一字符都算作一次修改。
* */
public class StrongPasswordVerifier {
    public static void main (String args[]){
        new StrongPasswordVerifier().strongPasswordChecker("Z2adjytjeyzyyu5e6xtjtaasdgdaa");
    }
    public int strongPasswordChecker(String s) {
        boolean numExsit=false;
        boolean bigChaExsit=false;
        boolean smallChaExsit=false;
        boolean threeRegular=true;
        boolean length=false;
        int[] flag=new int[s.length()];
        char[] sGroup=s.toCharArray();
        if(s.length()>=6&&s.length()<=20){
            length=true ;
        }
        TemQueue temQueue=new TemQueue();
        for (int i=0;i<sGroup.length;i++){
            if((int)sGroup[i]>=(int)'a'&&(int)sGroup[i]<=(int)'z'){
                smallChaExsit=true;
            }else if((int)sGroup[i]>=(int)'A'&&(int)sGroup[i]<=(int)'Z'){
                bigChaExsit=true;
            }else if((int)sGroup[i]>=(int)'0'&&(int)sGroup[i]<=(int)'9'){
                numExsit=true;
            }
        if (temQueue.add(sGroup[i]))
            threeRegular=false;
        }
        System.out.println(numExsit);
        System.out.println(bigChaExsit);
        System.out.println(smallChaExsit);
        System.out.println(threeRegular);
        System.out.println(length);

        return 0;
    }

    class TemQueue{
        char[] tmp=new char[3];
        public boolean add(char ch){
            tmp[0]=tmp[1];
            tmp[1]=tmp[2];
            tmp[2]=ch;
            return tmp[0]==tmp[1]&&tmp[1]==tmp[2];
        }
    }
}
