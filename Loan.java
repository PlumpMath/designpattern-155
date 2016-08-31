package afs.syed.designpattern.observer;

import java.util.Observable;

public class Loan extends Observable {

	private float interest;
	
	public Loan(String s, float f, String ss) {
		this.interest = f;
	}
	
	public float getInterest() {
		return interest;
	}

	public void setInterest(float f) {
		System.out.println("Set Interest");
		interest = f;
		setChanged();
		notifyObservers();
	}
}
