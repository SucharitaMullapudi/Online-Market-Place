

// Honor Pledge:
//
// I pledge that I have neither given nor
// received any help on this assignment.
//

//amorampu
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;


public class Server {
    /**
     *
     * @param args
     * @throws RemoteException
     * @throws MalformedURLException
     */
    public static void main(String[] args) throws RemoteException, MalformedURLException {

        System.setSecurityManager(new SecurityManager());

        try{


            String name = "server";


            MPlaceImplementation stub = new MPlaceImplementation(name);

            Naming.rebind(name, stub);

            System.out.println("Server Started");


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }



    }
}
