public class Persoana{  // In clasa persoana se gasesc toate detaliile unei persoane ;
	private String nume;
	private String prenume;
	private String cnp;
	private String carte1;
	private String carte2;
	private String carte3;
	private int nr;
	
	public void setNume(String nume){  // Setarea campului nume;
		this.nume=nume;
	}
	public void setPrenume(String prenume){ // Setarea campului prenume;
		this.prenume=prenume;
	}
	public void setCnp(String cnp){ // Setarea campului cnp;
		this.cnp=cnp;
	}
	public void setNr(int nr){  // Setarea campului nr;
		this.nr=nr;
	}
	public String getCnp(){  // Metoda returneaza cnp pentru a putea cauta o persoana dupa acest camp;
		return cnp;
	}
	public String setCarte(String carte){   // Aceasta metota set actualizeaza cartile imprumutate ;
		if(this.carte1 == null)
			{
				this.carte1=carte;
				return "Carte a fost adaugata cu succes";
			}
		else
			if(this.carte2 == null)
			{
				this.carte2=carte;
				return "Carte a fost adaugata cu succes";
			}
			
			else if (this.carte3 == null)
				{
					this.carte3 = carte;
					return "Carte a fost adaugata cu succes";
				}
				else
					return "Prea multe carti imprumutate";
	}
	
	
	

	
	
	public String toString(){  // Metoda toString returneaza toate datele unei persoana deoarece acestea nu pot fi accesate direct fiind private;
		String msg="NR : "+nr;
		msg+=" Nume : "+nume;
		msg+=" Prenume : "+prenume;
		msg+=" CNP : "+cnp;
		return msg;
	}
}