package com.javacore.steve.encryptor;


public class MainDataEncryptor implements DataEncryptor {
    String encryptionLevel;

    public MainDataEncryptor(String encryptionLevel) {
        this.encryptionLevel = encryptionLevel;
    }

    @Override
    public String encrypt(String text) {
        if (encryptionLevel.equals("LOW")) {
            return encryptLOW(text);
        }
        if (encryptionLevel.equals("MED")) {
            return encryptMED(text);
        }
        return null;
    }

    private String encryptLOW(String text) {
        StringBuilder res = new StringBuilder();
        for (char ch : text.toCharArray()) {
            String hex = String.format("%04x", (int) ch);
            res.append(hex);
        }
        //to hex
        return res.toString();
    }

    private String encryptMED(String text) {
        StringBuilder res = new StringBuilder();
        for (char ch : text.toCharArray()) {

        }
        //to hex
        return res.toString();
    }

    private String encryptHIGH(String text) {
        return null;
    }

}
