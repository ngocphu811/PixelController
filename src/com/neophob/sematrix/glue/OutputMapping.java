package com.neophob.sematrix.glue;

import com.neophob.sematrix.fader.Fader;
import com.neophob.sematrix.fader.Fader.FaderName;

/**
 * class used to store input/ouput mapping
 * @author michu
 *
 */
public class OutputMapping {

	/**
	 * the visual input object
	 */
	private int visualId;
	
	/**
	 * the output screen nr
	 */
	private int screenNr;
	private Fader fader;
	
	public OutputMapping() {
		this.visualId = 0;
		this.screenNr = 0;
		this.fader = Collector.getInstance().getFader(FaderName.SWITCH);
		System.out.println("faderid: "+fader.getId());
	}

	public OutputMapping(int visualId, int screenNr) {
		this();
		this.visualId = visualId;
		this.screenNr = screenNr;
	}

	public int getVisualId() {
		return visualId;
	}

	public void setVisualId(int visualId) {
		this.visualId = visualId;
	}

	public int getScreenNr() {
		return screenNr;
	}

	public void setScreenNr(int screenNr) {
		this.screenNr = screenNr;
	}

	public Fader getFader() {
		return fader;
	}

	public void setFader(Fader fader) {
		this.fader = fader;
	}
	
	
}