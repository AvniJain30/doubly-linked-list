public class insertAtLast {
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

    public insertAtLast(){
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

    public boolean isEmpty(){
        return length == 0;
    }

    public void insertLast(int data){
        listnode n = new listnode(data);
        if(isEmpty()){
            head = n;
        }
        else{
            tail.next = n;
            n.previous = tail;
        }
        tail = n;
        length++;
    }

    public static void main(String[] args){
        insertAtLast s = new insertAtLast();
        s.insertLast(3);
        s.insertLast(30);
        s.displayForward();
    }
}
