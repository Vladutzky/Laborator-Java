

## Exercițiul 1 – Array unidimensional

**Cerințe:**

- **Declarație și inițializare:**
  - Declarați un array de tip `int` cu o dimensiune fixă (ex.: 10 elemente).
  - Inițializați array-ul cu valori (de exemplu, `{1, 2, 3, ..., 10}`) la momentul declarației sau prin atribuirea valorilor într-o buclă.

- **Parcurgere și afișare:**
  - Parcurgeți array-ul folosind o buclă `for` clasică (cu indicii elementelor) și afișați fiecare valoare.
  - Parcurgeți array-ul folosind o buclă "enhanced for" (for-each) și afișați valorile.
  - Afișați întregul array într-o singură linie utilizând metoda `Arrays.toString()`.

---

## Exercițiul 2 – Array bidimensional

**Cerințe:**

- **Crearea array-ului:**
  - Creați un array bidimensional de tip `int` unde fiecare linie poate avea un număr diferit de coloane (ex.: prima linie cu 3 elemente, a doua cu 4 elemente, etc.).

- **Parcurgerea și afișarea:**
  - Parcurgeți array-ul folosind bucle imbricate (o buclă pentru rânduri și o buclă pentru coloane) și afișați elementele astfel încât fiecare linie să fie afișată pe o linie nouă.
  - Alternativ, folosiți bucle "enhanced for" pentru parcurgere.
  - (Opțional) Afișați array-ul complet folosind metoda `Arrays.deepToString()`.

---

## Exercițiul 3 – Definirea clasei "Persoana"

**Cerințe:**

- **Atribute:**
  - Creați clasa `Persoana` cu următoarele atribute:
    - `private String nume;`
    - `private int varsta;`
    - `private double[] venit;` (reprezentând veniturile pentru 12 luni)
    - `private static int nrPersoane;` (pentru contorizarea instanțelor)
    - *(Opțional)* un atribut `id` pentru identificarea unică a fiecărei instanțe.

- **Constructori:**
  - **Constructor implicit:**
    - Inițializați `nume` cu o valoare implicită (ex.: "Necunoscut").
    - Inițializați `varsta` cu 0.
    - Alocați array-ul `venit` pentru 12 luni.
  - **Constructor parametrizat:**
    - Permiteți inițializarea atributelor `nume`, `varsta` și `venit` (primiți ca parametru o listă de valori pentru array-ul `venit`).
  - **Constructor de copiere:**
    - Creați un constructor care primește un obiect de tip `Persoana` și copiază atributele.
    - Realizați o **deep copy** pentru array-ul `venit` (alocați un nou array și copiați elementele, pentru a evita partajarea referinței).

- **Metode suplimentare:**
  - Implementați metoda `toString()` pentru a returna un șir de caractere ce conține informațiile despre persoană (nume, vârstă, venituri etc.).
  - Implementați metode de tip `get` și `set` pentru fiecare atribut.

---

## Exercițiul 4 – Metode accesor și blocuri de inițializare

**Cerințe:**

- **Metode accesor:**
  - Implementați metodele `get` și `set` pentru fiecare atribut din clasa `Persoana` (ex.: `getNume()`, `setNume(String nume)`, `getVarsta()`, `setVarsta(int varsta)`, etc.).

- **Blocuri de inițializare:**
  - Adăugați un **bloc static** în clasa `Persoana` pentru inițializarea variabilelor statice (de exemplu, setați `nrPersoane` la 0).
  - Adăugați un **bloc nestatic** care să se execute înaintea oricărui constructor, pentru atribuirea unui ID unic fiecărei instanțe (ex.: `this.id = ++nrPersoane;`).

---

## Exercițiul 5 – Mini aplicație: Sistem de gestionare a studenților

**Cerințe:**

- **Definirea clasei `Student`:**
  - Creați clasa `Student` cu următoarele atribute:
    - `private String nume;`
    - `private int varsta;`
    - `private double medie;`
  - Implementați cel puțin doi constructori: unul implicit și unul parametrizat.
  - Implementați metodele `get` și `set` pentru toate atributele.
  - Faceți ca clasa să implementeze interfața `Comparable<Student>` pentru a putea sorta studenții (de exemplu, după medie).

- **Gestionarea colecției de studenți:**
  - În clasa principală, declarați și inițializați un array de studenți cu cel puțin 5 elemente.
  - Implementați o metodă pentru afișarea tuturor studenților din array.
  - Implementați o metodă pentru adăugarea sau modificarea unui student din array.

- **Sortare și căutare:**
  - Sortează array-ul de studenți folosind `Arrays.sort()`, bazat pe criteriul de sortare definit (de exemplu, media).
  - După sortare, implementați funcționalitatea de căutare a unui student folosind `Arrays.binarySearch()`, căutând după medie (sau alt criteriu relevant).

- **(Opțional) Pattern Singleton:**
  - Discutați sau implementați un pattern de tip Singleton pentru o clasă `Manager` care să coordoneze operațiunile de adăugare, modificare și afișare a studenților.

---