
import java.util.Scanner;

class Stack {
    private int stk[] = new int[10];
    private int top = -1;
    private Scanner scanner = new Scanner(System.in);

    public void push() {
        if (top == 9) {
            System.out.println("\nStack overflow");
            return;
        }
        top++;
        System.out.println("\nEnter data to push:");
        stk[top] = scanner.nextInt();
    }

    public void pop() {
        if (top == -1) {
            System.out.println("\nStack underflow");
            return;
        }
        System.out.println("\nPopped data=" + stk[top]);
        top--;
    }

    public void display() {
        if (top == -1) {
            System.out.println("\nStack underflow");
            return;
        }
        System.out.println("\nStack elements are:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stk[i]);
        }
    }
}

class StackData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        int ch;

        while (true) {
            System.out.println("____________________________");
            System.out.println("Welcome to Stack Operation");
            System.out.println("___________________________");
            System.out.println("Press 1 for push operation");
            System.out.println("Press 2 for push operation");
            System.out.println("Press 3 for push operation");
            System.out.println("Press 4 for push operation");
            System.out.println("Enter your choice:");
            ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    stack.push();
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("\nWrong choice");
            }
        }
    }
}