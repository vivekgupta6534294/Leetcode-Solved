class Solution {
    public int romanToInt(String s) {
        if(s==null|| s.length()==0)
            return -1;
        HashMap<Character,Integer> inHash=new HashMap<Character,Integer>();
        inHash.put('M',1000);
        inHash.put('D',500);
        inHash.put('C',100);
        inHash.put('L',50);
        inHash.put('X',10);
        inHash.put('V',5);
        inHash.put('I',1);
        int len=s.length()-1;
        int result=inHash.get(s.charAt(len));//Last se Start // or if there is single value
        for(int i=len-1;i>=0;i--){
            if(inHash.get(s.charAt(i))>=inHash.get(s.charAt(i+1)))
                result+=inHash.get(s.charAt(i));
            else 
                result-=inHash.get(s.charAt(i));
            
        }        
        return result;
    }
}