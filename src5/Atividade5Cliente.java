import java.rmi.Naming;

public class Atividade5Cliente {
    private static Atividade5 atv = null;

    public static void main(String[] args) {
        try {
            atv = (Atividade5) Naming.lookup("rmi://127.0.0.1:11099/RMIInterface");
            System.out.println(String.valueOf(atv.DolarReal(2.0F)));
            System.out.println(String.valueOf(atv.RealDolar(2.0F)));
            System.out.println(String.valueOf(atv.EuroReal(2.0F)));
            System.out.println(String.valueOf(atv.RealEuro(2.0F)));
        }
        catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }
}