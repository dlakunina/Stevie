package com.javacore.steve.db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Table {
    protected String name;

    protected List<String> columns;

    protected List<Record> records;

    {
        records = new ArrayList<Record>();
    }

    public Table(String name, List<String> columns) {
        this.name = name;
        this.columns = columns;
    }

    public void insert(Record record) {
        records.add(record);
    }

    public void select(String query) {
    }

    public List<String> getColumns() {

        return columns;
    }

    public List<String> selectField(String fieldName) {
        int index = columns.indexOf(fieldName);
        Iterator it = records.iterator();
        List<String> result = new ArrayList<>();
        while (it.hasNext()) {
            Record r = (Record) it.next();
            result.add(r.values.get(index));
        }

        return result;
    }

    public Record select(String fieldName, String fieldValue) {
        int index = columns.indexOf(fieldName);
        Iterator it = records.iterator();
        while (it.hasNext()) {
            Record r = (Record) it.next();
            String recordValue = r.values.get(index);
            if (recordValue.equals(fieldValue))
                return r;

        }

        return null;
    }
}