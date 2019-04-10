package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{
	ArrayList<Colour> colors = new ArrayList<Colour>();
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

	public Colour findColor(int value)
	{

		Colour c = colors.get(value);
        colour =  c.getColour();
		colourvalue =  c.getValue();
		//return colour;

	}
	public void draw()
	{	
			
	}
}
