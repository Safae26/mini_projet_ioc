# 🌡️ Mini-projet Spring - Convertisseur de Températures

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](https://spring.io/projects/spring-boot)

Un projet démonstratif des principes IoC et DI avec Spring Framework

## 📋 Table des matières
- [Introduction](#-introduction)
- [Architecture](#-architecture)
  - [Couche DAO](#-package-dao)
  - [Couche Métier](#-package-metier)
  - [Couche Présentation](#-package-pres)
- [Configuration](#-configuration)
- [Résultats](#-résultats)
- [Auteur](#-auteur)

## 🔰 Introduction
Ce mini-projet a pour but de découvrir les principes d'IoC et d'injection de dépendances avec Spring en créant une application de conversion de températures entre différentes unités (Celsius (°C), Fahrenheit (°F), Kelvin (K)).

**Objectifs pédagogiques** :
- ✅ Implémentation de l'IoC (Inversion of Control)
- ✅ Trois méthodes d'injection de dépendances
- ✅ Comparaison XML vs Annotations
- ✅ Architecture en couches (DAO/Métier/Présentation)

## 🧱 Architecture

### 📂 Package `dao`

**Interface `ITemperatureDao`** :
```java
public interface ITemperatureDao {
    double getConversionRate(String fromUnit, String toUnit);
}
