package com.bmik.sandbox.jsf.flow;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.flow.FlowHandler;
import javax.inject.Named;

/**
 * Created by Bart³omiej Mike (ebamike) on 2016-08-03.
 */
@Named
@RequestScoped
public class Helper {

    public String redirectToIndex() {

        return "index";

    }

}
