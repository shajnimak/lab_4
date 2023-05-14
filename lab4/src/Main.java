import service.MyHashTable;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();
        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(rand.nextInt(1000), "name" + i);
            Student value = new Student("student" + i, rand.nextInt(20) + 18);
            table.put(key, value);
        }

        table.printBucketSizes();
    }
}