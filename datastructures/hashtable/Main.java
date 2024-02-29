package datastructures.hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        System.out.println("Lumber:");
        System.out.println( myHashTable.get("lumber") );

        System.out.println("\nBolts:");
        System.out.println( myHashTable.get("bolts") );

        /*
            EXPECTED OUTPUT:
            ----------------
            Lumber:
            80

            Bolts:
            0

        */

        // HASH METHOD MUST BE SET TO PUBLIC FOR THESE LINES TO WORK
        // System.out.println( myHashTable.hash("paint") );
        // System.out.println( myHashTable.hash("bolts") );
        // System.out.println( myHashTable.hash("nails") );
        // System.out.println( myHashTable.hash("stuff") );
        // System.out.println( myHashTable.hash("lumber") );
    }
}