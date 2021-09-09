package keyvalpair;

import java.util.Scanner;

public class Pair <T extends Object>{
  
   private T key;
   private T value;
  
   public T getKey() {
      return key;
   }
   public void setKey(T key) {
      this.key = key;
   }
   public T getValue() {
      return value;
   }
   public void setValue(T value) {
      this.value = value;
   }


}

