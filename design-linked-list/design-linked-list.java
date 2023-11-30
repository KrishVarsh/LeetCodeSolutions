class Node{
    int val;
    Node next;
    public Node(int val){
        this.val=val;
        this.next=null;
    }
}
class MyLinkedList {
    Node head;
    int size;

    public MyLinkedList() {
        head=null;
        size=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        Node cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
            return cur.val;
        
    }
    
    public void addAtHead(int val) {
        Node noe=new Node(val);
        noe.next=head;
        head=noe;
        size++;
    }
    
    public void addAtTail(int val) {
        Node noe=new Node(val);
        if(head==null){
            head=noe;
        }
        else{
            Node cur=head;
            while(cur.next!=null){
                cur=cur.next;
            }
                cur.next=noe;
        }
            size++;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0||index>size){
            return;
        }
        if(index==0){
            addAtHead(val);
        }
        else if(index==size){
            addAtTail(val);
        }
        else{
            Node noe=new Node(val);
            Node cur=head;
            for(int i=0;i<index-1;i++){
                cur=cur.next;
            }
                noe.next=cur.next;
                cur.next=noe;
                
             
            
        size++;
        }
        
    }
    
//     public void deleteAtIndex(int index) {
//         if(index<0||index>size){
//             return ;
//         }
//         if(index==0){
//             head=head.next;
//         }
//         else{
//             Node cur=head;
//             for(int i=0;i<index-1;i++){
//                 cur=cur.next;}
//             if (cur.next != null) {
//             cur.next = cur.next.next;
//         }
//         }
//     size--;
// }
public void deleteAtIndex(int index) {
    if(index < 0 || index >= size){
        return;
    }
    if(index == 0){
        head = head.next;
    }
    else {
        Node cur = head;
        for(int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        if (cur.next != null) {
            cur.next = cur.next.next;
        }
        // If deleting the last element, update the tail to be the current node
        if (index == size - 1) {
            // Move to the new last element
            while (cur.next != null) {
                cur = cur.next;
            }
        }
    }
    size--;
}

}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

