class Solution {
    public int countCharacters(String[] words, String chars) {


        HashMap<Character,Integer>map=new HashMap<>();

        for(char ch:chars.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int result=0;

        for(String word:words){
            HashMap<Character,Integer>temp=new HashMap<>(map);

            int count=0;
            for(char ch:word.toCharArray()){
                if(temp.containsKey(ch)){

                    temp.put(ch,temp.get(ch)-1);

                    if(temp.get(ch)==0){
                        temp.remove(ch);
                    }

                    count++;
                }
            }

            if(count==word.length()){
                result+=word.length();
            }
        }
    return result;

    }
}