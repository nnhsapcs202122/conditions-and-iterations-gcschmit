
/**
 * Write a description of class NestedLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedLoops
{
    public static void loop1()
    {
        for(int i = 1; i <= 2; i++)
        {
            for(int j = 1; j <= 4; j++)
            {
                System.out.println(i + " " + j);
            }
        }
    }

    public static void loop2()
    {
        int i = 1;
        while(i <= 2)
        {
            int j = 1;
            while(j <= 4)
            {
                System.out.println(i + " " + j);
                j++;
            }
            i++;
        }
    }
}
