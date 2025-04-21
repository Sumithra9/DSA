class Solution(object):
    def numIslands(self, grid):
        """
        :type grid: List[List[str]]
        :rtype: int
        """
        if not grid:
            return 0
        
        def dfs(i, j):
            # If out of bounds or at water ('0'), return
            if i < 0 or i >= len(grid) or j < 0 or j >= len(grid[0]) or grid[i][j] == '0':
                return
            
            # Mark the current cell as visited (water)
            grid[i][j] = '0'
            
            # Explore the four possible directions: up, down, left, right
            dfs(i + 1, j)  # down
            dfs(i - 1, j)  # up
            dfs(i, j + 1)  # right
            dfs(i, j - 1)  # left
        
        count = 0
        
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == '1':  # Found an island
                    dfs(i, j)  # Use DFS to mark all connected land as visited
                    count += 1  # Increment the island count
        
        return count

