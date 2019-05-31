package characters;

import jobs.BaseCharacter;

public class Newbie extends BaseCharacter {

	public Newbie() {
		Name = "Newbie";
		Descript = "adalah seseorang yang masih belajar dan belum bisa melakukan apa-apa";	
	}

	public void New() {
		System.out.println("Masih belum bisa melakukan apa-apa");
	}
	
	@Override
	public void getInfo() {	
		System.out.println(Name + " "+ Descript);
	}
	
	public static void main(String[] args) {

	}
}
