package gradle.build;


public class CountingDuplicates {
    public static int duplicateCount(String text) {
        // Write your code here
        int[] occurances = new int[36];
        int dupOccurances = 0;
        String upperCaseLetters = text.toUpperCase();
        for(int i = 0; i < upperCaseLetters.length(); i++){
            char curChar = upperCaseLetters.charAt(i);
            if (curChar >= '0' && curChar <= 'Z')
            {
                if (curChar <= '9')
                {
                    occurances[curChar - '0']++;
                }
                else if (curChar >= 'A')
                {
                    occurances[curChar - 'A' + 10]++;
                }
            }
        }

        for (int i = 0; i < occurances.length; i++)
        {
            if (occurances[i] > 1)
            {
                dupOccurances++;
            }
        }

        return dupOccurances;
    }
}
