package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{
	ArrayList<Colour> colors = new ArrayList<Colour>();
	ArrayList<Resistor> resistors = new ArrayList<Resistor>();


	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
		loadColours();
		printColours();
		loadResistors();
		
	}
	
	public void loadColours() 
	{
		Table table = loadTable("colours.csv", "header");
        for(TableRow tr:table.rows())
        {
            Colour c = new Colour(tr);
            colors.add(c);
        }
	}

	public void loadResistors() 
	{
		Table table = loadTable("resistors.csv", "header");
        for(TableRow tr:table.rows())
        {
            Resistor r = new Resistor(tr);
            resistors.add(r);
		}
		for(int i=0; i<resistors.size(); i++)
        {
           
			Resistor r = resistors.get(i);

			int hundreds = (r.getValue() / 100);
			int tens = (r.getValue() - (hundreds * 100)) / 10;
			int ones = r.getValue() - ((hundreds * 100)  + (tens * 10));
            //System.out.println(System.out.println(r.getOnes()+ r.getTens()+ r.getHundreds()+ r.getValue());
        }
	}

	public void printColours()
	{
		for(int i=0; i<colors.size(); i++)
        {
           
            Colour c = colors.get(i);
            System.out.println(c.getColour()+ c.getR()+ c.getG()+ c.getB()+ c.getValue());
        }
	}
	
	String colour;
	int colourvalue;

	// public Colour findColor(int value)
	// {
	// 	for(int i=0; i<colors.size(); i++)
    //     {
           
	// 		Colour c = colors.get(i);
	// 		if(c.getValue() == value)
	// 		{
	// 			// return c.getValue();
	// 		}
		
    //     }
		
	//}

	public void draw()
	{	
		
		for(int i =0; i<3; i++)
		{	
			noFill();
			stroke(0);
			rect(width - 350, height - 750 + (i*200), width /2, height/5);
			line(width - 350, height - 750 + ((i*200) + 75),width - 400,  height - 750 + ((i*200) + 75));
			line(width - 100, height - 750 + ((i*200) + 75),width - 50,  height - 750 + ((i*200) + 75));
			
			// Colour c = colors.get(6);
			// fill(c.getR(),c.getG(), c.getB());
			
			// rect(width - 300, height - 750 + (i*200) , 20, height - 750 + 110);
			// Colour c = colors.get(6);
			// fill(c.getR(),c.getG(), c.getB());

			// rect(width - 250, height - 750 + (i*200) , 20, height - 750 + 110);

			// rect(width - 200, height - 750 + (i*200) , 20, height - 750 + 110);
			for(int j=0; j<resistors.size(); j++)
			{
				Resistor r = resistors.get(j);
				text(r.getValue(),width - 50,  height - 750 + ((i*200) + 100) )
			}
			
		}
		
		Colour c1 = colors.get(6);
		fill(c1.getR(),c1.getG(), c1.getB());
		rect(width - 300, height - 750 + (0*200) , 20, height - 750 + 110);
		Colour c2 = colors.get(7);
		fill(c2.getR(),c2.getG(), c2.getB());
		rect(width - 250, height - 750 + (0*200) , 20, height - 750 + 110);
		Colour c3 = colors.get(8);
		fill(c3.getR(),c3.getG(), c3.getB());
		rect(width - 200, height - 750 + (0*200) , 20, height - 750 + 110);

		
	}
}
