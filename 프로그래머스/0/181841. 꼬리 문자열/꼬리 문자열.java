class Solution {
    public String solution(String[] str_list, String ex) {
StringBuilder b = new StringBuilder();       
        for(String a:str_list){
           if(!a.contains(ex)){
               b.append(a);
           }
       }
        return b.toString();
    }
}