package imageModifier;

public class RGBIndex {
	/*
	 * the color about each pixel
	 */
	public int rgb, red, green, blue;

	/*
	 * @param rgb : the index get from each pixel point
	 */
	RGBIndex(int rgb) {
		this.rgb = rgb;
		this.red = (this.rgb & 0xFF0000) >> 16;
		this.green = (this.rgb & 0xFF00) >> 8;
		this.blue = (this.rgb & 0xFF);
	}

}