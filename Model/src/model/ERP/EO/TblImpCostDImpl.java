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
// ---    Thu Feb 04 17:17:22 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblImpCostDImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        ImpCostMId,
        SrNo,
        ItemL4Id,
        Description,
        QCQty,
        Qty,
        BalQty,
        FcyRate,
        FcyAmount,
        LandedCost,
        Amount,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        TblImpCostM;
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
    public static final int IMPCOSTMID = AttributesEnum.ImpCostMId.index();
    public static final int SRNO = AttributesEnum.SrNo.index();
    public static final int ITEML4ID = AttributesEnum.ItemL4Id.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int QCQTY = AttributesEnum.QCQty.index();
    public static final int QTY = AttributesEnum.Qty.index();
    public static final int BALQTY = AttributesEnum.BalQty.index();
    public static final int FCYRATE = AttributesEnum.FcyRate.index();
    public static final int FCYAMOUNT = AttributesEnum.FcyAmount.index();
    public static final int LANDEDCOST = AttributesEnum.LandedCost.index();
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int TBLIMPCOSTM = AttributesEnum.TblImpCostM.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblImpCostDImpl() {
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
     * Gets the attribute value for ImpCostMId, using the alias name ImpCostMId.
     * @return the value of ImpCostMId
     */
    public BigDecimal getImpCostMId() {
        return (BigDecimal) getAttributeInternal(IMPCOSTMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ImpCostMId.
     * @param value value to set the ImpCostMId
     */
    public void setImpCostMId(BigDecimal value) {
        setAttributeInternal(IMPCOSTMID, value);
    }

    /**
     * Gets the attribute value for SrNo, using the alias name SrNo.
     * @return the value of SrNo
     */
    public Integer getSrNo() {
        return (Integer) getAttributeInternal(SRNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SrNo.
     * @param value value to set the SrNo
     */
    public void setSrNo(Integer value) {
        setAttributeInternal(SRNO, value);
    }

    /**
     * Gets the attribute value for ItemL4Id, using the alias name ItemL4Id.
     * @return the value of ItemL4Id
     */
    public BigDecimal getItemL4Id() {
        return (BigDecimal) getAttributeInternal(ITEML4ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemL4Id.
     * @param value value to set the ItemL4Id
     */
    public void setItemL4Id(BigDecimal value) {
        setAttributeInternal(ITEML4ID, value);
    }

    /**
     * Gets the attribute value for Description, using the alias name Description.
     * @return the value of Description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Description.
     * @param value value to set the Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for QCQty, using the alias name QCQty.
     * @return the value of QCQty
     */
    public BigDecimal getQCQty() {
        return (BigDecimal) getAttributeInternal(QCQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for QCQty.
     * @param value value to set the QCQty
     */
    public void setQCQty(BigDecimal value) {
        setAttributeInternal(QCQTY, value);
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
     * Gets the attribute value for BalQty, using the alias name BalQty.
     * @return the value of BalQty
     */
    public BigDecimal getBalQty() {
        return (BigDecimal) getAttributeInternal(BALQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for BalQty.
     * @param value value to set the BalQty
     */
    public void setBalQty(BigDecimal value) {
        setAttributeInternal(BALQTY, value);
    }

    /**
     * Gets the attribute value for FcyRate, using the alias name FcyRate.
     * @return the value of FcyRate
     */
    public BigDecimal getFcyRate() {
        return (BigDecimal) getAttributeInternal(FCYRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for FcyRate.
     * @param value value to set the FcyRate
     */
    public void setFcyRate(BigDecimal value) {
        setAttributeInternal(FCYRATE, value);
    }

    /**
     * Gets the attribute value for FcyAmount, using the alias name FcyAmount.
     * @return the value of FcyAmount
     */
    public BigDecimal getFcyAmount() {
        return (BigDecimal) getAttributeInternal(FCYAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for FcyAmount.
     * @param value value to set the FcyAmount
     */
    public void setFcyAmount(BigDecimal value) {
        setAttributeInternal(FCYAMOUNT, value);
    }

    /**
     * Gets the attribute value for LandedCost, using the alias name LandedCost.
     * @return the value of LandedCost
     */
    public BigDecimal getLandedCost() {
        return (BigDecimal) getAttributeInternal(LANDEDCOST);
    }

    /**
     * Sets <code>value</code> as the attribute value for LandedCost.
     * @param value value to set the LandedCost
     */
    public void setLandedCost(BigDecimal value) {
        setAttributeInternal(LANDEDCOST, value);
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
    public EntityImpl getTblImpCostM() {
        return (EntityImpl) getAttributeInternal(TBLIMPCOSTM);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblImpCostM(EntityImpl value) {
        setAttributeInternal(TBLIMPCOSTM, value);
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
        return EntityDefImpl.findDefObject("model.ERP.EO.TblImpCostD");
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
