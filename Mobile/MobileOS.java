package CreationalDesignpattern.FactoryPattern.Mobile;

/*import CreationalDesignpattern.FactoryPattern.OS.BunchOS;
import CreationalDesignpattern.FactoryPattern.OS.OperatingSystem;*/ // OR
import CreationalDesignpattern.FactoryPattern.OS.*;

public class MobileOS {
    public static void main(String... a){
        BunchOS osf = new BunchOS();
        OperatingSystem obj = osf.getInstance("sjf");
        obj.specifications();
    }
}
