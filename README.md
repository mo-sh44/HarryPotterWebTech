[![CI](https://github.com/mo-sh44/HarryPotterWebTech/actions/workflows/test.yml/badge.svg)](https://github.com/mo-sh44/HarryPotterWebTech/actions/workflows/test.yml)

# 🧙‍♂️ Harry Potter Webprojekt – Webtechnologien Kurs

🌐 **Live-Link**:
👉 [https://harrypotter-frontend.onrender.com](https://harrypotter-frontend.onrender.com)

## 📚 Projektbeschreibung

Dieses Projekt wurde im Rahmen des Kurses **Webtechnologien** im Sommersemester 2025 an der **HTW Berlin** entwickelt.

Wir – ein Team bestehend aus zwei Gruppenmitgliedern – haben gemeinsam eine interaktive Website zum Thema **Harry Potter** umgesetzt. Ziel war es, eine moderne Webanwendung zu entwickeln, die Inhalte aus dem Harry-Potter-Universum übersichtlich darstellt und mit Backend-Funktionalitäten kombiniert.

## 🧩 Hauptfunktionen & Inhalte

Die Webseite bietet Informationen zu folgenden Kategorien:

* 🧑‍🎓 **Charaktere** (z. B. Harry, Hermine, Ron)
* 🪄 **Zaubersprüche**
* 🏠 **Häuser** (z. B. Gryffindor, Slytherin)
* 📚 **Bücher**
* 🎬 **Filme**

Jede Kategorie-Seite enthält **Such- und Filterfunktionen**, um gezielt nach bestimmten Inhalten zu suchen. Zusätzlich gibt es eine **visuell ansprechende Startseite** und eine **„Über uns“-Seite** mit Projektinformationen.

## 🔐 Benutzerfunktionen

* Nutzer\:innen können **Lieblingscharaktere, Filme, Bücher und Zauber** speichern.
* Die Favoriten werden im **Backend** gespeichert und auf einer separaten Seite angezeigt.
* (Optional geplant: Registrierung & Login mit Authentifizierung)

## ⚙️ Verwendete Technologien

### 🎨 Frontend

* HTML, CSS, JavaScript
* [Vue.js](https://vuejs.org/) (mit Vite als Build-Tool)
* Axios für API-Kommunikation

### 🔧 Backend

* Java mit [Spring Boot](https://spring.io/projects/spring-boot)
* RESTful API (GET/POST/DELETE)
* PostgreSQL-Datenbank (gehostet auf Render)
* JPA mit Hibernate zur Datenbankanbindung

### 🚀 Deployment

* [Render.com](https://render.com) für Hosting von Frontend, Backend und Datenbank
* GitHub als CI/CD-Plattform
* `Dockerfile` für Backend-Containerisierung
* GitHub Actions (`.github/workflows/test.yml`) für Build & Test

## 🔗 Verwendete APIs

Die Daten wurden aus zwei offiziellen, frei zugänglichen APIs geladen:

* 🧙‍♂️ [hp-api.onrender.com](https://hp-api.onrender.com)
* 🎥 [potterdb.com](https://www.potterdb.com)

Ein großes Dankeschön an die Entwickler dieser APIs! 🙌

## 👥 Gruppenmitglieder

* Mohamad Shahin
* Louris Marianna Houch


## 🧪 Testen

* **Backend**: Unit-Tests mit JUnit für Services & Controller
* **Frontend**: manuelle UI-Tests & Validierung via Developer Tools

## 📝 Lizenz & Hinweise

Dieses Projekt dient ausschließlich zu **Lernzwecken im Rahmen eines Hochschulkurses**.
Die Rechte an den Harry-Potter-Inhalten liegen bei **J.K. Rowling** und **Warner Bros.**

