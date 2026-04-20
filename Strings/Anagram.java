//Problem Name:valid Anagram
//Leetcode
//TC:O(n)
//SC:O(1);
//Approach:Used  If both strings contain same characters with same frequency → they are anagrams.

class Solution {
  public boolean anagramStrings(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    int[] freq = new int[26];

    for (int i = 0; i < s.length(); i++) {
      freq[s.charAt(i) - 'a']++;
      freq[t.charAt(i) - 'a']--;
    }
    for (int x : freq) {
      if (x != 0) {
        return false;
      }
    }
    return true;
  }
}
