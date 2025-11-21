# 📘 Tasca S3.2 – Patterns 2


## 📄 Descripció - Enunciat de l'exercici

Aquesta tasca consisteix en implementar diversos patrons de disseny en Java dins del context del Sprint 3.3 de la IT Academy.  
Inclou tres nivells:

- **Nivell 1:** Patró Builder amb interfícies progressives aplicat a un menú de restaurant.
- **Nivell 2:** Patró Observer aplicat a notificacions borsàries.
- **Nivell 3:** Patró Decorator aplicat a la personalització de Bubble Tea.




## ⭐ Nivell 1  
### 🧱 Patró Builder

### 📘 Què és?

El patró de disseny **Builder** és un patró creacional que ens ajuda a construir objectes complexos pas a pas, separant la construcció de l’objecte de la seva representació.

Facilita la creació d’objectes amb molts paràmetres opcionals sense utilitzar constructors massa llargs.

---

### 🛠️ Utilitat

És útil quan:

- L’objecte té molts atributs opcionals.
- Cal una construcció clara i llegible.
- Es vol evitar constructors telescòpics.

---

### 🎯 Propòsit

- Fer la construcció més mantenible.
- Evitar infinites sobrecàrregues de constructors.
- Millorar claredat quan es combina amb Fluent Builder.

Exemple:

```java
Car car = new CarBuilder()
        .withModel("Sedan Premium")
        .withEngine("Hybrid", 180)
        .withColor("Metallic Black")
        .withInterior("Leather")
        .withNavigationSystem()
        .withDriverAssistance()
        .withSportPackage()
        .build();
```

---

### 🧠 Exercici: Builder per menús de restaurant

#### 🏆 Objectiu

Implementar un sistema per construir menús utilitzant **Fluent Builder** juntament amb **Progressive Interface**, garantint que solament es puguin executar passos vàlids en ordre correcte.

---

### 📝 Descripció del domini

Els menús poden incloure:

- Entrants
- Plat principal
- Postres
- Beguda

Qualsevol plat pot ser:

- Vegà
- Sense gluten

Regles:

- El plat principal pot tenir suplement.
- El mig menú inclou només plat principal i beguda.
- El menú infantil inclou plat principal, beguda i postres.
- Les postres són opcionals i poden ser postres *o* cafè (mutuament excloents).
- No es poden afegir postres abans del plat principal.
- No es pot afegir suplement sense plat principal.

---

### ✅ Requisits

- Construcció pas a pas sense accedir a classes concretes.
- El disseny ha de garantir l’ordre correcte de construcció.
- Si es tria postres, no es pot afegir cafè (i viceversa).
- Les propietats del menú no han d’utilitzar booleans com paràmetre.
- S’han d’incloure tests unitaris.

---

### 💻 Exemple esperat

```java
Menu executiveMenu = new MenuBuilder()
    .withStarter("Amanida Mediterrània")
        .isVegan()
        .isGlutenFree()
    .withMainCourse("Filet de Vedella")
        .withSuplement("Guarnició extra")
    .withDessert("Mousse de xocolata")
    .withDrink("Vi Negre")
    .build();

Menu kidsMenu = new MenuBuilder()
    .withMainCourse("Macarrons amb tomàquet")
    .withDessert("Gelat de Vainilla")
    .withDrink("Suc de taronja")
    .build();

Menu halfMenu = new MenuBuilder()
    .withMainCourse("Risotto de bolets")
        .isVegan()
    .withCoffee("Espresso")
    .withDrink("Aigua")
    .build();
```

📌 *Recurs recomanat:* **Fluent Builder and Progressive Interface**

---

## ⭐⭐ Nivell 2  
### 👀 Patró Observer

### 📘 Què és?

El patró Observer defineix una relació **un-a-molts** entre objectes: quan l’objecte observat canvia d’estat, notifica automàticament als observadors.

---

### 🛠️ Utilitat

- Notificar diversos components quan alguna cosa canvia.
- Afegir o treure observadors dinàmicament.
- Implementar sistemes tipus Publisher/Subscriptor.

---

### 🎯 Propòsit

- Notificació automàtica sense acoblament fort.
- Afegir nous observadors sense modificar l’Observable.

---

