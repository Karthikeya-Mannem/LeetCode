class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char chars[] = s.toCharArray();
        int res = 0;
        int i,j;
        for(i = 0,j = 1;j < chars.length;i++,j++){
            if(map.get(chars[i]) >= map.get(chars[j])){
                res = res+map.get(chars[i]);
            }else{
                res = res-map.get(chars[i]);
            }
        }
        res= res+map.get(chars[i]);
        return res;
    }
}