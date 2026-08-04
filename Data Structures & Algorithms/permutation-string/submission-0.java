class Solution {
    public boolean checkInclusion(String s1, String s2) {
          int n1 = s1.length();
          int n2 = s2.length();
          if(n1 > n2){return false;
          
          }

           int[] s1Freq = new int[26];
        int[] windowFreq = new int[26];


          for (int i = 0; i < n1; i++) {
            s1Freq[s1.charAt(i) - 'a']++;
            windowFreq[s2.charAt(i) - 'a']++;
        }

         if (matches(s1Freq, windowFreq)) {
            return true;
        }

           // Sliding Window
        for (int i = n1; i < n2; i++) {

            // Add new character
            windowFreq[s2.charAt(i) - 'a']++;

            // Remove left character
            windowFreq[s2.charAt(i - n1) - 'a']--;

            // Compare frequency arrays
            if (matches(s1Freq, windowFreq)) {
                return true;
            }
        }

        return false;
    }
     private boolean matches(int[] s1Freq, int[] windowFreq) {
        for (int i = 0; i < 26; i++) {
            if (s1Freq[i] != windowFreq[i]) {
                return false;
            }
        }
        return true;
             
    }

}
