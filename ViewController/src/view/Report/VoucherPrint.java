package view.Report;

import java.math.BigDecimal;

import javax.faces.event.ActionEvent;

import view.DatabaseConnection.DatabaseConnection;

public class VoucherPrint {
    public VoucherPrint() {
    }
    DatabaseConnection dbconnect = new DatabaseConnection();
    OracleReportBean reportBean = new OracleReportBean(dbconnect.getUipReport(), dbconnect.getUportReport(), null);
    

    public void getStdRegReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendStdRegID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendStdRegID");
        reportBean.setReportParameter("P_Std_reg_id", sendStdRegID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Student_Registration_Voucher&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getStaffReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendStaffID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendStaffID");
        reportBean.setReportParameter("P_Staff_id", sendStaffID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Staff_Detail_Voucher&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getEnquiryFollowUpReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendEnqFollowUpID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendEnqFollowUpID");
        reportBean.setReportParameter("P_Enq_Follow_up_id", sendEnqFollowUpID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Enquiry_Follow_Up_Voucher&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getGradeAttReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendGradeAttID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendGradeAttID");
        reportBean.setReportParameter("P_Grade_Att_M_ID", sendGradeAttID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Grade_ATT_Voucher&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getStdEnqReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendStdEnqID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendStdEnqID");
        reportBean.setReportParameter("P_Std_Enq_id", sendStdEnqID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Student_Enquiry_With_Follow_Up_Voucher&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getBPVReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendBPVMID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendBPVMID");
        reportBean.setReportParameter("P_BPV_M_id", sendBPVMID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Bank_Payment_GL_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getBRVReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendBRVMID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendBRVMID");
        reportBean.setReportParameter("P_BRV_M_id", sendBRVMID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Bank_Reciept_GL_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getCPVReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendCPVMID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendCPVMID");
        reportBean.setReportParameter("P_CPV_M_id", sendCPVMID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Cash_Payment_GL_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getCRVReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendCRVMID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendCRVMID");
        reportBean.setReportParameter("P_CRV_M_id", sendCRVMID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Cash_Reciept_GL_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getJVReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendJVMID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendJVMID");
        reportBean.setReportParameter("P_JV_M_id", sendJVMID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Journal_Voucher_GL_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getPBPReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendPBPMID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendPBPMID");
        reportBean.setReportParameter("P_PBP_M_id", sendPBPMID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Bank_Payment_Payable_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getPCPReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendPCPMID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendPCPMID");
        reportBean.setReportParameter("P_PCP_M_id", sendPCPMID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Cash_Payment_Payable_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getGLCOAReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Chart_of_Account_GL_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getINVCOAReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Chart_of_Account_INV_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getINVOBReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Opening_Balance_INV_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getINVDEPReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Department_INV_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getINVUOMReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/UOM_INV_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }
}
