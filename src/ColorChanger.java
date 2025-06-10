
import java.util.ArrayList;
import java.util.List;

public class ColorChanger {
	private List<ColorObserver> observers= new ArrayList<>();
	
	public void subscribe(ColorObserver color) {
		observers.add(color);
	}
	
	public void change(String newColor) {
		System.out.println("Cambiando color a: " + newColor);
		notify(newColor);
	}
	
	private void notify(String newColor) {
		for(ColorObserver c: observers) {
			c.update(newColor);
		}
	}
}