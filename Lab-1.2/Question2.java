import java.util.Random;
import java.util.Scanner;
public class Question2{
	
    // NODE, nodo que sea el anteriro el siguiente y el valor que tendtra el nodo actual
    class Node {
        public Node prev;
        public Node next;
        public int value;
        public Node(int val) {
            this.value = val;
        }
    }
     
    // Nodo ocupa cabeza y cola para ver el siguiente y el anterior
    public Node head;
    public Node tail;
    private int size = 0;
   
     
    // Insertar nodo, si es null, hacer un nuevo nodo y ponerlo en la cabeza, si el que sigue es nulo ponerlo en la cola
   
    private void insertNode(Node nodeToInsertAfter, Node newNode) {
        Node tmpNode;
        if (nodeToInsertAfter == null) {
            this.head.prev = newNode;
            tmpNode  = this.head;
            this.head = newNode;
            this.head.next = tmpNode;
            if (this.size <= 1) {
                this.tail = tmpNode;
                this.tail.next = null;
            }
        } else if (nodeToInsertAfter.next == null) {
            newNode.prev = nodeToInsertAfter;
            nodeToInsertAfter.next = newNode;
            this.tail = newNode;
        } else {
            Node prevNode, nextNode;
            prevNode = nodeToInsertAfter;
            nextNode = nodeToInsertAfter.next;
            prevNode.next = newNode;
            newNode.prev = prevNode;
            newNode.next = nextNode;
            nextNode.prev = newNode;
        }
        this.size++;
    }
     
    //Encontra la posincion del nuevo nodo dependiendo del valor asignado
    private Node findNodeToInsertAfter(Node newNode) {
        Node curNode = this.head;
        if (newNode.value < curNode.value) {
            return null;
        }
        while(curNode.next != null) {
            if (newNode.value == curNode.value) {
                return curNode;
            }
            else if (newNode.value > curNode.value && newNode.value < curNode.next.value) {
                return curNode;
            }
            curNode = curNode.next;
        }
        return curNode;
    }
     
    // Tomar el valor que se da y crear un nodo, si es el primer nodo ponerlo en la head.
   
   
    public void insert(int value) {
        System.out.println("value: " + value);
        Node newNode = new Node(value);
        Node nodeToInsertAfter;
        if (this.head == null) {
            this.head = newNode;
            this.head.next = this.tail;
            this.size++;
        } else {
            nodeToInsertAfter = findNodeToInsertAfter(newNode);
            if (nodeToInsertAfter == null || nodeToInsertAfter.value != newNode.value) {
                insertNode(nodeToInsertAfter, newNode);
            }
 
            if (this.tail == null)System.out.println("tail is null when value is : " + value);
        }
    }
 
    public int getSize() {
        return this.size;
    }
     
    public void print() {
        Node curNode = this.head;
        while(curNode != null) {
            System.out.println(curNode.value);
            curNode = curNode.next;
        }
    }
    
    
    public static double median(int[] m) {
		Scanner cantidad = new Scanner(System.in);
		System.out.println("Number ");
		
		int input = cantidad.nextInt();
	    int middle = m.length/2;
	    if (m.length%2 == 1) {
	        return m[middle];
	    } else {
	        return (m[middle-1] + m[middle]) / 2.0;
	    }
	    
	}
    
   
    
 
     
    public static void main(String args[]) {
        Question2 ll = new Question2();
        Scanner in = new Scanner(System.in);
        int n = 0;
        String choice = in.next();
        //////////////////////////////////////////////////////////////
        while (n<1 )  {
        	System.out.println("Choice: Write add no add a number or median to get the list of the numbers ");
        	if (choice == ("add")) {
        		System.out.println("Enter a number: ");
        		n = in.nextInt();
        		ll.insert(n);
        		System.out.println(ll);
        	} else if (choice ==("median")) {
        		n++;
            	
            	}
        	}
        
    	
		//////////////////////////////////////////////////////////////
		
        ll.print();
        System.out.println("..........................");
       
        System.out.println("list size: " + ll.getSize());
    }
}
