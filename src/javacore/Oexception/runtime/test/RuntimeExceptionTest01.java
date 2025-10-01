package javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    //checked e unchecked
    public static void main(String[] args) {
        Object [] nums = {1, 2};
        System.out.println(nums[2]); //ArrayIndexOutOfBoundsException
    }


}
