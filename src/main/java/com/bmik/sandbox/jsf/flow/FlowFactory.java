package com.bmik.sandbox.jsf.flow;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;
import java.io.Serializable;

/**
 * Created by bmik on 2016-06-13.
 */
public class FlowFactory implements Serializable {

    private static final long serialVersionUID = 2649145095889446276L;

    @Produces
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {


        String flowId = "myFlow";
        flowBuilder.id("", flowId);

        String view1Id = "view1Id";
        flowBuilder.viewNode(view1Id, "/flows/flow1/my-flow.xhtml")
                .markAsStartNode();

        String view2Id = "view2Id";
        flowBuilder.viewNode(view2Id, "/flows/flow1/my-flow-2.xhtml");

        String view3Id = "view3Id";
        flowBuilder.viewNode(view3Id, "/flows/flow1/my-flow-3.xhtml");

        String endId = "end-flow";
        flowBuilder.returnNode(endId)
                .fromOutcome("/faces/index.xhtml?faces-redirect=true");

        return flowBuilder.getFlow();

    }

}
