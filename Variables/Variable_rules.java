package com.Variable;

public class Variable_rules {

	public static void main(String[] args) {
		//1.variables are the case sentive
        String name = "nobi";
        String NAME = "chan";
        System.out.println(name);
        System.out.println(NAME);
        
        //2.if ur word is single word it must and should be in lower case latters
        //firstname
        
        //3. camel case
        //fristname
        /*String firstName = "chan";
        //more than 3 words nobi chan neelu
        String nobiChanNeelu = "nobi";
        System.out.println(firstName);
        System.out.println(nobiChanNeelu);*/
        
       //4.dont use the keywords in place of variable names
       //ex: int void = 20;
        
       //5.dont write the short forms like firstname-fn
        
       //6.(-,$)allowed remaining special characters are not allowed
       //dont use before varible words
       /*String first$Name ="nobi";
       double MATH_PI =3.14;
       System.out.println(first$Name);
       System.out.println(MATH_PI);*/
	}

}
