[![CI](https://github.com/mo-sh44/HarryPotterWebTech/actions/workflows/test.yml/badge.svg)](https://github.com/mo-sh44/HarryPotterWebTech/actions/workflows/test.yml)

# 🧙‍♂️ Harry Potter Webprojekt – Webtechnologien Kurs

## 📚 Projektbeschreibung

Dieses Projekt wurde im Rahmen des Kurses **Webtechnologien** im Sommersemester 2025 an der HTW Berlin entwickelt.

Wir – ein Team bestehend aus zwei Gruppenmitgliedern – haben gemeinsam eine interaktive Website zum Thema **Harry Potter** umgesetzt. Ziel war es, eine moderne Webanwendung zu entwickeln, die Inhalte aus dem Harry-Potter-Universum übersichtlich darstellt und mit Backend-Funktionalitäten kombiniert.

Die Webseite bietet Informationen zu verschiedenen Kategorien:

- 🧑‍🎓 **Charaktere** (z. B. Harry, Hermione, Ron)
- 🪄 **Zaubersprüche**
- 🏠 **Häuser** (z. B. Gryffindor, Slytherin)
- 📚 **Bücher**
- 🎬 **Filme**

Jede Kategorie-Seite enthält **Such- und Filterfunktionen**, um gezielt nach bestimmten Inhalten zu suchen. Außerdem gibt es eine visuell ansprechende Startseite und eine "Über uns"-Seite mit Projektinformationen.

---

## 🔐 Benutzerfunktionen

Die Seite bietet zusätzlich personalisierte Features:

- Registrierung & Login (optional geplant)
- Nutzer:innen können **Lieblingscharaktere, Filme, Bücher und Zauber** speichern.
- Favoriten werden im Backend gespeichert und sind auf einer separaten Seite einsehbar.

---

## ⚙️ Verwendete Technologien

### 🎨 Frontend
- HTML, CSS, JavaScript
- [Vue.js](https://vuejs.org/) (Vite als Build-Tool)
- Axios (für API-Anfragen)

### 🔧 Backend
- Java mit Spring Boot
- RESTful API mit Endpunkten für Favoriten
- PostgreSQL-Datenbank (gehostet auf Render)
- JPA (Hibernate) zur Datenbankanbindung

### 🚀 Deployment
- [Render.com](https://render.com) für Frontend, Backend und Datenbank
- GitHub als CI/CD-Plattform
- Dockerfile für das Backend-Deployment
- GitHub Actions (`.github/workflows/test.yml`) für Tests & Build-Prozesse

---

## 🔗 Verwendete APIs

Die Daten wurden von zwei offiziellen, frei zugänglichen APIs bezogen:

- 🧙‍♂️ [hp-api.onrender.com](https://hp-api.onrender.com/)
- 🎥 [potterdb.com](https://potterdb.com/movies)

Ein großes Dankeschön an die Entwickler dieser APIs! 🙌

---

## 👥 Gruppenmitglieder

- Mohamad Shahin
- Louris Marianna Houch

---

## 📁 Projektstruktur (Kurzüberblick)

- `frontend/` – Vue-App mit Komponenten für Charaktere, Bücher, Filme, Zauber & Favoriten
- `backend/` – Spring-Boot-App mit Controllern, Services, Repositories und PostgreSQL-Anbindung
- `Dockerfile`, `Procfile`, `application.yml`, `.env` – für Deployment & Konfiguration

---

## 🧪 Testen

- Backend: JUnit-Tests für Services und Controller
- Frontend: manuelle UI-Tests & Konsolenausgaben zur Validierung

---

## 📝 Lizenz & Hinweise

Dieses Projekt dient ausschließlich zu Lernzwecken im Rahmen eines Hochschulkurses. Die Rechte an den Harry-Potter-Inhalten liegen bei **J.K. Rowling** und **Warner Bros.**
