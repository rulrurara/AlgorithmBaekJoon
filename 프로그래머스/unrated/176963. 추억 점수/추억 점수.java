import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        System.out.println("ew");
        int N = photo.length;
        int[] answer = new int[N];
        
     Map<String , Integer> map = new HashMap<String , Integer>();
        for(int i = 0 ; i < name.length ; i++){
            map.put(name[i] , yearning[i]);
        }
        for(int i = 0 ; i < photo.length ; i++){
            int cnt = 0;
            for(int j = 0 ; j< photo[i].length ; j++){
                String str = photo[i][j];
                if(map.containsKey(str)){
                    cnt+= map.get(str);
                }
                
            }
             answer[i] = cnt;
        }
        return answer;
    }
}