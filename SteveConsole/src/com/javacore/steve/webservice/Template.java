package com.javacore.steve.webservice;

import java.util.Map;

public class Template {
    public String templateFileName;//criminalProfile.html//html page
    public Map<String, String> values;

    public Template(String fileNme, Map<String, String> values) {
        this.values = values;
        // this.templateFileName;
    }

    public String compile() {
        String templateText = Utils.readFileIntoString(templateFileName);
        for (String key : values.keySet()) {
            templateText = templateText.replace("{{" + key + "}}", values.get(key));
        }
        return templateText;
    }
    //values.put("firstName")
}
