package org.upadhyay.suraj.action;

import org.upadhyay.suraj.service.TutorialFinder;

public class TutorialAction
{
	private String tutorialsList;
	private int param1;
	private double param2;
	private String param3;
	
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

	
	public int getParam1()
	{
		return param1;
	}

	
	public void setParam1(int param1)
	{
		this.param1 = param1;
	}

	
	public double getParam2()
	{
		return param2;
	}

	
	public void setParam2(double param2)
	{
		this.param2 = param2;
	}

	
	public String getParam3()
	{
		return param3;
	}

	
	public void setParam3(String param3)
	{
		this.param3 = param3;
	}
}
