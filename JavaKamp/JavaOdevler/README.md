## JavaCampOdevler

#### Java Kamp Ödevleri 

-------------------------------------------------------------------------------------------------------------------------------------------
### 4. Gün Ödev 3 (GameStore);

#### Yapılanlar;
* User,Game,Campaign ve GameSale nesneleri birbiri ili ilişkili olarak oluşturuldu.
* Her birinin ayrı ayrı Service interface'leri ve Manager class'ları yazıldı.
* Oyuncular sisteme kayıt olabiliyor isternirse mernis doğrulama alınabiliyor.
* Oyun satışında kampanya kodu ile indirim uygulanılarak kayıt yapılabiliyor.
* InMemory kullanılarak data tutuldu.

#### Ödev içeriği;
Bir oyun yazmak istiyorsunuz. Bu yazılım için backend kodlarını JAVA ile geliştirmeyi planlıyoruz. Yeni üye, satış ve kampanya yönetimi yapılması isteniyor. Nesnelere ait özellikleri istediğiniz gibi verebilirsiniz. Burada amaç yazdığınız kodun kalitesidir. Ödevde gereksinimleri tam anlamadığınız durum benim için önemli değil, kendinize göre mantık geliştirebilirsiniz. Dediğim gibi kod kalitesiyle ilgileniyoruz şu an :)

Gereksinimler

* Oyuncuların sisteme kayıt olabileceği, bilgilerini güncelleyebileceği, kayıtlarını silebileceği bir ortamı simule ediniz. Müşteri bilgilerinin doğruluğunu e-devlet sistemlerini kullanarak doğrulama yapmak istiyoruz. (E-devlet sistemlerinde doğrulama TcNo, Ad, Soyad, DoğumYılı bilgileriyle yapılır. Bunu yapacak servisi simule etmeniz yeterlidir.) (Loglama gibi)
* Oyun satışı yapılabilecek satış ortamını simule ediniz.( Yapılan satışlar oyuncu ile ilişkilendirilmelidir. Oyuncunun parametre olarak metotta olmasını kastediyorum.)
* Sisteme yeni kampanya girişi, kampanyanın silinmesi ve güncellenmesi imkanlarını simule ediniz.
* Satışlarda kampanya entegrasyonunu simule ediniz.

-------------------------------------------------------------------------------------------------------------------------------------------
### 4. Gün Ödev 2;

#### Yapılanlar;
* Customer nesnesi oluşturuldu.
* BaseCustomerManager abstract olarak yazıldı.
* Starbucks ve Nero için BaseCustomerManager inherit edildi.
* Constructorlarından CustomerCheckService injection yapıldı.
* Mernis servisi, Web Service Client ile kütüphaneye eklendi.
* Gerçek Mernis Adaptoru yazıldı.
* Mernis ve Fake, Customer kontrol servisleri yazılarak StarbucksCustomerManager a injection yapıldı.
* Main.java da test edildi.

#### Ödev içeriği;
* Aşağıda sektör için çok değerli bir örneği yapan yayını bırakıyorum.
* https://youtu.be/6VYDltTF2b4
* Bu yayın C# ile yapıldı.
* Aynı yapıyı Java için kurunuz.

-------------------------------------------------------------------------------------------------------------------------------------------
### 3. Gün Ödev 2;

#### Yapılanlar;
* User, Instructor, Student nesneleri modellendi.
* UserManager, InstructorManager, StudentManager içinde operasyonlar modellendi.
* Main.java içinde testler yazıldı.

#### Ödev içeriği;
* Kodlama.io projesini yazdığınızı düşünelim.
* User, Instructor, Student nesnelerini modelleyiniz. (Class-Inheritance)
* UserManager, InstructorManager, StudentManager için sistemde olabilecek operasyonları tahminleyip modelleyiniz. (Class-Inheritance-Method)
* Kural -- Sadece gördüğümüz konulardan yararlanmalısınız.

-------------------------------------------------------------------------------------------------------------------------------------------
### 2. Gün Ödev 1;

#### Yapılanlar;
* Egitmen ve Kurs nesneleri oluşturuldu.
* Bu nesneler diziye eklenerek foreach ile listelendi.
* KursManager yazılarak add ve delete metotları yazıldı.

#### Ödev içeriği;
* Kodlama.io sitesine gidiniz.
* Özellik nesnesi olarak tanımladığımızı düşündüğünüz iki örnek veriniz.
* Bunlara ait class, contructor yapılarını oluşturup diziye ekleyip listeleyiniz.
* İş sınıfı olarak tanımladığımızı düşündüğünüz bir class oluşturunuz. En az iki metot yazınız.
