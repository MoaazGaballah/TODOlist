# TODOlist Projesi

* Giriş
* Geliştirilen metotlar 
* Kullanım ve test
* Eksikler ve gelişme yönleri

## Giriş
Günlük hayatımızda kullanılabilecek, PostgreSQL(Database), Java(Backend), ve Vue.js(Frontend) teknolojileri kullanarak bir TODO list wep app geliştirilmiştir.


## Geliştirilen metotlar
![alt text](https://github.com/MoaazGaballah/TODOlist/blob/main/backend/Screenshot%20(72).png)



Yukarıdaki resimde görüldüğü gibi proje backend ve frontend iki ayrı alt kısımlara ayrılıp, monolithic yapısına sahiptir. 

Backend (repository) => (model) => (service ve controller) olup,
Frontend ise direkt Vue.js tan controllere bağlanabilir diye tasarlanmıştır.

Düşünülen ihtiyaca göre iki metot ```kaydet``` ve ```getAllTodo``` diye controller'da ve service'te geliştirilmiştir.

Service ve controller'da hem bir TODO kayıt etmek için hem de kayıt edilmiş TODO lar göstermek için birer metot testiyle beraber yazılmıştır.

Vue kısmı ise hem hello(Ana sayfa) hem de to-do(ikincil sayfa) için iki komponent olup hello için bir test ve to do için ```Listenin elemanları gösterme``` ve ```Butona basıldığında yeni bir eleman listeye eklenme``` iki ayrı test metodu geliştirilmiştir.

## Kullanım ve test
Proje prototipi, [buradan](https://modanisa-todo.herokuapp.com/#/) ana sayfaya erişilebilir olup, TODO listeye ise [buradan](https://modanisa-todo.herokuapp.com/#/to-do) erişilebilirmektedir.

Not: ücretsiz bir sonucuda deploy çıkıldığı için, ilk defa sayfa açarken yavaşlık yaşanabilir, ama sonraki denemelerde normal olur. 


Örneğin 

![alt text](https://github.com/MoaazGaballah/TODOlist/blob/main/backend/Screenshot%20(70).png)

Eklenmesi istenilen kutucuğa yazılıp, add butonuna basıldığında

![alt text](https://github.com/MoaazGaballah/TODOlist/blob/main/backend/Screenshot%20(71).png)

resimde görüldüğü gibi kolayca eklenmiş olur.

## Eksikler ve gelişme yönleri
- Metotların testi ve komponent testinde baya zorladım, ve yazılması gereken gibi yazıldığını düşünmüyorum.
- Dekomantasyonda anlatılan **Pipeline Automation** yapamadım, ve her geliştirme için test, build, git repoya push yapılması ve deploy çıkılması gerekiyor.
- kısıtlı bir zamanda daha çok java ya hakim olduğum için modern language(rust, golang, elixir, kotlin, clojure etc.) ile yazamadım, ve Java tercih ettim.

İNŞALLAH kısmet olursa bu eksikleri kendimi daha da geliştirerek, bu eksikleri avantaja en kısa zamanda dönüştüreceğim.
