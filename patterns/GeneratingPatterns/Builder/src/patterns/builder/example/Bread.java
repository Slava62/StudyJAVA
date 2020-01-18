package patterns.builder.example;



public class Bread {

	private Flour 		flour;
	private Salt 		salt;
    private Additives 	additives;
    
	public void setFlour(Flour flour) {
		this.flour = flour;
	}

	public void setSalt(Salt salt) {
		this.salt = salt;
	}

	public void setAdditives(Additives additives) {
		this.additives = additives;
	}
    
	
	public Flour getFlour () { return this.flour; }
   
    public Salt getSalt() { return this.salt; }
    
    public Additives getAdditives() { return this.additives; }
    
   
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
 
        if (flour != null)
            sb.append(flour.getSort() + "\n");
        if (salt != null)
            sb.append("Salt \n");
        if (additives != null)
            sb.append("Food additives: "+additives.getName()+" \n");
        return sb.toString();
    }
}
