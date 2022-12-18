package Main;

import module.Queue;
import module.User;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(100);
        
        for (int i = 1; i <= 5; i++) {
            String name = "VAN HIEN " + i;
            String phone = "032xxx11" + i;

            User user = new User(name, phone);
            queue.Enqueue(user);
        }

        System.out.println("\nNumber of users inserted: "+queue.Size());

        System.out.println("\nQueue is Empty: "+queue.isEmpty());

        System.out.println("\n===== List users =====");

        for (int i = 1; i <= 5; i++) {
            User user = queue.Dequeue();
            if (user != null) {
                System.out.println(user.getName() +" | "+user.getPhone());
            }
        }

        System.out.println("\nQueue is Empty: "+queue.isEmpty());
    }
}