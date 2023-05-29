package methodoverriding24;

/* 24. A real example of Java Method Overriding */

public class Test2 {
    public static void main(String[] args) {
        Sbi s = new Sbi();
        IcIc i = new IcIc();
        Axis a = new Axis();
        System.out.println("SBI Rate Of Interest: "+s.getRateOfInterest());
        System.out.println("ICIC Rate Of Interest"+ i.getRateOfInterest());
        System.out.println("AXIS Rate Of Interest:"+ a.getRateOfInterest());
    }
}
