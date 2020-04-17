package org.upadhyay.suraj.action;

import org.upadhyay.suraj.service.TutorialFinder;

public class TutorialAction
{
	private String tutorialsList;
	
	public String execute()
	{
		System.out.println("Hello from execute();");
		
		setTutorialsList(new TutorialFinder().getTutorials());
		
		return "success";
	}

	public String getTutorialsList()
	{
		return tutorialsList;
	}

	public void setTutorialsList(String tutorialsList)
	{
		this.tutorialsList = tutorialsList;
	}
	
	
}
