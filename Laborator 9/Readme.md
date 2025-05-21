# 💾 Laborator 9

## 🟢 Partea I – JDBC (bază de date)

### ✅ Exercițiul 1 – Salvare în baza de date
Creează o clasă `Produs` cu atribute `id`, `nume`, `pret`.  
Creează un `ProdusService` care:
- Creează tabela `produse` în baza de date.
- Inserează un produs primit de la utilizator (folosind `PreparedStatement`).
- Afișează toate produsele din tabel.

### ✅ Exercițiul 2 – Căutare și actualizare
Extinde `ProdusService`:
- Permite căutarea unui produs după nume.
- Dacă produsul este găsit, actualizează prețul său.
- Dacă nu este găsit, afișează un mesaj.

### ✅ Exercițiul 3 – Ștergere în masă
Creează o metodă care:
- Primește un preț `minim` ca parametru.
- Șterge toate produsele mai ieftine decât acel preț.
- Afișează câte produse au fost șterse.

---

## 🟠 Partea II – Serializare / Deserializare

### ✅ Exercițiul 4 – Serializare obiect simplu
Creează o clasă `Persoana` care implementează `Serializable`.  
Scrie un program care:
- Creează un obiect `Persoana` și îl salvează într-un fișier `persoana.ser`.
- Încarcă apoi acel obiect și îl afișează în consolă.

### ✅ Exercițiul 5 – Serializarea unei liste
Creează o listă de `Persoana` (cu minim 3 instanțe).  
- Serializează lista într-un fișier `persoane.ser`.
- Deserializați lista și afișați toate persoanele.

### ✅ Exercițiul 6 – Externalizare cu câmp ignorat
Creează o clasă `Carte` care implementează `Externalizable`.  
Aceasta are: `titlu`, `autor`, `parolaAcces` (care nu se salvează).  
- La scriere (`writeExternal`), omite `parolaAcces`.
- La citire (`readExternal`), setează `parolaAcces` cu `"necunoscut"`.