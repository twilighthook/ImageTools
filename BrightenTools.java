package imageModifier;

import java.awt.Image;
import java.awt.image.BufferedImage;

//gray tools
public class BrightenTools {

	/*
	 * do override if the @param is image type
	 * 
	 * @param image
	 */
	public static Image imageBrighten(Image image) {
		return imageBrighten(ImageTools.toBufferedImage(image));
	}

	public static Image imageBrighten(BufferedImage bufferedImage) {
		/*not complete to do the brighten tools
		 * */
		return null;
	}

	/*
	 * brighten or darker the pixel point
	 * 
	 * @param rgbIndex
	 * 
	 * @param rate ¦Ç¶¥¤ñ²v
	 */
	public static RGBIndex indexBrighten(RGBIndex rgbIndex, float rate) throws Exception {

		if (rate > 1 || rate < -1) {
			throw new Exception("Your rate may use from 1 to -1!");
		}

		rgbIndex.rgb = ImageTools.RGBToHex(rgbIndex);

		return rgbIndex;
	}

	/*
	 * change index from 0~255
	 * 
	 * @param index
	 * 
	 * @param rate
	 */
	int IndexChange(int index, float rate) {

		int range = 255 - index;
		index += range * rate;

		return index;
	}

}
