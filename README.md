# Wiederholung_Interfaces

Interfaces. Ähnlich wie Klassen aber doch wieder anders. Wieso benutze ich nicht einfach eine abstrakte Klasse, macht es nicht das selbe und sogar noch mehr. Das ganze wird hoffentlich mit der Aufgabe klarer. Vorerst allerdings ein Exkurs

### Interfaces:
Interface, auf Deutsch Schnittstelle, sind in Java eng verwoben mit der Vererbung. Man kann mit Interfaces bestimmte Funktionen für Klassen zur Verfügung stellen. Allerdings schreibt das Interface, also die Schnittstelle nicht vor, wie diese Funktionen implementiert werden sollen.
Ein kleines abstrahiertes Beispiel: Ein Interface ist ein wenig wie eine Blaupause zu verstehen. Schaut man sich eine Computermaus beispielsweise an. Es gibt einen Standard, welchen jede Computermaus implementieren muss, um als Computermaus auch nutzbar zu sein. Allermindestens müssen Linksklick, Rechtsklich, Mausrad und die Möglichkeit die Maus zu bewegen vorhanden sein (wir gehen davon aus, dass die Maus schon mit dem Computer verbunden ist). Der Standard einer Maus, der diese vier Funktionalität vorgibt wäre in dem Fall das Interface. Man kann, solange diese vier Features existieren, die Maus so groß oder klein machen wie man will; die Bewegung so schnell oder langsam machen wie man will, zusätzliche Funktionen einbauen. Solange der Standard, also das Interface, erfüllt und implementiert ist, gilt das Gerät als Computermaus und kann auch als solche benutz werden.

In der Programmierung ist das komplett gleich. Man gibt eine Blaupause vor und ermöglicht meist die Kommunikation zweier voneinander getrennten Programmteile.
Beispiel: Ihr programmiert einen Zahlungsdienst und wollt, dass dieser Dienst jetzt in Online-Shops benutzt wird. Dazu muss euer Dienst in die diversen Shops eingebaut werden. Da ihr aber euren Code nicht an jeden rausgeben wollt und könnt entwickelt ihr eine oder mehrere Schnittstellen/Interfaces. Das Interface definiert dann die Funktionen die vom Shop eingebaut werden müssen, damit euer Dienst mit dem Shop richtig kommunizieren kann.

### Codebeschreibung:

In dem hochgeladnenen Code befindet sich unsere Erdensimulation, in welcher wir Gott spielen. Ich habe seit dem letzten Mal das Projekt aufgeräumt und ein paar Sachen ergänzt. Es gibt nun die abstrakten Klassen *Animal, DomesticAnimal* und *Plant*. Jeweils mit 1-2 Unterklassen.
Ein Interface namens *IEdible* wurde auch erstellt.
In der Klasse *Human*gibt es nun auch eine Methode *eat(IEdible edible)*. Diese Methode nimmt als Parameter ein Interface an. Denn jetzt kommt die Krux

Ein Mensch kann diverse Sachen. Diese Sachen können Tiere oder Pflanzen sein, aber nicht alle Tiere oder Pflanzen können/sollten gegessen werden.
Der erste Gedanke wäre eine abstrakte Klasse *Food* zu erstellen, die alle Sachen beinhaltet, die essbar sind. Allerdings können wir das nicht tun, denn ein Apfel erbt bereits von der Klasse *Plant*. In Java kann man nur von einer Klasse erben. In der Klasse Plant kann man auch nicht abstrahieren, denn nicht jede Pflanze ist essbar.

Wir können stattdessen ein Interface implementieren. Das Interface *IEdible*. *IEdible* schreibt nur eine Methode vor --> *getEaten()*. Diese Methode müssen alle Klassen implementieren, die das Interface einbauen. 
Das tolle an der Lösung:
Wir haben jetzt ein Konstrukt erschaffen, in welchem jede Klasse als essbar eingestuft werden kann.
Wir haben die Möglichkeit nach der Implementierung des Interfaces zu fragen (und sparen uns somit große und komplexe If-Abfragen).
Wir wissen, dass jede Klasse, welche das Interface implementiert, die Methode *getEaten()* besitzt

Das nutzen wir bei der Methode *eat(IEdible edible)*. Ein Objekt kann __nur__ übergeben werden, wenn es auch eine Implementierung des Interfaces *IEdible* besitzt. Damit geht wie eben schon angesprochen, dass wir auf die Methode *getEaten()* des übergegebenen Objektes zugreifen können. Somit ist alles sauber und verständlich programmiert und verknüpft. Das Projekt kann jetzt sogar einfach um ganz viele neue essbare Sachen erweitert werden, indem Klassen einfach dieses eine kleine Interface implementieren. Es muss dann nirgends eine neue Abfrage oder ähnliches gemacht werden.

### 📝 Aufgabe:
Schaut euch den Code an. Besonders wichtig sind hierbei die Klassen *Apple* und *Human* (besonders die Methode *eat*) und natürlich das Interface *IEdible*. Schaut euch an, wie das Interface da eingesetzt wird, wie die Methode implementiert wird. Ihr sollt nämlich die Klasse *Cow* vervollständigen. Bedeutet ihr sollt sowohl die Vererbung der Elternklassen *DomesticAnimal*, *Animal* als auch das Interface *IEdible* implementieren.

Wenn ihr Lust habt könnt ihr euch auch an neuen essbaren Klassen wagen, wie zum Beispiel einem Pilz, oder andere Tiere. Oder ihr macht die Klasse Human selbst essbar. Kannibalismus is a thing. 
Oder wenn ihr wirklich Lust habt: Überlegt euch ein neues Interfaces und implementiert dieses in ein paar Klassen.
    
### ℹ️ Resourcen:
Hier noch ein paar nützliche 📃Artikel, 🖊️Threads und 🎥Videos

- [🎥 Börges Seminar Video](https://www.ilias.uni-koeln.de/ilias/ilias.php?ref_id=3638292&eid=7e686519-b1c2-43e4-aacb-edee380504af&cmd=streamVideo&cmdClass=xoctplayergui&cmdNode=wn:os:17v:186&baseClass=ilrepositorygui)

- [📃 Vererbung II (Wegweiser)](https://dh-cologne.github.io/java-wegweiser/articles/Vererbung-II-Abstrakte-Klassen-und-Methoden.html)
- [📃 Vererbung III(Wegweiser)](https://dh-cologne.github.io/java-wegweiser/articles/Vererbung-III-Interfaces.html)
- [📃 Interfaces (Extern)](https://www.programmierenlernenhq.de/interfaces-in-java/)

- [📃 Java Naming Conventions](https://github.com/DH-Cologne/java-wegweiser/blob/master/articles/Naming-Conventions.md)
