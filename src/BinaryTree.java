public class BinaryTree {

    Node root;

    public BinaryTree(){
        root = null;
    }

    void printLevelOrder(){

        int h = getHeight(root, 1);

        for (int i = 0; i < h; i++){
            printLevel(root, i);
        }
    }

    int getHeight(Node root, int cur){
        //System.out.println("getHeight");
        if (root == null) {return cur;}

        else {
            cur++;
            int rh = getHeight(root.right, cur);
            int lh = getHeight(root.left, cur);
            //System.out.println(rh + " " + lh);
            return Math.max(rh, lh);
        }

    }

    void printLevel(Node root, int lvl){
        if (root == null) return;

        if (lvl == 1)
            System.out.print(root.value);
        else if (lvl > 1){
            printLevel(root.left, lvl-1);
            printLevel(root.right, lvl-1);
        }
    }

}
