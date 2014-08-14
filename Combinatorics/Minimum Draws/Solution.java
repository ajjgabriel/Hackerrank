import java.util.*;
import java.io.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int numberOfTestCases = in.nextInt();
        while (numberOfTestCases > 0)
        {
            int numberOfSocks = in.nextInt();

            int minimumDraw = numberOfSocks + 1;

            System.out.println(minimumDraw);

            --numberOfTestCases;
        }
    }
}