import java.util.Arrays;

class ArrayReverse{
    void test(int[] numArray){
        System.out.println("Old array: "  + Arrays.toString(numArray));
        
        int[] newArray = new int[numArray.length];
        for(int i = 0, j = numArray.length - 1; i < numArray.length; i++, j--)
                newArray[i] = numArray[j];
        
        System.out.println("New array: "  + Arrays.toString(newArray));
    }
}