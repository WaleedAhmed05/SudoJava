package l33tc0de;

public class IntegerToRoman {
	
	
	public static String func(int num) {
		String x="";
		if(num==1) {
			x="I";
		}
		
		else if(num==2) {
			x="II";
		}
		
		else if(num==3) {
			x="III";
		}
		
		else if(num==4) {
			x="IV";
		}
		
		else if(num==5) {
			x="V";
		}
		
		else if(num==6) {
			x="VI";
		}
		
		else if(num==7) {
			x="VII";
		}
		
		else if(num==8) {
			x="VIII";
		}
		
		else if(num==9) {
			x="IX";
		}
		
		else if(num==10) {
			x="X";
		}
		
		return x;
	}
	
  public static String intToRoman(int num) {
     
	  int digit;
	  String roman="";
	  
	  if(num<10) {
		  
		 roman=func(num);
		  
	  }
	  
	  else if(num<50 && num>9) {
		  
		  digit=num%10;
		  num/=10;
		  if(digit!=0) {
			  roman=func(digit);
		  }
		  
		  
		  if(num==1)
			  roman="X"+roman;
		  
		  else if(num==2)
			  roman="XX"+roman;
		  
		  else if(num==3)
			  roman="XXX"+roman;
		  
		  else if(num==4)
			  roman="XL"+roman;
		  
	  }
	  
	  else if (num<100 && num>49) {
		  //L
		  
		  
		  
		  digit=num%10;
		  num/=10;
		  if(digit!=0) {
			  roman=func(digit);
		  }
		  
		  if(num==5)
			  roman="L"+roman;
		  
		  else if(num==6)
			  roman="LX"+roman;
		  
		  else if(num==7)
			  roman="LXX"+roman;
		  
		  else if(num==8)
			  roman="LXXX"+roman;
		  
		  else if(num==9)
			  roman="XC"+roman;
		  
		  
	  }
	  
	  else if(num<500 && num>99) {
		  //C
		  
		  digit=num%100;
		  num/=100;
		  if(digit!=00) {
			  roman=intToRoman(digit);
		  }
		  
		  if(num==1)
			  roman="C"+roman;
		  
		  else if(num==2)
			  roman="CC"+roman;
		  
		  else if(num==3)
			  roman="CCC"+roman;
		  
		  else if(num==4)
			  roman="CD"+roman;	  		  
		  
	  }
	  
	  else if(num<1000 && num>499) {
		  //D
		  digit=num%100;
		  num/=100;
		  if(digit!=00) {
			  roman=intToRoman(digit);
		  }
		  
		  if(num==5)
			  roman="D"+roman;
		  
		  else if(num==6)
			  roman="DC"+roman;
		  
		  else if(num==7)
			  roman="DCC"+roman;
		  
		  else if(num==8)
			  roman="DCCC"+roman;
		  
		  else if(num==9)
			  roman="CM"+roman;	
		  
		  
		  
	  }
	  
	  else if(num>=1000) {
		  //M
		  
		  digit=num%1000;
		  num/=1000;
		  if(digit!=000) {
			  roman=intToRoman(digit);
		  }
		  
		  if(num==1)
			  roman="M"+roman;
		  
		  else if(num==2)
			  roman="MM"+roman;
		  
		  else if(num==3)
			  roman="MMM"+roman;
		  
		  
		  
	  }
	  
	  
	  while(num>10) {
	  digit=num%10;
	  
	  
	  
	  num/=10;
	  }
	  
	  
	  return roman;
    }
  
  public static void main(String[] args) {
	  //int j=10;
	  for(int i=1000; i<4000; i++) {
	  //System.out.println(intToRoman(i)+" "+i);
	  //System.out.println(i);
	  i=i+143;
	  
		  }
		 // System.out.println(intToRoman(880));
  }

}
