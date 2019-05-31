package characters;

import jobs.*;

public class Master extends BaseCharacter implements IWorker , IDriver, IArtist, IChef {

	public Master() {
		Name = "Master";
		Descript = " adalah seseorang yang pro dalam melakukan semua job";
	}

	@Override
	public void Cook() {
		
	}

	@Override
	public void Paint() {
		
	}

	@Override
	public void Drive() {
		
	}

	@Override
	public void Work() {
		
	}
	
	public void master() {
		System.out.println("Master bisa semua pekerjaan");
	}

	@Override
	public void getInfo() {
		System.out.println(Name + Descript);
	}
}
