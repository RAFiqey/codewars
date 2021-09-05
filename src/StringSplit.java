// Complete the solution so that it splits the string into pairs of two characters.
// If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
//Examples :
// StringSplit.solution("abc") // should return {"ab", "c_"}
// StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}


//public class SampleTest{
//    @Test
//    public void testEvenString() {
//        String s = "abcdef";
//        String s1 = "HelloWorld";
//        assertEquals("Should handle even string","[ab, cd, ef]", Arrays.toString(StringSplit.solution(s)));
//        assertEquals("Should handle even string","[He, ll, oW, or, ld]", Arrays.toString(StringSplit.solution(s1)));
//    }
//
//    @Test
//    public void testOddString() {
//        String s = "abcde";
//        String s1 = "LovePizza";
//        assertEquals("Should handle odd string","[ab, cd, e_]", Arrays.toString(StringSplit.solution(s)));
//        assertEquals("Should handle odd string","[Lo, ve, Pi, zz, a_]", Arrays.toString(StringSplit.solution(s1)));
//    }
//}




public class StringSplit {
    public static String[] solution(String s) {

        char[] charArray = s.toCharArray();
        char[] newCharArray;
        String[] stringArray;
        int k = 0;  //счетчик для индексов  массива

        if(charArray.length%2 == 1){
            newCharArray = new char[charArray.length+1];
            for(int i = 0; i < charArray.length; i++){
                newCharArray[i] = charArray[i];
            }
            newCharArray[newCharArray.length-1] = '_';
        }else {
            newCharArray = new char[charArray.length+1];
            for(int i = 0; i < charArray.length; i++){
                newCharArray[i] = charArray[i];
            }
        }
        stringArray = new String[newCharArray.length/2];
        String myStr = new String(newCharArray);

        for(int i=0;i<myStr.length()-1;i=i+2) { // проход по массиву через каждые 2 символа для нахождения новой подстроки
            String S1 = myStr.substring(i, i+2); // нахождение подстроки с длиной в 2 символа
            stringArray[k++]=S1; // присваивание  подстроки к элементу массива
        }

        return stringArray;
    }
}