package com.javacore.steve.db;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DataBase {

    public static final String[] CRIMINALS_COLUMNS = new String[]{
            "id", "firstName", "lastName" //field from model
    };

    public static final String[] CRIMINAL_FAMILY_COLUMNS = {"id, name"};
    public static final Map<String, Table> tables;

    static {
        tables = new HashMap<>();
        tables.put("Criminals", new Table("Criminals", Arrays.asList(CRIMINALS_COLUMNS)));
        tables.put("CrimeFamily", new Table("CrimeFamily", Arrays.asList(CRIMINAL_FAMILY_COLUMNS)));
    }

    private Object tableLock = new Object();

    public DataBase() {
        init();
    }

    private static List<String[]> readDataFile(String fileName) {
        FileInputStream fis = null;
        List<String[]> result = new ArrayList<>();
        BufferedReader br;
        try {
            fis = new FileInputStream(fileName);
            br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                // System.out.println(line);
                result.add(line.split(";"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public void init() {

        String absolutePath = "/home/dasha/IdeaProjects/Stevie/resources/Criminals.tbl";

        List<String[]> records = readDataFile(absolutePath);
        Table criminalTable = tables.get("Criminals");
        for (String[] values : records) {
            Record record = new Record(criminalTable);
            record.setValues(values);
            criminalTable.insert(record);
        }

        //load data to tables
    }

    public List<Record> select() {
        System.out.println("Starting fetching records...");
        synchronized (tableLock) {
            try {
                Thread.sleep(500);
                System.out.println("Finished fetching..");
            } catch (InterruptedException e) {
            }
        }
        return null;
    }

    public synchronized void update() {
        System.out.println("Starting updating records...");
        synchronized (tableLock) {
            try {
                Thread.sleep(10000);
                System.out.println("Finished..");
            } catch (InterruptedException e) {

            }


        }
    }

    public void delete() {

    }

    public void insert(Record record, Table table) {

    }
}
