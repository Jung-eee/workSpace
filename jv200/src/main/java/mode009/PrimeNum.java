package mode009;

public class PrimeNum {
	
	public String Number(int n) {
		String prime = "";
		int i_n = 0;
		int count = 0;
		try {
			for(int i = 2; i < n; i++) {
				if(n % i== 0) {
					count++;
					i_n = i;
					break;
				}
			}				
			if (count == 0) {
				prime = n + "은 소수";
			}
			else {
				throw new Exception();
			}
			count=0;
		} catch(Exception e){
			prime = n + "=" + (n /i_n) +"X"+ i_n;
		}
		return prime;
	} 
}
