import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner (System.in);
		
		int num = 0;
		int i;
		int j;
		int soma=0;
		int maiornumero=0;
		int menornumero=0;
		int dp=0;
		int ds=0;
		int contpar=0;
		int contimpar=0;
		float media=0;		
		
		
		do {
		System.out.println("Insira um n�mero impar de 3 � 11 para montar o tamanho da matriz: ");
		num= entrada.nextInt();
		}
		while ((num<3) || (num>11)||(num%2==0)); 
		
		int matriz[] []= new int [num][num];
		
		for (i=0;i<num;i++) {
			for(j=0;j<num;j++) {
				System.out.println("Insira os valores que comp�em a matriz:");
				matriz[i][j]=entrada.nextInt();
				
				soma+=matriz[i][j];
				media=soma/matriz[i][j];
				
				if (i==j) {
					dp+=matriz[i][j];
				}
				
				if((i+j)==num-1) {
					ds+=matriz[i][j];
				}
				
				if (matriz[i][j]%2==0) {
					contpar++;
				}else {
					contimpar++;
				}

				if (i==0) {
					maiornumero=matriz[i][j];
					menornumero=matriz[i][j];
				} 
			
				else {
					if (matriz[i][j] < menornumero) {
						menornumero = matriz[i][j];
					}
					if (matriz[i][j] > maiornumero) {
						maiornumero = matriz[i][j];
					}            
				}
		}
		}
		
		System.out.println("O maior n�mero �: "+maiornumero);	
		System.out.println("O menor n�mero �: " +menornumero);
		System.out.println("A quantidade de n�meros par � :"+contpar);
		System.out.println("A quantidade de n�meros impar �: "+contimpar);
		System.out.println("A soma da diagonal principal deu: "+dp);
		System.out.println("A soma da diagonal secund�ria deu:"+ds);
		System.out.println("A m�dia dos valores digitados �: "+media);
		System.out.println("A soma de todos os valores da matrizes �: "+soma);
		
		for (i=0;i<num;i++) {
			for(j=0;j<num;j++) {
		System.out.print(matriz[i][j]+"|");
		}
		System.out.println();	
	}
		
		entrada.close();	
}
}


