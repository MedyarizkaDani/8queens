# About #
This project was done as a partial fulfilment of 159402 Programming languages paper taken at Massey university in 2012. The problem might have been solved years ago, however, the aim of this project is to design an optimal solution using artificial intelligence and constraint satisfaction techniques.

![http://8queens.googlecode.com/svn/wiki/Screen%20Shot%202012-04-11%20at%201.27.32%20AM.png](http://8queens.googlecode.com/svn/wiki/Screen%20Shot%202012-04-11%20at%201.27.32%20AM.png)

## How to use the game solver ##
```
Board board = new DefaultBoard(27);
NQueensSolver solver = new NaiveNQueensSolver();
solver.setBoard(board);
solver.solve();
System.out.println(Arrays.toString(solver.getSolution()));
System.out.println(solver.getTimeElapsed());
```

### output ###
```
[0, 2, 4, 1, 3, 8, 10, 12, 14, 21, 23, 20, 26, 24, 22, 25, 13, 9, 6, 15, 7, 11, 17, 5, 18, 16, 19]
9659
```

Here is a snapshot of the application solving 29x29 board in less than 3 seconds

![http://8queens.googlecode.com/svn/29x29.png](http://8queens.googlecode.com/svn/29x29.png)