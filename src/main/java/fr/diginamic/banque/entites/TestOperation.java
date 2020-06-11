package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		
		Credit op1 = new Credit("10/06/2020",80502.00F);
		Credit op2 = new Credit("09/06/2020",5.00F);
		Debit op3 = new Debit("01/01/1999",20.50F);
		Debit op4 = new Debit("25/05/2019",65456.12F);
		Compte c = new Compte("0000",0F);

		
		Operation[] tabOp = {op1,op2,op3,op4};
		for(int i=0 ; i < tabOp.length ; i++) {
			float montant = tabOp[i].getMontant();
			System.out.println("Informations du compte "+(i+1));
			System.out.println("date : "+tabOp[i].getDate());
			System.out.println("montant : "+montant+"€");
			
			c.ajoutOperation(tabOp[i]);
			
			
		}
		
		System.out.println("Montant global : "+c.getSolde()+"€");
	}

}
