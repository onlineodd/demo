package com.chansofti.demo.interf;



public enum OperatorEnum {
	
//���г��󷽷���ö����
	PLUS
 {
	@Override
	public double calculate(double x, double y) {
		// TODO Auto-generated method stub
		return x+y;
	}
},MINUS
 {
		@Override
		public double calculate(double x, double y) {
			// TODO Auto-generated method stub
			return x-y;
		}
	},MULTI	
 {
	@Override
	public double calculate(double x, double y) {
		// TODO Auto-generated method stub
		return x*y;
	}
},DIVIDE
 {
		@Override
		public double calculate(double x, double y) {
			// TODO Auto-generated method stub
			return x/y;
		}
	};
	public abstract double calculate(double x,double y);
}