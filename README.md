# 🌡️ Mini-projet Spring - Convertisseur de Températures

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](https://spring.io/projects/spring)

Un projet démonstratif des principes IoC et DI avec Spring Framework

## 🔰 Introduction
Ce mini-projet a pour but de découvrir les principes d'IoC et d'injection de dépendances avec Spring en créant une application de conversion de températures entre différentes unités (Celsius (°C), Fahrenheit (°F), Kelvin (K)).

**Objectifs pédagogiques** :
- ✅ Implémentation de l'IoC (Inversion of Control)
- ✅ Trois méthodes d'injection de dépendances
- ✅ Comparaison XML vs Annotations
- ✅ Architecture en couches (DAO/Métier/Présentation)

## 🧱 Architecture du projet:
### 📁 Package dao : couche d'accès aux taux de conversion
- Interface IDao: Définit une méthode getTauxConversion(String from, String to) qui retourne le taux de conversion entre deux unités de température
- Classe DaoImpl: Implémentation avec des taux fixes:
    - Celsius → Fahrenheit: ×1.8 + 32
    - Fahrenheit → Celsius: -32 ×5/9
    - Celsius → Kelvin: +273.15

### 📁 Package ext : alternative DAO
- DaoImpl2: Deuxième implémentation avec des taux légèrement différents pour démontrer l'injection dynamique

### 📁 Package metier : couche métier
- Interface IMetier: Définit une méthode convertir(String from, String to, double valeur)
- Classe MetierImpl: Implémentation avec trois types d'injection:
    - Injection par constructeur
    - Injection par setter
    - Injection par annotation @Autowired

### 📁 Package pres : couche de présentation
- PresSpringAnnotation: Utilise AnnotationConfigApplicationContext pour configurer Spring via annotations
- PresSpringXML: Utilise un fichier config.xml pour la configuration XML

### 📄 config.xml
<beans>
    <bean id="dao" class="com.example.temperature.dao.DaoImpl"/>
    <bean id="metier" class="com.example.temperature.metier.MetierImpl">
        <property name="dao" ref="dao"/>
    </bean>
</beans>

## Conclusion:
Ce projet m'a permis de:
- Comprendre l'injection de dépendances
- Comparer XML vs annotations
- Séparer clairement les couches
- Faciliter le changement d'implémentation
