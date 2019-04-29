package library;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IListeners;

public class ListenersDemo implements ITestListener {
  

@Override
public void onTestStart(ITestResult result) {
	System.out.println("result ontest start is"+" "+result.getName());
	
}

@Override
public void onTestSuccess(ITestResult result) {
	System.out.println("result onTestSuccess is"+" "+result.getName());
	
}

@Override
public void onTestFailure(ITestResult result) {
	System.out.println("result onTestFailure is"+" "+result.getName());
	
}

@Override
public void onTestSkipped(ITestResult result) {
	System.out.println("result onTestSkipped is"+" "+result.getName());
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}




}
