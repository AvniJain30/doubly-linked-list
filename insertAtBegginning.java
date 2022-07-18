public class insertAtBegginning {
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

    public insertAtBegginning(){
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

    public void insertFirst(int data){
        listnode n = new listnode(data);
        if(isEmpty()){
            tail = n;
        }
        else{
            head.previous = n;
        }
        n.next = head;
        head = n;
        length++;
    }

    public static void main(String[] args){
        insertAtBegginning s = new insertAtBegginning();
        s.insertFirst(2);
        s.insertFirst(15);
        s.displayForward();
    }
}
