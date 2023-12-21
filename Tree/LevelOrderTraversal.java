package Tree;
class Node1{
    int val;
    Tree.Node1 left=null;
    Tree.Node1
            right=null;
    Node1(int val){
        this.val=val;
    }
}
public class LevelOrderTraversal {
    public static void levelOrderTraversal(Node1 root) {
        int level = 1;
        while (printLevel(root, level)) {
            level++;
        }
    }
    public static boolean printLevel(Node1 root, int level) {
        if (root == null) {
            return false;
        }
        if (level == 1) {
            System.out.print(root.val + " ");
            return true;
        }
        boolean left = printLevel(root.left, level - 1);
        boolean right = printLevel(root.right, level - 1);
        return (left || right);
    }
        public static void main(String[] args) {
            Tree.Node1 root=new Tree.Node1(1);
            root.left=new Tree.Node1(2);
            root.right=new Tree.Node1(3);
            root.left.left=new Tree.Node1(4);
            root.left.right=new Tree.Node1(5);
            root.right.left=new Tree.Node1(6);
            root.right.right=new Tree.Node1(7);
            levelOrderTraversal(root);
        }

    }


