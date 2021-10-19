package org.data;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class WithoutKnown implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation a, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer ir=a.getRetryAnalyzer();
		a.setRetryAnalyzer(WithKnowTest.class);
		
		
	}

}
