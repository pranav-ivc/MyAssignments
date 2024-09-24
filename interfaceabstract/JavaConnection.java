package interfaceabstract;

public class JavaConnection extends MySqlConnection{

	
public static void main(String[] args) {
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();
		jc.newMethod();
	}

	@Override
	public void connect() {
		System.out.println("Connect method implements from Interface DatabseConnection");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect method implements from Interface DatabseConnection");

	}

	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate method implements from Interface DatabseConnection");

	}

	@Override
	public void newMethod() {
		System.out.println("Non implement method from the abstract class");
	}


}
