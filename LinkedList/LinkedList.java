package LinkedList;

class LinkedList<T> {
  private Node<T> head;

  public class Node<V> {
    public V value;
    public Node<V> next;

    Node(V value) {
      this.value = value;
    }
  }

  void add(T value) {
    addLast(value);
  }

  void addFirst(T value) {
    Node<T> node = this.head;

    this.head = new Node<T>(value);
    this.head.next = node;
  }

  void addLast(T value) {
    if (this.head == null) {
      this.head = new Node<T>(value);
    } else {
      Node<T> node = this.head;

      while(node.next != null) {
        node = node.next;
      }

      node.next = new Node<T>(value);
    }
  }

  Node<T> find(T value) {
    if (this.head.value == value) {
      return this.head;
    }

    Node<T> node = this.head;

    do {
      System.out.println(node.value);
      if (node.value == value) {
        return node;
      }
      node = node.next;
    } while(node != null);

    return null;
  }

  void remove(T value) {
    if (this.head.value == value) {
      this.head = this.head.next;
    }

    Node<T> node = this.head;

    while (node.next != null) {
      if (node.next.value == value) {
        node.next = node.next.next;
        return;
      } else {
        node = node.next;
      }
    }
  }

  void removeFirst() {
    if (this.head != null) {
      this.head = this.head.next;
    }
  }

  void removeLast() {
    if (this.head == null) {
      return;
    }
    if (this.head.next == null) {
      this.head = null;
    }

    Node<T> node = this.head;

    while(node.next != null) {
      if (node.next.next == null) {
        node.next = null;
        break;
      } else {
        node = node.next;
      }
    }
  }

  void print() {
    if (this.head == null) {
      return;
    }

    Node<T> node = this.head;

    do {
      System.out.println(node.value);
      node = node.next;
    } while(node != null);
  }

  Node<T> getFirst() {
    return this.head;
  }

  Node<T> getLast() {
    Node<T> node = this.head;

    while(node != null && node.next != null) {
      node = node.next;
    }

    return node;
  }
}
