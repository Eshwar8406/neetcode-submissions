class Solution {
    public boolean isAnagram(String s, String t) {
        boolean ans=false;
        if(s.length()==t.length()){
            char[] sc=s.toCharArray();
            Arrays.sort(sc);
            //String ss=new String(sc);
            char[] tc=t.toCharArray();
            Arrays.sort(tc);
            //String st=new String(tc);
            if(Arrays.equals(sc,tc)){
                ans=true;
            }
        }
        return ans;
    }
}
