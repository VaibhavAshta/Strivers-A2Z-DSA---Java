class Solution {
    public double myPow(double x, int n) {
         int n = s.length();
	ArrayList<String>ans=new ArrayList<>();
	for (int num = 0; num < (1 << n); num++) {
		String sub = "";
		for (int i = 0; i < n; i++) {
			//check if the ith bit is set or not
			if ((num & (1 << i))!=0) {
				sub += s.charAt(i);
			}
		}
		if (sub.length() > 0) {
			ans.add(sub);
		}
	}
	Collections.sort(ans);
	return ans;
    }
}
//https://leetcode.com/problems/powx-n/
