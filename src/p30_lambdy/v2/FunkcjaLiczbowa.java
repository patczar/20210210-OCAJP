package p30_lambdy.v2;

@FunctionalInterface
public interface FunkcjaLiczbowa {
    double oblicz(double arg);

    // void inna_metoda();

}

// Aby interfejs uznać za interfejs funkcyjny (i aby można było tworzyć instancje za pomocą lambd),
// interfejs musi deklarować dokładnie jedną metodę, która nie posiada implementacji domyślnej.

// Aby zwiększyć czytelność kodu i aby wprowadzić dodatkową weryfikację poprawności,
// można do tego interfejsu dodać adnotację @FunctionalInterface.
