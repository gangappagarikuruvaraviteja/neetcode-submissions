class Solution {
    public boolean isAnagram(String s, String t) {

    //   if(s.length()!=t.length()){
    //     return false;

    //   }

    //   for(char ch:toCharArray()){

    //         map.put(ch,map.getOrDefault(ch,0)+1);
    //   }

    //     for(char ch:toCharArray()){

    //             if(!map.contains(ch)){
    //                 return false;
    //             }
    //             map.put(ch,map.get(ch))

    //     }


        if(s.length()!=t.length()){
            return false;
        }


        char []a=s.toCharArray();
        char[] b=t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);


    }
}
