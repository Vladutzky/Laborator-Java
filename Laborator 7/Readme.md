

### Exercițiul 1 – Copiere fișier text
**Cerință:**  
Scrie un program care citește un fișier `.txt` caracter cu caracter (folosind `FileReader`) și îl copiază într-un alt fișier. Afișează numărul total de caractere copiate.

---

### Exercițiul 2 – Prelucrare fișier binar (imagine BMP)
**Cerință:**  
Scrie un program care citește un fișier `.bmp`, păstrează header-ul și inversează culorile fiecărui pixel (complementul RGB). Folosește `FileInputStream` și `FileOutputStream`.

---

### Exercițiul 3 – Folosirea RandomAccessFile
**Cerință:**  
Creează un fișier binar în care scrii 10 valori `double`. Apoi, folosește `RandomAccessFile` pentru a:
- afișa valoarea aflată la poziția 5,
- înlocui valoarea de la poziția 3 cu dublul ei,
- afișa toate valorile după modificare.

---

## Partea II: Lambda, Stream API, Clase Anonime

### Exercițiul 4 – Clasă anonimă cu interfață
**Cerință:**  
Creează o interfață `Operatie` cu o metodă `double calculeaza(double a, double b)`. Creează o clasă anonimă care implementează această interfață și realizează adunarea și scăderea a două numere.

---

### Exercițiul 5 – Expresii lambda și sortare
**Cerință:**  
Definește o clasă `Persoana` cu nume și vârstă. Creează o listă de persoane și sorteaz-o:
- după vârstă, crescător (cu lambda),
- după nume, alfabetic (cu `Comparator.comparing()` și method reference).

---

### Exercițiul 6 – Stream API – filtrare și mapare
**Cerință:**  
Creează o listă de `Student`, fiecare cu nume și medie. Folosește Stream API pentru a:
- filtra studenții cu media peste 8,
- extrage doar numele acestora într-o listă,
- afișa rezultatul cu `forEach`.

---

### Exercițiul 7 – Sumă și medie cu reduce
**Cerință:**  
Creează un `List<Integer>` cu note. Folosește `stream.reduce()` pentru a calcula:
- suma tuturor notelor,
- media notelor.
"""