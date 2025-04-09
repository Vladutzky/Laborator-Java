

## Exercițiul 1 – Introducere în try-catch-finally

**Cerințe:**

- Scrieți o metodă `readInteger()` care citește un număr întreg și tratează `NumberFormatException`.
- Utilizați blocurile `try`, `catch` și `finally`.
- Afișați mesaje relevante pentru fiecare caz.

---

## Exercițiul 2 – Multi-catch și Ordinea Blocurilor Catch

**Cerințe:**

- Scrieți o metodă `parseAndDivide(String a, String b)` care aruncă `NumberFormatException` și `ArithmeticException`.
- Tratați ambele într-un bloc `multi-catch`.
- Apelați metoda din `main()` cu date greșite pentru a testa ambele excepții.

---

## Exercițiul 3 – Excepții Personalizate și Propagare

**Cerințe:**

- Definiți `InvalidGradeException` extinzând `Exception`.
- Creați metoda `validateGrade(int grade)` care aruncă excepția dacă nota nu e între 1 și 10.
- Tratați excepția în `main()`.

---

## Exercițiul 4 – Interfețe și Implementare

**Cerințe:**

- Creați interfața `Shape` cu metodele `getArea()` și `getPerimeter()`.
- Implementați-o în clasele `Circle` și `Rectangle`.
- Creați un array de tip `Shape` și afișați rezultatele pentru fiecare formă.

---

## Exercițiul 5 – Comparable pentru Sortare

**Cerințe:**

- Clasa `Student` să implementeze `Comparable<Student>`.
- Suprascrieți `compareTo` pentru a sorta după notă.
- Creați o listă de studenți, sortați-o și afișați rezultatul.

---

## Exercițiul 6 – Combinația Excepții + Interfețe

**Cerințe:**

- Interfața `DatabaseActions` cu metode `connect()` și `executeQuery(String)`.
- Clasa `FakeDatabase` să arunce `IllegalStateException` dacă e offline și `SQLException` pentru query invalid.
- Tratați ambele excepții separat în `main()`.

---

## Exercițiul 7 – Gestionare cu List

**Cerințe:**

- Clasa `Product` cu `id`, `name`, `price`.
- Folosiți un `ArrayList<Product>`, parcurgeți-l și sortați-l după preț.
- Folosiți `Iterator` și `Comparator`.

---

## Exercițiul 8 – Gestionare cu Map

**Cerințe:**

- Clasa `Student` cu `id`, `name`, `grade`.
- Folosiți un `HashMap<Integer, Student>`.
- Afișați conținutul și actualizați nota unui student.

---