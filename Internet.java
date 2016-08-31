package afs.syed.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Internet implements Observer {

	public void update(Observable o, Object arg) {
		
		System.out.println("Update in Internet");
		
		System.out.println(o);
		
		System.out.println(arg);
	}

}
