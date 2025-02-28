import java.util.Scanner;

public class ReturnsString {
    public static void main(String[] args) {
        int[] nums = getNum();
        System.out.println(sum1(nums[0], nums[1]));
    }

    static int[] getNum() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[2];  
        nums[0] = scanner.nextInt();  
        nums[1] = scanner.nextInt();  
        return nums;  
    }

    static int sum1(int num1, int num2) {
        return num1 + num2; 
    }
}






