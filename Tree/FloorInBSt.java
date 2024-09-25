package Tree;

public class FloorInBSt {
    int data;
    FloorInBSt left;
    FloorInBSt right;

    FloorInBSt(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static int find(FloorInBSt root, int key){
        int floor = -1;
        while(root != null){
            if(root.data == key){
                floor = root.data;
                return floor;
            }
            if(key > root.data){
                floor = root.data;
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return floor;
    }

    public static void main(String[] args) {
        // Creating a sample BST
        FloorInBSt root = new FloorInBSt(8);
        root.left = new FloorInBSt(4);
        root.right = new FloorInBSt(12);
        root.left.left = new FloorInBSt(2);
        root.left.right = new FloorInBSt(6);
        root.right.left = new FloorInBSt(10);
        root.right.right = new FloorInBSt(14);

        int key = 5;
        int floor = find(root, key);
        System.out.println("Floor value of " + key + " is: " + floor);
    }
}
