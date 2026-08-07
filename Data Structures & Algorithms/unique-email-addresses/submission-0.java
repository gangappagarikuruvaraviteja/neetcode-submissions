class Solution {
    public int numUniqueEmails(String[] emails) {

     HashSet<String> set=new HashSet<>();
     for(String email:emails){

        int at=email.indexOf("@");
        String local=email.substring(0,at);
        String domain=email.substring(at);

        local=local.split("\\+")[0];
        local=local.replace(".","");



        set.add(local+domain);
     }
     return set.size();

        
        

    }
}