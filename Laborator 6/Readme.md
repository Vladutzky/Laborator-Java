
## Exercițiul 1 – Utilizarea enum pentru stări de comandă

**Cerințe:**
- Definește un `enum` numit `OrderStatus` cu valorile: `PLACED`, `SHIPPED`, `DELIVERED`, `CANCELLED`.
- Creează o clasă `Order` cu atribute: `id`, `status`.
- Adaugă metode care schimbă starea comenzii și o metodă `printStatus()`.

---

## Exercițiul 2 – Enum cu câmpuri și metode

**Cerințe:**
- Creează un `enum` numit `Currency` cu valori: `EUR`, `USD`, `GBP`, fiecare având un curs față de RON.
- Fiecare constantă are un atribut `exchangeRate`.
- Creează o metodă `convertToRON(double amount)` care folosește cursul.

---

## Exercițiul 3 – Shallow vs Deep Copy

**Cerințe:**
- Creează clasa `Departament` cu atribute `nume` și `cod`.
- Creează clasa `Angajat` cu nume și un obiect `Departament`.
- Fă o implementare `clone()` shallow și una deep în `Angajat`.
- Testează prin modificarea obiectului copiat și observă efectul asupra originalului.

---

## Exercițiul 4 – Cloneable și instanceof

**Cerințe:**
- Creează o clasă `Carte` care implementează `Cloneable`.
- Suprascrie metoda `clone()` și folosește `instanceof` pentru verificarea.
- Creează o metodă statică care primește un obiect și îl clonează dacă este `Cloneable`.

---

## Exercițiul 5 – Clasă generică Box<T>

**Cerințe:**
- Creează o clasă generică `Box<T>` cu metodele `setValue(T)` și `getValue()`.
- Testează folosind tipuri diferite: `String`, `Integer`, `Student`.

---

## Exercițiul 6 – Metodă generică cu wildcard

**Cerințe:**
- Creează o metodă `printList(List<? extends Number>)` care afișează toate elementele.
- Testează cu `List<Integer>`, `List<Double>`, etc.

---

## Exercițiul 7 – Interfață cu metode default și static

**Cerințe:**
- Creează interfața `Logger` cu:
  - metodă `default void log(String msg)`
  - metodă `static boolean isEmpty(String str)`
- Creează o clasă care implementează `Logger` și folosește aceste metode.

---

## Exercițiul 8 – Interfețe `sealed`, `non-sealed` și `final`

**Cerințe:**
- Creează o clasă `Animal` definită ca `sealed`.
- Permite doar clasele `Pisica` (`final`) și `Caine` (`non-sealed`) să o extindă.
- Creează instanțe și testează comportamentul în `main`.

---