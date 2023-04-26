public class Tester {
    public static void main(String[] args)
    {

        System.out.println(Result.findModeCount(15, 8, "2"));
        System.out.println("Expected: 9\n");

        System.out.println(Result.findModeCount(25, 2, "1111011"));
        System.out.println("Expected: 105\n");

        System.out.println(Result.findModeCount(20, 12, "9AB"));
        System.out.println("Expected: 14\n");

        System.out.println(Result.findModeCount(10, 16, "ABCDEF"));
        System.out.println("Expected: 10\n");
        
        System.out.println(Result.findModeCount(1000, 2, "1"));
        System.out.println("Expected: 4938\n");

    }
}
