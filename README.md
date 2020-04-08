**Napravite klase MuzickiUredjaj, RadioKomponenta, CDKomponenta, MuzickiStub i TestMuzickiStub sa sledećim uslovima:**

a)	Apstraktna klasa MuzickiUredjaj koja ima: 
-	Atribut ukljucen koji ima vrednost TRUE ako je uređaj ukljucen, a FALSE ako nije. 
-	Atribut jacinaTona koji predstavlja jačinu tona na uređaju. Raspon vrednosti za ovaj atribut je od 0 do 40. Početna vrednost je 0. 
-	Metodu ukljuci koja uključuje uređaj. 
-	Metodu iskljuci koja isključuje uređaj. 
-	Metodu pojacajTon koja pojačava ton za 1 (ako je ton bio 5, posle poziva metode ima vrednost 6). Pojačavanje tona se vrši samo ako je ton manji od 40. 
-	Metodu smanjiTon koja smanjuje ton za 1 (ako je ton bio 5, posle poziva metode ima vrednost 4). Smanjivanje tona se vrši samo ako je ton veći od 0. 
-	Apstraktnu metodu ispisi koja ništa ne vraća a nema ni ulaznih argumenata. 

b)	Interfejs RadioKomponenta koji ima: 
-	Metodu promeniStanicu koja ne vraća ništa ali ako ulazni argument prima novu frekvenciju radio stanice. 

c)	Interfejs CDKomponenta koji ima: 
-	Metodu pustiPesmu koja ne vraća ništa ali kao ulazni argument prima broj pesme na CD-u koji je potrebno pustiti. 

d)	Klasa MuzickiStub koja nasleđuje klasu MuzickiUredjaj, implementira interfejse RadioKomponenta i CDKomponenta i ima: 
-	Atribut frekvencija koji predstavlja trenutnu frekvenciju radio stanice. Početna vrednost za ovaj atribut je 87.5. 
-	Atribut brojPesme koji predstavlja broj pesme sa CD-a koju muzički stub trenutno pušta. 
-	Atribut ukljucenRadio koji ima vrednost TRUE ako muzički stub trenutno pušta muziku sa radija, a inače FALSE. 
-	Atribut ukljucenCD koji ima vrednost TRUE ako muzički stub trenutno pušta muziku sa CD-a, a inače FALSE. 
-	Implementiranu metodu promeniStanicu koja uključuje radio komponentu muzičkog stuba (postavlja vrednost atributa ukljucenRadio na TRUE), isključuje CD komponentu (postavlja vrednost atributa ukljucenCD na FALSE), i postavlja vrednost atributa frekvencija na unetu vrednost. Dodeljivanje nove vrednosti za frekvenciju se vrši samo ako je uneta frekvencija u rasponu 87.5-108.0. U suprotnom, potrebno je dodeliti frekvenciju 87.5. 
-	Implementiranu metodu pustiPesmu koja uključuje CD komponentu muzičkog stuba (postavlja vrednost atributa ukljucenCD na TRUE), isključuje radio komponentu (postavlja vrednost atributa ukljucenRadio na FALSE), i postavlja vrednost atributa brojPesme na unetu vrednost. Dodeljivanje nove vrednosti za broj pesme se vrši samo ako je uneti broj u rasponu 1 do 21. U suprotnom, potrebno je pustiti prvu pesmu sa CD-a. 
-	Implementiranu metodu ispisi koja na ekranu ispisuje poruku o tome da li je muzički stub uključen. Ako jeste, metoda ispisuje i poruku o tome koja je trenutna jačina tona. Pored toga, ova metoda bi trebalo da, ako je uključena radio komponenta muzičkog stuba, ispiše frekvenciju radio stanice, a ako je uključen CD broj pesme koja se trenutno pušta. Ako stub nije uključen ne ispisuje se ništa drugo osim poruke da je isključen. 

e)	Klasa TestMuzickiStub koja kreira jedan objekat klase MuzickiStub, uključuje ga, pojačava ton za 2, podešava frekvenciju radija na 88.9 i ispisuje na ekranu podatke o muzičkom stubu. 
