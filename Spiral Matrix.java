
// Spiral Matrix
class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int left=0,right=m-1;
        int top=0,bot=n-1;
        List <Integer> ans=new ArrayList<>();
        while (top <= bot && left <= right){
        //left to right
        for(int i=left;i<=right;i++){
            ans.add(mat[top][i]);
        }
        top++;

        //top to bottom
        for(int i=top;i<=bot;i++){
            ans.add(mat[i][right]);
        }
        right--;
        if (top <= bot){
        //right to left
         for(int i=right;i>=left;i--){
            ans.add(mat[bot][i]);
        }
        bot--;}

        if (left <= right) {
        //bot to top
         for(int i=bot;i>=top;i--){
            ans.add(mat[i][left]);
        }
        left++;
        }}
        return ans;
    }
}
