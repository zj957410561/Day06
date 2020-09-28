package Stack;

/**
 * 自定义栈容器
 * 栈的底层是数组
 */
public class MyStack {
    private int top ;//栈顶的索引
    private int[] arr;

    public MyStack(){
        super();
        arr = new int[10];
    }
    public MyStack(int length)
    {
        super();
        if(length<2)
        {
            length = 10;
        }
        arr = new int[length];
    }
    public void push(int value)
    {
        arr[top++] = value;
    }

    public int pop(){
        return arr[--top];
    }
}
