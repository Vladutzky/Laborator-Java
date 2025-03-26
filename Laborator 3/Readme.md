## Exercițiul 1 – Supraincarcarea Metodelor

**Cerințe:**

- Definește o clasă `MathUtil` care conține metode numite `multiply`:
  - **`multiply(int a, int b)`** – returnează produsul celor două numere întregi.
  - **`multiply(double a, double b, double c)`** – returnează produsul celor trei numere reale.
  - **`multiply(int[] values)`** – calculează și returnează produsul tuturor elementelor dintr-un array de întregi.
- În metoda `main`, apelează fiecare variantă a metodei și afișează rezultatele.

## Exercițiul 2 – Moștenire și Suprascriere

**Cerințe:**

- Definește o clasă de bază `Vehicle` care conține:
  - **Atribute:**  
    - `String brand`  
    - `int year`
  - **Constructor:**  
    - Un constructor parametrizat care inițializează atributele `brand` și `year`.
  - **Metodă:**  
    - `displayInfo()` – afișează informațiile despre vehicul (brandul și anul de fabricație).

- Definește o subclasă `Car` care extinde clasa `Vehicle` și adaugă:
  - **Atribut suplimentar:**  
    - `int numberOfDoors`
  - **Suprascriere:**  
    - Suprascrie metoda `displayInfo()` pentru a include și informația despre numărul de uși, de exemplu, afișând:  
      `Car: <brand> (<year>), Doors: <numberOfDoors>`

- În metoda `main`, efectuează următoarele:
  - Creează o instanță de `Vehicle`.
  - Creează o instanță de `Car`.
  - Apelează metoda `displayInfo()` pentru fiecare instanță și observă diferențele de comportament între metoda din clasa de bază și cea suprascrisă în subclasă.

## Exercițiul 3 – Polimorfism cu Clase Abstracte

**Cerințe:**

- Definește o clasă abstractă `Animal` care conține:
  - **Metodă abstractă:**  
    - `makeSound()` – metoda abstractă ce va fi implementată de clasele derivate.
- Creează două clase concrete, `Dog` și `Cat`, care extind `Animal` și implementează metoda `makeSound()` astfel:
  - **`Dog`:** afișează "Woof!"
  - **`Cat`:** afișează "Meow!"
- În metoda `main`, efectuează următoarele:
  - Creează un array de tip `Animal` care conține instanțe de `Dog` și `Cat`.
  - Iterează prin array și apelează metoda `makeSound()` pentru fiecare element pentru a demonstra polimorfismul.

## Exercițiul 4 – Interfețe și Implementare

**Cerințe:**

- Definește o interfață `Insurable` care declară metoda:
  - **`double getInsuranceCost()`** – returnează costul asigurării.
- Definește o clasă abstractă `Vehicle` care conține:
  - **Metodă abstractă:**  
    - `void drive()` – care va fi implementată de clasele derivate.
- Creează o clasă `Motorcycle` care extinde `Vehicle` și implementează interfața `Insurable`:
  - **Atribute:**  
    - `String brand`  
    - `int engineCapacity`
  - **Implementare:**  
    - Metoda `drive()` afișează un mesaj specific, de exemplu:  
      `"Motorcycle [brand] is driving"`
    - Metoda `getInsuranceCost()` calculează costul asigurării, de exemplu:  
      `engineCapacity * 1.5`
- În metoda `main`, efectuează următoarele:
  - Creează o instanță de `Motorcycle`.
  - Apelează metoda `drive()` și afișează costul asigurării folosind metoda `getInsuranceCost()`.
## Exercițiul 5 – Overriding versus Overloading

**Cerințe:**

- Definește o clasă `Printer` cu următoarele metode:
  - **`print(String s)`** – afișează șirul primit.
  - **`print(int number)`** – afișează numărul primit.
- Definește o subclasă `ColorPrinter` care extinde `Printer` și suprascrie metoda `print(String s)` astfel încât să afișeze șirul primit împreună cu un indiciu de culoare (de exemplu, "Printing in red: \<s\>").
- În metoda `main`, efectuează următoarele:
  - Creează o instanță de `Printer` și una de `ColorPrinter`.
  - Demonstrează apelarea metodelor supraincarcate din clasa `Printer`.
  - Demonstrează apelarea metodei suprascrise din clasa `ColorPrinter`.
  - Discută diferența dintre supraincarcare (overloading) și suprascriere (overriding).

## Exercițiul 6 – Mini Aplicație: Gestionarea Formelor Geometrice

**Cerințe:**

- Definește o clasă abstractă `Shape` cu metoda abstractă:
  - `double getArea()` – returnează aria formei.
- Creează două clase:
  - **`Rectangle`**:
    - **Atribute:**  
      - `double width`  
      - `double height`
    - **Implementare:**  
      - Metoda `getArea()` returnează `width * height`.
  - **`Circle`**:
    - **Atribut:**  
      - `double radius`
    - **Implementare:**  
      - Metoda `getArea()` returnează `Math.PI * radius * radius`.
- Definește o interfață `Colorable` care declară metoda:
  - `String getColor()` – returnează culoarea formei.
- Fă ca clasa `Circle` să implementeze interfața `Colorable` și să returneze o culoare prestabilită (ex.: "blue").
- În metoda `main`, efectuează următoarele:
  - Creează o listă (sau un array) de tip `Shape` care conține instanțe de `Rectangle` și `Circle`.
  - Iterează prin listă, afișând aria fiecărei forme; pentru obiectele care implementează `Colorable`, afișează și culoarea.
  - Sortează formele după arie folosind un `Comparator` (fără a implementa `Comparable`) și afișează rezultatele sortate.
  




