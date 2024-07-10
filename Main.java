import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer value");
        int value = s.nextInt();
        System.out.println("Before method: " + value);
        increment(value);
        System.out.println("After method: " + value);
    }

    public static void increment(int value){
        value++;
        System.out.println("Inside method: " + value);
    }
}
