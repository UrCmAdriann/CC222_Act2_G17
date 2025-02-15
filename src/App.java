import java.util.ArrayList;
import java.util.Scanner;

public class App {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                StudentArray studentArray = new StudentArray();
                SinglyLinkedList studentLinkedList = new SinglyLinkedList();

                while (true){
                    System.out.println("enter number:");
                    int number = scanner.nextInt();

                    System.out.println("operations:");
                    System.out.println("1. insert to array");
                    System.out.println("2. insert to linked list");
                    int choice = scanner.nextInt();

                    if (choice ==1){
                        studentArray.insert(number);
                        System.out.println("after insection:" + studentArray);
                    } else if ( choice == 2){
                        System.out.println("options");
                        System.out.println("1. insert at beginning");
                        System.out.println("2. insert at end");
                        int insertChoice = scanner.nextInt();

                    if (insertChoice == 1) {
                        studentLinkedList.insertAtBeginning(number);
                    }else{
                        studentLinkedList.insertAtEnd(number);
                    }   
                    System.out.println("after insertion");
                    studentLinkedList.display();
                    }

                    System.out.println("options:");
                    System.out.println("1. enter value");
                    System.out.println("2. end");
                    int nextChoice = scanner.nextInt();

                    if (nextChoice == 2) break;
                }
                scanner.close();
            }
        }
        
        class StudentArray{
            private ArrayList<Integer> studentList;

            public StudentArray(){
            studentList = new ArrayList<>();    
            }
            public void insert(int number){
                studentList.add(number);
            }
            @Override
            public String toString(){
                return studentList.toString();
            }
        }

        class SinglyLinkedList{
            private Node head;

            public void insertAtBeginning(int data){
                Node newNode = new Node(data);
                newNode.next = head;
                head = newNode;
            }
            public void insertAtEnd(int data){
                Node newNode = new Node(data);
                if (head == null){
                    head = newNode;
                    return;
                }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
        }
        temp.next = newNode;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
    class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        
