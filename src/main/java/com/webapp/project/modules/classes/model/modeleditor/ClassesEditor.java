package com.webapp.project.modules.classes.model.modeleditor;

import java.beans.PropertyEditorSupport;
import java.util.HashMap;
import java.util.Map;

import com.webapp.project.modules.classes.model.Classes;
public class ClassesEditor extends PropertyEditorSupport{

    //This will be called when user HTTP Post to server a field bound to DepartmentVO
    public void setAsText(String id) 

    {
    	Map<String,Classes> classesMap = new HashMap();
    	classesMap.put("Class one",new Classes(1,  "Class one")); 
    	classesMap.put("Class two",new Classes(2,  "Class two"));
    	
    	Classes d = null;
       if(classesMap.get(id)!=null){
    	   d = classesMap.get(id);
       }
        this.setValue(d);
    }
}
