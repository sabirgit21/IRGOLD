package view.SideBar;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;

public class BankCashModuleBoard_Sidebar implements Serializable {
    private String taskFlowId =
        "/WEB-INF/TaskFlows/Group/Company/SBU/Modules/Bank_Cash/Bank_Cash_TaskFlow.xml#Bank_Cash_TaskFlow";

    public BankCashModuleBoard_Sidebar() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }
    public void BankCashSetupFragmentCall(ActionEvent actionEvent) {
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/TaskFlows/Group/Company/SBU/Modules/Bank_Cash/Bank_Cash_Setup/");
        link.append(action);
        link.append(".xml#");
        link.append(action);
        setDynamicTaskFlowId(link.toString());
    }
    
}
