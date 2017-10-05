
public class CompteBancaire {
	private double solde ;
	private double somme ;
	public CompteBancaire(double solde)
    {
        this.solde=solde;
           }
	 public double getSolde()
	    {return solde;}
	 //crédit
	 public double credit(double somme)
	 {
	 if (somme > 0){
	 
		 return solde+somme ; }
	 
	  else
	 { return solde ;
	 }
	 }

	//debit
	 public double debit(double somme)
	 { 
		 if ( somme > 0 && solde < somme) 
		   {
			 throw new ArithmeticException();
			 
		   }
		else
		   { return solde - somme ;  }
	 }
	 
	//Transfert
	 public double Virement ( CompteBancaire a, CompteBancaire b)
	 {
		 
			 a.solde = a.solde + b.solde;
			 return a.solde;
		
	 }
	
}
