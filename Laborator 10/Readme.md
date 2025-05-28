# Laborator – Threads și Socket-uri în Java

## Exercițiul 1 – Fire cu Thread și Runnable
Creează două fire care rulează în paralel și afișează caractere diferite ('A' și 'B') de 100 de ori fiecare. Testează cu `.start()` și `.run()` pentru a vedea diferențele.

## Exercițiul 2 – Utilizarea `sleep()` și `join()`
Modifică exercițiul 1 astfel încât firul principal să aștepte terminarea celor două fire. Adaugă pauze între afișări cu `Thread.sleep(50)`.

## Exercițiul 3 – Oprirea unui fir cu `interrupt()`
Creează un fir care afișează numere infinit. După ce utilizatorul tastează "stop" în consola, firul este întrerupt și se oprește.

## Exercițiul 4 – Contor sincronizat
Creează un contor global și două fire care îl incrementează de 10.000 ori. Arată rezultatul fără și cu `synchronized` pentru a evidenția diferența.

## Exercițiul 5 – Producător–Consumator
Implementează două fire: unul produce un număr, celălalt îl consumă, folosind o coadă partajată (`LinkedList`). Sincronizează folosind `wait()` și `notify()`.

## Exercițiul 6 – Chat simplu cu socket-uri
Creează un server și un client care comunică prin mesaje text. Chatul continuă până când unul din participanți trimite mesajul „STOP”.