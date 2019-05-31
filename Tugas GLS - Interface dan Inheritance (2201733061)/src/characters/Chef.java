package characters;

import jobs.BaseCharacter;
import jobs.IChef;

public class Chef extends BaseCharacter implements IChef {

	public Chef() {
		Name = "Chef";
		Descript= "adalah sesorang yang dapat memasak makanan enak";
	}
	
	@Override
	public void Cook() {	
		System.out.println("Chef bisa memasak");
	}

	@Override
	public void getInfo() {
		System.out.println(Name + " " + Descript);
	}
	
	public static void main(String[] args) {

	}
}
