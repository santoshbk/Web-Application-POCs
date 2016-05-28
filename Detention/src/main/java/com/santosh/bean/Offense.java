package com.santosh.bean;

public enum Offense {

	HOMEWORK(1), STEALING(2), FIGHTING(0.5), UNTYDINESS(1), LYING(1.5), DAMAGE(1);

	double val;

	private Offense(double val) {
		this.val = val;
	}

	public double getVal() {
		return val;
	}

}
