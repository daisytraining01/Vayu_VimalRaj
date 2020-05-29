package com.vayu.hooks;

import com.vayu.action.ActionClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	ActionClass actionObj;
	public  Hooks(ActionClass actionObj){
		this.actionObj=actionObj;
		System.out.println("Hi Hooks");
	}
	
	
	
	@Before
	public void displayBefore(){
		System.out.println("Before");
		actionObj.LauchBrowser();
		
	}
	
	@After
	public void displayAfter(){
		System.out.println("After");
		actionObj.terminate();
	}

}
