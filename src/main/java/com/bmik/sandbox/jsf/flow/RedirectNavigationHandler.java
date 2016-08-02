package com.bmik.sandbox.jsf.flow;

import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.application.NavigationCase;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import java.util.Map;
import java.util.Set;

/**
 * Created by Bart³omiej Mike (ebamike) on 2016-08-02.
 */
public class RedirectNavigationHandler extends ConfigurableNavigationHandler {

    private NavigationHandler parent;

    public RedirectNavigationHandler(NavigationHandler parent) {
        this.parent = parent;
    }

    @Override
    public NavigationCase getNavigationCase(FacesContext facesContext, String s, String s1) {
        if (parent instanceof ConfigurableNavigationHandler) {
            return ((ConfigurableNavigationHandler) parent).getNavigationCase(facesContext, s, s1);
        } else {
            return null;
        }
    }

    @Override
    public Map<String, Set<NavigationCase>> getNavigationCases() {
        if (parent instanceof ConfigurableNavigationHandler) {
            return ((ConfigurableNavigationHandler) parent).getNavigationCases();
        } else {
            return null;
        }
    }

    @Override
    public void handleNavigation(FacesContext facesContext, String s, String s1) {
        if (!s1.endsWith("?faces-redirect=true")) {
            s1 += "?faces-redirect=true";
        }

        parent.handleNavigation(facesContext, s, s1);
    }
}
