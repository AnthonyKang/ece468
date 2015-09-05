import org.antlr.v4.runtime.*;


public class Micro{
	
	public static void main(String[] args) throws Exception{
		ANTLRErrorStrategy es = new CustomErrorStrategy();


		try{
			MicroLexer lexer = new MicroLexer( new ANTLRFileStream(args[0]));

			CommonTokenStream tokens = new CommonTokenStream(lexer);

			MicroParser parser = new MicroParser(tokens);

			parser.setErrorHandler(es);

			ParserRuleContext t = parser.program();

			System.out.println("Accepted");

		} catch (RuntimeException e){
			System.out.println("Not accepted");
		}




		/*
		for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()){
			switch(token.getType()){
				case 3: System.out.println("Token Type: IDENTIFIER"); break;
				case 5: System.out.println("Token Type: INTLITERAL"); break;
				case 4: System.out.println("Token Type: FLOATLITERAL"); break;
				case 6: System.out.println("Token Type: STRINGLITERAL"); break;
				case 2: System.out.println("Token Type: KEYWORD"); break;
				case 8: System.out.println("Token Type: OPERATOR"); break;
				//case 9: System.out.println("Token Type: COMMENT"); break;
			}
			if(token.getType() != 7 && token.getType() != 9){

				System.out.println("Value: " + token.getText());
			}
			
			//System.out.println(token.getType());
		}*/


	}
}