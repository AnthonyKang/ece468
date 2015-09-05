import org.antlr.v4.runtime.*;

public class CustomErrorStrategy extends DefaultErrorStrategy{
	
	@Override
	public void reportError(Parser recoginzer, RecognitionException e) throws RuntimeException{
		//System.out.println("Not Accepted");

		RuntimeException er = new RuntimeException();
		throw er;
	}
}