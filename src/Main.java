public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        int [] num = new int[] {1, 2, 3};
        float [] nums = {1.57f, 7.654f, 9.986f};
        int [] ais = {5, 6, 45};

            System.out.println("task2");
            System.out.print(num[0] + ", " + num[1] + ", " + num[2]);
        System.out.println();
            System.out.print(nums[0] + ", " + nums[1] + ", " + nums[2]);
        System.out.println();
            System.out.print(ais[0] + ", " + ais[1] + ", " + ais[2]);
        System.out.println();

            System.out.println("task3");
            System.out.print(num[2] + ", " + num[1] + ", " + num[0]);
        System.out.println();
            System.out.print(nums[2] + ", " + nums[1] + ", " + nums[0]);
        System.out.println();
            System.out.print(ais[2] + ", " + ais[1] + ", " + ais[0]);
        System.out.println();

        System.out.println("task4");
        for (int i = 0; i < num.length; i++)
            if (i % 2 != 0) System.out.print(num[i] + " ");
            else System.out.print(num[i]+1 + " ");
    }
}