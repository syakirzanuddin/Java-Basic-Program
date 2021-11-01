import java.util.Scanner; 

public class TreeNodeTest {
    
    public class TreeNode{
        int data; //store information inside node
        TreeNode left; //datatype treenode
        TreeNode right;
        TreeNode(int data)
        { //constructor, initialize member
        
            this.data = data; //initialize data
            this.left=this.right=null; //initialize both node is empty
        } 
    }
    
    TreeNode root; //declare
    
    TreeNodeTest()
    {
        root=null; //for the first time, the root is null
    } 
    
    
    public TreeNode insert(TreeNode root, int dataToBeInserted) //insert method/operation, insert method
    {//parse two parameter
        if(root == null){ //if root empty
            root = new TreeNode(dataToBeInserted); //parsing parameter
            return root;
        }
        if(root.data > dataToBeInserted){
            root.left = insert(root.left, dataToBeInserted); //if inserted value smaller than root, consider left child
        }else if(root.data < dataToBeInserted){
            root.right = insert(root.right, dataToBeInserted); //if inserted value greater than root, consider right child
        }
        return root;
    }
    
    public TreeNode search(TreeNode root, int dataToBeSearched){
        if(root == null || root.data==dataToBeSearched) //check if there is a nodes or not
        return root;
        
        if(root.data > dataToBeSearched){
        return search(root.left, dataToBeSearched); //call search method recursively, if search value smaller than root, search on the left
        }else{
            return search(root.right, dataToBeSearched);//call search method recursively, if search value greater than root, search on the right
        }
    }
    
    public void inOrder(TreeNode root) //inorder traversal
    {
        if(root == null)
        return; 
        inOrder(root.left); //parse argument 
        System.out.print(root.data + " "); //SOP in the middle
        inOrder(root.right);
    }
    
    public void preOrder(TreeNode root) //inorder traversal
    {
        if(root == null)
        return; 
        System.out.print(root.data + " "); //SOP at the beginning
        inOrder(root.left); //parse argument 
        inOrder(root.right);
    }
    public void postOrder(TreeNode root) //inorder traversal
    {
        if(root == null)
        return; 
        inOrder(root.left); //parse argument 
        inOrder(root.right);
        System.out.print(root.data + " "); //SOP at last
    }
    
    public void insertIntoTree(int dataToBeInserted)
    {
        root = insert(root, dataToBeInserted); //insert method called inside the wrapper method(insertIntoTree)
    }
    
    public TreeNode searchTree(int dataToBeSearched)
    {
        return search(root, dataToBeSearched); //searchTree(wrapper method) call search method
    }
    
    public void inOrderTraversal()
    {
        inOrder(root); //inOrderTraversal(wrapper method) call insert method
    }
    
    public void preOrderTraversal()
    {
        preOrder(root); //preOrderTraversal(wrapper method) call insert method
    }
    
    public void postOrderTraversal()
    {
        postOrder(root); //postOrderTraversal(wrapper method) call insert method
    }
    
    
    public static void main(String[] args)
    {
      TreeNodeTest tnt = new TreeNodeTest();
      int n, num;
      Scanner sc = new Scanner(System.in); //get input from user
      System.out.println("Enter how many number to be input");
      n = sc.nextInt(); // value to be inserted into binary search tree
      System.out.print("Enter "+n+" numbers: ");
      for(int i=0; i<n; i++) //continously taking input from user
      {
          num = sc.nextInt();
          tnt.insertIntoTree(num); //insert value entered by user into tree
      }
      System.out.println("Congratulations!! tree insertion is done");
      System.out.println("\nEnter number to be searched: ");
      n = sc.nextInt();
      if(tnt.searchTree(n) != null) { //check the number exist or not
          System.out.println("Number found");
      }else{
          System.out.println("Number not found");
      }
      
      System.out.print("\nBinary search tree InOrder: ");
      tnt.inOrderTraversal(); //print tree int the inorder method
      
      System.out.print("\nBinary search tree preOrder: ");
      tnt.preOrderTraversal(); //print tree int the preorder method
      
      System.out.print("\nBinary search tree postOrder: ");
      tnt.postOrderTraversal(); //print tree int the postorder method
      
    }
}

