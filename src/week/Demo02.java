package week;

public class Demo02 {
    public  static int[] a = new int[100];

    /**
     * 遍历
     */
    public void Test01()
    {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    // 赋值
    public void Test02()
    {
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
    }
    // 冒泡
    public void Test03(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++) {				//外循环只需要比较arr.length-1次就可以了
            for (int j = 0; j < arr.length - 1 - i; j++) {		//-1为了防止索引越界,-i为了提高效率
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // 扩容
    public void Test04(int c){
        int arr[] = new int[a.length+1];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        arr[a.length] = c;
    }

    //  交换数组中的元素
    public void Test05()
    {
        for (int i = 0; i < a.length; i++) {
            int temp;
            temp = a[i];
            a[i] = a[a.length - i];
           a[a.length - i] = temp;
        }
    }

    public static void main(String[] args) {

    }
}
