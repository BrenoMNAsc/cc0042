import java.net.UnknownHostException;
import java.rmi.*;
import java.util.List;

public interface Atividade extends Remote {
    public List<String> listarMensagens() throws RemoteException;
    public String adicionarMensagem(String mensagem) throws RemoteException;
    public String getIp() throws RemoteException, UnknownHostException;
    public String getDataHora() throws RemoteException;

}
