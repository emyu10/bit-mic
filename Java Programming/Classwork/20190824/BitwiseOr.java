import java.util.*;

class BitwiseOr {
    public static void main(String[] args) {
        String[] a = {
            "0000",
            "0001",
            "0010",
            "0011",
            "0100",
            "0101",
            "0110",
            "0111",
            "1000",
            "1001",
            "1010",
            "1011",
            "1100",
            "1101",
            "1110",
            "1111"
        };

        int b = 3;
        int c = 6;
        int d = b | c;
        System.out.println(a[d]);
    }
}