package Main;

import module.Stack;
import module.User;

public class Main {
    public static void main(String[] args) {
        int MAX_SIZE = 3;
        Stack stack = new Stack(MAX_SIZE);

        for (int i = 1; i <= 5; i++) {
            String name = "Văn Hiền" + i;
            String phone = "032xxxx72" + i;

            User user = new User(name, phone);
            stack.Push(user);
        }

        // kiểu tra stack
        System.out.println("\nStack is Full: "+stack.IsFull());
        System.out.println("\nStack is empty: "+stack.IsEmpty());

        // Hiển thị stack
        System.out.println("\n==== StacK DisPlay ====\n");
        stack.DisPlay();

        System.out.println("\n==== StacK POP ====\n");
        for (int i = 0; i < 5; i++) {
            User user = stack.Pop();
            if (user != null) {
                System.out.println(user.getName() + " | " +user.getPhone());
            }
        }

        // kiểu tra stack
        System.out.println("\nStack is Full: "+stack.IsFull());
        System.out.println("\nStack is empty: "+stack.IsEmpty());
    }
}
