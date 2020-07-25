package com.epam2.Arushi_CleanCode;
public class Calculate  {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//exemplary functioning of both the functions
		System.out.println("SI and CI for P=2000, R=0.8, T=5, N=1 is");
		SimpleInterest simpleInterest = new SimpleInterest();
		System.out.println("SI is "+simpleInterest.calculate(2000,0.8,5,1));
		CompoundInterest compoundInterest = new CompoundInterest();
		System.out.println(compoundInterest.calculate(2000,0.8,5,12));


	}

}
class SimpleInterest extends Interest
{

	double calculate(double principle, double rate, double time,int n) {
		// TODO Auto-generated method stub
		n=1;
		return principle*rate*time/100;
	}
	
}
class CompoundInterest extends Interest
{

	double calculate(double principle, double rate, double time,int n) {
		// TODO Auto-generated method stub
        double amount = principle * Math.pow(1 + (rate / n), n * time);

		return amount;
	}
}