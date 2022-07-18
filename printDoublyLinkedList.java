public class printDoublyLinkedList {
    private listnode head;
    private listnode tail;
    private int length;

    private static class listnode{
        private int data;
        private listnode previous;
        private listnode next;

        public listnode(int data){
            this.data = data;
        }
    }

    public printDoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public int length(){
        return length;
    }

    public void displayForward(){
        if(head == null){
            return;
        }
        listnode temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward(){
        if(head == null){
            return;
        }
        listnode temp = tail;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        printDoublyLinkedList s = new printDoublyLinkedList();
        listnode first = new listnode(3);
        listnode second = new listnode(30);
        listnode third = new listnode(34);
        listnode fourth = new listnode(35);
        s.head = first;
        s.tail = fourth;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.previous = third;
        third.previous = second;
        second.previous = first;

        s.displayForward();
        s.displayBackward();
    }
}
