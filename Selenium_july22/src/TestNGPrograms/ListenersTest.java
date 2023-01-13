package TestNGPrograms;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.testng.IAnnotationTransformer;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.xml.XmlSuite;

public class ListenersTest implements ITestListener, IReporter, IInvokedMethodListener, IAnnotationTransformer{

	
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(TestNGPrograms.RetryAnalyzer.class);
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		 System.out.println("Before Invocation Method Started For: " + method.getTestMethod().getMethodName() + "of Class:" + testResult.getTestClass());		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("After Invocation Method Started For: " + method.getTestMethod().getMethodName() + "of Class:" + testResult.getTestClass());
	}

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		 //Iterate over every suite assigned for execution
	      for (ISuite suite : suites) {
	            
	         String suiteName = suite.getName();
	         Map<String, ISuiteResult> suiteResults = suite.getResults();
	         for (ISuiteResult sr : suiteResults.values()) {
	            ITestContext tc = sr.getTestContext();
	            System.out.println("Passed tests for suite '" + suiteName +
	               "' is:" + tc.getPassedTests().getAllResults().size());
	            System.out.println("Failed tests for suite '" + suiteName +
	               "' is:" + tc.getFailedTests().getAllResults().size());
	            System.out.println("Skipped tests for suite '" + suiteName +
	               "' is:" + tc.getSkippedTests().getAllResults().size());
	         }
	      }
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("New Test Started : " +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on Test Success Method : " +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("on Test Failure Method : " +result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("on Test Skip Method : " +result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("on Test Failed But Within Success Percentage : " +result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("on Test Failed WithTimeout : " +result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart method started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish method started");
	}

}
