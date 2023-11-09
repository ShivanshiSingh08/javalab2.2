public class String2 {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");

        // append()
        str.append(" Java");
        System.out.println("Appended string: " + str);

        // insert()
        str.insert(5, "World");
        System.out.println("Inserted string: " + str);

        // replace()
        str.replace(11, 15, "!");
        System.out.println("Replaced string: " + str);

        // delete()
        str.delete(6, 10);
        System.out.println("Deleted string: " + str);

        // charAt()
        char firstChar = str.charAt(0);
        System.out.println("First character: " + firstChar);

        // setCharAt()
        str.setCharAt(0, 'H');
        System.out.println("Modified first character: " + str);

        // length()
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // capacity()
        int capacity = str.capacity();
        System.out.println("Capacity of the string buffer: " + capacity);

        // ensureCapacity()
        str.ensureCapacity(20);
        System.out.println("New capacity of the string buffer: " + str.capacity());

        // toString()
        String str2 = str.toString();
        System.out.println("String representation: " + str2);

        // substring(int start)
        String substring1 = str.substring(5);
        System.out.println("Substring from index 5: " + substring1);

        // substring(int start, int end)
        String substring2 = str.substring(3, 8);
        System.out.println("Substring from index 3 to index 7: " + substring2);
    }
}