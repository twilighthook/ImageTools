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
	public static Image imageBrighten(Image image, float rate) {
		return imageBrighten(ImageTools.toBufferedImage(image), rate);
	}

	/*
	 * */
	public static Image imageBrighten(BufferedImage bufferedImage, float rate) {
		/*
		 * i is the row j is the line
		 */
		for (int i = 0; i < bufferedImage.getHeight(); i++) {
			for (int j = 0; j < bufferedImage.getWidth(); j++) {
				int rgb = bufferedImage.getRGB(i, j);
				RGBIndex rgbIndex = new RGBIndex(rgb);
				rgbIndex.red = IndexChange(rgbIndex.red , rate);
				rgbIndex.green = IndexChange(rgbIndex.green , rate);
				rgbIndex.blue = IndexChange(rgbIndex.blue , rate);
				
				/*wait to complete need to return the color to bufferedImage*/
			}
		}

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
	public static int IndexChange(int index, float rate) {

		int range = 255 - index;
		index += range * rate;

		return index;
	}

}
