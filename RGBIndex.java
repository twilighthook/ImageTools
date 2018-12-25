package imageModifier;

public class RGBIndex {
	public int rgb;

	RGBIndex(int rgb) {
		this.rgb = rgb;
	}

	public int getRed() {
		return (this.rgb & 0xFF0000) >> 16;
	}

	public int getGreen() {
		return (this.rgb & 0xFF00) >> 8;
	}

	public int getBlue() {
		return (this.rgb & 0xFF);
	}
	
}