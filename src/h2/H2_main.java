package h2;

public class H2_main {

	public static void main(String[] args) {
		int i=1;
		int j=2;
		int k=3;
	    int min = 0;
		int max = 0;
		 
		
	if (i<j && i < k) {
		min = i;
	}else if (j < i && j < k) {
		min = j;
	} else {
		min = k;
	}

	if  (i > j && i>k) {max = i;} else if
	(j > i && j > k) {max = j;} else {max =k;}
	
	System.out.println ("Maximum: " +max);
	System.out.println ("Minimum: " +min);
}
}
