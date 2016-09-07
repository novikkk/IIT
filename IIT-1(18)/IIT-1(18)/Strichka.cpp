#include "Strichka.h"
#include <string>
#include <regex>
#include <unordered_map>
using namespace std;
Strichka::Strichka(string a)
{
	value = a;
}

int Strichka::getCount() {
	const std::regex reg("\\w+");

	std::unordered_map<std::string, int> words;
	for (std::sregex_iterator next(_value.begin(), _value.end(), reg), end; next != end; ++next)
	{
		std::string word = next->str();
		std::transform(word.begin(), word.end(), word.begin(), tolower);
		++words[word];
	}

	
	return std::count_if(words.begin(), words.end(), [](const auto &p) { return p.second > 1; });
}

