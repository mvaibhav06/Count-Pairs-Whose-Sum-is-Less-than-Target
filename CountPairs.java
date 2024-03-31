import java.util.List;

public class CountPairs {
    public int countPairs(List<Integer> nums, int target) {
        int out = 0;
        for(int i=0; i<nums.size()-1; i++){
            for(int j=i+1; j<nums.size(); j++){
                if(nums.get(i)+nums.get(j) < target){
                    out++;
                }
            }
        }
        return out;
    }
    public static void main(String[] args) {

    }
}
