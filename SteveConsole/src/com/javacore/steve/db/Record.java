package com.javacore.steve.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Record {

    List<String> values;
    List<String> columns;

    {
        values = new ArrayList<>();
    }


    public Record(Table table) {
        columns = table.getColumns();

    }

    public void setValues(String[] values) {
        this.values.clear();
        this.values = Arrays.asList(values);
    }

    public String getString(String fieldName) throws FieldNotFoundException {
        int index = columns.indexOf(fieldName);
        if (index == -1) {
            throw new FieldNotFoundException("Field not Found:   " + fieldName);
        }
        return values.get(index);
    }

    public int getInt(String fieldName) throws FieldNotFoundException {
        int index = columns.indexOf(fieldName);
        if (index == -1) {
            throw new FieldNotFoundException("Field not Found:   " + fieldName);
        }
        return Integer.parseInt(values.get(index));
    }

    public int getInt(String fieldName, int defaultValue) throws FieldNotFoundException {
        int index = columns.indexOf(fieldName);
        if (index == -1) {
            throw new FieldNotFoundException("Field not Found:   " + fieldName);
        }
        String valueString = values.get(index);
        if (valueString == null) {
            return defaultValue;
        }
        return Integer.parseInt(valueString);
    }

    public boolean getBoolean(String fieldName) throws FieldNotFoundException {
        int index = columns.indexOf(fieldName);
        if (index == -1) {
            throw new FieldNotFoundException("Field not Found:   " + fieldName);
        }

        String value = values.get(index);
        return Boolean.valueOf(value);

    }

    public class FieldNotFoundException extends Exception {
        FieldNotFoundException(String msg) {
            super(msg);
        }
    }


}