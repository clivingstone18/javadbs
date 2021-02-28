package HashTable;

public class HashTableDemo {
    public static void main(String[] args) {
        HashTable h = new HashTable();
        System.out.println("Adding dog, cat, potato");
        h.put("dog");
        h.put("cat");
        h.put("potato");
        System.out.println(h.containsString("dog"));
        System.out.println(h.containsString("frog"));
        System.out.println(h.containsString("plonk"));
        System.out.println(h.containsString("cat"));


    }
}
