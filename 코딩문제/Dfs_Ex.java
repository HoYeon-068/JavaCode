package days17;

public class Dfs_Ex {
	
	static int target=1;
	static int result=0;
	
	public static void main(String[] args) {
		
		dfs(0,0);
		System.out.println(result);
	}

	public static void dfs(int index,int sum) {
		if (index==3) {
			if (sum==target) {
				result++;
			}
			return;
		}
		dfs(index+1,sum+1);
		dfs(index+1,sum-1);
		
	}
	
}
