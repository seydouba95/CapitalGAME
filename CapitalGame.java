import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class CapitalGame {

	public static void main(String[] args) {
		final int NOMBRE_DE_QUESTIONS=6;
		int index,score=0;
		String pays,capitale,user_answer;
	
		ArrayList<Integer> indexesalreadytaken= new ArrayList<Integer>();
		String [][] data={

				{"Senegal","Dakar"},
				{"France","Paris"},
				{"Allemagne","Berlin"},
				{"Nigeria","Lagos"},
				{"Gabon","Libreville"},
				{"Cameroun","Yaounde"},
				{"Ghana","Accra"},
				{"Espagne","Madrid"},
				{"Portugal","Lisbonne"},
				{"Russie","Moscou"},
		};
		Scanner clavier=new Scanner(System.in);
		for(int i=0;i<NOMBRE_DE_QUESTIONS;i++)
		{
			//choisir un pays de maniere aleatoire
			do{
				Random random= new Random();
				index= random.nextInt(data.length);
			}while(indexesalreadytaken.contains(index));
			indexesalreadytaken.add(index);
			pays=data[index][0];
			capitale=data[index][1];


			//DEMANDER A L'UTILISATEUR d'entrer la capitale de ce pays

			System.out.printf("Quelle est la capitale de ce pays: %s?\n",pays);
			user_answer=clavier.nextLine();
			//on compare les reponses
			if(capitale.equalsIgnoreCase(user_answer))
			{
				System.out.println("Bonne reponse!");
				score++;
			}
			else
			{
				
				System.out.printf("Mauvaise reponse. La bonne reponse est %s\n",capitale);
			}

		}
	
		
		System.out.printf("C'est terminé. <<Score:%d/%d>>",score,NOMBRE_DE_QUESTIONS);
		 
 
     
		 
	}
	
	

}
