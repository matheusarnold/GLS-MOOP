package characters;

import jobs.BaseCharacter;
import jobs.IWorker;

public class Worker extends BaseCharacter implements IWorker {

	public Worker() {
		Name = "Worker";
		Descript = "adalah sesorang yang bekerja di kantor atau tempat lainnya";
	}

	public static void main(String[] args) {

	}

	@Override
	public void Work() {
		System.out.println("Worker Bekerja");
	}

	@Override
	public void getInfo() {
		System.out.println(Name + " " + Descript);
	}
}
