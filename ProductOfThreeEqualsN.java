public class Main
{
	public static void main(String[] args) {
		int n = 12345;
		int a =1, b=1, c=1;
		
		for (int i=2; i<n; i++) {
		    if (n%i==0) {
		        a = i;
		        break;
		    }
		}
		
		n = n /a;
		
		for (int j=a+1; j<n; j++) {
		    if (n%j==0) {
		        b = j;
		        break;
		    }
		}
		
		c = n / b;
		
		if (a!=b && b!=c && c!=1) {
		    System.out.println("YES");
		    System.out.println(a + " " + b +" " + c);
		} else {
		    System.out.println("NO");
		}
	}
}
