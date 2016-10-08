package sree.spring.controller;

import java.beans.PropertyEditorSupport;

public class UserNameEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String name) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if(name.contains("Mr.") || name.contains("Mr.")){
			setValue(name);
		}else{
			name = "Mr."+name;
			setValue(name);
		}
		
	}


}
