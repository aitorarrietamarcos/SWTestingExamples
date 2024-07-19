package code;

public class OraclesExamples {

	public static int returnFirstZero(int[]x) {
		
		for(int i=0;i<x.length;i++) {
			if(x[i]==0)
				return i;
		}
		return -1;
		
	}
	
	public static int returnFirstZero_v2(int[]x) {
		int value = -1;
		for(int i=0;i<x.length;i++) {
			if(x[i]==0) {
				value = i;
				break;
			}
		}
		
		return value;
	}
}
