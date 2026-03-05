/*Q19. Count occurrence of character

Input: programming
Character → g

Output: 2
*/

public class CountOccurrence {
    public static void main(String[] args) {

        String str = "programming";
        char ch = 'g';
        int count = 0;

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Occurrence = " + count);
    }
}