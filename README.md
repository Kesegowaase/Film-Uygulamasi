# Film-Uygulamasi

## Kullanılan Teknolojiler
- Spring Framework
- Spring boot
- Spring security
- Spring boot DevTools
- Spring data jpa with hibernate
- MySQL JDBC driver
- Thymeleaf
- Maven
- Bootstrap

1. mysqlde movie adlı bir database oluşturun.
2. bu database içinde 4 tane tablo oluşturun:
   1. movies, 
   2. roles, 
   3. users, 
   4. users_roles.
   
// TODO: Görsel hale getir.
---------------
users tablosunda user_id(int,primary key, not null, auto increment), username(varchar(45), not null) password(varchar(64), not null)
roles tablosunda role_id(int primary key, not null, auto increment), name(varchar(45), not null)
movies tablosunda id(int,primary key, not null, auto increment), nameMovies(varchar(45), not null), publicationYearMovies(int, not null),
typeMovies(varchar(45), not null), descriptionMovies(TEXT, not null), mediaMovies(varchar(45), not null), languageMovies(varchar(100), not null),
actorName(varchar(100), not null)
users_roles user_id(int), role_id(int) yapılıp bu her iki kolonada foreign key atanmalı user_id yi users tablosundan
user_id kısmına bağlamalı ve role_id yide roles tablosundan role_id ye bağlamalıyız foreign key olarak.
----------------

// TODO: img klasörü aç, ss yükle.
// TODO: demo.md'de sitenin detayları.
// TODO: Kısalt, madde madde göster.
Bu işlemlerden sonra roles tablosunda name kısmına "ADMIN" yazıp kaydedin. Aynı işlemi users tablosunda yapın ama parolanızı test kısmındaki
"PasswordGenerator" sınıfından "parolanızı giriniz" yazan yere yazıp çıkan sonucu mysqldeki users tablosundaki password kısmına yapıştırınız.
Sonra users_roles tablosuna gidip user_id ve role_id yerine 1 yazdıktan sonra sisteme bir adet kullanıcı adı ADMIN parolası ise belirlediğiniz
bir yönetici atamış oluyoruz daha sonra kullanıcı eklenecek ise /registration kısmından ekleyebiliriz bu işlem sadece yönetici
eklemek içindir.

kod ayarlarında mysql kullanıcı adı parola "root" ve port ise 3306 olarak kayıtlanmıştır. bu işlemlerden sonra kodu kullandığınız ide de
en üst pakete sağ tıklayıp run as java application dedikten sonra tarayıcınızda arama yerine localhost:8080 yazmanız yeterlidir.
