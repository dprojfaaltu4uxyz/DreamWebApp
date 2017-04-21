package com.webapp.project.modules.teacher.model.modeleditor;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.webapp.project.modules.teacher.model.Teacher;

public class TeacherEditor extends PropertyEditorSupport{

    //This will be called when user HTTP Post to server a field bound to DepartmentVO
    public void setAsText(String id) 
    {
    	Map<String,Teacher> teacherMap = new HashMap();
    	teacherMap.put("Akshay",new Teacher(3,  "Akshay"));
    	teacherMap.put("Gautam",new Teacher(2,  "Gautam"));
    	
        Teacher d = null;
       if(teacherMap.get(id)!=null){
    	   d = teacherMap.get(id);
       }
        this.setValue(d);
    }
}
