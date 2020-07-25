package com.epam2.Arushi_CleanCode;

public abstract class Interest {
	double rate;
	double principle;
	double time;
	int n=1;
	abstract double calculate(double rate,double principle, double time,int n);

	
}
