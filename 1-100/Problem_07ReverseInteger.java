
public class Problem_07ReverseInteger {
	public int reverse(int x) {
        int reserve,i=1;
		double newNumber=0;
        while(x!=0){
            reserve=x%10;
            x=x/10;
            newNumber=newNumber*10;
            newNumber+=reserve;
            i++;
        }
        if(newNumber>Integer.MAX_VALUE||newNumber<Integer.MIN_VALUE)
			return 0;
        
        return (int)newNumber;
    }
}
