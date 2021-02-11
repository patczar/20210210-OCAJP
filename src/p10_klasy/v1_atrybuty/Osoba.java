package p10_klasy.v1_atrybuty;

public class Osoba {
    // zmienna definiowana wewnątrz klasy, to inaczej:
    // pole (field) / atrybut (attribute) / zmienna instancyjna (instance variable)
    // każdy obiekt ma osobną wartość tej zmiennej
    String imie, nazwisko;
    int wiek;

    // podczas tworzenia obiektu, jeśli nie wpiszemy innych wartości, to przyjmowane są wartości domyślne:
    // 0 (dla liczb typów prostych), false (dla boolean), null (dla wszelkich obiektów, w tym np. Integer)

    // zmienne bez słowa static, to są zmienne instancyjne - należą do poszczególnych obiektów

    // zmienna statyczna należy do klasy i jest współdzielona przez wszystkie obiekty
    static int wspolnaZmienna = 0;
}
