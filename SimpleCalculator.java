package se.maven.example;

public class SimpleCalculator {
	private int res=0;
	
	public void add(int x, int y) {
		res=x+y;
	}
	public void sub(int x, int y) {
		res=x-y;
	}
	public void inc(int d) {
		res+=d;
	}
	public void dec(int d) {
		res+=d;
	}
	public int getResult() {
		return res;
	}
	public void addWithPostiveArgs(int x, int y) throws InvalidArgumentException{
		if (x<0 || y<0) throw new InvalidArgumentException();
		res=x+y;
	}
	public void weiredAdd(int x, int y) {
		if(x==5 && y==7) res = 100;
		else res=x+y;
	}

}
