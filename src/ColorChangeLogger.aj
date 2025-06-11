
public aspect ColorChangeLogger {
	private int cont=0;
	
	pointcut change(): call (* ColorChanger.change(String));
	
	after (String color): change() && args(color){
		System.out.println("[LOG] Se ha cambiado el color a: " + color);
	}
	
	after (): change(){
		cont++;
		System.out.println("[LOG] Se ha cambiado el color #" + cont);
	}
}
