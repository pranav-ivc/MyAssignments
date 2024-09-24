package interfaceabstract;

public class JavaConnection implements DatabseConnection{

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
	
public static void main(String[] args) {
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
	}

}
