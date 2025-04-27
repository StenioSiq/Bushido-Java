package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeException01 {
    public static void main(String[] args) {
        // Checked Unchecked

        // RuntimeException 99,9% de chance de ser erro humano no código!

        int [] nums = {1,2};
        System.out.println(nums[2]); // ArrayIndexOutOfBoundsException
    }
}
