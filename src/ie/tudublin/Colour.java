package ie.tudublin;

import javafx.scene.control.TableRow;
import processing.core.PApplet;

public class Colour
{
	private String colour;
	public int r;
	public int g;
	public int b;
	public int value;
	
	public void Colour(String colour, int r, int g, int b, int value)
	{
		this.colour = colour;
		this.r = r;
		this.g = g;
		this.b = b;
		this.value = value;
		
	}

	// public Colour(processing.data.TableRow row)
	// {
	// 	this(row.getString("colour"), row.getFloat("r"), row.getFloat("g"), row.getFloat("b"), row.getFloat("value"));
	// }

	public Colour(processing.data.TableRow tr)
    {
        colour = ((processing.data.TableRow) tr).getString("colour");
        r = ((processing.data.TableRow) tr).getInt("r");
        g = ((processing.data.TableRow) tr).getInt("g");
        b = ((processing.data.TableRow) tr).getInt("b");
        value = ((processing.data.TableRow) tr).getInt("value");

    }


	public String toString()
    {
        return  colour +  "\t" + r + "\t" + g + "\t" + b + "\t" + value;
    }

	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	/**
	 * @return the r
	 */
	public int getR() {
		return r;
	}

	/**
	 * @param r the r to set
	 */
	public void setR(int r) {
		this.r = r;
	}

	/**
	 * @return the g
	 */
	public int getG() {
		return g;
	}

	/**
	 * @param g the g to set
	 */
	public void setG(int g) {
		this.g = g;
	}

	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	

	
}
