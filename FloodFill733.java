public class FloodFill733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        dfs(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    private void dfs(int[][] image, int x, int y, int oldColor, int newColor) {
        // if (image[x][y] == oldColor && x < image.length && y < image[0].length && x >= 0 && y >= 0 && oldColor != newColor) {
        if (x>=0 && y >=0 && x <= image.length-1 && y <= image[0].length-1 && image[x][y] == oldColor && oldColor != newColor) {
            image[x][y] = newColor;
            dfs(image, x - 1, y, oldColor, newColor);
            dfs(image, x + 1, y, oldColor, newColor);
            dfs(image, x, y - 1, oldColor, newColor);
            dfs(image, x, y + 1, oldColor, newColor);
        }

    }

}
