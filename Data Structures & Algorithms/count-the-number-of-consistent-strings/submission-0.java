class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        HashSet<Character>set=new HashSet<>();

        for(char ch:allowed.toCharArray()){
            set.add(ch);
        }
        int count=0;
        for(String word:words){
            int valid=0;

            for(char ch:word.toCharArray()){

                if(set.contains(ch)){
                    valid++;
                }

            }
            if(valid==word.length()){
                count++;
            }


        }
        return count;
    }
}