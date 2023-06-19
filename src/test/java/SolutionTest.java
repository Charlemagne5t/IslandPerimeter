import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void islandPerimeterTest1() {
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        int output = 16;
        Assert.assertEquals(output, new Solution().islandPerimeter(grid));
    }

    @Test
    public void islandPerimeterTest2() {
        int[][] grid = {
                {1}
        };
        int output = 4;
        Assert.assertEquals(output, new Solution().islandPerimeter(grid));
    }

    @Test
    public void islandPerimeterTest3() {
        int[][] grid = {
                {1, 0}
        };
        int output = 4;
        Assert.assertEquals(output, new Solution().islandPerimeter(grid));
    }

}
