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
        System.out.print("Enter a word: ");
        String word = s.next();
        int count = 0;

        while (!word.equals("quit"))
        {
            if (word.length() > 4)
            {
                count++;
            }

            System.out.print("Enter a word: ");
            word = s.next();
        }
        return count;
    }

    /*
     * Loop Algorithm #2: Count Matches for Prefix
     * reads a series of words (ends with "quit")
     * counts the number of words that start with the substring "con"
     * @return the number of words  that start with the substring "con"
     */
    public static int countMatchesForPrefix()
    {
        Scanner s = new Scanner(System.in);
        String str = "";
        int con = 0;
        while(!str.equals("QUIT"))
        {
            System.out.println("Enter a word: ");
            str = s.next();
            if(str.length() >= 3)
            {
                if(str.substring(0,3).equals("con"))
                {
                    con += 1;
                }
            }
        }
        return con;
    }

    /*
     * Loop Algorithm #3: Count Matches for Suffix
     * reads a series of words (ends with "quit")
     * counts the number of words that end with the substring "est"
     * @return the number of words  that end with the substring "est"
     */
    public static int countMatchesForSuffix()
    {
        Scanner s = new Scanner(System.in);
        String word;
        int count = 0;
        do
        {
            word = s.next();
            String checkForEst = word.substring(word.length()-3);
            if (checkForEst.equals("est"))
            {
                count++;
            }
        }
        while(!word.equals("quit"));
        return count;

    }

    /*
     * Loop Algorithm #4: Reverse String
     * reads one word
     * reverses the characters in the word
     * @return a new string with the characters reversed
     */
    public static String reverseWord()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = s.next();
        String newStr = "";
        for(int i = str.length()-1; i > -1; i--)
        {
            newStr += str.substring(i, i + 1);
        }
        return newStr;
    }

    /*
     * Loop Algorithm #5: Compare Adjacent Words
     * reads a series of words until an adjacent duplicate word is entered
     * @return the number of unique words entered before the duplicate
     */
    public static int compareAdjacent()
    {
        return 0;
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
        boolean met = false;
        String input = "";
        Scanner s = new Scanner(System.in);
        while(!met){
            System.out.println("type a word that is alphabetically after north and greater than 6");
            input = s.nextLine();
            if(input != null && input.compareTo("north") > 0 && input.length() > 6){
                met = true;
            }
        }
        return input;
    }

    /*
     * Loop Algorithm #7: Identify Individual Digits in an Integer (Extension)
     * Write an algorithm to identify the individual digits in an integer.
     * For example, if the integer 123456 is entered by a user, print each digit on its own line.
     */
    public static void identifyDigits(int intValue)
    {
        Scanner sus = new Scanner(System.in);
        System.out.println("What are your magic numbers? (quit to exit) ");
        String value = null;
        do
        {
            value = sus.next();
            for (int i = 0; i < value.length(); i++)
            {
                char read = value.charAt(i);
                System.out.println(read);
            }
        }
        while (value.equals("quit"));

    }

    public static void identifyDigits2(int intValue)
    {
        String nums = "" + intValue;
        if(nums == null)
            nums = "0";
        int x = 0;
        while(x != nums.length()){
            System.out.println(nums.substring(x, x + 1));
            x++;
        }
    }

}