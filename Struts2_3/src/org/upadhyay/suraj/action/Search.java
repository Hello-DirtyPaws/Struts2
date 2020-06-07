package org.upadhyay.suraj.action;

public class Search
{
	private String searchStr;
	private String displayMsg;
	
	public String getDisplayMsg()
	{
		return displayMsg;
	}

	public void setDisplayMsg(String displayMsg)
	{
		this.displayMsg = displayMsg;
	}

	public String execute()
	{
		if(searchStr.equalsIgnoreCase("java"))
		{
			displayMsg = "Java language found!";
		}
		else
		{
			displayMsg = searchStr + " language not found!";
		}
			
		return "s";
	}

	public String getSearchStr()
	{
		return searchStr;
	}

	public void setSearchStr(String searchStr)
	{
		this.searchStr = searchStr;
	}
}
