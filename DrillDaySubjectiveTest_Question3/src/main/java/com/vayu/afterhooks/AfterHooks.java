package com.vayu.afterhooks;

import com.vayu.action.ActionClass;

import cucumber.api.java.After;

public class AfterHooks {
	ActionClass actionObj;
	public  AfterHooks(ActionClass actionObj){
		this.actionObj=actionObj;
		System.out.println("Hi Hooks");
	}
	
	@After
	public void displayAfter(){
		System.out.println("After");
		actionObj.terminate();
	}

}
