package com.register.alien.model;

import java.util.ArrayList;
import java.util.List;

import com.register.main.CommonConstant;

/**
 * The Class AlienModel. Used as model for alien information
 */
public class AlienModel extends BaseModel {

	/** The code name. */
	private String codeName;

	/** The blood color. */
	private String bloodColor;

	/** The no of antenna. */
	private int noOfAntenna;

	/** The no of legs. */
	private int noOfLegs;

	/** The home planet. */
	private String homePlanet;

	/**
	 * Gets the code name.
	 * 
	 * @return the code name
	 */
	public String getCodeName() {
		return codeName;
	}

	/**
	 * Sets the code name.
	 * 
	 * @param codeName
	 *            the new code name
	 */
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	/**
	 * Gets the blood color.
	 * 
	 * @return the blood color
	 */
	public String getBloodColor() {
		return bloodColor;
	}

	/**
	 * Sets the blood color.
	 * 
	 * @param bloodColor
	 *            the new blood color
	 */
	public void setBloodColor(String bloodColor) {
		this.bloodColor = bloodColor;
	}

	/**
	 * Gets the no of antenna.
	 * 
	 * @return the no of antenna
	 */
	public int getNoOfAntenna() {
		return noOfAntenna;
	}

	/**
	 * Sets the no of antenna.
	 * 
	 * @param noOfAntenna
	 *            the new no of antenna
	 */
	public void setNoOfAntenna(int noOfAntenna) {
		this.noOfAntenna = noOfAntenna;
	}

	/**
	 * Gets the no of legs.
	 * 
	 * @return the no of legs
	 */
	public int getNoOfLegs() {
		return noOfLegs;
	}

	/**
	 * Sets the no of legs.
	 * 
	 * @param noOfLegs
	 *            the new no of legs
	 */
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	/**
	 * Gets the home planet.
	 * 
	 * @return the home planet
	 */
	public String getHomePlanet() {
		return homePlanet;
	}

	/**
	 * Sets the home planet.
	 * 
	 * @param homePlanet
	 *            the new home planet
	 */
	public void setHomePlanet(String homePlanet) {
		this.homePlanet = homePlanet;
	}

	@Override
	public List<String> getDataInListFormat() {
		List<String> data = new ArrayList<String>();
		data.add("Code Name" + CommonConstant.SEPARATOR + getCodeName());
		data.add("Home Planet" + CommonConstant.SEPARATOR + getHomePlanet());
		data.add("Blood Color" + CommonConstant.SEPARATOR + getBloodColor());
		data.add("No of Antennas" + CommonConstant.SEPARATOR
				+ String.valueOf(getNoOfAntenna()));
		data.add("No of Legs" + CommonConstant.SEPARATOR
				+ String.valueOf(getNoOfLegs()));
		return data;
	}

	public AlienModel(String codeName, String bloodColor, int noOfAntenna,
			int noOfLegs, String homePlanet) {
		super();
		this.codeName = codeName;
		this.bloodColor = bloodColor;
		this.noOfAntenna = noOfAntenna;
		this.noOfLegs = noOfLegs;
		this.homePlanet = homePlanet;
	}

	public AlienModel() {
		super();
	}

}
