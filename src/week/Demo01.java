package week;

import homwork.Test;
import javafx.scene.Parent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo01 {
    /**
     * 编写一个方法，判断是奇数还是偶数
     * @param a
     * @return
     */
    public boolean Test01(int a){
        if (a%2==0)
            return true;
        return false;
    }

    /**
     * 判断是否是闰年
     * @param year
     * @return
     */
    public boolean Test02(int year){
        if(year%4==0 && year%100!=0){
            return true;
        }else if(year%400==0){
            return false;
        }
        return false;
    }

    /**
     * 编写一个可以求任意数阶乘的方法
     * @return
     */
    public long Test03(int chengji){
        long num = 1;
        for (int i = 1; i < chengji; i++) {
            num *= i;
        }
        return num;
    }

    /**
     * 实现求num的n次方
     * @param
     */
    public long Test04(long num,int n){
        long a = 1;
        for (int i = 1; i < n; i++) {
            a *=num;
        }
        return a;
    }

    /**
     * 计算num保留n为后的四舍五入结果
     *
     * @param num 原数据
     * @param n   保留四舍五入的位数
     * @return
     */
    public static double Test05(double num, int n) {

        int a = 1;
        for (int i = 0; i < n; i++) {
            a *= 10;
        }
        num = (int) (num * a + 0.5);
        num = num / a;

        return num;
    }

    /**
     * 判断传入的数字是否是质数？
     * @param n
     * @return
     */
    public boolean Test06(int n){
        if(n < 2){
            return false;
        }
        if(n == 2 || n == 3){
            return true;
        }else{
            int a = (int)Math.sqrt(n);
            for(int i = 2; i <= a ; i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * 判断手机号码是否是正确的？
     * @param phone
     * @return
     */
    public boolean Test07(String phone)
    {
        Pattern pattern = Pattern.compile("1[3-9][0-9]{9}");
        Matcher a = pattern.matcher(phone);
        boolean b = a.matches();
        return b;
    }

    /**
     * 判断身份证号码是否是正确的？
     * @param a
     * @return
     */
    public boolean Test08(String a)
    {
        Pattern pattern = Pattern.compile("/^[1-9]\\d{5}(18|19|20|(3\\d))\\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$/");
        Matcher m = pattern.matcher(a);
        boolean b = m.matches();
        return b;

    }
    public static void main(String[] args) {

    }
}
