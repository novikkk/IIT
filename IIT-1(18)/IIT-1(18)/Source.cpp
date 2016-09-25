#include <string>
using namespace std;
class Strichka2 {
public:
	Strichka2() {

	}
	Strichka2(string str) {
		this->_data_ = str;
	}
private:
	string _data_;
};