package SwapElements;

import java.util.Arrays;
import java.util.Collections;

public class SwapElements {
   public static void main(String[] args) {
       int[] elements = {1, 2, 3, 4, 5};

       int size = elements.length;

       int temp = elements[0];

       elements[0] = elements[size-1];

       elements[size-1] = temp;

       System.out.println(Arrays.toString(elements));
   }
}