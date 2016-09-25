#pragma once
using namespace System::Collections::Generic;
using namespace System::Drawing;
using namespace System;
ref class Tabulation
{
public:
	Tabulation(double a, double b, double h,double (*а)(double));
private:
	double(*f)(double);
	void doIt();
	List<PointF> data;
	double a, b, h;
	void addPoint(PointF a);
	const double sin_(double x);
};

