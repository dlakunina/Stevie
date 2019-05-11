package com.javacore.steve.profile;

import java.util.HashMap;
import java.util.Map;

public enum ProfileStore {
    INSTANCE;

    Map<Integer, ProfileModel> profiles;

    {
        profiles = new HashMap<>();
    }

    public void loadData() {


    }

    public ProfileModel getProfile(int id) {
        Table criminalTable = DataBase.tables.get("Criminals");
        Record criminalRecord = criminalTable.select("id", Integer.toString(id));
        ProfileModel model = ProfileModel.modelFromRecord(criminalRecord);
        return model;
    }

}
