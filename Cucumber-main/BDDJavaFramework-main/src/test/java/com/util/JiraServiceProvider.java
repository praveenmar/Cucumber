package com.util;
import net.rcarz.jiraclient.*;
import net.rcarz.jiraclient.Issue.FluentCreate;
import utils.jiraconfig;

import java.io.IOException;

public class JiraServiceProvider extends jiraconfig {
	public static JiraClient jira;
	public String project;

	jiraconfig jiraobj = new jiraconfig();

	public JiraServiceProvider(String jiraUrl, String username, String password, String project) {
		BasicCredentials creds = new BasicCredentials(username, password);
		jira = new JiraClient(jiraUrl, creds);
		this.project = project;
	}

	public void createJiraTicketForFail(String issueType, String summary, String description, String reporterName)
	{
		try {
			FluentCreate fleuntCreate = jira.createIssue(project, issueType);
			fleuntCreate.field(Field.SUMMARY, summary);
			String ticked_id = jiraobj.load("ticket_id");
			fleuntCreate.field(Field.DESCRIPTION,description + "Bug Raised For Old Issue OF ID : " + ticked_id);
			Issue newIssue = fleuntCreate.execute();
			System.out.println("New Issue Raised : " + newIssue + ", For Old Issue No : " + ticked_id);

		} catch (JiraException | IOException e) {
			e.printStackTrace();
		}
	}
	public static void changeStateFromProgressToDone() throws JiraException
	{
		Issue issue = jira.getIssue("SP-38");
		System.out.println(issue);
	}
}
