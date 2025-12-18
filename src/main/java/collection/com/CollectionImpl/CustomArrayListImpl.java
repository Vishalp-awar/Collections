package collection.com.CollectionImpl;

import java.util.Arrays;

public class CustomArrayListImpl {

    private Object[] obj;
    private int index = 0;

    // public constructor
    public CustomArrayListImpl(int size) {
        obj = new Object[size];
    }

    // public default constructor
    public CustomArrayListImpl() {
        obj = new Object[5];
    }

    public void add(Object object) {
        if (index >= obj.length) {

            //  creating new size of array
            int newSize = obj.length + (obj.length / 2);

            //  creating new Object type array
            //            Object[] newArraylist = new Object[newSize];

            // Manually copying of array
            /*            for (int i = 0; i < obj.length; i++) {
                            newArraylist[i] = obj[i];
                        }
                        obj = newArraylist;
                    }

             */

            //  using Arrays copy method to copy array an array
            obj = Arrays.copyOf(obj, newSize);
        }
        obj[index] = object;
        index++;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < index; i++) {
            sb.append(obj[i]);
            if (i < index - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }

    public Object get(int index) throws Exception {

        if(index > obj.length || index < 0){
            throw new Exception("Index not Found");
        }
        return obj[index];
    }

}