### 🧠 Exercici: Agent de Borsa

#### 🏆 Objectiu

Simular un agent de borsa que notifiqui agències quan el valor de les accions puja o baixa.

---

### 📝 Requisits tècnics

- Observable manté referències d'observadors.
- Mètodes per simular pujades i baixades.
- Cada observer mostra el missatge rebut.
- Tests unitarios requerits.

---

#### 💻 Exemple esperat

```java
@Test
public void testStockAgentNotifications() {
   StockAgent agent = new StockAgent();

   Observer alphaBrokers = new StockBrokerAgency("Alpha Brokers");
   Observer zenithInvestments = new StockBrokerAgency("Zenith Investments");

   agent.addObserver(alphaBrokers);
   agent.addObserver(zenithInvestments);

   agent.stockMarketUp(150.75);
   // Expected:
   // Alpha Brokers: Stock market went UP to 150.75
   // Zenith Investments: Stock market went UP to 150.75
}
```

📌 *Recurs recomanat:* **Observer Pattern**

---

## ⭐⭐⭐ Nivell 3  
### 🎨 Patró Decorator

### 📘 Què és?

El patró Decorator permet afegir funcionalitats noves a un objecte **dinàmicament** sense modificar la classe base.

---

### 🛠️ Utilitat

- Afegir funcionalitats sense crear moltes subclasses.
- Composar comportaments de manera flexible.

---

### 🎯 Propòsit

- Evitar herències excessives.
- Afegir funcionalitats adicionalment amb objectes envoltants.

---

### 🧠 Exercici: Bubble Tea

#### 🏆 Objectiu

Crear un sistema de preparació de begudes Bubble Tea utilitzant decoradors per afegir ingredients.

---

### 📝 Requisits

- Interfície `BubbleTea` amb `getDescription()` i `getCost()`.
- Classes base: `LatteBase`, `MatchaBase`, `TeaBase`.
- Decoradors: `Ice`, `Sugar`, `Tapioca`, `Flavor`.
- Tests unitaris demostrant combinacions.

---

### 💻 Exemple d’ús

```java
BubbleTea tea = new LatteBase();
tea = new Tapioca(tea);
tea = new Sugar(tea);
tea = new Flavor(tea, "Maduixa");
tea = new Flavor(tea, "Mango");
```

📌 *Recurs recomanat:* **Decorator Design Pattern**

---

## 🤝 Autor

Projecte desenvolupat per **Jordi**  
IT Academy – Especialització Back-End amb Java


---

## 📄 Descripció - Enunciat de l'exercici

Aquesta tasca consisteix en implementar diversos patrons de disseny en Java dins del context del Sprint 3.3 de la IT Academy.  
Inclou tres nivells:

- **Nivell 1:** Patró Builder amb interfícies progressives aplicat a un menú de restaurant.
- **Nivell 2:** Patró Observer aplicat a notificacions borsàries.
- **Nivell 3:** Patró Decorator aplicat a la personalització de Bubble Tea.

---

## 💻 Tecnologies Utilitzades

- **Java 17**
- **JUnit 5**
- **Maven**
- **Git & GitHub**
- IDE recomanat: IntelliJ, Eclipse o VS Code

---

## 📋 Requisits

| Requisit | Descripció |
|----------|------------|
| Versió Java | 17 o superior |
| Maven | Instal·lat i configurat |
| Sistema Operatiu | Windows, MacOS o Linux |
| Connexió a GitHub | Necessària per lliurament |

---

## 🛠️ Instal·lació

```bash
git clone <URL_DEL_REPOSITORI>
cd projecte
mvn clean install
```

---

## ▶️ Execució

Per executar els tests:

```bash
mvn test
```

Si el projecte té main, executar-lo des de l'IDE o via:

```bash
mvn exec:java
```

---

## 🌐 Desplegament

Aquest projecte no requereix desplegament en entorn productiu, però es pot empaquetar amb:

```bash
mvn package
```

---

## 🤝 Contribucions

Les contribucions no són necessàries per aquesta tasca acadèmica, però si es vol ampliar:

1. Fer fork del repositori
2. Crear branca amb feature:
```bash
git checkout -b feature/nova-funcio
```
3. Fer commit i pull request.

---
