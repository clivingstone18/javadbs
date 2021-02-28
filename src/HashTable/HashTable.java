package HashTable;
import LinkedListGeneric.*;

public class HashTable {
    private LinkedListGeneric[] hashArray;
    private static final int SIZE = 10;

    public HashTable() {
        hashArray = new LinkedListGeneric[SIZE];
        for (int i = 0; i<SIZE;i++) {
            hashArray[i] = new LinkedListGeneric();
        }
    }

    private int computeHash(String string) {
        int hash = 0;
        for (int i=0; i<string.length(); i++) {
            hash += string.charAt(i);
        }
        return hash % SIZE;
    }

    public boolean containsString(String s) {
        int hashValue = computeHash(s);
        return hashArray[hashValue].contains(s);
    }

    public void put(String s) {
        // put into hash table
        int hashValue = computeHash(s);
        hashArray[hashValue].addToStart(s);
    }


    public void outputHashTable() {
        for (int i = 0; i < SIZE; i++) {
            if (hashArray[i].size() > 0) {
                hashArray[i].outputList();
            }
        }
    }

}
