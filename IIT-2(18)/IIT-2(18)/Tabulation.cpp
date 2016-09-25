#include "Tabulation.h"

Tabulation::Tabulation(double a, double b, double h, double(*f)(double))
{
	this->a = a;
	this->b = b;
	this->h = h;
	this->f = f;
}

void Tabulation::doIt() {
	for (double i = a; i < b; i+=h) {
		PointF point;
		point.X = i;
		point.Y = f(i);
		addPoint(point);
	}
}

void Tabulation::addPoint(PointF point){
	data.Add(point);
}

double static Tabulation::sin_(double x) {
	return Math::Sin(x);
}