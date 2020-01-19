package patterns.singleton.example;

public class Computer {
	
	private OS os;

	public OS getOS() {
		return os;
	}

	public void setOS(OS oS) {
		os = oS;
	}

	public void Launch(String osName)
	    {
	       this.os = OS.getInstance(osName);
	    }
}
