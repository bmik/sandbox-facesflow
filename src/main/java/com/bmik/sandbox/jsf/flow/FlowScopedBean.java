package com.bmik.sandbox.jsf.flow;

import javax.annotation.PostConstruct;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by bmik on 2016-06-14.
 */
@Named
@FlowScoped(value = "myFlow")
public class FlowScopedBean implements Serializable {

    private static final long serialVersionUID = -2509490831703976482L;

    @PostConstruct
    public void init(){
        System.out.println("init");
    }

    private String veryImportantString;

    public void finalizer() {
        System.out.println("end");
    }


    public String getVeryImportantString() {
        return veryImportantString;
    }

    public void setVeryImportantString(String veryImportantString) {
        this.veryImportantString = veryImportantString;
    }

}
