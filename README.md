# Film-Uygulamasi

## Kullanılan Teknolojiler
- Spring Framework
- Spring Boot
- Spring Security
- Spring Boot DevTools
- Spring Data JPA with Hibernate
- MySQL JDBC Driver
- Thymeleaf
- Maven
- Bootstrap

1. mysqlde movie adlı bir database oluşturun.
2. bu database içinde 4 tane tablo oluşturun:
   1. movies, 
   2. roles, 
   3. users, 
   4. users_roles.
   
![ERR Diagram](/img/errDiagram.PNG)

users tablosunda user_id(int,primary key, not null, auto increment), username(varchar(45), not null) password(varchar(64), not null)
roles tablosunda role_id(int primary key, not null, auto increment), name(varchar(45), not null)
movies tablosunda id(int,primary key, not null, auto increment), nameMovies(varchar(45), not null), publicationYearMovies(int, not null),
typeMovies(varchar(45), not null), descriptionMovies(TEXT, not null), mediaMovies(varchar(45), not null), languageMovies(varchar(100), not null),
actorName(TEXT, not null)
users_roles user_id(int), role_id(int) yapılıp bu her iki kolonada foreign key atanmalı user_id yi users tablosundan
user_id kısmına bağlamalı ve role_id yide roles tablosundan role_id ye bağlamalıyız foreign key olarak.


// TODO: img klasörü aç, ss yükle.
// TODO: demo.md'de sitenin detayları.
// TODO: Kısalt, madde madde göster.
1. Bu işlemlerden sonra roles tablosunda name kısmına "ADMIN" yazıp kaydedin.
2. users tablosunda username kısmına admin yazın, parola kısmına ise test kısmındaki "PasswordGenerator" sınıfından "parolanızı giriniz" yazan yere yazıp çıkan sonucu mysqldeki users tablosundaki password kısmına yapıştırınız.
3. Sonra users_roles tablosuna gidip user_id ve role_id yerine 1 yazın
4. Böylece sisteme bir adet yönetici atamış olduk
5. Daha sonra kullanıcı eklenecek ise localhost:8080/registration kısmından ekleyebilirsiniz.

Kod ayarları (application.properties) MySQL kullanıcı adı ve parolası "root" ve port ise 3306 olarak kayıtlanmıştır. Bu işlemlerden sonra kodu kullandığınız IDE'de
en üst pakete sağ tıklayıp run as java application dedikten sonra tarayıcınızda arama yerine localhost:8080 yazmanız yeterlidir.
