package epam.training.model;

import epam.training.interfaces.DisplayElement;

public class FileAdapter implements DisplayElement{
	CurrentStaticLog currentLog;
	
	public FileAdapter(CurrentStaticLog currentLog) {
		this.currentLog = currentLog;
	}

	public void display() {
		currentLog.updateFile();
	}

}
