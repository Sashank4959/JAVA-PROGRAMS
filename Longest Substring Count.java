/**public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner for user input
        Solution solution = new Solution();
        String input = scanner.nextLine(); // Read user input
        int result = solution.lengthOfLongestSubstring(input); // Call the function
    }
}*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxL=0;
        int i =0;
        HashSet<Character> hash= new HashSet<>();
        for(int j=0;j<s.length();j++){
            while(hash.contains(s.charAt(j))){
                hash.remove(s.charAt(i));
                i+=1;
            }
            hash.add(s.charAt(j));
            maxL=Math.max(maxL,j-i+1);
        }
        return maxL;
    }
}
