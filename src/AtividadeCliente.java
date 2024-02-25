import java.rmi.Naming;

public class AtividadeCliente {
    private static Atividade atv = null;

    public static void main(String[] args) {
        try {
            atv = (Atividade) Naming.lookup("rmi://127.0.0.1:11099/RMIInterface");
            System.out.println(String.valueOf(atv.adicionarMensagem("Gatinhio monnoso")));
            System.out.println(String.valueOf(atv.getIp()));
            System.out.println(String.valueOf(atv.listarMensagens()));
            System.out.println(String.valueOf(atv.getDataHora()));
        }
        catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }
}