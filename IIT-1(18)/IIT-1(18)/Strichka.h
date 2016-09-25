#pragma once
#include <string>
using namespace System;
using namespace System::Collections::Generic;
ref class Strichka
{
public:
	Strichka(String^ str);
	SortedDictionary<String^, int>^ getDictionary(bool a);
private:
	String^ str = nullptr;
	SortedDictionary<String^, int>^ dictionary;

};

