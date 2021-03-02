package model.ERP.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Feb 04 16:45:28 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblGradeAllowanceImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        GradeId,
        AllowanceId,
        Amount,
        Qty,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        TblAllowance,
        TblHrGrade;
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
    public static final int GRADEID = AttributesEnum.GradeId.index();
    public static final int ALLOWANCEID = AttributesEnum.AllowanceId.index();
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int QTY = AttributesEnum.Qty.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int TBLALLOWANCE = AttributesEnum.TblAllowance.index();
    public static final int TBLHRGRADE = AttributesEnum.TblHrGrade.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblGradeAllowanceImpl() {
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
     * Gets the attribute value for GradeId, using the alias name GradeId.
     * @return the value of GradeId
     */
    public BigDecimal getGradeId() {
        return (BigDecimal) getAttributeInternal(GRADEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GradeId.
     * @param value value to set the GradeId
     */
    public void setGradeId(BigDecimal value) {
        setAttributeInternal(GRADEID, value);
    }

    /**
     * Gets the attribute value for AllowanceId, using the alias name AllowanceId.
     * @return the value of AllowanceId
     */
    public BigDecimal getAllowanceId() {
        return (BigDecimal) getAttributeInternal(ALLOWANCEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AllowanceId.
     * @param value value to set the AllowanceId
     */
    public void setAllowanceId(BigDecimal value) {
        setAttributeInternal(ALLOWANCEID, value);
    }

    /**
     * Gets the attribute value for Amount, using the alias name Amount.
     * @return the value of Amount
     */
    public BigDecimal getAmount() {
        return (BigDecimal) getAttributeInternal(AMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Amount.
     * @param value value to set the Amount
     */
    public void setAmount(BigDecimal value) {
        setAttributeInternal(AMOUNT, value);
    }

    /**
     * Gets the attribute value for Qty, using the alias name Qty.
     * @return the value of Qty
     */
    public BigDecimal getQty() {
        return (BigDecimal) getAttributeInternal(QTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Qty.
     * @param value value to set the Qty
     */
    public void setQty(BigDecimal value) {
        setAttributeInternal(QTY, value);
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
     * @return the associated entity TblAllowanceImpl.
     */
    public TblAllowanceImpl getTblAllowance() {
        return (TblAllowanceImpl) getAttributeInternal(TBLALLOWANCE);
    }

    /**
     * Sets <code>value</code> as the associated entity TblAllowanceImpl.
     */
    public void setTblAllowance(TblAllowanceImpl value) {
        setAttributeInternal(TBLALLOWANCE, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblHrGrade() {
        return (EntityImpl) getAttributeInternal(TBLHRGRADE);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblHrGrade(EntityImpl value) {
        setAttributeInternal(TBLHRGRADE, value);
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
        return EntityDefImpl.findDefObject("model.ERP.EO.TblGradeAllowance");
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
        Number loginId = null;
                                try {
                                    loginId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessUMID"));
                                } catch(Exception ex) {
                                    ex.printStackTrace();
                                }
                                
                                if (operation == DML_INSERT) {
                                    setCreatedBy(loginId);
                                    setUpdatedBy(loginId);
                                    } else if(operation == DML_UPDATE) {
                                    setUpdatedBy(loginId);
                                }
        super.doDML(operation, e);
    }
}

