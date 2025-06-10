
public aspect ColorChangeLogger {
	pointcut change(): call (* ColorChanger.change(String));
	
	after (String color): change() && args(color){
		System.out.println("[LOG] Se ha cambiado el color a: " + color);
	}
}
