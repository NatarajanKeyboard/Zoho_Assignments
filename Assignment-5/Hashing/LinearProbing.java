class Node{
    int key;
    String value;

    public Node(int key, String value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public String toString()
    {
        return "["+this.key+"| "+this.value+"]";
    }
}
class MyHashTable
{
    private static final int size=10;
    private Node[] hashTable=new Node[size];

    public static int hash(int key)
    {
        return key%size;
    } 

    public void add(int key,String value)
    {
        if(hashTable[hash(key)]==null)
        {
            hashTable[hash(key)]=new Node(key,value);
        }
        else{
            int probe=key+1;
            while(probe<=size && hashTable[hash(probe)]!=null)
            {
                probe++;
            }
            hashTable[hash(probe)]=new Node(key,value);

        }
    }

    public void printTable()
    {
        for (Node node : hashTable) {
            System.out.println(node);
        }
        
    }
    public Node retrieve(int key)
    {
        for (Node nodeTarget : hashTable) {
            if(nodeTarget!=null&&nodeTarget.key==key)return nodeTarget;
        }
        return null;

    }
    

}
public class LinearProbing {
    public static void main(String[] args) {
        MyHashTable my=new MyHashTable();
        my.add(1,"hello");
        my.add(11,"this");
        my.add(2,"world");
        my.add(6,"ZSGS");
        my.add(6,"Zoho");


        my.printTable();

        System.out.println(my.retrieve(11));
    }
    
}
