package org.lyx.pojo;


import java.io.Serializable;

public class DataDictionary implements Serializable {
    private int id;
    private String typeCode;
    private String typeName;
    private int valueId;
    private String valueName;
    private int createBy;
    private String creationDate;
    private int modifyBy;
    private String modifyDate;

    public DataDictionary() {
    }

    public DataDictionary(int id, String typeCode, String typeName, int valueId, String valueName, int createBy, String creationDate, int modifyBy, String modifyDate) {
        this.id = id;
        this.typeCode = typeCode;
        this.typeName = typeName;
        this.valueId = valueId;
        this.valueName = valueName;
        this.createBy = createBy;
        this.creationDate = creationDate;
        this.modifyBy = modifyBy;
        this.modifyDate = modifyDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getValueId() {
        return valueId;
    }

    public void setValueId(int valueId) {
        this.valueId = valueId;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public int getCreateBy() {
        return createBy;
    }

    public void setCreateBy(int createBy) {
        this.createBy = createBy;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public int getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(int modifyBy) {
        this.modifyBy = modifyBy;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }
}
