package org.example.hw.generics.maxval;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 4, -2, -6, 5, 8, 1, -2, 8, 3};
        Byte[] byteArray = {2, 4, 1, -2, 5, 1, 0};
        Long[] longArray = {1L, 3L, 2L, 10L, 3L};

        System.out.println("Max Value: " + getMaxValue(intArray));
        System.out.println("Max Value: " + getMaxValue(byteArray));
        System.out.println("Max Value: " + getMaxValue(longArray));

        Double[] doubleArray = {1.0, 2.5, 2.2, 2.5, 1.3};
        System.out.println("Max Value: " + getMaxValue2(doubleArray));

        Float[] floatArray = {1.0f, 2.5f, 2.2f, 4.1f, 3.4f};
        System.out.println("Max Value: " + getMaxValue2(floatArray));

    }

    public static <S extends Number > Long getMaxValue(S[] numberArray) {
        long maxVal = 0L;
        for (S s1 : numberArray){
            if (s1.longValue() > maxVal) maxVal = s1.longValue();
        }
        return maxVal;
    }

    public static <S extends Number > Double getMaxValue2(S[] numberArray) {
        double maxVal = 0L;
        for (S s1 : numberArray){
            if (s1.doubleValue() > maxVal) maxVal = s1.doubleValue();
        }
        return maxVal;
    }
}
