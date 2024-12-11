package com.example.mongodb.pre.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "STORAGE_CLASS")
public class StorageClass {

    @Field("STATUS")
    private String status;

    @Field("FIELD_NUMBER")
    private long numberField;

    public long getNumberField() {
        return numberField;
    }

    public void setNumberField(long numberField) {
        this.numberField = numberField;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StorageClass{" +
            "status='" + status + '\'' +
            ", numberField=" + numberField +
            '}';
    }
}
