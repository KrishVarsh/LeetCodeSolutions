class Solution {
    public int maxSubArray(int[] a) {
        int sum=0;
		int maxi=a[0];
		for(int i=0;i<a.length;i++){
            if(a.length==1){break;}
			sum=sum+a[i];
			// if(sum>maxi){
			// maxi=sum;}
             maxi = Math.max(sum,maxi);
			if(sum<0){
			sum=0;}
		}
		//if (maxi < 0) maxi = 0;
		return maxi;
	}

}
