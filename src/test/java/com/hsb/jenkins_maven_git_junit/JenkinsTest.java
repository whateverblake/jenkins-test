package com.hsb.jenkins_maven_git_junit;

import org.junit.Test;

public class JenkinsTest {
	
	
	@Test
	public void testSayHello(){
		
		JenkinsApp app = new JenkinsApp();
		
		System.out.println(app.sayHello());
		
	}
	

}
