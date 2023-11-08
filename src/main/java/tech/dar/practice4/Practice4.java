package tech.dar.practice4;

public class Practice4 {

    // Написать метод, который переворачивает строку.
    static void reverseString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    // Написать метод, который считает количество вхождений символа 'а' в строке.
    static void countCharA(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                counter++;
            }
        }
        System.out.println(counter);
    }

    // Написать метод, который находит подстроку в строке "abcdefgh" -> "def"
    static void findSubstring(String haystack, String needle) {
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {

//            if (haystack.charAt(i) == needle.charAt(0) && i + needle.length() < haystack.length()) {
//                return haystack.substring(i, i + needle.length());
//            }

            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            } else {
                j = 0;
            }
            if (j == needle.length()) {
                System.out.println("True: " + (i - needle.length() + 1));
                break;
            }
        }
    }

    // Написать метод, который преобразует строку в массив байтов и обратно.
    static byte[] strToBytes(String str) {
        byte[] result = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = (byte) str.charAt(i);
        }
        return result;
    }

    // Написать метод, который удаляет все пробелы из строки.
    static String deleteSpaces(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }
        return result;
    }

    // Написать метод, который заменяет все вхождения 'а' на 'о'
    static String replaceAtoO(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a') {
                c = 'o';
            }
            result += c;
        }
        return result;
    }

    // Написать метод, который проверяет, начинается ли строка с подстроки "Java".
    static void isStartsWithJava(String str) {
        // str.startsWith("Java")
        if (str.substring(0, 4).equals("Java")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    // Написать метод, который соединяет массив строк в одну строку с разделителем.
    static void joinStringArray(String[] arr) {
        String result = "";
        for (String s: arr) {
            result += s + " | ";
        }
        result = result.substring(0, result.length() - 3);
        System.out.println(result);
    }

    // Написать метод, который проверяет, является ли строка палиндромом. abcddcba <-> abcdcba
    static void isPalindrome(String str) {
        String result = "True";
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                result = "False";
                break;
            }
        }
        System.out.println(result);
    }

    // Написать метод, который считает количество уникальных символов в строке.
    static void countUnique(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                }
            }
            if (isUnique) {
                result += str.charAt(i);
            }
        }
        System.out.println(result.length());
    }

    static void countUnique2(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            boolean isUnique = true;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                }
            }
            if (isUnique) {
                result += str.charAt(i);
            }
        }
        System.out.println(result.length());

    }

    // Написать метод, который сжимает строку, используя счетчик повторяющихся символов.
    // Например, строка "aabcccccaaa" превратится в "a2b1c5a3".
    // Если сжатая строка не становится короче исходной, метод должен вернуть исходную строку.
    static void reduceString(String str) {
        String result = "";
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result += str.charAt(i - 1) + "" + count;
                count = 1;
            }
        }
        result += str.charAt(str.length() - 1) + "" + count;
        if (str.length() == result.length())
            result = str;
        System.out.println(result);
    }

    // Написать метод, который проверяет, является ли слово анаграммой другого слова. aabc = caba
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int aSum = 0, bSum = 0;
        for (int i = 0 ; i < a.length(); i++) {
            aSum += a.charAt(i);
            bSum += b.charAt(i);
        }
        return aSum == bSum;
    }

}

