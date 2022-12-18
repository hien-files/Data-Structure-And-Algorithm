package module;

/** Queue
 * là kiểu danh sách tuyến tính 
 * hoạt động theo nguyên tắc "Vào trước – ra trước (First In – First Out)" -> phần tử đc thêm vào trước thì lấy ra trước
 * rear: quản lý cuối danh sách -> thêm phần tử vào đc thực hiện bởi rear
 * front: quản lý ở đầu danh sách -> loại bỏ phần tử vào đc thực hiện bởi front
 */

public class Queue {
    private int front;
    private int rear;
    private int MAX_SIZE;
    private User arr[];

    public Queue(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        front = -1;
        rear = -1;
        arr = new User[MAX_SIZE];
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (front == 0 && rear == MAX_SIZE - 1) {
            return true;
        }
        return false;
    }

    public void Enqueue(User data) {
        if (isFull()) {
            System.out.println("Queue is full ...!");
        }else {
            if (rear < MAX_SIZE-1) {
                arr[++rear] = data;
                
                if (front == -1) {
                    front = 0;
                }
            }
        }
    }

    public User Dequeue() {
        if (isEmpty()) {
            return null;
        }else {
            if (front >= rear) {
                // nêu front == rear thì trả về phần tử cuối và reset queue
                int temp = front;
                front = rear = -1;
                return arr[temp];
            }else {
                return arr[front++];
            }
        }
    }

    public User Peek() {
        if (isEmpty()) {
            return null;
        }else {
            return arr[rear];
        }
    }

    public int Size() {
        if (isEmpty()) {
            return 0;
        }else {
            return rear - front + 1;
        }
    }

    public void Display() {
        if (isEmpty()) {
            System.out.println("Queue is empty ...!");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(arr[i].getName() + " | " + arr[i].getPhone());
            }
        }
    }
}