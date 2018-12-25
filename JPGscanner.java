package imageModifier;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class JPGscanner {

	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\twili\\Desktop\\¹Ï¤ù¶°\\black.jpg";
		File file = new File(path);

		BufferedImage image = ImageIO.read(file);
		int width = image.getWidth();
		int height = image.getHeight();

		System.out.println("Width: " + width + " Height: " + height);

		ArrayList<ArrayList<RGBIndex>> rgbIndexArr = new ArrayList<ArrayList<RGBIndex>>();

		for (int i = 0; i < height; i++) {
			ArrayList<RGBIndex> rgbRow = new ArrayList<RGBIndex>();
			rgbIndexArr.add(rgbRow);
			for (int j = 0; j < width; j++) {
				RGBIndex rgb = new RGBIndex(image.getRGB(j, i));
				rgb = BrightenTools.indexBrighten(rgb, 0.5f);
				rgbRow.add(rgb);
			}
		}

	}

}
