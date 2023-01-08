/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author GeorgeAlaa
 */


import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NQueensVisualization {

	final static int M = 4;
	
	static JLabel[][] jLabel = new JLabel[M][M];

	static int board[][] = new int[M][M];
        static int board1[][] = new int[M][M];
        static int board2[][] = new int[M][M];
        static int board3[][] = new int[M][M];


          public static boolean isSafe(int i,int c) {
        int temp=1;
        try {//up, left
            while (0==board[i-temp][c-temp])
            {temp++;}
            if (1==board[i-temp][c-temp]) {
                return false;
            }
        } catch (Exception e) {}
        temp=1;
        try {//up
            while (0==board[i-temp][c])
            {temp++;}
            if (1==board[i-temp][c]) {
                return false;
            }
        } catch (Exception e) {}
        temp=1;
        try {//up, right
            while (0==board[i-temp][c+temp])
            {temp++;}
            if (1==board[i-temp][c+temp]) {
                return false;
            }
        } catch (Exception e) {}
        return true;
    }
           public static boolean isSafe1(int i,int c) {
        int temp=1;
        try {//up, left
            while (0==board1[i-temp][c-temp])
            {temp++;}
            if (1==board1[i-temp][c-temp]) {
                return false;
            }
        } catch (Exception e) {}
        temp=1;
        try {//up
            while (0==board1[i-temp][c])
            {temp++;}
            if (1==board1[i-temp][c]) {
                return false;
            }
        } catch (Exception e) {}
        temp=1;
        try {//up, right
            while (0==board1[i-temp][c+temp])
            {temp++;}
            if (1==board1[i-temp][c+temp]) {
                return false;
            }
        } catch (Exception e) {}
        return true;
    }
            public static boolean isSafe2(int i,int c) {
        int temp=1;
        try {//up, left
            while (0==board2[i-temp][c-temp])
            {temp++;}
            if (1==board2[i-temp][c-temp]) {
                return false;
            }
        } catch (Exception e) {}
        temp=1;
        try {//up
            while (0==board2[i-temp][c])
            {temp++;}
            if (1==board2[i-temp][c]) {
                return false;
            }
        } catch (Exception e) {}
        temp=1;
        try {//up, right
            while (0==board2[i-temp][c+temp])
            {temp++;}
            if (1==board2[i-temp][c+temp]) {
                return false;
            }
        } catch (Exception e) {}
        return true;
    }
             public static boolean isSafe3(int i,int c) {
        int temp=1;
        try {//up, left
            while (0==board3[i-temp][c-temp])
            {temp++;}
            if (1==board3[i-temp][c-temp]) {
                return false;
            }
        } catch (Exception e) {}
        temp=1;
        try {//up
            while (0==board3[i-temp][c])
            {temp++;}
            if (1==board3[i-temp][c]) {
                return false;
            }
        } catch (Exception e) {}
        temp=1;
        try {//up, right
            while (0==board3[i-temp][c+temp])
            {temp++;}
            if (1==board3[i-temp][c+temp]) {
                return false;
            }
        } catch (Exception e) {}
        return true;
    }
          
       
                   
	public static boolean findSolution(int row) {
           

		if (row >= M)
			return true;

		for (int i = 0; i < M;i++) {

			// Increase the sleep value to slow down the animation
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}

			if (isSafe(row,i) == true) {

				board[row][i] = 1;
				jLabel[row][i].setBackground(Color.ORANGE);

				if (findSolution(row + 1) == true)
					return true;
                                else{
                                return false;
                                }
			}

		}

		return false;

	}
       public static boolean findSolution1(int row) {
           

		if (row >= M)
			return true;

		for (int i = 0; i < M;i++) {

			// Increase the sleep value to slow down the animation
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}

			if (isSafe1(row,i) == true) {

				board1[row][i] = 1;
				jLabel[row][i].setBackground(Color.RED);

				if (findSolution1(row + 1) == true)
					return true;
                        else{
                            return false;
			}
                        }

		}

		return false;

	}
       public static boolean findSolution2(int row) {
           

		if (row >= M)
			return true;

		for (int i = 0; i < M;i++) {

			// Increase the sleep value to slow down the animation
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}

			if (isSafe2(row,i) == true) {
				board2[row][i] = 1;
				jLabel[row][i].setBackground(Color.BLACK);

				if (findSolution2(row + 1) == true)
					return true;
                                else{
                                return false;
                                }
			}

		}

		return false;

	}
       public static boolean findSolution3(int row) {
           

		if (row >= M)
			return true;

		for (int i = 0; i < M;i++) {

			// Increase the sleep value to slow down the animation
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}

			if (isSafe3(row,i) == true) {

				board3[row][i] = 1;
				jLabel[row][i].setBackground(Color.GREEN);

				if (findSolution3(row + 1) == true)
					return true;
                        else{
                            return false;
			}
                        }

		}

		return false;

	}
       

	static void solveNQueen() {

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
		}

		// reset board
		for (int i = 0; i < M; ++i) {
			for (int j = 0; j < M; ++j) {

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					
				}

				board[i][j] = 0;
				jLabel[i][j].setBackground(Color.BLUE);
			}
		}
               board[0][0] = 1;
	       jLabel[0][0].setBackground(Color.ORANGE);


		// If solution exist print otherwise show error message
		if (findSolution(1) == false)
			System.out.println("No Solution.\n");
		else
			             System.out.println("done");
	}
        static void solveNQueen1() {

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
		}

		// reset board
		for (int i = 0; i < M; ++i) {
			for (int j = 0; j < M; ++j) {

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					
				}

				board1[i][j] = 0;
				jLabel[i][j].setBackground(Color.BLUE);
			}
		}
                
                board1[0][1] = 1;
		jLabel[0][1].setBackground(Color.RED);
		// If solution exist print otherwise show error message
		if (findSolution1(1) == false)
			System.out.println("No Solution.\n");
		else
			             System.out.println(" done");
	}
         static void solveNQueen3() {

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// reset board
		for (int i = 0; i < M; ++i) {
			for (int j = 0; j < M; ++j) {

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					
				}

				board3[i][j] = 0;
				jLabel[i][j].setBackground(Color.BLUE);
			}
		}
                
                board3[0][3] = 1;
		jLabel[0][3].setBackground(Color.GREEN);
		// If solution exist print otherwise show error message
		if (findSolution3(1) == false)
			System.out.println("No Solution.\n");
		else
			              System.out.println("done");
	}
          static void solveNQueen2() {

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
		}

		// reset board
		for (int i = 0; i < M; ++i) {
			for (int j = 0; j < M; ++j) {

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					
				}

				board2[i][j] = 0;
				jLabel[i][j].setBackground(Color.BLUE);
			}
		}
                
                board2[0][2] = 1;
		jLabel[0][2].setBackground(Color.BLACK);
		// If solution exist print otherwise show error message
		if (findSolution2(1) == false)
			System.out.println("No Solution.\n");
		else
			               System.out.println("done");
	}

	NQueensVisualization() {

		JFrame jFrame = new JFrame("NQueen Visualizer.");

		jFrame.setLayout(new GridLayout(M, M));
		jFrame.setSize(512,512);
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < M; ++i) {
			for (int j = 0; j < M; ++j) {
				jLabel[i][j] = new JLabel("(" + i + "," + j + ")");
				jLabel[i][j].setHorizontalAlignment(SwingConstants.CENTER);

				jLabel[i][j].setSize(50, 50);

				jLabel[i][j].setOpaque(true);

				

				jFrame.add(jLabel[i][j]);
			}
		}

		jFrame.setVisible(true);

	}

	public static void main(String args[]) {
        
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new NQueensVisualization();
                                
			}
		});

		t0 th=new t0();
                t1 th1=new t1();
                t2 th2=new t2();
                t3 th3=new t3();
         Thread ths=new Thread(th);
        Thread ths1=new Thread(th1);
         Thread ths2=new Thread(th2);
          Thread ths3=new Thread(th3);
        ths.start();
          ths1.start();
          ths2.start();
          ths3.start();
          
	}

}