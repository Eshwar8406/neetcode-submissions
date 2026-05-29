class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
        char[] c=s.toCharArray();
        boolean ans=true;
        int n=c.length;
        for(int i=0;i<n/2;i++){
            int j=n-i-1;
            if(c[i]!=c[j]){
                ans=false;
                break;
            }
        }
        return ans;
    }
}
