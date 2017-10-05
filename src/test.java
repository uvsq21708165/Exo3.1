import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void test() {
		
		CompteBancaire compte1= new CompteBancaire(100);
		CompteBancaire compte2= new CompteBancaire(100);
		assertequals( 90,compte1.credit(100));
		assertequals( 100,compte1.debit(-10));
		assertequals( 100,compte1.getSolde());
		assertequals( 200,compte1.Virement(compte1, compte2));
	}

	private void assertequals(double i, double solde) {
		// TODO Auto-generated method stub
		
	}

}
