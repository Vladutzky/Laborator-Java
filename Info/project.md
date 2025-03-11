# Programare Orientată pe Obiecte - proiect

Fiecare student va lucra la un proiect individual. Proiectul este structurat în mai multe etape.
Condiția de punctare a proiectelor:
- să nu prezinte erori de compilare
- să se implementeze/abordeze toate cerințele date

## Condiții de punctare
* fără erori de compilare
* prezentarea în cadrul laboratorului

## Termene de predare
* prima etapă: 14 - 18 Aprilie
* a doua etapă: 2 - 6 Iunie

## Etapa 1

### 1. Definirea sistemului
Să se creeze o listă pe baza temei alese cu cel puțin 10 acțiuni / interogări care se pot face în cadrul sistemului și o listă cu cel puțin 8 tipuri de obiecte. Prezentați sistemul, împreună cu acțiunile / obiectele alese.

### 2. Implementare
Să se implementeze în limbajul Java o aplicație pe baza celor definite pa primul punct.
Aplicația va conține:
- clase simple cu atribute private / protected și metode de acces;
- cel puțin 2 colecții diferite, capabile să gestioneze obiectele definite anterior (ex. List, Set, Map etc.), dintre care cel puțin una să fie sortată. În cazul în care până la data de predare a primei etape nu se parcurg colecțiile, se vor folosi array-uri uni/bidimensionale;
- utilizarea moștenirii pentru crearea de clase adiționale și utilizarea lor în cadrul colecțiilor;
- cel puțin o clasă serviciu, care să expună operațiile sistemului;
- o clasă Main, din care sunt făcute apeluri către servicii.

## Etapa 2

### 1. Extindeți proiectul din prima etapă, prin realizarea persistenței utilizând o bază de date relațională și JDBC.
Se vor realiza servicii care să expună operații CRUD (CREATE, READ, UPDATE, DELETE) pentru cel puțin 4 dintre clasele definite. Se vor realiza servicii singleton generice pentru citirea și scrierea în/din baza de date.

### 2. Realizarea unui serviciu de audit
Se va realiza un serviciu care va scrie într-un fișier de tip CSV de fiecare dată când este executată una din acțiunile descrise în prima etapă. Structura fișierului: *nume_acțiune, timestamp*.


# Teme sugerate
1. catalog (student, materie, profesor)
2. biblioteca (secțiuni, cărți, autori, cititori)
3. programare cabinet medical (client, medic, programare)
4. gestiune stocuri magazin (categorii, produse, distribuitori)
5. aplicație bancară (conturi, extras de cont, tranzacții, carduri, servicii)
6. platformă e-learning (cursuri, utilizatori, cursanți, quiz-uri)
7. sistem licitații (licitații, bids, produse, utilizatori)
8. platforma food delivery (localuri, comenzi, șoferi, useri)
9. platformă împrumut cărți - tip bookster (companii afiliate, utilizatori, cărți)
10. platformă e-ticketing (evenimente, locații, clienți)