package src;

/**
 * Test
 */
public class Solution {
    public static void main(String[] args) {
        String a = "1111";
        String b = "1111";

        int aa = Integer.parseInt(a,2) + Integer.parseInt(b,2);

        String ss = Integer.toString(aa,2);

        System.out.println(ss);
    }
}