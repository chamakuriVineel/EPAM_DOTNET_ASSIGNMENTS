
public class Constructors
{
	public static void main(String[] args)
	{
	    System.out.println(new Bird().toString());
	    System.out.println(new Bird(60,"white").toString());
	    System.out.println(new Bird("red",34).toString());
	    System.out.println(new Bird.Builder().height(23).weight(65).colour("violet").build().toString());
	}
}

class Bird
{
    int height; int weight; String  colour; 
    Bird()
    {
        System.out.println("default constructor with out parameters");
        height=-1;weight=-1;colour="####";
    }
    protected Bird(int height,String colour){
        System.out.println("protected constructor with  parameters");
        this.height=height;
        this.colour=colour;
    }
    public Bird(String colour,int weight)
    {
        System.out.println("public  constructor with  parameters");
        this.weight=weight;
        this.colour=colour;
    }
    public String toString()
    {
        String details="";
        details+="\nheight: "+this.height+"\n weight: "+this.weight+"\n colour: "+this.colour;
        return details;
    }
    public static class Builder
    {
        int height;int weight;String colour;
        public Builder height(int height)
        {
            this.height=height;
            return this;
        }
        public Builder weight(int weight)
        {
            this.weight=weight;
            return this;
        }
        public Builder colour(String colour)
        {
            this.colour=colour;
            return this;
        }
        public Bird build()
        {
            Bird bird=new Bird();
            bird.height=this.height;
            bird.weight=this.weight;
            bird.colour=this.colour;
            return bird;
        }
        
    }
    
}