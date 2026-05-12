class Solution {
    public boolean isPalindrome(String s) {
        String sentence = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sentence += s.charAt(i);
            }
        }
        String word = sentence.toLowerCase();
        int left = 0;
        int right = word.length() - 1;
        while (left <= right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
