package myMath;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		////Monom Constructor test
		Monom m =new Monom(2,3);
		Monom l =new Monom(0.5,3);
		Monom n =new Monom(1,5);
		Monom q =new Monom(5,0);

		//Polynom Constructor Test and more declarations

		Polynom p =new Polynom();
		Polynom q1=new Polynom();

	
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///MONOM TESTS		



		////f test
		/*
		System.out.println(m.f(0));    //should be 0
		System.out.println(m.f(1));		//should be 2
		System.out.println(l.f(1));		//should be 0.5

		 */		
		////add Test
		/*
		m.add(l);
		n.add(m);
		System.out.println("coefficient is :" + m.get_coefficient() + " Power is: "+ m.get_power());//should be 2,5 + 3
		System.out.println("coefficient is :" + n.get_coefficient() + " Power is: "+ n.get_power());//should be 1 + 5
		 */		
		////multiply test
		/*		
		Monom k=m.multiply(n);
		Monom y=l.multiply(l);
		System.out.println("coefficient is :" + k.get_coefficient() + " Power is: "+ k.get_power());  //should be 2+8
		System.out.println("coefficient is :" + y.get_coefficient() + " Power is: "+ y.get_power());	//should be 0.25+6
		 */
		////derivative test 
		/*		
		Monom k=m.derivative();
		Monom t=n.derivative();
		Monom y=q.derivative();
		System.out.println("coefficient is :" + k.get_coefficient() + " Power is: "+ k.get_power());  //should be 6+2
		System.out.println("coefficient is :" + t.get_coefficient() + " Power is: "+ t.get_power());  //should be 5+4
		System.out.println("coefficient is :" + k.get_coefficient() + " Power is: "+ k.get_power());  //should be 2+8
		System.out.println("coefficient is :" + y.get_coefficient() + " Power is: "+ y.get_power());  //should be 0+0
		 */		



		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//POLYNOM TESTS

		
		// Polynom toString&&add&&add in order test
/*
		String s = p.toString();
		System.out.println(s);
		 
		
		//Polynom value at x Test (result should be 8)
		double resultOfF= p.f(2);
		System.out.println("value of x for the polynom is: "+resultOfF);

		s = p.toString();
		System.out.println(s);
		System.out.println(p.f(2)); //result should be 32
		 
		
		//Copy constructor test
		Monom m3 =new Monom(1,4);
		Polynom pCopy=new Polynom(p);
		pCopy.add(m3);
		System.out.println("pCopy Polynom is:" +pCopy.toString());
		System.out.println("p Polynom is: " + p.toString());
		 
		
		//isZero test
		Polynom zeroP =new Polynom();
		System.out.println(zeroP.isZero());//answer should be true
		System.out.println(p.isZero()); //answer should be false
		 
		
		//derivative test
		System.out.println(q1);
		System.out.println(p);
		Polynom q1Derivative=(Polynom)q1.derivative();
		Polynom pDerivative = (Polynom)p.derivative();

		System.out.println("pCopy derivative is : "+q1Derivative.toString());
		System.out.println("pDerivative is : "+pDerivative.toString());
		 
		
		//equals test
		System.out.println(p.equals(zeroP)); //return false
		System.out.println(p.equals(pDerivative));//return false
		Polynom zeroPCopy =new Polynom(p);
		System.out.println(zeroPCopy.equals(p));//return true
		
		//add (polynom) test
		System.out.println("p is : "+ p.toString());   //3x^3 +2x^2
		System.out.println("pDerivtive is : " +pDerivative.toString()); //9x^2+4x^1
		p.add(pDerivative);
		System.out.println(p.toString());          // result is 3x^3 + 11x^2 + 4x^1

		pDerivative.add(p);
		System.out.println(pDerivative.toString());
		 
		//substract test
		System.out.println(p.toString());
		System.out.println(q1.toString());
		q1.substract(p);
		System.out.println(q1.toString());
				
		//multiply Polynom by Polynom
		System.out.println(p);
		System.out.println(q1);
		p.multiply(q1);
		System.out.println(p);
		//String constructor
		Polynom mp = new Polynom ("x^2-1+2x");
		System.out.println(mp.toString());
		//root test
		System.out.println(mp.root(-30, 30, 0.04)); 
		  //should be -1.0517 with deviation of 0.04.
		   * */
		   
	}
}


