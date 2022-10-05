import java.util.*;
	
public class Proiect1{
	
	public static void main(String args[]){
		int n=1,i=0;
		Scanner sc = new Scanner(System.in);
		Persoana[] p=new Persoana[25];
			p[i]=new Persoana();
			p[i].setNume("Borzasi");
			p[i].setPrenume("Cosmin-Andrei");
			p[i].setCnp("5020514060020");
			p[i].setNr(n);
		//System.out.println(p[0].toString());
		int ok=-1;
		while(ok!=0){	
			System.out.println("1:Introducere persoana noua .");
			System.out.println("2:Gasire persoana dupa CNP");
			System.out.println("3:Afisare persoane");
			System.out.println("4:Imprumut carte");
			System.out.println("0:Inchidere sistem");
			ok=sc.nextInt();
			if(ok==1){ // Daca se alege cazul 1 se adauga o persoana noua ;
				n++;
				i++;
				p[i]=new Persoana();
				System.out.println("Introduceti numele : ");
				p[i].setNume(sc.next());
				System.out.println("Introduceti prenumele : ");
				p[i].setPrenume(sc.next());
				System.out.println("Introduceti CNP : ");
				p[i].setCnp(sc.next());
				p[i].setNr(n);	
			}
			if(ok==2){ // Daca se alege cazul 2 se asteapta introducerea unui cnp pentru a cauta daca acea persoana este sau nu in baza de date;
				String c;
				int a=1;
				c=sc.next();
				for(int j=0;j<n;j++)
					if(c.equals(p[j].getCnp()) && a == 1)
						{
							System.out.println(p[j].toString());
							a=2;
						}
				if(a==1)
					System.out.println("Nu s-a gasit persoana cu acest cnp");
				
			}
			if(ok==3){ // In cazul 3 se afiseaza toata baza de date a persoanelor ;
				if(i==0)
					System.out.println(p[0].toString());
				else
					for(int j=0;j<=i;j++)
						System.out.println(p[j].toString());
			}
			if(ok==4){
				System.out.println("Care este nr persoanei care doreste sa imprumute o carte ?");
				int x=sc.nextInt();
				System.out.println("Ce carte doreste sa imprumute ? ");
				String cartee=sc.next();
				System.out.println(p[x-1].setCarte(cartee));
				
			}

		}
		
	
	}
}