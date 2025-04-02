
## Exercițiul 1 – Moștenire versus Compoziție

**Cerințe:**

- Definește două clase care modelează o relație HAS_A:
  - **Clasa `Room`:**
    - Atribute: `double width`, `double length`.
    - Un constructor parametrizat și un constructor de copiere.
  - **Clasa `House`:**
    - Atribute: `String address`, `Room diningRoom`, `Owner owner`.
    - În relația cu `Room`, folosește **compoziția**: inițializează intern o copie a obiectului primit (prin constructor de copiere).
    - În relația cu `Owner` (o altă clasă pe care o definești simplu cu atribute precum `String name`), folosește **agregarea**: stochează referința directă, fără a crea o copie.
- În metoda `main`, demonstrează diferența:
  - Dacă se modifică obiectul `Room` trecut ca argument, observați că House păstrează o copie proprie (compoziție).
  - Dacă se modifică obiectul `Owner`, modificarea se reflectă și în casă (agregare).

---

## Exercițiul 2 – Suprascrierea Metodelor din Clasa Object

**Cerințe:**

- Creează o clasă `Person` cu următoarele atribute:
  - `String name`
  - `int age`
- Suprascrie metodele din clasa `Object`:
  - **`toString()`** – returnează un șir reprezentativ, de exemplu: `"Person{name='John', age=30}"`
  - **`equals(Object o)`** – compară două obiecte `Person` pe baza valorilor atributelor.
  - **`hashCode()`** – generează un cod hash consistent cu `equals()`.
- În metoda `main`, creează două instanțe de `Person` cu aceleași valori și demonstrează:
  - Că `equals()` returnează `true`.
  - Că hashCode-ul este același.
  - Afișarea cu `toString()`.

---

## Exercițiul 3 – Crearea unei Clase Imutabile

**Cerințe:**

- Definește o clasă imutabilă `ImmutablePoint` care reprezintă un punct cu coordonate:
  - **Atribute:**  
    - `private final double x`
    - `private final double y`
- Reguli:
  - Clasa trebuie să fie `final`.
  - Atributele sunt private și finale.
  - Nu se definesc setteri, doar un constructor parametrizat și metode getter.
- În metoda `main`, creează un obiect `ImmutablePoint` și demonstrează că valorile nu se pot modifica după crearea obiectului.

---

## Exercițiul 4 – Utilizarea Records

**Cerințe:**

- Creează un record `Student` cu componentele:
  - `String name`
  - `int group`
  - `double grade`
- În metoda `main`, creează cel puțin două instanțe de `Student` și:
  - Afișează-le utilizând metoda implicită `toString()`.
  - Compară-le cu metoda `equals()` și afișează rezultatul.
  - Demonstrează utilizarea componentelor (ex.: `student.name()`).

---

## Exercițiul 5 – Lucrul cu Șiruri de Caractere

**Cerințe:**

- Scrie un program care să ilustreze diferențele dintre clasele:
  - **`String`:** Demonstrează imutabilitatea – modificarea unui șir prin metode (ex.: `toUpperCase()`) nu schimbă șirul original.
  - **`StringBuilder`:** Demonstrează modul în care se poate modifica șirul (ex.: folosind `append()`, `insert()`, `delete()`).
  - **`StringBuffer`:** Similar cu `StringBuilder`, dar menționează că metodele sale sunt thread-safe.
- În metoda `main`, realizează următoarele:
  - Creează un `String` și afișează rezultatul unei operații de modificare (de exemplu, `toLowerCase()`) fără a modifica șirul original.
  - Creează un `StringBuilder`, modifică-l prin concatenare și afișează rezultatul.
  - (Opțional) Demonstrează diferența de performanță sau explică diferența conceptuală între `StringBuilder` și `StringBuffer`.

---

## Exercițiul 6 – Mini Aplicație Integrată

**Cerințe:**

- Creează o mini aplicație care combină mai multe concepte:
  - Definește o clasă `House` folosind compoziția (vezi Exercițiul 1) și o clasă `Owner`.
  - Creează o clasă imutabilă `Address` (cu atribute precum `city` și `street`).
  - Utilizează un record `Student` pentru a reprezenta datele unui student.
  - Folosește `StringBuilder` pentru a construi un raport sumar care să includă:
    - Informații despre o casă (adresă, proprietar).
    - Informații despre studenți.
- În metoda `main`, creează instanțe ale acestor clase și generează raportul, demonstrând reutilizarea codului și imutabilitatea datelor.

---

