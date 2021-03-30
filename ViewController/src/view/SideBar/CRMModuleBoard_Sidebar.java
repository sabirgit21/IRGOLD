package view.SideBar;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;

public class CRMModuleBoard_Sidebar implements Serializable {
    private String taskFlowId =
        "/WEB-INF/TaskFlows/Group/Company/SBU/Modules/Customer_Relationship_Management/Customer_Relationship_Management_TaskFlow.xml#Customer_Relationship_Management_TaskFlow";

    public CRMModuleBoard_Sidebar() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }
    
    public void CRMSetupFragmentCall(ActionEvent actionEvent) {
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/TaskFlows/Group/Company/SBU/Modules/Customer_Relationship_Management/CRM_Setup/");
        link.append(action);
        link.append(".xml#");
        link.append(action);
        setDynamicTaskFlowId(link.toString());
    }
    
    public void CRMTransactionFragmentCall(ActionEvent actionEvent) {
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/TaskFlows/Group/Company/SBU/Modules/Customer_Relationship_Management/CRM_Transaction/");
        link.append(action);
        link.append(".xml#");
        link.append(action);
        setDynamicTaskFlowId(link.toString());
    }
}
