package figuras;

import java.awt.Color;

public class Triángulo extends Figura{
private double lado1;
private double lado2;
private double lado3;

double getLado1() {
	return lado1;
}

double getLado2() {
	return lado2;
}

double getLado3() {
	return lado3;
}

void setLado3(double lado3) {
	this.lado3 = lado3;
}

void setLado2(double lado2) {
	this.lado2 = lado2;
}

void setLado1(double lado1) {
	this.lado1 = lado1;
}

public Triángulo(double x, double y, Color color, double lado1, double lado2, double lado3){
super (x, y, color);
this.setLado1(lado1);
this.setLado2(lado2);
this.setLado3(lado3);
}


public double perímetro (){
   return getLado1() + getLado2() + getLado3();
}

public double área (){ 
   double sp = perímetro() / 2;
   return Math.sqrt(sp * (sp - getLado1()) * (sp - getLado2()) * (sp - getLado3())); 
}
}
