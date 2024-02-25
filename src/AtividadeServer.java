import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AtividadeServer extends UnicastRemoteObject implements Atividade {

    private List<String> mens;
    public AtividadeServer() throws RemoteException{
        super();
    }

    @Override
    public List<String> listarMensagens() throws RemoteException {
        return mens;
    }

    @Override
    public String adicionarMensagem(String mensagem) throws RemoteException {
        mens.add(mensagem);
        return "Mensagem adicionada";
    }

    @Override
    public String getIp() throws RemoteException, UnknownHostException {
        return InetAddress.getLocalHost().getHostAddress();
    }

    @Override
    public String getDataHora() throws RemoteException {
        Date dataHoraAtual = new Date();
        return new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
    }

    public static void main(String[] args) {
        try {
            AtividadeServer server = new AtividadeServer();
            System.out.println("CalculadoraServer is running...");
            Naming.rebind("rmi://127.0.0.1:11099/RMIInterface", new AtividadeServer());
        } catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }

}
