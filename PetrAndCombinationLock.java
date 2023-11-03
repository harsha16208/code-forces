public class Main
{
    
    static boolean solve(int[] arr) {
        for (int i=0; i<(1<<arr.length); i++) {
            int sum = 0;
            for (int j=0; j<arr.length; j++) {
                if ((i & (1<<j)) != 0) {
                    sum+=arr[j];
                } else {
                    sum-=arr[j];
                }
            }
            if (sum%360==0) {
                return true;
            } 
        }
        return false;
    }
    
	public static void main(String[] args) {
		int arr[] = {10,20,30};
		System.out.println(solve(arr));
	}
}
