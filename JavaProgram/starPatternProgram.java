package JavaProgram;

public class starPatternProgram {

	public static void main(String[] args) {
		//I want to print a square
		// Always remember we need to use two loops for rows and columns for printing triangle/sqaure etc.
	
		int a,b,c;
		
		for(a=1;a<=5;a++) {
			
			
			for(b=5;b>=a;b--) {
				System.out.print(" *");
			}
			for(c=1;c<=a;c++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		starSquarePattern();
	}

	public static void starSquarePattern() {
		int d,e;
		
		for(d=1;d<=5;d++) {
			//System.out.print(" 0");
			for(e=1;e<=5;e++) {
				System.out.print(" 0");
			}
			System.out.println();
		} 
		traingalePattern();
	}
	
	public static void traingalePattern() {
		int f,g,h,i;
		
		for(f=1;f<=5;f++) {
			
			for (g=5;g>=f;g--) {
				System.out.print(" ");
			}
			
			for(h=1;h<=f;h++) {
				System.out.print("+");
			}
			
			for(i=1;i<=g;i++) {
				System.out.print("+");
			}
			System.out.println();
		}
		
		reverseHill();
	}

	public static void reverseHill() {
		
	int	j,k,l,m;
	
	for (j=1;j<=5;j++) {
		 
		for(k=1;k<=j;k++) {   // here k holds value as 2 for first time the holds value as 3 when run second time and so on
			System.out.print("  ");
			}
		for(l=5;l>=j;l--) {
			System.out.print(" *");
		}
		for(m=5;m>=k;m--) {
			System.out.print(" *");
		}
	System.out.println();
	}
	backSlashpattern();
	}

	public static void backSlashpattern() {
		
		int n,o;
		
		for(n=1;n<=5;n++) {
			
			for(o=1;o<=n;o++) {
			System.out.print("  ");
			}
			System.out.print(" *");
			System.out.println();
		}
		printForwardSlash();
	}
	public static void printForwardSlash() {
		int p,q;
		for(p=5;p>=1;p--) {
			for(q=1;q<=p;q++) {
				System.out.print("  ");
			}
			System.out.print(" *");
			System.out.println();
		}
		crossStarPattern();	
	}
	public static void crossStarPattern() {
		
		int r,s,t,u;
		
		for (r=1;r<=5;r++) {
			
			for (s=1;s<=r;s++) {
				System.out.print("  ");
			}
			System.out.print(" *");
			
			for(t=5;t>=r;t--) {
				System.out.print("  ");
			}
			for (u=5;u>=r;u--) {
				System.out.print("  ");
			}
		System.out.print(" *");
		System.out.println();
		}
	
	}
}
