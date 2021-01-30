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

    public void getDNReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendDNID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendDNID");
        reportBean.setReportParameter("P_DNMID", sendDNID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Debit_Notes_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getDOReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendDOID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendDOID");
        reportBean.setReportParameter("P_DOMID", sendDOID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Demand_Order_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getGINReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendGINID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendGINID");
        reportBean.setReportParameter("P_GINMID", sendGINID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Good_Issue_Notes_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getGRNReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendGRNID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendGRNID");
        reportBean.setReportParameter("P_GRNMID", sendGRNID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Good_Receipt_Notes_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getITNReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendITNMID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendITNMID");
        reportBean.setReportParameter("P_ITNMID", sendITNMID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Inter_Transfer__Notes_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getIGPReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendIGPID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendIGPID");
        reportBean.setReportParameter("P_IGPMID", sendIGPID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Inward_Gate_Pass_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
        
    }

    public void GetPOReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendPOID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendPOID");
        reportBean.setReportParameter("P_POMID", sendPOID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Purchase_Order_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getQCRReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendQCRID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendQCRID");
        reportBean.setReportParameter("P_QCRID", sendQCRID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Quality_Inspection_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getBOQReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendBOQID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendBOQID");
        reportBean.setReportParameter("P_Boq_M_id", sendBOQID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Batch_Order_Quantity_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }


    public void getFGTReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendFGTID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendFGTID");
        reportBean.setReportParameter("P_Fgt_M_id", sendFGTID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Finish_Goods_Transfer_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }
    
    public void getProFgReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendProFgID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendProFgID");
        reportBean.setReportParameter("P_Pro_Fg_M_id", sendProFgID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Production_Finish_Goods_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }
    public void getPorMasterReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendPorMasterID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendPorMasterID");
        reportBean.setReportParameter("P_Pro_M_id", sendPorMasterID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Production_Order_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }
    
    
    public void getProIssMasterReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        BigDecimal sendProIssMID = (BigDecimal) actionEvent.getComponent().getAttributes().get("sendProIssMID");
        reportBean.setReportParameter("P_Pro_Iss_M_id", sendProIssMID.toString());
        
        reportBean.setReportURLName("userid=irgc/irgc@orcl&domain=classicdomain&report=C:/IRGC_Reports/Production_Issuance_Detail&");
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