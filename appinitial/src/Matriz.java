
public class Matriz {

	    public static void main(String[] args) {
	        int[][] matriz = new int[4][4];

	        for (int i = 0; i < 4; i++) {
	            matriz[i][0] = 1;
	        }


	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
////////////////////////////////////////////////////////////////////
	        for (int i = 0; i < 4; i++) {
	            matriz[i][i] = 1;
	        }

	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
