// package Hashing;

import java.util.ArrayList;

class node //Entry in real HashTable class
{
    int key;
    String value;
    node nextAddr;
    public node(int key, String value) {
        this.key = key;
        this.value = value;
        this.nextAddr=null;
    }
    // ArrayList<Byte> a=new ArrayList<>();
    
}
class MyHashTable
{
    private final static int size=10;
    private node[] table=new node[size];

    public static int hash(int key)
    {
        return key%size;
    }

    public void add(int key,String value)
    {
        if(table[hash(key)]==null)
        {    
            table[hash(key)]=new node(key,value);
        }
        else
        {
            node current=table[hash(key)];
            while(current.nextAddr!=null)
            {
                current=current.nextAddr;
            }
            current.nextAddr=new node(key,value);
        }
    }
    public void printTable()
    {
        for (int i = 0; i < size; i++) 
        { 
            System.out.print("Index " + i + ": ");
            node current = table[i]; 
            while (current != null) 
            { 
                System.out.print("(" + current.key + ", " + current.value + ") -> ");
                current = current.nextAddr; 
            } 
            System.out.println("null");
        }
    }
    public ArrayList<String> retrieve(int key)
    {
        node current=table[hash(key)];
        ArrayList<String> rowList=new ArrayList<>();
        while(current!=null)
        {
            if(current.key==key)
            {
                rowList.add(current.value);
            }
            current=current.nextAddr;
        }
        return rowList;
    }


}


public class SeparateChaining {
    public static void main(String[] args) {

        MyHashTable table=new MyHashTable();

        table.add(1,"Hello");
        table.add(11, "World!");
        table.add(1,"Dutch");
        table.add(3,"This");
        table.add(73,"is");
        table.add(4,"an example");
        
        table.printTable();

        System.out.println();

        System.out.println(table.retrieve(1));
        System.out.println(table.retrieve(3));

    }
}
