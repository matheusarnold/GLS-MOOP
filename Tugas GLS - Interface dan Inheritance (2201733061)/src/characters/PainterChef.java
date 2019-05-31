package characters;

import jobs.BaseCharacter;
import jobs.IChef;
import jobs.IArtist;

public class PainterChef extends BaseCharacter implements IChef, IArtist {

	public PainterChef() {
		Name = "PainterChef";
		Descript = "adalah sesorang yang merupakan pelukis dan juga chef";
	}
	
	@Override
	public void Paint() {
		System.out.printf("Melukis");	
	}

	@Override
	public void Cook() {
		System.out.printf("Memasak");
	}
	
	public void painterchef() {
		System.out.printf("PainterChef bisa ");
		Paint();
		System.out.printf(" dan ");
		Cook();
		System.out.println("");
	}
	
	@Override
	public void getInfo() {	
		System.out.println(Name + " " + Descript);
	}
}
