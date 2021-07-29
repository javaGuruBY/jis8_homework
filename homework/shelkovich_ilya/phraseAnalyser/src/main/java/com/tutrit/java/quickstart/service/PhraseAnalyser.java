package com.tutrit.java.quickstart.service;

public class PhraseAnalyser {
    public String analyse(String phrase){
        for (var i = 0; i < phrase.length(); i++){
            if (phrase.startsWith("Make") && phrase.endsWith("great again")){
                return "It stands no chance";
            } else if (phrase.startsWith("Make") || phrase.endsWith("great again")){
                return "It could be worse";
            }
        }  return "It is fine, really";
    }
}
