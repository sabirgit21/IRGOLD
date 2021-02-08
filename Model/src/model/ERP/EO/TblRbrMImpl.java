package model.ERP.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Feb 04 12:34:57 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblRbrMImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        Vno,
        Vtp,
        Dated,
        ChqNo,
        ChqDate,
        ClrDate,
        Narration,
        RblCustId,
        SaleInvMId,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        BankCashId,
        FrDate,
        ToDate,
        CompanySbuId,
        TblRbrD;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ID = AttributesEnum.Id.index();
    public static final int VNO = AttributesEnum.Vno.index();
    public static final int VTP = AttributesEnum.Vtp.index();
    public static final int DATED = AttributesEnum.Dated.index();
    public static final int CHQNO = AttributesEnum.ChqNo.index();
    public static final int CHQDATE = AttributesEnum.ChqDate.index();
    public static final int CLRDATE = AttributesEnum.ClrDate.index();
    public static final int NARRATION = AttributesEnum.Narration.index();
    public static final int RBLCUSTID = AttributesEnum.RblCustId.index();
    public static final int SALEINVMID = AttributesEnum.SaleInvMId.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int BANKCASHID = AttributesEnum.BankCashId.index();
    public static final int FRDATE = AttributesEnum.FrDate.index();
    public static final int TODATE = AttributesEnum.ToDate.index();
    public static final int COMPANYSBUID = AttributesEnum.CompanySbuId.index();
    public static final int TBLRBRD = AttributesEnum.TblRbrD.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblRbrMImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblRbrM");
    }


    /**
     * Gets the attribute value for Id, using the alias name Id.
     * @return the value of Id
     */
    public BigDecimal getId() {
        return (BigDecimal) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Id.
     * @param value value to set the Id
     */
    public void setId(BigDecimal value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for Vno, using the alias name Vno.
     * @return the value of Vno
     */
    public String getVno() {
        return (String) getAttributeInternal(VNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Vno.
     * @param value value to set the Vno
     */
    public void setVno(String value) {
        setAttributeInternal(VNO, value);
    }

    /**
     * Gets the attribute value for Vtp, using the alias name Vtp.
     * @return the value of Vtp
     */
    public String getVtp() {
        return (String) getAttributeInternal(VTP);
    }

    /**
     * Sets <code>value</code> as the attribute value for Vtp.
     * @param value value to set the Vtp
     */
    public void setVtp(String value) {
        setAttributeInternal(VTP, value);
    }

    /**
     * Gets the attribute value for Dated, using the alias name Dated.
     * @return the value of Dated
     */
    public Timestamp getDated() {
        return (Timestamp) getAttributeInternal(DATED);
    }

    /**
     * Sets <code>value</code> as the attribute value for Dated.
     * @param value value to set the Dated
     */
    public void setDated(Timestamp value) {
        setAttributeInternal(DATED, value);
    }

    /**
     * Gets the attribute value for ChqNo, using the alias name ChqNo.
     * @return the value of ChqNo
     */
    public String getChqNo() {
        return (String) getAttributeInternal(CHQNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChqNo.
     * @param value value to set the ChqNo
     */
    public void setChqNo(String value) {
        setAttributeInternal(CHQNO, value);
    }

    /**
     * Gets the attribute value for ChqDate, using the alias name ChqDate.
     * @return the value of ChqDate
     */
    public Timestamp getChqDate() {
        return (Timestamp) getAttributeInternal(CHQDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChqDate.
     * @param value value to set the ChqDate
     */
    public void setChqDate(Timestamp value) {
        setAttributeInternal(CHQDATE, value);
    }

    /**
     * Gets the attribute value for ClrDate, using the alias name ClrDate.
     * @return the value of ClrDate
     */
    public Timestamp getClrDate() {
        return (Timestamp) getAttributeInternal(CLRDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ClrDate.
     * @param value value to set the ClrDate
     */
    public void setClrDate(Timestamp value) {
        setAttributeInternal(CLRDATE, value);
    }

    /**
     * Gets the attribute value for Narration, using the alias name Narration.
     * @return the value of Narration
     */
    public String getNarration() {
        return (String) getAttributeInternal(NARRATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Narration.
     * @param value value to set the Narration
     */
    public void setNarration(String value) {
        setAttributeInternal(NARRATION, value);
    }

    /**
     * Gets the attribute value for RblCustId, using the alias name RblCustId.
     * @return the value of RblCustId
     */
    public BigDecimal getRblCustId() {
        return (BigDecimal) getAttributeInternal(RBLCUSTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RblCustId.
     * @param value value to set the RblCustId
     */
    public void setRblCustId(BigDecimal value) {
        setAttributeInternal(RBLCUSTID, value);
    }

    /**
     * Gets the attribute value for SaleInvMId, using the alias name SaleInvMId.
     * @return the value of SaleInvMId
     */
    public BigDecimal getSaleInvMId() {
        return (BigDecimal) getAttributeInternal(SALEINVMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SaleInvMId.
     * @param value value to set the SaleInvMId
     */
    public void setSaleInvMId(BigDecimal value) {
        setAttributeInternal(SALEINVMID, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }


    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public oracle.jbo.domain.Number getCreatedBy() {
        return (oracle.jbo.domain.Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(oracle.jbo.domain.Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
    }


    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public Number getUpdatedBy() {
        return (Number) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(Number value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for BankCashId, using the alias name BankCashId.
     * @return the value of BankCashId
     */
    public BigDecimal getBankCashId() {
        return (BigDecimal) getAttributeInternal(BANKCASHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BankCashId.
     * @param value value to set the BankCashId
     */
    public void setBankCashId(BigDecimal value) {
        setAttributeInternal(BANKCASHID, value);
    }

    /**
     * Gets the attribute value for FrDate, using the alias name FrDate.
     * @return the value of FrDate
     */
    public Timestamp getFrDate() {
        return (Timestamp) getAttributeInternal(FRDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for FrDate.
     * @param value value to set the FrDate
     */
    public void setFrDate(Timestamp value) {
        setAttributeInternal(FRDATE, value);
    }

    /**
     * Gets the attribute value for ToDate, using the alias name ToDate.
     * @return the value of ToDate
     */
    public Timestamp getToDate() {
        return (Timestamp) getAttributeInternal(TODATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ToDate.
     * @param value value to set the ToDate
     */
    public void setToDate(Timestamp value) {
        setAttributeInternal(TODATE, value);
    }

    /**
     * Gets the attribute value for CompanySbuId, using the alias name CompanySbuId.
     * @return the value of CompanySbuId
     */
    public Number getCompanySbuId() {
        return (Number) getAttributeInternal(COMPANYSBUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompanySbuId.
     * @param value value to set the CompanySbuId
     */
    public void setCompanySbuId(Number value) {
        setAttributeInternal(COMPANYSBUID, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblRbrD() {
        return (RowIterator) getAttributeInternal(TBLRBRD);
    }


    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal id) {
        return new Key(new Object[] { id });
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Number userId = null;
                Number sbuId = null;
                 try {
                     userId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessUMID"));
                     
                     sbuId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessSBUID"));
                 } catch(Exception ex) {
                     ex.printStackTrace();
                 }
                 
                 if (operation == DML_INSERT) {

                     setCompanySbuId(sbuId);

                     setCreatedBy(userId);
                     setUpdatedBy(userId);
                     } else if(operation == DML_UPDATE) {
                     
                     setCompanySbuId(sbuId);
                     
                     setUpdatedBy(userId);
                 }
        super.doDML(operation, e);
    }
}

