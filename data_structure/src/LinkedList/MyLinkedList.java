package LinkedList;

public class MyLinkedList {
    private MyListNode head;
    int count;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public MyListNode addElement(String data) {
        MyListNode newNode = new MyListNode(data);
        if (head == null) {
            head = newNode;
        }
        else {
            MyListNode cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
        }
        count++;
        return newNode;
    }

    public MyListNode insertElement(int position, String data) {
        int i;
        MyListNode cur = head;
        MyListNode pre = null;

        MyListNode newNode = new MyListNode(data);

        if(position < 0 || position > count) {
            return null;
        }
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        }
        else {
            for (i = 0; i < position; i++) {
                pre = cur;
                cur = cur.next;
            }
            newNode.next = pre.next;
            pre.next = newNode;
        }
        count++;
        return newNode;
    }

    public MyListNode removeElement(int position) {
        MyListNode cur = head;
        MyListNode pre = null;

        if(position >= count) {
            return null;
        }

        if(position == 0) {
            head = cur.next;
        }
        else {
            for(int i = 0; i < position; i++) {
                pre = cur;
                cur = cur.next;
            }
            pre.next = cur.next;
        }
        count--;

        return cur;
    }

    public String getElement(int position) {
        MyListNode temp = head;

        if (position >= count) {
            return null;
        }

        if (position == 0) {
            return head.getData();
        }

        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        return temp.getData();
    }

    public MyListNode getNode(int position) {
        MyListNode temp = head;

        if (position >= count) {
            return null;
        }

        if (position == 0) {
            return head;
        }
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        return temp;
    }


    public void removeAll() {
        head = null;
        count = 0;
    }

    public int getSize() {
        return count;
    }

    public void printAll() {
        if (count == 0) {
            System.out.println("temp!");
            return;
        }

        MyListNode temp = head;
        while(temp != null) {
            System.out.print(temp.getData());
            temp = temp.next;
            if (temp != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println("");
    }

    public boolean isEmpty() {
        return head == null;
    }
}
