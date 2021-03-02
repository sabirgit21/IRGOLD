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
// ---    Thu Feb 04 17:13:18 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblIgpMImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        Vno,
        Vtp,
        Dated,
        PoMId,
        Narration,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        CompanySbuId,
        OrdType,
        IpoMId,
        TblIgpD,
        TblPoM,
        TblQcM;
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
    public static final int POMID = AttributesEnum.PoMId.index();
    public static final int NARRATION = AttributesEnum.Narration.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int COMPANYSBUID = AttributesEnum.CompanySbuId.index();
    public static final int ORDTYPE = AttributesEnum.OrdType.index();
    public static final int IPOMID = AttributesEnum.IpoMId.index();
    public static final int TBLIGPD = AttributesEnum.TblIgpD.index();
    public static final int TBLPOM = AttributesEnum.TblPoM.index();
    public static final int TBLQCM = AttributesEnum.TblQcM.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblIgpMImpl() {
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
    public Number getVno() {
        return (Number) getAttributeInternal(VNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Vno.
     * @param value value to set the Vno
     */
    public void setVno(Number value) {
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
     * Gets the attribute value for PoMId, using the alias name PoMId.
     * @return the value of PoMId
     */
    public BigDecimal getPoMId() {
        return (BigDecimal) getAttributeInternal(POMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PoMId.
     * @param value value to set the PoMId
     */
    public void setPoMId(BigDecimal value) {
        setAttributeInternal(POMID, value);
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
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
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
     * Gets the attribute value for OrdType, using the alias name OrdType.
     * @return the value of OrdType
     */
    public String getOrdType() {
        return (String) getAttributeInternal(ORDTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrdType.
     * @param value value to set the OrdType
     */
    public void setOrdType(String value) {
        setAttributeInternal(ORDTYPE, value);
    }

    /**
     * Gets the attribute value for IpoMId, using the alias name IpoMId.
     * @return the value of IpoMId
     */
    public BigDecimal getIpoMId() {
        return (BigDecimal) getAttributeInternal(IPOMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for IpoMId.
     * @param value value to set the IpoMId
     */
    public void setIpoMId(BigDecimal value) {
        setAttributeInternal(IPOMID, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblIgpD() {
        return (RowIterator) getAttributeInternal(TBLIGPD);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblPoM() {
        return (EntityImpl) getAttributeInternal(TBLPOM);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblPoM(EntityImpl value) {
        setAttributeInternal(TBLPOM, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblQcM() {
        return (RowIterator) getAttributeInternal(TBLQCM);
    }

    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal id) {
        return new Key(new Object[] { id });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblIgpM");
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

