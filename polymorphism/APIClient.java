package polymorphism;

public class APIClient {
	
	public void sendRequest(String endPoint) {
		System.out.println("Given EndPoint is :"+endPoint);
		
	}
public void sendRequest(String endPoint,String requestBody,boolean requestStatus) {
	if(requestStatus) {
		System.out.println("Given EndPoint: "+endPoint+" Given Request Body :"+requestBody+" Given Request is Successfull :"+requestStatus);

	}
	else {
		
		System.out.println("Given EndPoint: "+endPoint+" Given Request Body :"+requestBody+" Given Request is Not Successfull :"+requestStatus);
	}
}
		
	public static void main (String args[]) {
		APIClient request=new APIClient();
		request.sendRequest("Start");
		request.sendRequest("Start", "Stop",true);
		request.sendRequest("Stop", "Start",false);

	}

}
