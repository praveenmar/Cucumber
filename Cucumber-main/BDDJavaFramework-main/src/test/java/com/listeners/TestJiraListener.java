package com.listeners;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.util.JiraPolicy;
import com.util.JiraServiceProvider;
import utils.jiraconfig;

import java.io.IOException;
import java.util.Properties;

public class TestJiraListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
			System.out.println("Bang");
//		try {
//			JiraServiceProvider jsp = new JiraServiceProvider("https://selinium-test.atlassian.net/",
//					"praveenmaroju217@gmail.com", "ju3Sy7QabuBKDOnWtp3T7478", "SP");
//			jsp.changeStateFromProgressToDone();
//		} catch (JiraException e) {
//			throw new RuntimeException(e);
//		}
	}

	@Override
	public void onTestFailure(ITestResult result)  {
		jiraconfig jc = new jiraconfig();
		JiraPolicy jiraPolicy = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraPolicy.class);
		boolean isTicketReady = jiraPolicy.logTicketReady();
		if (isTicketReady) {
			// raise jira ticket:
			System.out.println("is ticket ready for JIRA: " + isTicketReady);
			JiraServiceProvider jiraSp = null;
			try
			{
				jiraSp = new JiraServiceProvider(
						jc.load("jira_url"),
						jc.load("jira_username"),
						jc.load("jira_password"),
						jc.load("jira_project")
				);
			}
			catch (IOException e)
			{
				throw new RuntimeException(e);
			}
			String issueSummary = result.getMethod().getConstructorOrMethod().getMethod().getName()
					+ "got failed due to some assertion or exception";
			String issueDescription = result.getThrowable().getMessage() + "\n";
			issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));

			try {
				jiraSp.createJiraTicketForFail(
						jc.load("jira_issue_type"),
						issueSummary,
						issueDescription,
						jc.load("jira_reporter")

				);
			}
			catch (IOException e)
			{
				throw new RuntimeException(e);
			}
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {


	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {


	}

	@Override
	public void onStart(ITestContext context) {


	}

	@Override
	public void onFinish(ITestContext context) {


	}
}
