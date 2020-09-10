package datastructure.tree;

import java.util.List;

public class AllNodesDistanceKInBinaryTree {
    public static void main(String[] args) {
        AllNodesDistanceKInBinaryTree instance = new AllNodesDistanceKInBinaryTree();
        //root = [3,5,1,6,2,0,8,null,null,7,4]
        Integer[] treeNodes = {3, 5, 1, 6, 2, 0, 8, null, null, 7, 4};
        TreeNode tree = populateTree(treeNodes);


    }

    private static TreeNode populateTree(Integer[] treeNodes) {
        if (treeNodes.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(treeNodes[0]);
        int i = 1;

        while (i < treeNodes.length){

            int left = (2*i + 1);
            int right = (2*i + 2);
            if(left < treeNodes.length && treeNodes[left] !=null){
                TreeNode leftNode = new TreeNode(treeNodes[left]);
                root.left = leftNode;
            }
            if(right < treeNodes.length && treeNodes[right] !=null){
                TreeNode rightNode = new TreeNode((treeNodes[right]));
                root.right = rightNode;
            }
            i++;

        }
            return root;
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {

        return null;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
