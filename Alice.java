import cs1.*;
public class Alice {
    public static void main(String[] args) {
        System.out.print("enter p:");
        int p = Keyboard.readInt();
        System.out.print("enter g:");
        int g = Keyboard.readInt();
        System.out.print("enter a:");
        int a = Keyboard.readInt();
        int A = ((int)Math.pow(g,a))%p;
        System.out.println("A is " + A);
        System.out.print("enter B: " );
        int B = Keyboard.readInt();
        int s = ((int)Math.pow(B,a))%p;
        System.out.println("your shared secret is " + s);
    }
}