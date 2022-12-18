package module;

/** Stack
 * là một kiểu danh sách tuyến tính 
 * hoạt động theo nguyên tắc "Vào sau ra trước – LIFO (Last In – First Out)" => PT thêm vào sau thì lấy ra trước
 * mọi hoạt động đều được thực hiện bởi con trỏ TOP
 *  + Top là vị trị của phần tử trên cùng của stack -> đỉnh của stack
 *  + khởi tạo stack cho Top bằng -1
 *      -> vì Top là vị trị của phần tử trên cùng của stack mà vị trí của mảng bắt đầu từ 0
 *      -> Top = -1 -> khi thêm phần tử đầu tiên vào -> Top = 0 -> vị trí của PT đầu tiên trong mảng
 */

public class Stack {
    private int top;
    private User arr[];
    private int MAX_SIZE;

    public Stack(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        this.arr = new User[MAX_SIZE];
        this.top = -1;
    }

    public boolean IsEmpty () {
        if (top == -1) {
            return true;
        } 
        return false;
    }

    public boolean IsFull () {
        if (top == MAX_SIZE - 1) {
            return true;
        }
        return false;
    }

    public void Push(User data) {
        if (IsFull()) {
            System.out.println("Stack is Full ...!");
        } else {
            arr[++top] = data;
        }
    }

    public User Peek() {
        if (IsEmpty()) {
            return null;
        } else {
            return arr[top];
        }
    }

    public User Pop() {
        if (IsEmpty()) {
            return null;
        } else {
            return arr[top--];
        }
    }

    public void DisPlay () {
        if (IsEmpty()) {
            System.out.println("Stack is empty ...!");
        } else {
            int temp = top;

            while (temp >= 0) {
                System.out.println(arr[temp].getName() + " | " +arr[temp].getPhone());
                temp --;
            }
        }
    }
}
