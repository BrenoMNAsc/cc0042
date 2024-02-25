import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Atividade5Server extends UnicastRemoteObject implements Atividade5 {

    public Atividade5Server() throws RemoteException{
        super();
    }

    @Override
    public float DolarReal(float dolar) throws RemoteException {
        return (float) (dolar*5.0);
    }
    @Override
    public float RealDolar(float real) throws RemoteException {
        return (float) (real/5.0);
    }
    @Override
    public float EuroReal(float euro) throws RemoteException {
        return (float) (euro*5.37);
    }
    @Override
    public float RealEuro(float real) throws RemoteException {
        return (float) (real/5.37);
    }

    public static void main(String[] args) {
        try {
            Atividade5Server server = new Atividade5Server();
            System.out.println("AtvidadeServer is running...");
            Naming.rebind("rmi://127.0.0.1:11099/RMIInterface", new Atividade5Server());
        } catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }

}
