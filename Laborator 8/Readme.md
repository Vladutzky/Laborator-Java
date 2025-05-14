
## Exercițiul 1 – Gestionare listă de studenți cu `ArrayList`

**Cerințe:**
- Creează o clasă `Student` cu nume, grupă și medie.
- Creează un `ArrayList<Student>`.
- Adaugă cel puțin 6 studenți, cu unele medii identice.
- Sortează studenții după medie descrescător.
- Găsește și afișează studentul cu media cea mai mare.
- Caută studenți cu nume care încep cu o literă introdusă de utilizator.

---

## Exercițiul 2 – `LinkedList` ca listă de taskuri

**Cerințe:**
- Creează o listă dublu înlănțuită `LinkedList<String>` pentru taskuri.
- Adaugă taskuri la început și sfârșit.
- Marchează un task ca finalizat (prin `remove()`).
- Afișează taskurile în ordine inversă folosind `descendingIterator()`.
- Creează o funcție care mută toate taskurile care conțin cuvântul „urgent” în fruntea listei.

---

## Exercițiul 3 – `HashSet` și `TreeSet`: mulțimi de orașe

**Cerințe:**
- Creează două colecții: `HashSet<String>` și `TreeSet<String>`.
- Adaugă 10 orașe, unele duplicate.
- Compară mărimea și conținutul mulțimilor.
- Afișează toate orașele în ordine alfabetică (cu `TreeSet`).
- Verifică dacă un oraș citit de la tastatură există în `HashSet`.

---

## Exercițiul 4 – `TreeSet` cu obiecte și `Comparable`

**Cerințe:**
- Creează o clasă `Produs` cu `nume` și `pret`, care implementează `Comparable<Produs>` (după preț).
- Creează un `TreeSet<Produs>` și adaugă produse.
- Afișează produsele sortate crescător după preț.
- Creează un al doilea `TreeSet<Produs>` cu un `Comparator` care sortează descrescător după nume.

---

## Exercițiul 5 – Catalog de note cu `HashMap`

**Cerințe:**
- Creează un `HashMap<String, List<Integer>>` unde cheia e numele studentului și valoarea e lista de note.
- Adaugă 4–5 studenți cu note.
- Calculează media fiecărui student.
- Afișează doar studenții cu medii ≥ 8.
- Afișează perechiile `nume: notă1, notă2...` folosind `entrySet()`.

---

## Exercițiul 6 – Prețuri sortate cu `TreeMap`

**Cerințe:**
- Creează un `TreeMap<String, Double>` în care cheia e un produs, valoarea e prețul.
- Adaugă cel puțin 6 produse.
- Afișează lista produselor sortate alfabetic.
- Calculează prețul total.
- Caută și afișează produsul cel mai scump.

---

## Exercițiul 7 – Simulare `Queue` și `Deque`

**Cerințe:**
- Simulează coada de la un ghișeu folosind `Queue<String>`. Adaugă clienți și procesează-i (`poll()`).
- Creează un `Deque<String>` pentru acțiuni în aplicație (undo/redo).
  - Adaugă acțiuni cu `addFirst()`.
  - Realizează undo prin `removeFirst()` și arată starea listei după fiecare operație.

---