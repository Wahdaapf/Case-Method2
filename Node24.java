public class Node24 {
    Kendaraan data;
    Node24 prev;
    Node24 next;

    Node24(Kendaraan data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

//class node diatas buat nyimpen node

class DoubleLinkedList24 {
    Node24 head;
    Node24 tail;

    DoubleLinkedList24() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addLast(Kendaraan data) {
        Node24 newNode = new Node24(data);
        if(isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println(">> Kendaraan masuk kedalam antrian.");
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
        } else {
            Node24 current = head;
            System.out.println("== Isi Kendaraan ==\nAntrian Kendaraan:");
            while (current != null) {
                current.data.tampilkanInformasi();
                current = current.next;
            }
        }
    }

    void totalAntrian() {
        if (isEmpty()) {
            System.out.println("Belum Ada Antrian" );
        } else {
            int total = 0;
            Node24 current = head;
            while (current != null) {
                total++;
                current = current.next;
            }
            System.out.println("Total Antrian : " + total);
        }
    }
    
    void layaniKendaraan() {
        Kendaraan datalayani = head.data;
        System.out.println("Petugas melayani " + datalayani.platNomor);
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }
}
