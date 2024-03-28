package in.Amazon;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalayzer implements  IRetryAnalyzer{

	int a=1;
	int b=2;
	public boolean retry(ITestResult result) {
		if(a<b) {
			a++;
		Object instance = result.getInstance();
		System.out.println(instance);
		return true;
	}
		return false;
	}
}
