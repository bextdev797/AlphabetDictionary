package com.brandonang.alphabetdictionary;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;
import java.util.HashMap;

public class AlphabetDictionary extends AndroidNonvisibleComponent {
  private String letter;
  private String description;
  private HashMap<String, String> dictionaryMap;

  public AlphabetDictionary(ComponentContainer container) {
    super(container.$form());
    initializeDictionary();
  }
   
  private void initializeDictionary(){
    HashMap dictionaryMap = new HashMap();
    dictionaryMap.put("1st letter of the alphabet", "A");
    dictionaryMap.put("2nd letter of the alphabet", "B");
    dictionaryMap.put("3rd letter of the alphabet", "C");
    dictionaryMap.put("4th letter of the alphabet", "D");
    dictionaryMap.put("5th letter of the alphabet", "E");
    dictionaryMap.put("6th letter of the alphabet", "F");
    dictionaryMap.put("7th letter of the alphabet", "G");
    dictionaryMap.put("8th letter of the alphabet", "H");
    dictionaryMap.put("9th letter of the alphabet", "I");
    dictionaryMap.put("10th letter of the alphabet", "J");
    dictionaryMap.put("11th letter of the alphabet", "K");
    dictionaryMap.put("12th letter of the alphabet", "L");
    dictionaryMap.put("13th letter of the alphabet", "M");
    dictionaryMap.put("14th letter of the alphabet", "N");
    dictionaryMap.put("15th letter of the alphabet", "O");
    dictionaryMap.put("16th letter of the alphabet", "P");
    dictionaryMap.put("17th letter of the alphabet", "Q");
    dictionaryMap.put("18th letter of the alphabet", "R");
    dictionaryMap.put("19th letter of the alphabet", "S");
    dictionaryMap.put("20th letter of the alphabet", "T");
    dictionaryMap.put("21st letter of the alphabet", "U");
    dictionaryMap.put("22nd letter of the alphabet", "V");
    dictionaryMap.put("23rd letter of the alphabet", "W");
    dictionaryMap.put("24th letter of the alphabet", "X");
    dictionaryMap.put("25th letter of the alphabet", "Y");
    dictionaryMap.put("26th letter of the alphabet", "Z");
  }

  @SimpleFunction
  public void SearchAlphabetLetterDescription(String description){
    if(dictionaryMap.containsKey(description)){
      letter = dictionaryMap.get(description);
      LetterFound(letter);
    } else {
      letter = "Letter not found";
      GetLetterError(letter);
    }
  }

  @SimpleEvent
  public void LetterFound(String letter){
    EventDispatcher.dispatchEvent(this, "LetterFound", letter);
  }

  @SimpleEvent
  public void GetLetterError(String letter){
    EventDispatcher.dispatchEvent(this, "GetLetterError", letter);
  }

  @SimpleFunction
  public void SearchAlphabetLetter(String letter){
    if(dictionaryMap.containsKey(letter)){
      description = dictionaryMap.get(letter);
      DescriptionFound(description);
    } else {
      description = "Description not found";
      GetDescriptionError(description);
    }
  }

  @SimpleEvent
  public void DescriptionFound(String description){
    EventDispatcher.dispatchEvent(this, "DescriptionFound", description);
  }

  @SimpleEvent
  public void GetDescriptionError(String description){
    EventDispatcher.dispatchEvent(this, "GetDescriptionError", description);
  }
}