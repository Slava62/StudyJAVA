package patterns.abstractfactory.example;

public class Program {

	public static void main(String[] args) {
		Hero elf = new Hero(new ElfFactory());
		elf.getInfo();
        elf.hit();
        elf.run();
 
        Hero voin = new Hero(new VoinFactory());
        voin.getInfo();
        voin.hit();
        voin.run();

	}

}
