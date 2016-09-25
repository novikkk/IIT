#include "Strichka.h"
Strichka::Strichka(String^ str)
{
	this->str = str;
}

SortedDictionary<String^, int>^ Strichka::getDictionary(bool a) {
	SortedDictionary<String^, int>^ MyDictionary = gcnew SortedDictionary<String^,int>();
	const wchar_t seperator[] = {' ',',' };
	array<String^>^ mas = str->Split(*seperator);

	for (int i = 0; i < mas->Length; i++) {
		mas[i] = mas[i]->ToLowerInvariant();
	}

	for (int i = 0; i < mas->Length; i++) {
		if (!(*MyDictionary).ContainsKey(mas[i])) {
			(*MyDictionary).Add(mas[i],1);
		}
		else {
			(*MyDictionary).default[mas[i]]++;
		}
	}

	dictionary = MyDictionary;
	SortedDictionary<String^, int>^ dictionary = gcnew SortedDictionary<String^, int>();;

	if (a) {
		String^ max_key; int max = 0;
		for (SortedDictionary<String^, int>::Enumerator myLich = MyDictionary->GetEnumerator(); myLich.MoveNext();) {
			if (myLich.Current.Value > max) {
				max = myLich.Current.Value;
				max_key = myLich.Current.Key;
			}
		}
		MyDictionary->Remove(max_key);
	}
	if (a) {
		String^ max_key; int min = 1000;
		for (SortedDictionary<String^, int>::Enumerator myLich = MyDictionary->GetEnumerator(); myLich.MoveNext();) {
			if (myLich.Current.Value < min) {
				min = myLich.Current.Value;
				max_key = myLich.Current.Key;
			}
		}
		MyDictionary->Remove(max_key);
	}

	return MyDictionary;
}

