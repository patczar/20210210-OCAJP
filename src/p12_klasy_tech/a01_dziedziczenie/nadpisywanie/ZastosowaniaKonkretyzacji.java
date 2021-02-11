package p12_klasy_tech.a01_dziedziczenie.nadpisywanie;

abstract class Zwierze {
	Zwierze self() {
		return this;
	}
}

class Pies extends Zwierze {
	Pies self() {
		return this;
	}
}

class Kot extends Zwierze {
	Kot self() {
		return this;
	}
}
