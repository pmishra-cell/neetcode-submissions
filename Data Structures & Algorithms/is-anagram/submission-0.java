class Solution {
    public boolean isAnagram(String s, String t) {
        return s.length() == t.length() &&
       s.chars().sorted().boxed().collect(Collectors.toList())
       .equals(t.chars().sorted().boxed().collect(Collectors.toList()));

        

    }
}
