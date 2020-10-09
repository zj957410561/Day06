package week;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo03 {
    /*
    2010年培养学员8万人，每年增长25%，请问按此增长速度，到哪 一年培训学员人数将达到20万人？
     */
    public void Test01(){
        float a = 8f;
        int b = 0;
        for (int i = 1; a < 20; i++) {
            a *= 1.25;
            b++;
        }
        System.out.println(b);
    }

    /**
     * 第一天存一元钱,第二天又存2元钱，第三天又存4元钱， 以后每天翻1倍,30天后存了多少钱？
     */
    public void Test02(){
        int a = 1;
        long sum = 0;
        for (int i = 1; i < 30; i++) {
            a = 2 * a;
            sum += a;
        }
    }

    @Test
    public void Test03()
    {
        int count=5;
        int count1=5;
        count=count+count++*5; //  5+5*5
        System.out.println(count);
        System.out.println((count1++)+(++count1)+(++count1)); // 5 + 7 + 8
    }
// 键盘输入一段文字，然后提示用户输入一个需要查找的字符，统计 这个字符在此字符串中出现的次数
    public void  Test06(String a,String arr){
        int b = 0;
        for (int i = 0; i < arr.length(); i++) {
            if(a.equals(arr.charAt(i)))
                b++;
        }

    }


    /**
     * 键盘输入一个数，打印出质因数分解的过程结果
     *
     * @param x
     */
    public static void Test07(int x) {
        int k = 2;
        System.out.print(x + "=");
        while (x >= k) {
            if (k == x) {
                System.out.print(x);
                break;
            } else if (x % k == 0) {
                System.out.print(k + "*");
                x = x / k;
            } else
                k++;
        }

    }

    /**
     * 十进制转二进制
     *
     * @param num
     */
    public static void Test08(int num) {
        int t = 0;
        int x = 0;
        while (num != 0) {
            x += (num % 2) * Math.pow(10, t);
            num = num / 2;
            t++;

        }
        System.out.println(x);
    }

    /**
     * 键盘输入一个数判断是否是质数（素数）
     */
    public static boolean Test09(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;

    }
    /**
     * 判断一个数是否是回文数 aba abba 100001 人人为我，我 为人人
     *
     * @param a
     */
    public static void Test09(String a) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = a.length() - 1; i >= 0; i--) {
            stringBuffer.append(a.charAt(i));
        }
        if (a.equals(stringBuffer.toString()))
            System.out.println("是回文数");
        else
            System.out.println("不是");
        System.out.println(a);
        System.out.println(stringBuffer.toString());

    }
    /**
     * 判断手机号码是否是正确的？
     * @param phone
     * @return
     */
    public boolean Test10(String phone)
    {
        Pattern pattern = Pattern.compile("1[3-9][0-9]{9}");
        Matcher a = pattern.matcher(phone);
        boolean b = a.matches();
        return b;
    }

    /**
     * 产生一个四位数的随机验证码，数字，字母组成
     */
    @Test
    public void Test11()
    {
        ArrayList<Object> array;
        array = new ArrayList<Object>();
        Random rand =new Random();
        for(int i=0;i<4;i++){
            int choice=rand.nextInt(3);
            switch (choice) {
                case 0:
                    int num=rand.nextInt(9);
                    array.add(num);
                    break;
                case 1:
                    int num2=rand.nextInt(25)+65;
                    char low=(char)num2;
                    array.add(low);
                    break;
                case 2:
                    int num3=rand.nextInt(25)+97;
                    char high=(char)num3;
                    array.add(high);
                    break;
                default:
                    break;
            }
        }
        for (Object object : array) {
            System.out.print(object);
        }


    }
    /**
     * 计算num保留n为后的四舍五入结果
     *
     * @param num 原数据
     * @param n   保留四舍五入的位数
     * @return
     */
    public static double Test11(double num, int n) {

        int a = 1;
        for (int i = 0; i < n; i++) {
            a *= 10;
        }
        num = (int) (num * a + 0.5);
        num = num / a;

        return num;
    }

    /**
     * 编写一个方法可以求任意数阶乘
     */
    public static long Test12(int a) {
        if (a <= 0)
            return -1;
        long x = 1L;
        for (int i = 1; i <= a; i++) {
            x *= i;
        }
        return x;

    }



    public static void main(String[] args) {

    }
}
