package Anno;

import java.lang.reflect.Method;

public class Test {

	@Arbeitszeit(name="Chi Lap",dauer=10)
	public void machwas(){
		System.out.println("was geht");
	}
	public static void main(String[] args) {
		Method[] method = Test.class.getDeclaredMethods();
		for(Method m : method){
			System.out.println(m.getName());
			Arbeitszeit arbeitszeit = m.getAnnotation(Arbeitszeit.class);
			System.out.println(arbeitszeit.dauer()+" "+arbeitszeit.name());
		}
	}
}
