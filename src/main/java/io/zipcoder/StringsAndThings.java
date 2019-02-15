package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {


    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */

    public Integer countYZ(String input) {

        char[] charArray = input.toCharArray();
        Integer number = 0;

        for (int i = 0; i < charArray.length; i++) {
            if ((charArray[i] == 'y') || (charArray[i] == 'z') || (charArray[i] == 'Y') || (charArray[i] == 'Z')) {

                if ((i == (charArray.length - 1)) || (!Character.isLetter(charArray[i + 1]))) {
                    number++;
                }
            }
        }
        return number;
    }


    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {


//     /Integer indexToRemove = 0;
//        Integer index = 0;
//        String answer = "";
//
//        while (indexToRemove != -1) {
//            indexToRemove = base.indexOf(remove.toLowerCase(), index);
//            if (indexToRemove != -1) {
//                answer = answer + base.substring(index, indexToRemove);
//            } else {
//                answer = answer + base.substring(index);
//            }
//            index = indexToRemove + remove.length();
//        }
//        return answer;
//    }

        String new_string = base.replace(remove, "");
        return new_string;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return ture
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return fault
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
//            String a = "is";
//            String b = "not";

        int numIs = countAppreance(input, "is");
        int numNot = countAppreance(input, "not ");
        return numIs == numNot;

    }


    public int countAppreance(String input, String sCount) {
        int count = 0;
        int start = 0;
        int index = 0;

        while (true) {

            index = input.indexOf(sCount, start);
            if (index != -1) {

                count++;
                start = index + sCount.length();


            }

        }

    }


    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {

        char[] findG = input.toCharArray();
        for (int i = 0; i < findG.length; i++) {
            if (findG[i] == 'g' && findG[i + 1] == 'g') {
            } else {
                return false;
            }
        }

        return true;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        char[] ins = input.toCharArray();
        int counter = 0;
        for (int i = 0; i < ins.length; i++) {
            char ob = ins[i];
            if (ob == ins[i + 1] && ob == ins[i + 2]) {
                counter++;
            } else ;
        } return  counter;
    }
}
