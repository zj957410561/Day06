package MyList;

public class MyList {
    private int size;
    private Object[] elementData;

  /*  public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getElementData() {
        return elementData;
    }

    public void setElementData(Object[] elementData) {
        this.elementData = elementData;
    }*/

    public MyList() {
        super();
        elementData = new Object[10];
        size = 10;
    }

    public MyList(int size) {
        if (size < 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.size = size;
        elementData = new Object[size];
    }

    /**
     * 返回长度
     */
    public int size() {
        return this.size;
    }

    /**
     * 判断是否为空
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * 返回指定位置额元素
     */
    public Object getElement(int index) {
        if (index < 0 || index > size - 1) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return elementData[index];
    }

    /**
     * 返回指定元素的位置
     */
    public int getIndex(Object o) {
        int i = 0;
        for (Object a : elementData
        ) {
            if (a.equals(o)) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    /**
     * 判断是否包含
     *
     * @param o
     * @return
     */
    public boolean contains(Object o) {
        for (Object a : elementData
        ) {
            if (a.equals(o))
                return true;
        }
        return false;
    }

    /**
     * 添加数组
     *
     * @param o
     * @return
     */
    public boolean add(Object o, int index) {
        while (index > size - 1) {
            reSize();
        }
        elementData[size - 1] = o;
        return true;
    }

    /**
     * 删除index处的元素
     *
     * @param index
     * @return
     */
    public Object remove(int index) {
        isOutIndex(index);
        Object[] objects = new Object[size - 1];
        Object item = elementData[index];
        for (int i = size - 1; i > 0; i++) {
            if (i > index)
                objects[i - 1] = elementData[i];
            else if (i < index)
                objects[i - 1] = elementData[i - 1];
        }
        elementData = objects;
        return item;
    }

    /**
     * 扩容
     */
    private void reSize() {
        Object[] objects = new Object[size + 1];
        for (int i = 0; i < size - 1; i++) {
            objects[i] = elementData[i];
        }
        elementData = objects;
        size++;
    }

    /**
     * 判断是否越界
     *
     * @param index
     */
    private void isOutIndex(int index) {
        if (index < 0 || index > size - 1) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
