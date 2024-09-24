package interfaceabstract;

public abstract class MySqlConnection implements DatabseConnection {
	
	public void executeQuery() {
		System.out.println("Execute Query from Abstract My Sql Conection Class");
	}
	
	public abstract void newMethod();

}
