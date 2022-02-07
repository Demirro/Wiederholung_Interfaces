# Wiederholung_Interfaces

In diesem Projekt findet ihr den Code der Wiederholungsstunde zu Interfaces.

Hier wird (sehr rudimentär) ein Spiel aufgebaut.
Wir haben eine abstrakte Klasse *GameObject* vorliegen, welche für alle Objekte/Items in unserem imaginären Spiel stehen soll, mit denen die Spielenden interagieren können. Entsprechend erben die Klassen *Chocolate*, *Magazine* und *Water* von GameObject, da Objekte die aus den Klassen entstehen von Spielenden genutzt werden sollen.

Jetzt haben wir uns für unser Spiel überlegt, dass es einen Marktplatz geben soll, auf diesem Marktplatz nicht jedes Item bzw. GameObject (ver-)kaufbar sein soll.
Erstmal bekommt unsere *Player*-Klasse eine Methode zum Kaufen von Objekten. Allerdings müssen wir jetzt einen Weg finden einzelne Items im Spiel handelbar zu machen und das auch überprüfbar zu machen. Über die Elternklasse *GameObject* geht es nicht, da dann jedes GameObject zwangsweise handelbar wäre. In jede einzelne Klasse diese Funktion zu implementieren ist umständlich und löst nicht das Problem, wie wir überprüfen können ob etwas wirklich handelbar ist.

_Hallo Interfaces_

Wir erstellen ein Interface namens *Buyable*. Darin deklarieren wir eine Methode namens *price* die, einmal implementiert, den Preis eines Items zurückgeben soll.
Mit diesem Interface können wir jetzt GameObjects markieren, die handelbar sein sollen, indem wir einfach das Interface in die entsprechende Klasse implementieren.
Und wir können sogar sicher gehen, dass wir den Preis eines Items immer mit der *price()*-Methode abrufen können. Super.
Das sehen wir auch in der *buyGameObject()* Methode. Dort möchten wir nur die Übergabe von Objekte zulassen, die das Interface *Buyable* implementiert haben. Und weil wir das tun, können wir uns sicher sein, dass die übergebenen Objekte auch die *price()*-Methode beinhalten und können diese also sicher und ohne weitere Überprüfung aufrufen.

Also können wir jetzt unsere Items separat voneinander kennzeichnen und verschieden nutzbar machen. Und noch cooler: Man kann mehrere Interfaces implementieren (siehe *Chocolate*). Somit haben wir eine "erschummelte" Mehrfachvererbung. Und das alles unabhängig von irgendwelchen Elternklassen.
Außerdem könntet ihr jetzt in dieses Projekt einsteigen und müsstet um neue kaufbare Items hinzuzufügen einfach nur das Interface *Buyable* implementieren. Alles andere ist schon erledigt. Das heißt, ich hab mein Spiel super einfach erweiterbar gemacht, indem ich es mit Schnittstellen/Interfaces aufgebaut habe.

### Weitere Infos
In dem Interface *Buyable* seht ihr eine Variable und eine fertige Methode. Obwohl wir eigentlich gesagt hatten, das ginge nicht. Naja offensichtlich schon.
Variablen in Interfaces können nichts anderes sein als _static_ und _final_. Und wir erinnern uns: Das heißt es ist eine Konstante! Das kann in Interfaces genutzt werden, um wie bei uns wichtige Konstante für diese Schnittstelle festzuhalten, damit das nicht irgendwo anders rumliegt. Und dann kann man diese Konstante in den zwangsweise statischen Methoden im Interface benutzen, wie in diesem Projekt. Die implementierte ist im Prinzip einfach nur eine Helfer- oder auch Utility-Methode für eben dieses Interface. Aufrufen kann man das wie andere statische Methoden --> Buyable.isValidPrice().
Sieht man beides selten. Aber dennoch mal gut zu wissen :)

Ich hoffe das kann ein wenig aufklären. Bei weiteren Fragen immer gerne melden und ansonsten im nächsten Semester nachfragen.

### ℹ️ Resourcen:
Hier noch ein paar nützliche 📃Artikel, 🖊️Threads und 🎥Videos

- [📃 Interfaces (Extern) & Basis für mein Beispiel](https://openbook.rheinwerk-verlag.de/javainsel/07_007.html#u7.7)
- 
- [📃 Erste Übung zu Interfaces](https://demirro.github.io/Programmierpraktikum_Overview_20_21/posts/Interfaces/)
- [📃 Zweite Übung zu Interfaces](https://demirro.github.io/Programmierpraktikum_Overview_20_21/posts/Klassen_Interfaces_Wiederholung/)
- 
- [📃 Vererbung II (Wegweiser)](https://dh-cologne.github.io/java-wegweiser/articles/Vererbung-II-Abstrakte-Klassen-und-Methoden.html)
- [📃 Vererbung III(Wegweiser)](https://dh-cologne.github.io/java-wegweiser/articles/Vererbung-III-Interfaces.html)
- [📃 Interfaces (Extern)](https://www.programmierenlernenhq.de/interfaces-in-java/)


- [📃 Java Naming Conventions](https://github.com/DH-Cologne/java-wegweiser/blob/master/articles/Naming-Conventions.md)
