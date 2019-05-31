package characters;

import jobs.BaseCharacter;
import jobs.IDriver;

public class Driver extends BaseCharacter implements IDriver {
	
	public Driver() {
		Name = "Driver";
		Descript = "adalah seseorang yang mengemudikan mobil";
	}

	@Override
	public void Drive() {
		System.out.println("Driver bisa mengemudi");
	}

	@Override
	public void getInfo() {
		System.out.println(Name + " "+ Descript);
	}
}
