package afs.syed.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Newspaper implements Observer {

	public void update(Observable o, Object arg) {
		
		System.out.println("Update in Newspaepr");
		
	}

}

