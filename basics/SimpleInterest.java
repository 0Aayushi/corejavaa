package basics;

public class SimpleInterest { public static void main(String[]args){
int P=5000;
int R =3;
int T =5;
int SI=(P*R*T)/100;
if(P>999) {
	System.out.println(SI);
}
else {
	System.out.println("0");
}

}
}
