package CreationalDesignpattern.FactoryPattern.OS;

public class BunchOS {
   public OperatingSystem getInstance(String str){// interface as a return type
      if(str.equals("open")){
         return new Adroid();// Constructor of Android
      }else if(str.equals("close")){
         return new IOS();
      }else if(str.equals("new")){
         return new Bluberry();
      }else {
         return new Symby();
      }
   }
}
