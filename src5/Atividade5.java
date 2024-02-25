import java.rmi.*;

public interface Atividade5 extends Remote {
    public float DolarReal(float dolar) throws RemoteException;
    public float RealDolar(float real) throws RemoteException;
    public float EuroReal(float euro) throws RemoteException;
    public float RealEuro(float real) throws RemoteException;
}
