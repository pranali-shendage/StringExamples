/*Q20. Check substring in string

Input: Java Programming
Substring → Java

Output: Substring found
*/

public class SubStringCheck {
    public static void main(String[] args) {

        String str = "Java Programming";

        if(str.contains("Java")) {
            System.out.println("Substring found");
        } 
        else {
            System.out.println("Not found");
        }
    }
}