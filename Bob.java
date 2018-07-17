import cs1.*;
public class Bob {
    public static void main(String[] args) {
        System.out.print("enter p:");
        int p = Keyboard.readInt();
        System.out.print("enter g:");
        int g = Keyboard.readInt();
        System.out.print("enter b:");
        int b = Keyboard.readInt();
        int B = ((int)Math.pow(g,b))%p;
        System.out.println("B is " + B);
        System.out.print("enter A: ");
        int A = Keyboard.readInt();
        int s = ((int)Math.pow(A,b))%p;
        System.out.println("your shared secret is " + s);
    }   
}