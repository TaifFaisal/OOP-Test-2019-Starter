package ie.tudublin;

import javafx.scene.control.TableRow;

public class Resistor
{
	public int value;
	public int ones;
	public int tens;
	public int hundreds;
	
	// public void Resistor(int value, int ones, int tens, int hundreds)
	// {
		
	// }

	public Resistor(processing.data.TableRow tr)
    {
		
		value = ((processing.data.TableRow) tr).getInt("");
		// hundreds= ((processing.data.TableRow) tr).getInt(value / 100);
		// tens = ((processing.data.TableRow) tr).getInt(value - (hundreds * 100)) / 10;
		// ones = ((processing.data.TableRow) tr).getInt(value - ((hundreds * 100)  + (tens * 10)));
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

	/**
	 * @return the ones
	 */
	public int getOnes() {
		return ones;
	}

	/**
	 * @param ones the ones to set
	 */
	public void setOnes(int ones) {
		this.ones = ones;
	}

	/**
	 * @return the tens
	 */
	public int getTens() {
		return tens;
	}

	/**
	 * @param tens the tens to set
	 */
	public void setTens(int tens) {
		this.tens = tens;
	}

	/**
	 * @return the hundreds
	 */
	public int getHundreds() {
		return hundreds;
	}

	/**
	 * @param hundreds the hundreds to set
	 */
	public void setHundreds(int hundreds) {
		this.hundreds = hundreds;
	}

	

	

	

	
}
