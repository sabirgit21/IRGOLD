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
// ---    Thu Feb 04 16:02:05 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblEmpAllImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        EmpId,
        AllowanceId,
        QtyAmt,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        TblEmp,
        TblAllowance;
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
    public static final int EMPID = AttributesEnum.EmpId.index();
    public static final int ALLOWANCEID = AttributesEnum.AllowanceId.index();
    public static final int QTYAMT = AttributesEnum.QtyAmt.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int TBLEMP = AttributesEnum.TblEmp.index();
    public static final int TBLALLOWANCE = AttributesEnum.TblAllowance.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblEmpAllImpl() {
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
     * Gets the attribute value for EmpId, using the alias name EmpId.
     * @return the value of EmpId
     */
    public BigDecimal getEmpId() {
        return (BigDecimal) getAttributeInternal(EMPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmpId.
     * @param value value to set the EmpId
     */
    public void setEmpId(BigDecimal value) {
        setAttributeInternal(EMPID, value);
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
     * Gets the attribute value for QtyAmt, using the alias name QtyAmt.
     * @return the value of QtyAmt
     */
    public BigDecimal getQtyAmt() {
        return (BigDecimal) getAttributeInternal(QTYAMT);
    }

    /**
     * Sets <code>value</code> as the attribute value for QtyAmt.
     * @param value value to set the QtyAmt
     */
    public void setQtyAmt(BigDecimal value) {
        setAttributeInternal(QTYAMT, value);
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
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblEmp() {
        return (EntityImpl) getAttributeInternal(TBLEMP);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblEmp(EntityImpl value) {
        setAttributeInternal(TBLEMP, value);
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
        return EntityDefImpl.findDefObject("model.ERP.EO.TblEmpAll");
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

