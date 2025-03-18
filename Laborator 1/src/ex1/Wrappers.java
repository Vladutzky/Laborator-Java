package ex1;

public class Wrappers {

    public static void main(String[] args) {

        // byte
        Byte byteValue = Byte.valueOf((byte)126);
        //  Byte byteValue = Byte.valueOf(126) -> error: incompatible types: int cannot be converted to byte
        System.out.println("byteValue = " + byteValue);


        // Boxing: converting a primitive type to a wrapper class

        // short
        Short shortValue = 32767;
        System.out.println("shortValue = " + shortValue);

        // int
        Integer intValue = 2147483647;
        System.out.println("intValue = " + intValue);

        // long
        Long longValue = 9223372036854775807L;
        System.out.println("longValue = " + longValue);

        // float
        Float floatValue = 3.4028235E38f;
        System.out.println("floatValue = " + floatValue);

        // double
        Double doubleValue = 1.7976931348623157E308;
        System.out.println("doubleValue = " + doubleValue);

        // char
        Character charValue = 'A';
        System.out.println("charValue = " + charValue);

        // boolean
        Boolean booleanValue = true;
        System.out.println("booleanValue = " + booleanValue);


        // Unboxing: converting a wrapper class to a primitive type
        int primitiveIntValue = intValue - 1;
        System.out.println("primitiveIntValue = " + primitiveIntValue);

        if (booleanValue) {
            System.out.println("booleanValue is true");
        }

        if (longValue == Long.MAX_VALUE) {
            System.out.println("longValue is equal to Long.MAX_VALUE");
        }

        if (intValue + floatValue < Float.MAX_VALUE) {
            System.out.println("intValue + floatValue is less than Float.MAX_VALUE");
        }
    }
}