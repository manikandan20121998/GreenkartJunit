package org.test.greenkart;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.junit.runner.*;

public class Result {
	@Test
	public void ResultRep() {

		org.junit.runner.Result r = JUnitCore.runClasses(GreenKartJunit.class,Greenkart2.class);
		int failcount = r.getFailureCount();
		List<Failure> faillist = r.getFailures();
		int ignorecount = r.getIgnoreCount();
		int runcount = r.getRunCount();
		long runtime = r.getRunTime();
	//	RunListener createListener = r.createListener();
	boolean succesfull = r.wasSuccessful();
	
	System.out.println("failcount-------"+failcount);
	System.out.println("Ignorecount-------"+ignorecount);
	System.out.println("runcount----------"+runcount);
	System.out.println("runtime---------"+runtime);
	System.out.println("successfull-------"+succesfull);
//	System.out.println("createListener-------"+createListener);
	//System.out.println("faillist-------"+faillist);
	
	
	System.out.println("...............foreach loop..........");
	for (Failure x : faillist) {
		System.out.println(x.getMessage());
		System.out.println(x.getTestHeader());
		System.out.println(x.getException());
		
		
	}
	}
	
	

}
