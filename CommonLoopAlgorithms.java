import java.util.Scanner;

public class CommonLoopAlgorithms
{
    /*
     * Loop Algorithm #1: Count Matches for Length
     * reads a series of words (ends with "quit")
     * counts the number of words of length greater than four
     * @return the number of words of length greater than four
     */
    public static int countMatchesForLength()
    {
        Scanner s = new Scanner(System.in);
        String word = new String();
        int wordsGreaterThanFour = 0;
        do
        {
            System.out.print("Enter a series of words (type quit to quit): ");
            word = s.next();

            if (word.length() > 4)
            {
                wordsGreaterThanFour++;
            }
        }
        while (!word.equals("quit"));
        return wordsGreaterThanFour;
    }

    /*
     * Loop Algorithm #2: Count Matches for Prefix
     * reads a series of words (ends with "quit")
     * counts the number of words that start with the substring "con"
     * @return the number of words that start with the substring "con"
     */
    public static int countMatchesForPrefix()
    {
        String compare = "con";
        String word = "";
        int num = 0;
        Scanner s = new Scanner(System.in);

        while(!word.equals("quit"))
        {
            System.out.print("Enter an all lowercase word, type quit to exit: ");
            word = s.next();
            if(word.substring(0,3).equals(compare))
            {
                num++;
            }
        }
        return num;
    }

    /*
     * Loop Algorithm #3: Count Matches for Suffix
     * reads a series of words (ends with "quit")
     * counts the number of words that end with the substring "est"
     * @return the number of words that end with the substring "est"
     */
    public static int countMatchesForSuffix()
    {
        Scanner s = new Scanner(System.in);
        String w = null;
        int estCount = 0;
        do {
            System.out.print("Enter a word (type quit to quit): ");
            w = s.next();
            if(w.length() >= 3 && w.substring(w.length() - 3).equals("est")) {
                estCount ++;
            }
        }
        while(!w.equals("quit"));
        System.out.println(estCount);
        return estCount;
    }

    /*
     * Loop Algorithm #4: Reserve String
     * reads one word
     * reverses the characters in the word
     * @return a new string with the characters reversed
     */
    public static String reverseWord()
    {
        Scanner s= new Scanner(System.in);
        String reversedWord = s.nextLine();
        String newWord = "";
        int nerds = reversedWord.length();
        for(int i = 1;           // initialization
                i <= nerds;           // condition
                i++)
        {  String len = reversedWord.substring(nerds - i,nerds - i + 1);

            newWord += len;
        }
        System.out.print(" The reversed word is : " + newWord);
        return newWord;
    }

    /*
     * Loop Algorithm #5: Compare Adjacent Words
     * reads a series of words until an adjacent duplicate word is entered
     * @return the number of unique words entered before the duplicate
     */
    public static int compareAdjacent()
    {

        Scanner s = new Scanner(System.in);
        System.out.print("enter a word: ");
        String word1 = "";
        String word2 = s.next();
        int uniqueWordCount = 0;
        while(!word1.equals(word2))
        {
            System.out.println("enter another word: ");
            word1 = word2;
            word2 = s.next();
            uniqueWordCount++;
        }
        return uniqueWordCount;

    }

    /*
     * Loop Algorithm #6: Prompting until Criteria Is Met
     * prompts the user to enter a word that is alphabetically after "north"
     *        and has more than six characters
     * continues to prompt the user until the word meets the criteria
     * @return the word that meets the criteria
     */
    public static String promptUntilMatch()
    {
        Scanner s = new Scanner(System.in);
        int result;
        System.out.println("Enter a word: ");
        String word = s.next();
        result = word.compareTo("north");
        System.out.println(result);

        /*
         * prompt until condition: (word.length() > 6) && (result > 0)
         * the while condition negates the prompt until condition
         * !((word.length() > 6) && (result > 0))
         * DeMorgan's Law!
         * !(word.length() > 6) || !(result > 0)
         * (word.length() <= 6) || (result <= 0)
         */
        while(word.length() <= 6 || result <= 0){
            System.out.println("Enter a word: ");   
            word = s.next();
            result = word.compareTo("north");
        }

        return word;
    }

    /*
     * Loop Algorithm #7: Identify Individual Digits in an Integer (Extension)
     * Write an algorithm to identify the individual digits in an integer.
     * For example, if the integer 123456 is entered by a user, print each digit on its own line.
     */
    public static void identifyDigits(int intValue)
    {
    }
}