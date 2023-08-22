import Helper.CharacterMatcher;

import java.util.Arrays;

public class Lesson9Program {
    public static void main(String[] args) {

        // 0, 1, 1, 2, 3, 5, 8, 13, 21....
        System.out.println(Arrays.toString(fibonachiCount(20)));

//        String str1 = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Odio dignissimos exercitationem provident explicabo autem quo, quidem?";
//        String str2 = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Perspiciatis sunt sit, obcaecati, ipsa quasi voluptatem.";
//        char[] chars1 = str1.toCharArray();
//        char[] chars2 = str2.toCharArray();
//        System.out.println(matchSymbols(chars1, chars2));
//
//        CharacterMatcher[] matchers = matchSymbols(str1, str2);
//        System.out.println(Arrays.toString(matchSymbols(str1, str2)));
//
//        for (CharacterMatcher matcher:
//             matchers) {
//            if(matcher != null){
//                System.out.print(matcher + ", ");
//            }
//        }
//        int [] array = getEven(20);
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(getEven(19)));
//        System.out.println();
//        int[] array2 = getUneven(20);
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(getUneven(19)));



//        Book book1 = new Book("Golden buffalo", "Ilf & Petrov", 123456, true);
//        Book book2 = new Book("12 chairs", "Ilf & Petrov", 123456, false);
//        System.out.println(book1);
//        System.out.println(book2);
//        System.out.println(multiplyNumbers(5, 4));
//        long a = 5;
//        long b = 6;
//        System.out.println(multiplyNumbers(a, b));
//        int c = 10;
//        System.out.println(multiplyNumbers(a, c));
//        System.out.println(multiplyNumbers(c, a));
//        short s = 15;
//        System.out.println(multiplyNumbers(s, c));
    }

    public static long multiplyNumbers(int num1, int num2) {
        long res = (long) num1 * num2;
        return res;
    }

    public static long multiplyNumbers(long num1, int num2) {
        long res = (long) num1 * num2;
        return res;
    }

    public static long multiplyNumbers(int num1, long num2) {
        long res = (long) num1 * num2;
        return res;
    }

    public static long multiplyNumbers(long num1, long num2) {
        long res = (long) num1 * num2;
        return res;
    }

    public static long multiplyNumbers(short num1, int num2) {
        long res = (long) num1 * num2;
        return res;
    }

    public static int[] getEven(int num) {
        int arrayIncrement = num % 2 == 0 ? 0 : 1;
        int[] arr = new int[num / 2 + arrayIncrement];
        int index = 0;

        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                arr[index] = i;
                index++;
            }
        }
        return arr;
    }
    public static int[] getUneven(int num){
        int arrayIncrement = num % 2 == 0 ? 0 : 1;
        int[] arr = new int[num / 2 + arrayIncrement];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                arr[index] = i;
                index++;
            }
        }

        return arr;
    }

    public static int matchSymbols(char[] chars1, char[] chars2){
        int count = 0;
        int lengthArray = Math.min(chars1.length, chars2.length);
        for (int i = 0; i < lengthArray; i++) {
            if(chars1[i] == chars2[i]){
                count++;
            }
        }
        return count;
    }

    public static CharacterMatcher[] matchSymbols(String str1, String str2){
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int lengthArray = Math.min(chars1.length, chars2.length);

        CharacterMatcher[] saveData = new CharacterMatcher[lengthArray];
        int count = 0;
        int index = 0;
        for (int i = 0; i < lengthArray; i++) {
            if(chars1[i] == chars2[i]){
                CharacterMatcher matcher = new CharacterMatcher(i, chars1[i]);
                saveData[index] = matcher;
                index++;
                count++;
            }
        }
        System.out.println(count);

        return saveData;
    }

    public static int[] fibonachiCount(int num){
        int[] result = new int[num];
        int previousNum = 0;
        int nextNum = 1;
        for (int i = 0; i < num; i++) {
            int temp = previousNum + nextNum;
            result[i] = temp;
            previousNum = nextNum;
            nextNum = temp;
        }
        return result;
    }
}
