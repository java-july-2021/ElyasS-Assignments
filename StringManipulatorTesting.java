public class StringManipulatorTesting {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str);       

        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null

String word = "Hello";
String subString = "llo";
String notSubString = "world";
Integer a1 = manipulator.getIndexOrNull(word, subString);
Integer b1 = manipulator.getIndexOrNull(word, notSubString);
System.out.println(a1); // 2
System.out.println(b1); // null



String word2 = manipulator.concatSubstring("Hello", 1, 2, "world");
System.out.println(word2); // eworld


}
}
