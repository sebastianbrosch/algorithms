package LinkedList;

public class Example {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Hallo");
        list.add("Welt");
        list.addFirst("AAA");
        //list.removeFirst();
        //list.removeLast();
        //list.remove("Hallo");
        LinkedList<String>.Node<String> node = list.find("Welt");
        System.out.println(node.value);
        list.print();

    }
}
